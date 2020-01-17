package project1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CubeServlet
 */
@WebServlet("/cube")
public class CubeServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
//		HttpSession ssn=req.getSession();//using session
		int cube=0,sum=0;
     //  int a=(int) req.getAttribute("sum"); //for request Dispatcher
		//int a=Integer.parseInt(req.getParameter("sum"));//for sendRedirect
//		int a=(int) ssn.getAttribute("sum");//using session
		Cookie[]cookies=req.getCookies();//using cookies
		for(Cookie ck:cookies)
		{
			if(ck.getName().equals("deloitte.sum"))
			{
				 sum=Integer.parseInt(ck.getValue());
			}
		}
		cube=(sum*sum*sum);
//		res.getWriter().println("Sum is:"+sum);
//		res.getWriter().println("Cube is:"+cube);
		HttpSession ssn=req.getSession();//using jsp
		//ssn.setAttribute("sum",sum);
		ssn.setAttribute("cube",cube);
		res.sendRedirect("Home.jsp");
		
	}

}
