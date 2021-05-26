package TOOLS;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Entities.Student;
import DAO.CredentialC;


/**
 * Servlet implementation class Addstudent
 */
@WebServlet("/Addstudent")
public class Addstudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addstudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("Nom");
		int ide =Integer.parseInt(request.getParameter("id"));
		String prenom = request.getParameter("prenom");
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");
		int age =Integer.parseInt(request.getParameter("Age")); 
		
		
           if(pass1.equals(pass2))
           { CredentialC.AddEutdaint(ide,login, prenom, age, login, pass1);
			HttpSession ss = request.getSession(false);
			Student u = (Student)ss.getAttribute("student");
			
			response.sendRedirect("authenification.jsp");
		    } 
		
		 else 
			{response.sendRedirect("ADDstudent.jsp?res=err");}

	}

}
