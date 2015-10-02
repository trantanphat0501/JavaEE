package phat.code.java;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class PhatServlet
 */
@WebServlet("/PhatServlet")
public class PhatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "text/html;charset=UTF-8";
	private static final String MESSAGE = "<!DOCTYPE html><html>"
			+ "<head><title>Hello!</title></head>"
			+ "<body>Hello World WildFly</body>" + "</html>";  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType(CONTENT_TYPE);
		try (PrintWriter out = response.getWriter()) {
			out.println(MESSAGE);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
