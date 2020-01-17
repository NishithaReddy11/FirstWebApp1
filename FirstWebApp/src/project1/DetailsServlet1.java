package project1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/details1")//by using this there is no need of web.xml file
public class DetailsServlet1 extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		String name=req.getParameter("t1");
		String gender=req.getParameter("gender");
		List<String>langs=Arrays.asList(req.getParameterValues("cblang"));
		String c=req.getParameter("country");
		Details d=new Details(name,gender,langs,c);
//		HttpSession ssn=req.getSession();
//		ssn.setAttribute("details", d);
//		res.sendRedirect("details1.jsp");
		RequestDispatcher rd=req.getRequestDispatcher("details1.jsp");
		req.setAttribute("details",d);
		rd.forward(req, res);
	}
}