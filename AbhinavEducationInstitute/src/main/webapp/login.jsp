
<jsp:include page="head.jsp" />

<script>
		$(document).ready(function()
		{
				$("#submit").click(function()
				{					
					var applicant= $("#applicant").val();
					var username = $("#username").val();
					var password = $("#password").val();
					
					if((applicant!="null") && (username!="") && (password!=""))
					{			
						
						var patt_email = /[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$/;
						if(patt_email.test(username))
						{
							$.ajax({					
									url : "LoginController",
									method : "GET",
									dataType : "json",
									data : {
												username : username,
												password : password,
												applicant : applicant
											}, 
									success :  function(data)
									{
									//	alert("returned :"+data);
										switch(applicant)
										{
											case "admins" :
													if(data>0)
													{
														var applicantId=data;
														window.location.href="Account/Admin/sessionTrack.jsp?applicantAdminId="+applicantId;
													}
													else
													{
														//$("#data").text("invalid Admin credentials");
														myError("invalid Admin credentials");
													}
													break;
											case "staffs" :
													if(data>0)
													{
														var applicantId=data;
														window.location.href="Account/Staff/sessionTrack.jsp?applicantStaffId="+applicantId;
													}
													else
													{
														//$("#data").text("invalid Staff credentials");
														myError("invalid Staff credentials");
													}
													break;
											case "students" :
													if(data>0)
													{
														var applicantId=data;
														window.location.href="Account/Student/sessionTrack.jsp?applicantStudentId="+applicantId;
													}
													else
													{
														//$("#data").text("invalid Student credentials");
														myError("invalid Student credentials");
													}
													break;
											default :
													break;
										}
									}					
								});
						}
						else
						{
							//$("#data").text("Please enter valid Email :");
							myError("please enter valid email");
						}
					}
					else
					{
						//$("#data").text("please fill all details");
						myError("please fill all details");
					}

				});				
		});

						
</script>

<div class="container" style="width:50%">

<script> function myError(myvar) { document.getElementById("alert-info").style.display = "block"; $("strong").text(myvar); } </script>
<div class='alert alert-info alert-dismissible fade in' id='alert-info' style='display:none'><strong></strong></div>

	<h3>Login to Account !</h3><br>

<div class="row">

<p>Login Type <select id="applicant" class="form-control">
	<option value="null">Select Applicant</option>
    <option value="students">Student / Applicant</option>
    <option value="staffs">Staff Member</option>
    <option value="admins">Administrator</option>
    </select>
    
<p>Email <input type="text" id="username"  class="form-control"><p>

<p>Password <input type="text" id="password"  class="form-control">

<p><button id="submit" class="btn btn-primary">Login</button>

<a href="forget_password.jsp">Forget Password ?</a> <a href="register.jsp">new user ?</a>


</div>
</div>

<jsp:include page="tail.jsp" />