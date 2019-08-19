package com.filters.demo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class HelloWorldFilter
 */
@WebFilter("/HelloWorld")
public class HelloWorldFilter implements Filter {

    /**
     * Default constructor. 
     */
    public HelloWorldFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("1111....2222");
		System.out.println("Destroy the filter..!");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.getWriter().append("<h1>Pre Filter </h1> <br />");
		chain.doFilter(request, response);
		response.getWriter().append("<h1>Post Filter </h1>");
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Initialize the filter..!");
	}

}
