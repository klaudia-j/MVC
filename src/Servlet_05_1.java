

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet_05_1
 */
@WebServlet("/Servlet_05_1")
public class Servlet_05_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet_05_1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		getServletContext().getRequestDispatcher("/WEB-INF/index5_form_single.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		if (sess.getAttribute("listOfBooks") == null){
			List<Book> listOfBooks = new ArrayList<>();
			sess.setAttribute("listOfBooks", listOfBooks);
		}
		try {
			String title = request.getParameter("title");
			String author = request.getParameter("author");
			String isbnText = request.getParameter("isbn");
			int isbn = Integer.parseInt(isbnText);
			Book book = new Book(title, author, isbn);
			request.setAttribute("book", book); //???
			List<Book> listOfBooks = (List<Book>) sess.getAttribute("listOfBooks");
			listOfBooks.add(book);
			sess.setAttribute("listOfBooks", listOfBooks);
			getServletContext().getRequestDispatcher("/WEB-INF/index5_result.jsp").forward(request, response);
		} catch (NumberFormatException e) {

		}
	}

}
