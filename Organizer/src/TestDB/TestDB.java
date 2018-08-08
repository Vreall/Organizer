package TestDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;



/**
 * Servlet implementation class TestDB
 */
@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String user="guestlist";
			String pass="guestlist";
			String jdbcURL="jdbc:mysql://localhost:3306/guestlist?useSSL=false&serverTimezone=UTC";
			String driver = "com.mysql.cj.jdbc.Driver";
			
			try {
				PrintWriter out = response.getWriter();
				out.println("£¹czenie z DB: " + jdbcURL);
				
				Class.forName(driver);
				
				Connection myConn = DriverManager.getConnection(jdbcURL, user, pass);
				
				out.println("Connected!");
				
				myConn.close();
				
				
			} catch (Exception exc) {
				exc.printStackTrace();
				throw new ServletException(exc);
			}
			
			
			
			
	}

}
