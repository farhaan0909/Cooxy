package CoOxy.Sarvlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import CoOxy.DAO.RegDAO;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profileimg")
@MultipartConfig(fileSizeThreshold = 16177216)
public class Profileimg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profileimg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// getting the perameters from web page.....
		HttpSession hs=request.getSession();
		String unm1=(String) hs.getAttribute("unm");
			
			//inut stream of the uploud file
			InputStream img = null;
			String fname =null;
			String fpath ="E://Users//farha//Web project//Co-Oxy_1.0//src//main//webapp//img//";
			//obtains the uploud file 
			
			//part in this multipart request
			Part filePart = request.getPart("img");
			if(filePart != null)
			{
				fname=filePart.getSubmittedFileName();
				//System.out.println("file name : "+fname);
				//System.out.println("file size : "+filePart.getSize());
				
				img=filePart.getInputStream();
				//System.out.println("file is selected :");	
			 
				// save img folder----
			FileOutputStream fos = new FileOutputStream(fpath+fname);
				byte data[] = new byte[img.available()];
				img.read(data);
				fos.write(data);
				fos.close();
					 
		   	  // save img folder---
			}
			
			RegDAO pro=new RegDAO();
			
			int save = pro.uploadFile(unm1,fname,fpath,img);
			
			if(save > 0)
			 {
				//System.out.println("File upload and :  : Save into database");
				response.sendRedirect("index.jsp");
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





