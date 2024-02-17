package CoOxy.Sarvlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import CoOxy.DAO.RegDAO;
import CoOxy.DTO.RegDTO;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   try{
			RegDTO u1=new RegDTO();
			u1.setUnm(request.getParameter("unm"));
			u1.setName(request.getParameter("nm"));
			u1.setMob(request.getParameter("mob"));
			u1.setEmail(request.getParameter("email"));
			u1.setGender(request.getParameter("gender"));
			u1.setAdd(request.getParameter("add"));
			
			RegDAO u2=new RegDAO();
			int u=u2.update(u1);
			
			if(u == 0){
				response.sendRedirect("searchme.jsp");
			}
			else{
				response.sendRedirect("index.jsp");
			}
		  }catch(Exception ee){System.out.println(ee+" : update arorr--");}
		}
}
