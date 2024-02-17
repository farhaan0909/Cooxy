package CoOxy.Sarvlet;

import CoOxy.DAO.RegDAO;
import CoOxy.DTO.RegDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Newregistration
 */
@WebServlet("/Newregistration")
public class Newregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Newregistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		RegDTO r1=new RegDTO();
		r1.setName(request.getParameter("nm"));
		r1.setMob(request.getParameter("mob"));
		r1.setEmail(request.getParameter("email"));
		r1.setGender(request.getParameter("gender"));
		r1.setAdd(request.getParameter("add"));
		r1.setUnm(request.getParameter("unm"));
		r1.setPwd(request.getParameter("pwd"));
		
		RegDAO rt=new RegDAO();
			rt.uniquser(r1);
		int x=rt.insert(r1);
			
		 if(x == 1){
			 response.sendRedirect("login.jsp");
		 }
		 if(x == 2){
			 response.sendRedirect("registration.jsp");
		 }
		 else
		 {
			 response.sendRedirect("registration.jsp");
		 }
		}catch(Exception ee) {System.out.println(ee+"new reg servlet error");}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
