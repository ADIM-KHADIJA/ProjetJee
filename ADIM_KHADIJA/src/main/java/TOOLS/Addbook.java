package TOOLS;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CredentialC;

/**
 * Servlet implementation class Addbook
 */
@WebServlet("/Addbook")
public class Addbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addbook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String categorie = request.getParameter("category");
		String author = request.getParameter("fname");
		int id=Integer.parseInt(request.getParameter("id"));
		String date=request.getParameter("date");
        
	      
		if (!name.isEmpty() && !categorie.isEmpty() && !author.isEmpty() && !date.isEmpty()) {
		   CredentialC.AddBook(id, name, author, categorie, date);
			response.sendRedirect("Addbook.jsp?res=suc");
		}
	}

}
