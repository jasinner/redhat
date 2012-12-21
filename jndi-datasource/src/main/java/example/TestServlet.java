package com.redhat.gss.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    DataSource ds = null;

    Context ctx = null;
    
    /**

     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();


        try {

                String strDSName = "java:comp/env/jdbc/datasource";

                ctx = new InitialContext();

                ds = (javax.sql.DataSource) ctx.lookup(strDSName);

        } catch (Exception e) {
        	throw new IllegalStateException(e);
        }
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = null;
		try {
			String databaseProductName = ds.getConnection().getMetaData().getDatabaseProductName();
			writer = response.getWriter();
			writer.append("Database: " + databaseProductName);
		} catch (SQLException e) {
			throw new IllegalStateException(e);
		}
		finally{
			writer.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
