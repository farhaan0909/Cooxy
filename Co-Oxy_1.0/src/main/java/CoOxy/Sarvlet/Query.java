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
 * Servlet implementation class Query
 */
@WebServlet("/Query")
public class Query extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Query() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RegDTO q=new RegDTO();
		q.setName(request.getParameter("nm"));
		q.setMob(request.getParameter("mob"));
		q.setQt(request.getParameter("qt"));
		q.setQw(request.getParameter("qw"));
		
		RegDAO q2=new RegDAO();
		
		int qr=q2.qsend(q);
		
		RegDTO qre=q2.answ(q);
		if(qr == 1)
		{
			ServletContext ctx=getServletContext();
			RequestDispatcher qd=ctx.getRequestDispatcher("/query.jsp");
			
			request.setAttribute("qans", qre.getQans());
			
			qd.forward(request, response);
		}
		else
		{
			 response.sendRedirect("/index.jsp");
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
