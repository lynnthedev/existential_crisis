package com.existential_crisis;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/retrieveDreads")

public class retrieveDreads extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public retrieveDreads() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		list(request,response);
	}
	
	private void list(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException 
			{
				dreadCollection dc = new dreadCollection();
				dread s1 = new dread("0001","I think if we were to truly create a utopian society, the first thing we would do to tear it down, just to have a purpose.");
				dread s2 = new dread("0002","It is closer to the year 2030 than the year 2005.");
				dread s3 = new dread("0003","At some point in your life, you will be the next person on Earth to die.");
				dread s4 = new dread("0004","Of all the consciences that could have been born in my body, I'm the one looking through these eyes.");
				
				dc.addThought(s1);
				dc.addThought(s2);
				dc.addThought(s3);
				dc.addThought(s4);
				PrintWriter writer = response.getWriter();
				writer.println(s1 + "<br/>" + s2 + "<br>" + s3 + "<br>" + s4);
				writer.close();
		
			}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
