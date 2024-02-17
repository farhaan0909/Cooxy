package CoOxy.Sarvlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CoOxy.DAO.RegDAO;
import CoOxy.DTO.RegDTO;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RegDTO f1=new RegDTO();
		f1.setName(request.getParameter("nm"));
		f1.setMob(request.getParameter("mob"));
		f1.setFt(request.getParameter("ft"));
		f1.setFd(request.getParameter("feed"));
		
		RegDAO f2=new RegDAO();
		
		int fe=f2.fsend(f1);
		if(fe == 1)
		{
			ServletContext ctx=getServletContext();
			RequestDispatcher qd=ctx.getRequestDispatcher("/contact.jsp");
		
			 qd.forward(request, response);
		}
		else
		{
			response.sendRedirect("/contact.jsp");
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
