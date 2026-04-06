package com.test;

import java.util.List;

public class OrderDemo {

	public static void main(String[] args) {
		OrderDao odao = new OrderDao();
		Order obj=new Order();
		//obj.setId(102);
		obj.setO_name("Books");
		obj.setO_quantity(10);
		obj.setO_price(100);
		
		odao.saveOrder(obj);
		//odao.updateOrder(obj);
		//List<Order> list=odao.listAllOrders();
		//list.forEach(dt-> System.out.println(dt.getId()+" "+dt.getO_name()+" "+dt.getO_quantity()+" "+dt.getO_price()));
		
		System.out.println("Done.");
		
	}

}
