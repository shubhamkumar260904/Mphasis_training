package com.test;
import java.util.*;
import jakarta.servlet.jsp.tagext.TagSupport;
import jakarta.servlet.jsp.JspWriter;
public class CustomTag extends TagSupport{
	
	private static final long serialVersionUID = 1L;
	private static final long serialVersion=1L;
	public int doStartTag() {
		JspWriter out=null;
		try
		{
			out=pageContext.getOut();
			out.println("Current Date : "+new Date());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
