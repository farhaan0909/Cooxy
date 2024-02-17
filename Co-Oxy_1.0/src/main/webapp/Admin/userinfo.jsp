<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<% String unm1; %>
<% HttpSession hs=request.getSession(false);
	unm1 =(String)hs.getAttribute("unm");
	
	if(unm1==null){
		response.sendRedirect("../login.jsp");
	}
%>
<!-- link header section -->
<jsp:include page="header.jsp"/>
<!-- end link header section -->

  <!-- contact section -->
  <section class="contact_section layout_padding">
    <div class="container">
       <h2>User Information</h2>
    </div>
    <div class="container layout_padding2">
      <div class="row">
          <div class="form_contaier">
            <form action="../UserInfo" method="post">
           	  <div class="form-group">
                <label for="uid1">User ID 
                 <input type="text" class="form-control" name="uid1" id="uid1" required="required"></input>
                </label>  
                <button type="submit" value="submit">Send</button> 
              </div>            
               <div class="form-group">
                <label for="unm">User Name
                <input type="text" class="form-control" name="unm" value="<%= (String)request.getAttribute("unm") %>" id="unm" >
               </label>
                <label for="nm">Name
                <input type="text" class="form-control" name="nm" value="<%= (String)request.getAttribute("nm") %>" id="nm">
                </label>
              </div>
              <div class="form-group">
                <label for="mob">Mobile Number
                <input type="text" class="form-control" name="mob" value="<%= (String)request.getAttribute("mob") %>" id="mob">
                </label>
                <label for="email">Email Id
                <input type="email" class="form-control" name="email" value="<%= (String)request.getAttribute("email") %>" id="email">
                </label>
              </div>
              <div class="form-group ">
                <label for="gender">Gender
                <input type="text" class="form-control" name="gender" value="<%= (String)request.getAttribute("gender") %>" id="gender" >
                </label>
                <label for="add">Address
                <input type="text" class="form-control" name="add" value="<%= (String)request.getAttribute("add") %>" id="add">
                </label>
              </div>
            </form>             
         </div>
        </div>
      </div>
  </section>
 <!-- end contact section -->

<!--link footer section -->
 <jsp:include page="footer.jsp"/>
<!--end link footer section -->
</body>
</html>