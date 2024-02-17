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
 
<!-- slider section -->
    <section class=" slider_section position-relative">
        <div class="carousel-inner">
          <div class="carousel-item active">
            <div class="container">
              <div class="row">
                <div class="col-md-4">
                  <div class="img-box">
                    <img src="images/Admin2.jpg" alt="">
                  </div>
                </div> 
  			 <div class="col-md-8">
          	  <div class="detail-box">                 
           	   <div class="container layout_padding2">
      		    <div class="form_contaier">
      		     <h2>
         		    User Feedback's & Contact
         		 </h2><br>
      			 <form action="../Adfeed" method="post">
        		   <div class="form-group">
			             <label for="fid">Id
			                <input type="number" class="form-control" name="fid" id="fid" >
						 </label>
						 <label for="fno">Feedback number
			                <input type="text" class="form-control" name="fno" id="fno" value="<%=(String)request.getAttribute("fno")%>" readonly="readonly">
			             </label>
			        </div>
			        <div class="form-group">
			             <label for="fnm">Name
			                <input type="text" class="form-control" name="fnm" id="fnm" value="<%=(String)request.getAttribute("fnm")%>" readonly="readonly">
			             </label>
			             <label for="fmob">Phone Number
			                <input type="text" class="form-control" name="fmob" id="fmob" value="<%=(String)request.getAttribute("fmob")%>" readonly="readonly">
			             </label>
			        </div>
			        <div class="form-group ">
			             <label for="ft">Feedback /Contact
			                <input type="text" class="form-control" name="ft" id="ft" value="<%=(String)request.getAttribute("ft")%>" readonly="readonly">
			             </label>
			             <label for="fd">Message
			                <input type="text" class="form-control" name="fd" id="fd" value="<%=(String)request.getAttribute("fd")%>" readonly="readonly">
			             </label>
			        </div>
				    <div class="form-group">
			              <button type="submit" value="send">Send</button>
			              <button type="submit" value="pre">Previous</button>
			              <button type="submit" value="next">Next</button>
			        </div>
			    </form>        			 
           	   </div>
              </div>
             </div>
            </div>
           </div>
          </div>
        <a class="carousel-control-prev" href="" role="button" data-slide="prev">
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="" role="button" data-slide="next">
          <span class="sr-only">Next</span>
        </a>
   </div>
  </div>
 </section>
<!-- end slider section -->
 
<!--link footer section -->
 <jsp:include page="footer.jsp"/>
<!--end link footer section -->
</html>

