package com.harshit.entity;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagAddress extends TagSupport{
	@Override
	public int doStartTag()throws JspException{
		JspWriter out = pageContext.getOut();
		try {
			out.println("<h2> Address of Harshit</h2>");
			out.println("<h2> Sector 22 C2</h2>");
			out.println("<h2> Gurgram </h2>");

		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}
