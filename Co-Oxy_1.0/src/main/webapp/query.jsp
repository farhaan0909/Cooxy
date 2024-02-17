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
          <h2>
           Your's Query
          </h2>
        </div>
      </div>
    </div>
    <div class="container layout_padding2">
      <div class="row">
        <div class="col-md-5">
          <div class="form_contaier">
            <form action="Query" method="post">
              <div class="form-group">
                <label for="exampleInputName1">Name</label>
                <input type="text" class="form-control" name="nm" id="nm" required="required">
              </div>
              <div class="form-group">
                <label for="exampleInputNumber1">Phone Number</label>
                <input type="text" class="form-control" name="mob" id="mob" required="required">
              </div>
               <div class="form-group ">
                <label for="inputState">Select type of query</label>
                <select id="qt" class="form-control" name="qt">
                  <option selected>Delivery related</option>
                  <option >Product related</option>
                  <option >Other Query</option>
                </select>
              </div>
               <div class="form-group">
                <label for="exampleInputMessage">Write your Query</label>
                <input type="text" class="form-control" name="qw" id="qw" required="required">
              </div>
              <div class="form-group">
                <label for="exampleInputMessage">Try My Best Solution</label>
                <textarea class="form-control" id="exampleInputMessage" readonly="readonly"><%= (String)request.getAttribute("qans")%></textarea>
              </div>
              <button type="submit" class="">Send</button>
            </form>
          </div>
        </div>
        <div class="col-md-7">
          <div class="detail-box">
            <h3>
              Get Now Oxygen
            </h3>
            <p>
             COVID-19 OXG is out facility so that you can book cylinder and get it on time.
             In today's era, online shopping is the trend, which is being used by everyone, in the online world,
             we can see many websites to buy anything and buy the right item for ourselves. In this we have to pay pesos.
             There are savings.It is very easy to pay in this as soon as the options of online payment and case on delivery are given,
             which will also be easy to pay.
            </p>
          </div>
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