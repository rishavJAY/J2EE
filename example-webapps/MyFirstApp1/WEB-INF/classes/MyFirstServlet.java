import javax.servlet.*;
import java.io.*;

//GenericServlet is outdated, due to http protocol popularity java provides with HttpServlet
public class MyFirstServlet extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse resp) throws IOException, ServletException {

		PrintWriter out = resp.getWriter();
		out.print("First Servlet Using Tomcat...");
	}
	
}