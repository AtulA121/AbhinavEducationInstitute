<%@page import="com.abhinav.models.Students" %>
<%@page import="com.abhinav.services.StudentService" %>
<%
	if(request.getParameter("applicantStudentId")!=null)
	{
		try
		{
			System.out.println("Applicant is not null :");
			int studentId=Integer.decode(""+request.getParameter("applicantStudentId"));
			session.setAttribute("applicantStudentId",""+studentId);
			System.out.println("Student : "+request.getParameter("applicantStudentId"));
			response.sendRedirect("welcome.jsp?applicantId="+studentId);
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
	}
	else if(session.getAttribute("applicantStudentId")!=null)
	{
		
	}
	else
	{
		System.out.println("redirected to login page :");
		
		%>
			<script>
				window.location.href="../../login.jsp";
			</script>
		<%
	
	}
%>