package CoOxy.Admin.Sarvlet;

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
 * Servlet implementation class Aquery
 */
@WebServlet("/Aquery")
public class Aquery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Aquery() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try{
		int qid1=Integer.parseInt(request.getParameter("qid"));
		RegDTO q1=new RegDTO();
		q1.setQid(qid1);
		
		RegDAO q2=new RegDAO();
		
		RegDTO q3=q2.aquery(q1);
	   
		if(q3 != null)
		{
			ServletContext ctx=getServletContext();
			RequestDispatcher rd=ctx.getRequestDispatcher("/Admin/adquery.jsp");
			
			request.setAttribute("qid", q3.getQid());
			request.setAttribute("qno", q3.getQno());
			request.setAttribute("nm",  q3.getName());
			request.setAttribute("mob", q3.getMob());
			request.setAttribute("qt" , q3.getQt());
			request.setAttribute("qw",  q3.getQw());
			
			rd.forward(request, response);
		}
		else{
			ServletContext ctx=getServletContext();
			RequestDispatcher rd=ctx.getRequestDispatcher("/Admin/adquery.jsp");
			
			request.setAttribute("qid", "No data");
			request.setAttribute("fno", "No data");
			request.setAttribute("nm",  "No data");
			request.setAttribute("mob", "No data");
			request.setAttribute("qt" , "No data");
			request.setAttribute("qw",  "No data");
			
			rd.forward(request, response);
		}
	   }catch(Exception ee){System.out.println(ee+" : Admin Query Erorr");}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
