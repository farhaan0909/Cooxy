<!DOCTYPE html>
<html>
<head>
<!-- link header section -->
<jsp:include page="headlogin.jsp"/>
<!-- end link header section -->

<!-- contact section -->
  <section class="contact_section layout_padding">
    <div class="container">
      <div class="row">
        <div class="custom_heading-container">
          <h2>
           User Login 
          </h2>
        </div>
      </div>
    </div>
    <div class="container layout_padding2">
      <div class="row">
        <div class="col-md-5">
          <div class="form_contaier">
            <form action="Newlogin" method="post"> 
              <div class="form-group">
                <label for="unm">User Name</label>
                <input type="text" class="form-control" name="unm" id="unm">
              </div>
              <div class="form-group">
                <label for="pwd">Password</label>
                <input type="password" class="form-control" name="pwd" id="pwd">
              </div>
              <button type="submit" class="">Log in</button>
            </form>
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