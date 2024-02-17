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

 <!-- discount section -->

  <section class="discount_section">
    <div class="container-fluid">
      <div class="row">
        <div class="col-lg-3 col-md-5 offset-md-2">
          <div class="detail-box">
            <h2>You get <br>any Type Oxygen Cylinder <br>on
              <span>10% discount</span>
            </h2>
            <p>It is a long established fact that a reader will be distracted by</p>
            <div>
               <a href="">Buy Now</a>
            </div>
          </div>
        </div>
        <div class="col-lg-7 col-md-5">
          <div class="img-box">
            <img src="images/logo.jpg" alt="">
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- end discount section -->

  <!-- health section -->
  <section class="health_section layout_padding">
    <div class="health_carousel-container">
      <h2 class="text-uppercase">
        Oxygen Cylinder
      </h2>
      <div class="carousel-wrap layout_padding2">
        <div class="owl-carousel">
          <div class="item">
            <div class="box">
              <div class="btn_container">
                <a href="">Buy Now</a>
              </div>
              <div class="img-box">
                <img src="images/6.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i>

                </div>
                <div class="text">
                  <h6><span style=" color: red;">10% off </span> 5 kg </h6>
                  <h6 class="price"><span> &#8377; </span> 699</h6>
                </div>
              </div>
            </div>
            <div class="box">
              <div class="btn_container">
                 <a href="">Buy Now</a>
              </div>
              <div class="img-box">
                <img src="images/color1.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i>
                </div>
                <div class="text">
                  <h6><span style=" color: red;">10%off</span>15kg</h6>
                  <h6 class="price"><span>&#8377;</span>1499</h6>
                </div>
              </div>
            </div>
          </div>
          <div class="item">
            <div class="box">
              <div class="btn_container">
                 <a href="">Buy Now</a>
              </div>
              <div class="img-box">
                <img src="images/6.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i>

                </div>
                <div class="text">
                  <h6><span style=" color: red;">10% off </span> 5 kg </h6>
                  <h6 class="price"><span> &#8377; </span> 699</h6>
                </div>
              </div>
            </div>
            <div class="box">
              <div class="btn_container">
                <a href="">Buy Now</a>
              </div>
              <div class="img-box">
                <img src="images/color1.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i>
                </div>
                <div class="text">
                  <h6><span style=" color: red;">10%off</span>15kg</h6>
                  <h6 class="price"><span>&#8377;</span>1499</h6>
                </div>
              </div>
            </div>
          </div>
          <div class="item">
            <div class="box">
              <div class="btn_container">
                 <a href="">Buy Now</a>
              </div>
              <div class="img-box">
                <img src="images/6.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i>
                </div>
               <div class="text">
                  <h6><span style=" color: red;">10% off </span> 5 kg </h6>
                  <h6 class="price"><span> &#8377; </span> 699</h6>
                </div>
              </div>
            </div>
            <div class="box">
              <div class="btn_container">
                 <a href="">Buy Now</a>
              </div>
              <div class="img-box">
                <img src="images/color1.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i>
                </div>
                <div class="text">
                  <h6><span style=" color: red;">10%off</span>15kg</h6>
                  <h6 class="price"><span>&#8377;</span>1499</h6>
                </div>
              </div>
            </div>
          </div>
          <div class="item">
            <div class="box">
              <div class="btn_container">
                <a href="">Buy Now</a>
              </div>
              <div class="img-box">
                <img src="images/6.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i>
                </div>
               <div class="text">
                  <h6><span style=" color: red;">10% off </span> 5 kg </h6>
                  <h6 class="price"><span> &#8377; </span> 699</h6>
                </div>
              </div>
            </div>
            <div class="box">
              <div class="btn_container">
                 <a href="">Buy Now</a>
              </div>
              <div class="img-box">
                <img src="images/color1.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i>
                </div>
               <div class="text">
                  <h6><span style=" color: red;">10%off</span>15kg</h6>
                  <h6 class="price"><span>&#8377;</span>1499</h6>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="health_carousel-container">
      <h2 class="text-uppercase">
       Oxygen Cylinder
      </h2>
      <div class="carousel-wrap layout_padding2">
        <div class="owl-carousel owl-2">
          <div class="item">
            <div class="box">
              <div class="btn_container">
                 <a href="">Buy Now</a>
              </div>
              <div class="img-box">
                <img src="images/5.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i> 
                </div>
                <div class="text">
                  <h6><span style=" color: red;">10% off </span>10kg</h6>
                  <h6 class="price"><span>&#8377;</span>1199</h6>
                </div>
              </div>
            </div>
          </div>
          <div class="item">
            <div class="box">
              <div class="btn_container">
                <a href="">Buy Now</a>
              </div>
              <div class="img-box">
                <img src="images/5.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i>
                </div>
                <div class="text">
                  <h6><span style=" color: red;">10% off </span>10kg</h6>
                  <h6 class="price"><span>&#8377;</span>1199</h6>
                </div>
              </div>
            </div>
          </div>
          <div class="item">
            <div class="box">
              <div class="btn_container">
                <a href="">
                  Buy Now
                </a>
              </div>
              <div class="img-box">
                <img src="images/5.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i>

                </div>
                <div class="text">
                  <h6><span style=" color: red;">10% off </span>10kg</h6>
                  <h6 class="price"><span>&#8377;</span>1199</h6>
                </div>
              </div>
            </div>
          </div>
          <div class="item">
            <div class="box">
              <div class="btn_container">
                <a href="">Buy Now</a>
              </div>
              <div class="img-box">
                <img src="images/5.jpg" alt="">
              </div>
              <div class="detail-box">
                <div class="star_container">
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star" aria-hidden="true"></i>
                  <i class="fa fa-star-o" aria-hidden="true"></i>
                </div>
               <div class="text">
                  <h6><span style=" color: red;">10% off </span>10kg</h6>
                  <h6 class="price"><span>&#8377;</span>1199</h6>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="d-flex justify-content-center">
      <a href="">See more</a>
    </div>
  </section>
  <!-- end health section -->

  <!--link footer section -->
 <jsp:include page="footer.jsp"/>
<!--end link footer section -->
</body>

</html>