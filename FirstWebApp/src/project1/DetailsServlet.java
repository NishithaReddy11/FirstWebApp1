package project1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/details")//by using this there is no need of web.xml file
public class DetailsServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name=req.getParameter("t1");
		String gender=req.getParameter("gender");
		List<String>langs=Arrays.asList(req.getParameterValues("cblang"));
		String c=req.getParameter("country");
		PrintWriter out=res.getWriter();
		out.println("Name is:"+name+"<br>");
		out.println("Gender is:"+gender+"<br>");
		out.println("Languages Known:");
		langs.forEach((l)->out.println(l));
		out.println("Country is:"+c);
	}
}
