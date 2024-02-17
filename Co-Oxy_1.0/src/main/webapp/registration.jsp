<!DOCTYPE html>
<html>
<!-- link header section -->
<jsp:include page="headlogin.jsp"/>
<!-- end link header section -->
 <!-- contact section -->
  <section class="contact_section layout_padding">
    <div class="container">
      <div class="row">
        <div class="custom_heading-container ">
          <h2>
           Registration Page
          </h2>
        </div>
      </div>
    </div>
    <div class="container layout_padding2">
      <div class="row">
        <div class="col-md-5">
          <div class="form_contaier">
            <form action="Newregistration" method="post">
              <div class="form-group">
                <label for="nm">Name</label>
                <input type="text" class="form-control" name="nm" id="nm" required="required">
              </div>
              <div class="form-group">
                <label for="mob">Mobile Number</label>
                <input type="text" class="form-control" name="mob"  id="mob" required="required">
              </div>
              <div class="form-group">
                <label for="email">Email Id</label>
                <input type="email" class="form-control" name="email" id="email" required="required">
              </div>
              <div class="form-group ">
                <label for="gender">Select Gender</label>
                <select name="gender" id="gender" class="form-control" required="required">
                  <option selected>Male</option>
                  <option >Female</option>
                  <option >Trans</option>
                </select>
              </div>
              <div class="form-group">
                <label for="add">Address</label>
                <input type="text" class="form-control" name="add" id="add" required="required">
              </div>
             <div class="form-group">
                <label for="unm">User Name</label> 
                	<script>show(){alert('Username already exists. Please choose a different username.');}</script>
                <input type="text" class="form-control" name="unm" id="unm" required="required">
              </div>
               <div class="form-group">
                <label for="pwd">Password</label>
                <input type="password" class="form-control" name="pwd" id="pwd" required="required">
              </div>
              
              <button type="submit" class="">Register Now</button>
            </form>
          </div>
        </div>
        <div class="col-md-7">
          <div class="detail-box">
            <h3>
              Get Now Oxygen
            </h3>
            <p>
              There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration
              in some form, by injected humour, or randomised words which don't look even slightly believable.
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