<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<% String unm1; %>
<% HttpSession hs=request.getSession(false);
	unm1 =(String)hs.getAttribute("unm");
	
	if(unm1==null){
		response.sendRedirect("login.jsp");
	}
%>
<!-- link header section -->
<jsp:include page="header.jsp"/>
<!-- end link header section -->

 <!-- contact section -->
  <section class="contact_section layout_padding">
    <div class="container">
      <div class="row">
        <div class="custom_heading-container ">
          <h2>-:  MY Profile :-</h2>
        </div>
      </div>
    </div>
    <div class="container layout_padding2">
      <div class="row">
        <div class="col-md-5">
          <div class="form_contaier">
            <form action="Update" method="post">
               <div class="form-group">
                <label for="unm">User Name</label>
                <input type="text" class="form-control" name="unm" value="<%= (String)request.getAttribute("unm") %>" id="unm" readonly="readonly">
              </div>
              <div class="form-group">
                <label for="nm">Name</label>
                <input type="text" class="form-control" name="nm" value="<%= (String)request.getAttribute("nm") %>" id="nm" required="required">
              </div>
              <div class="form-group">
                <label for="mob">Mobile Number</label>
                <input type="text" class="form-control" name="mob" value="<%= (String)request.getAttribute("mob") %>" id="mob" required="required">
              </div>
              <div class="form-group">
                <label for="email">Email Id</label>
                <input type="email" class="form-control" name="email" value="<%= (String)request.getAttribute("email") %>" id="email" required="required">
              </div>
              <div class="form-group ">
                <label for="gender">Gender</label>
                <input type="text" class="form-control" name="gender" value="<%= (String)request.getAttribute("gender") %>" id="gender" required="required">
              </div>
              <div class="form-group">
                <label for="add">Address</label>
                <input type="text" class="form-control" name="add" value="<%= (String)request.getAttribute("add") %>" id="add" required="required">
              </div><!--  -->
              <div class="form-group">
           		 <button type="submit" >update</button>
          	 </div>	 
   		 </form>
   		</div>
       </div>
<!-- profile image upload section -->
    <div class="form_contaier">
      <form action="Profileimg" method="post" enctype="multipart/form-data">
       <div class="form-group">
         <div class="img-box">  
          	<img src="img/<%=(String)request.getAttribute("fname") %>" name="fname" style="width: 220px; height: 220px; border-radius: 150px;"><br><br> 
         </div>
            <label for="img">Update Image</label><br>
            <input type="file" name="img" id="img" size="1" required="required">
          <div class="form-group">
            <button type="submit" value="submit">upload</button>
          </div>  
       </div>
      </form>
     </div>
 <!-- end profile image upload section -->
   
  
 </section>
 <!-- end contact section -->

 <!--link footer section -->
 <jsp:include page="footer.jsp"/>
<!--end link footer section -->
</body>
</html>