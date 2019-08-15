<jsp:include page="head.jsp" />

<%

	session.invalidate();
	System.out.println("Sesssion invalidated :");
	response.sendRedirect("../../login.jsp");
	
%>
logout admin page here.........

