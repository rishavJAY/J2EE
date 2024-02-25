import java.io.*;
import javax.servlet.*;			//.* only imports classes inside it not the subpackages
import javax.servlet.http.*;		//http is a subpackage inside servlet, so need to import it specifically


public class MyFirstHttpServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");	//"text/plain" -> to treat as plain text 

		PrintWriter out = resp.getWriter();
		out.println("<html><body bgcolor='red'>");
		out.println("HttpServlet - content type html");
		out.println("</body></html>");	
	}
	

}