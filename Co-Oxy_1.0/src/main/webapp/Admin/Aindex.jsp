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
      <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
        </ol>
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
                    <h1>
                      Welcome To<br>
                      <span>
                        Admin Panel
                      </span>

                    </h1>
                    <p>
                      A solution to reduce the black marketing of oxygen cylinders during the Covid-19 OXG lockdown period is that by which 
                      we will try to provide cylinders,to the people at reasonable prices and on time,
                      which will save both the time and money of the people or which will help the people.Pesa Blake I'm going to stop in that.
                    </p>
                    <div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="carousel-item">
            <div class="container">
              <div class="row">
                <div class="col-md-4">
                  <div class="img-box">
                    <img src="images/Admin2.jpg" alt="">
                  </div>
                </div>
                <div class="col-md-8">
                  <div class="detail-box">
                    <h1>
                      Welcome To<br>
                      <span>
                        Admin Panel
                      </span>

                    </h1>
                    <p>
                      A solution to reduce the black marketing of oxygen cylinders during the Covid-19 OXG lockdown period is that by which 
                      we will try to provide cylinders,to the people at reasonable prices and on time,
                      which will save both the time and money of the people or which will help the people.Pesa Blake I'm going to stop in that.
                    </p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
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