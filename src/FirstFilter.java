

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FirstFilter
 */
@WebFilter("/*")
public class FirstFilter implements Filter {
	private String encoding = "UTF-8";
	private String charset = "text/html";
	private String name = "Klaudia";

	/**
	 * Default constructor. 
	 */
	public FirstFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType(charset);
		response.setCharacterEncoding(encoding);
		System.out.println("Cześć " + name);
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		String encodingParam = fConfig.getInitParameter("encoding"); 
		String charsetParam = fConfig.getInitParameter("charset"); 
		if (encodingParam != null && charsetParam!= null) {
			encoding = encodingParam;
			charset = charsetParam; }
		String nameParam = fConfig.getInitParameter("name"); 
		if (nameParam != null) {
			name = nameParam;
		}
	}

}
