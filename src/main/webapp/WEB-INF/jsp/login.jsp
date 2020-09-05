 <%@ include file="include/header.jsp" %>
<div class="jumbotron jumbotron-fluid" style="margin:100px;">
<div class="container">
<form method="POST" action="/evanika/user/login">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
 </div>
 </div>
 <%@ include file="include/footer.jsp" %>
