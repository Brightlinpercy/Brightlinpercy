package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logincontroller
 */
@WebServlet("/logincontroller")
public class logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginname=request.getParameter("loginname");
		String password=request.getParameter("password");
		model.Condition obj=new model.Condition();
		obj.setLoginname(loginname);
		obj.setPassword(password);
		if(obj.check())
		{
			request.setAttribute("loginname",loginname);
			RequestDispatcher dispatch=request.getRequestDispatcher("success.jsp");
			dispatch.forward(request,response);
		}
		else
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("failure.jsp");
			dispatch.forward(request,response);
		}
	}

}
