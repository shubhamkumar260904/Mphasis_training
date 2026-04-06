package com.test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.PlayerDao;
import com.test.model.Players;

public class TestDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		PlayerDao dao=ctx.getBean("pdao2",PlayerDao.class);
		
		PlayerDao dao1=ctx.getBean("pdao1",PlayerDao.class);
		
		Players obj=new Players();
		
		obj.setId(111);
		obj.setName("Rohit");
		obj.setTeam("Mumbai");
		obj.setPrice(1234);
		dao.createPlayers(obj);
		List<Players> list=dao.getAllPlayers();
		
		System.out.println("Done.");
	}

}
