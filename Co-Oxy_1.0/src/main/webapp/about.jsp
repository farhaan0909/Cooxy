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

 <!-- about section -->
  <section class="about_section layout_padding">
    <div class="container">
      <div class="custom_heading-container ">
        <h2>
          About Us
        </h2>
      </div>
      <div class="img-box">
        <img src="images/about1.jpg" alt="" style="border-radius: 20px;">
      </div>
      <div class="detail-box">
        <p>
          Due to Covid , people needed oxygen a lot to save their lives, but some people have made it a business.
          In this difficult devotee, we have created this website to help people so that people can get cylinders at reasonable prices.
          This website has been made keeping in mind that they can get cylinders in working time and without spending much money.
          Not only does it save money, it also their time. In this era of Covid, there is small effort to reduce people's problems regarding Oxygen.
        </p>
        <div class="d-flex justify-content-center">
          <a href="">
            Read More
          </a>
        </div>
      </div>
    </div>
  </section>
<!-- end about section -->

<!--link footer section -->
 <jsp:include page="footer.jsp"/>
<!--end link footer section -->
</body>
</html>