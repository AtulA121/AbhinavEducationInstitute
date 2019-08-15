<jsp:include page="sessionTrack.jsp" />
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Abhinav Computer Education</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link href='http://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet'>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

<style>
body {
	font-family: laila;
}
</style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="welcome.jsp"> Welcome Admin - <%=session.getAttribute("applicantAdminFullName") %></a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="centers.jsp">centers</a></li>	
		<li><a href="courses.jsp">courses</a></li>
		<li><a href="batches.jsp">batches</a></li>
		
		<li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="head.jsp">
        <span class="glyphicon"></span> students
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="batch_student.jsp">Link Batch</a></li>
          <li><a href="students.jsp">Manipulate</a></li>
          <li><a href="installment.jsp">installment</a></li>
		  <li><a href="results.jsp">results</a></li>
        </ul>
      </li>
      
      		<li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="head.jsp">
        <span class="glyphicon"></span> staffs
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="batch_staff.jsp">Link Batch</a></li>
          <li><a href="staffs.jsp">Manipulate</a></li>
          <li><a href="staffs_payment.jsp">staffs payment</a></li>
          <li><a href="post_vacancies.jsp">post vacancies</a></li>
        </ul>
      </li>		
		
	<li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="head.jsp">
        <span class="glyphicon"></span>Attendance <!-- for administrator account -->
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="fill_att_staff.jsp">Fill Staff Attendance</a></li>
          <li><a href="attendance.jsp?att_of=staffs">View Staff Attendance</a></li>
          <li><a href="attendance.jsp?att_of=students">View Student Attendance</a></li>
        </ul>
      </li>		


		<li><a href="other_expense.jsp">other expense</a></li>	      
    </ul>
    
<ul class="nav navbar-nav navbar-right">      
      
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="head.jsp">
        <span class="glyphicon glyphicon-wrench"></span> Setting
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="change_password.jsp">Change Password</a></li>
          <li><a href="download_data.jsp">download data</a></li>
		  <li><a href="reports.jsp">reports</a></li>
        </ul>
      </li>

<li><a href="logout.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>

    </ul>
  </div>
</nav>


</body>
</html>
