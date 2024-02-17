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
 * Servlet implementation class Adfeed
 */
@WebServlet("/Adfeed")
public class Adfeed extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adfeed() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  try{	
		  int fid1=Integer.parseInt(request.getParameter("fid"));				
			
		  RegDTO f1=new RegDTO();
		  f1.setFid(fid1);
		  
		  RegDAO f2=new RegDAO();
		  
		  RegDTO feed1=f2.feed(f1);
		  
		if(feed1 != null)
		  {	
			ServletContext ctx=getServletContext();
			RequestDispatcher rd=ctx.getRequestDispatcher("/Admin/adfeed.jsp");
			request.setAttribute("fid", feed1.getFid());
			request.setAttribute("fno", feed1.getFno());
			request.setAttribute("fnm",feed1.getFnm());
			request.setAttribute("fmob", feed1.getFmob());
			request.setAttribute("ft",  feed1.getFt());
			request.setAttribute("fd",feed1.getFd());
			
			rd.forward(request, response);
			
		  }
		  else
		  {
			  ServletContext ctx=getServletContext();
				RequestDispatcher rd=ctx.getRequestDispatcher("/Admin/adfeed.jsp");
				request.setAttribute("fid", " No data");
				request.setAttribute("fno", " No data");
				request.setAttribute("fnm", " No data");
				request.setAttribute("fmob", " No data");
				request.setAttribute("ft",  " No data");
				request.setAttribute("fd", " No data");
				
				rd.forward(request, response);
		  }
	  }catch(Exception ee){System.out.println(ee+" : Adfeed erorr");}
	  finally {
		  response.sendRedirect("/Admin/adfeed.jsp");
		}		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
