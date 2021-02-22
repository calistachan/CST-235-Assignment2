package assignment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher reqDispatch = request.getRequestDispatcher("TestForm.jsp");
		reqDispatch.forward(request, response);
		System.out.println("I am in doGet()");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
 		
		if(firstname.length() == 0 || lastname.length() == 0) {
			RequestDispatcher reqDispatch = request.getRequestDispatcher("TestError.jsp");
			reqDispatch.forward(request, response);
		} else {
			RequestDispatcher reqDispatch = request.getRequestDispatcher("TestResponse.jsp");
			reqDispatch.forward(request, response);
		}
		

		
	}
	
	@Override
	public void init() {
		System.out.println("I am in init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("I am in destroy()");
	}
	

}
