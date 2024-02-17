package CoOxy.Sarvlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import CoOxy.DAO.RegDAO;
import CoOxy.DTO.RegDTO;

/**
 * Servlet implementation class Newlogin
 */
@WebServlet("/Newlogin")
public class Newlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Newlogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String  name1=request.getParameter("unm");
		String	pwd1=request.getParameter("pwd");
		
		RegDTO l1=new RegDTO();
		l1.setUnm(name1);
		l1.setPwd(pwd1);
		
		RegDAO l2=new RegDAO();
		int y=l2.check(l1);
		
		RegDTO data=l2.notice(l1);
		
			if(y == 1)
			 {
				HttpSession hs=request.getSession(true);
				hs.setAttribute("unm", name1);
				//response.sendRedirect("index.jsp");	
				
				ServletContext ctx=getServletContext();
				RequestDispatcher rd=ctx.getRequestDispatcher("/index.jsp");
				request.setAttribute("anote", data.getAnote());
				rd.forward(request, response);
			 }
			 else{
				 if(y==4){	
					 HttpSession hs=request.getSession(true);
					 hs.setAttribute("unm", name1);
					 response.sendRedirect("Admin/Aindex.jsp");
				 }else{
					   response.sendRedirect("login.jsp");
				      }
			   }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
