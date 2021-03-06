package kr.ac.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")//이 servlet이 해당되는 url 맵핑(html의 action부분)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//...DB Access
		
		//Build HTML code
		PrintWriter out = response.getWriter();
		
		String htmlResponse = "<html>";
		htmlResponse += "<h2> your name is " + username + "<br/>";
		htmlResponse += "your password is " + password + "</h2>";
		htmlResponse += "hello!";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
		
	}

}
