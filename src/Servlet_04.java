

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_04
 */
@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet_04() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int amount = 5;
		request.setAttribute("amount", amount);
		getServletContext().getRequestDispatcher("/WEB-INF/index4_form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Book> listOfBooks = new ArrayList<>();
		String amountText = request.getParameter("amount");
		int amount = Integer.parseInt(amountText);
		for (int i=1; i<=amount; i++) {
			Book book = createBook(i, request, response);
			if (book != null){
				listOfBooks.add(book);
				listOfBooks.toArray();
			}
			request.setAttribute("listOfBooks", listOfBooks);
		}
		getServletContext().getRequestDispatcher("/WEB-INF/index4_result.jsp").forward(request, response);
	}

	protected Book createBook(int i, HttpServletRequest request, HttpServletResponse response) {
		try{
			String title = request.getParameter("title"+i);
			String author = request.getParameter("author"+i);
			String isbnText = request.getParameter("isbn"+i);
			int isbn = Integer.parseInt(isbnText);
			Book book = new Book(title, author, isbn);
			return book;
		} catch (Exception e) {
			return null;
		}
	}

}
