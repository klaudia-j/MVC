

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Homework_Servlet_01_1
 */
@WebServlet("/Homework_Servlet_01_1")
public class Homework_Servlet_01_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Homework_Servlet_01_1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> lang = new  HashMap<>();
		lang.put("en", "Hello");
		lang.put("pl", "Cześć");
		lang.put("de", "Ehre");
		lang.put("es", "Hola");
		lang.put("fr", "Bienvenue");
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName()=="language") {
				String language = cookie.getValue();
				request.setAttribute("language", lang.get(language));
				break;
			}
		}
		getServletContext().getRequestDispatcher("/WEB-INF/homework_index1_1.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
