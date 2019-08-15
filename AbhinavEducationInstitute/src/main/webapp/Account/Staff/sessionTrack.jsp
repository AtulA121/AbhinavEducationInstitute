<%@page import="com.abhinav.models.Staffs" %>
<%@page import="com.abhinav.services.StaffService" %>
<%
	if(request.getParameter("applicantStaffId")!=null)
	{
		try
		{
			System.out.println("Applicant is not null :");
			int staffId=Integer.decode(""+request.getParameter("applicantStaffId"));
			session.setAttribute("applicantStaffId",""+staffId);
			System.out.println("Staffs : "+request.getParameter("applicantStaffId"));
			
			response.sendRedirect("welcome.jsp?applicantId="+staffId);
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
	}
	else if(session.getAttribute("applicantStaffId")!=null)
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