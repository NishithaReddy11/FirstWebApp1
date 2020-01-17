package project1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/show1")
public class SumServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int sum=0;
		int a=Integer.parseInt(req.getParameter("t1"));
		int b=Integer.parseInt(req.getParameter("t2"));
		sum=a+b;
		
//		RequestDispatcher rd= req.getRequestDispatcher("cube");//for request dispatcher
//		 req.setAttribute("sum",sum);
//		 rd.forward(req, res);
		//res.sendRedirect("cube?sum="+sum);//for send redirect
//		HttpSession ssn=req.getSession();//using session //session is specific for particular browser it wont work in all browsers
//		ssn.setAttribute("sum",sum);//for both session and request dispatcher
//		res.sendRedirect("cube");
		Cookie cookie=new Cookie("deloitte.sum",String.valueOf(sum));//using cookies
		res.addCookie(cookie);
		res.sendRedirect("cube");
		}
}
