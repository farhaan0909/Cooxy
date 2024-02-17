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
 * Servlet implementation class UserInfo
 */
@WebServlet("/UserInfo")
public class UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInfo() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		int uid=Integer.parseInt(request.getParameter("uid1"));
		
		RegDTO u1=new RegDTO();
		u1.setUid(uid);
		
		RegDAO u2=new RegDAO();

		RegDTO info=u2.search(u1);
		
		if(info != null)
			{
				ServletContext ctx=getServletContext();
				RequestDispatcher rd=ctx.getRequestDispatcher("/Admin/userinfo.jsp");
				
				request.setAttribute("nm",info.getName());
				request.setAttribute("mob",info.getMob());
				request.setAttribute("email",info.getEmail());
				request.setAttribute("gender",info.getGender());
				request.setAttribute("add",info.getAdd());
				request.setAttribute("unm",info.getUnm());
				
				rd.forward(request, response);
			}
		else{			
				ServletContext ctx=getServletContext();
				RequestDispatcher rd=ctx.getRequestDispatcher("/Admin/userinfo.jsp");
				
				request.setAttribute("nm", " No data Found");
				request.setAttribute("mob", " No data Found");
				request.setAttribute("email", " No data Found");
				request.setAttribute("gender", " No data Found");
				request.setAttribute("add", " No data Found");
				request.setAttribute("unm", " No data Found");
				
				rd.forward(request, response);
			}
	
		}catch(Exception ee){System.out.println(ee+" userinfo erorr--");}	
		finally{
				ServletContext ctx=getServletContext();
				RequestDispatcher rd=ctx.getRequestDispatcher("/Admin/userinfo.jsp");
				
				request.setAttribute("nm", " No data Found");
				request.setAttribute("mob", " No data Found");
				request.setAttribute("email", " No data Found");
				request.setAttribute("gender", " No data Found");
				request.setAttribute("add", " No data Found");
				request.setAttribute("unm", " No data Found");
				
				rd.forward(request, response);
		}		
	}
}
