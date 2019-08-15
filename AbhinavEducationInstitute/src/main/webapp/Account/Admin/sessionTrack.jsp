<%@page import="com.abhinav.models.Admins" %>
<%@page import="com.abhinav.services.AdminService" %>

<%
	if(request.getParameter("applicantAdminId")!=null)
	{
		try
		{
			System.out.println("Applicant is not null :");
			int adminId=Integer.decode(""+request.getParameter("applicantAdminId"));
			session.setAttribute("applicantAdminId",""+adminId);
			System.out.println("Admin : "+request.getParameter("applicantAdminId"));
			response.sendRedirect("welcome.jsp?applicantAdminId="+adminId);
		}
		catch(Exception e)
		{
			System.out.println("Exception in Admin of sessionTrack.jsp : "+e);
		}
	}
	else if(session.getAttribute("applicantAdminId")!=null)
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