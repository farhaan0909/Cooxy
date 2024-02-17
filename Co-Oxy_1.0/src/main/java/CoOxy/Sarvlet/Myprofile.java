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
 * Servlet implementation class SearchMe
 */
@WebServlet("/Myprofile")
public class Myprofile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myprofile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
				/*int cid=Integer.parseInt(request.getParameter("cid"));*/
		HttpSession hs=request.getSession();
		String unm1=(String) hs.getAttribute("unm");
		
		RegDTO d1=new RegDTO();
		d1.setUnm(unm1);
		
		RegDAO dao=new RegDAO();
		
		RegDTO data=dao.serme(d1);
		
		if(data != null)
		{
			ServletContext ctx=getServletContext();
			RequestDispatcher rd=ctx.getRequestDispatcher("/searchme.jsp");
			request.setAttribute("nm", data.getName());
			request.setAttribute("mob", data.getMob());
			request.setAttribute("email", data.getEmail());
			request.setAttribute("gender", data.getGender());
			request.setAttribute("add", data.getAdd());
			request.setAttribute("unm", data.getUnm());
			request.setAttribute("fname", data.getFname());
			
			rd.forward(request, response);
		}
		else{
			/*<response.sendRedirect("searchme.jsp");*/
			
			ServletContext ctx=getServletContext();
			RequestDispatcher rd=ctx.getRequestDispatcher("/searchme.jsp");
			
			request.setAttribute("nm", " No data Found");
			request.setAttribute("mob", " No data Found");
			request.setAttribute("email", " No data Found");
			request.setAttribute("gender", " No data Found");
			request.setAttribute("add", " No data Found");
			request.setAttribute("unm", " No data Found");
			request.setAttribute("fname", "3.jpg");

			rd.forward(request, response);
		   }
	
		}catch(Exception ee){System.out.println(ee+" : search me erorr--");}	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
