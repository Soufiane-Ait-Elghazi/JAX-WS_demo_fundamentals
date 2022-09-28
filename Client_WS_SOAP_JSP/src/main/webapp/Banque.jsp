<%@page import="ws.BanqueServiceProxy"%>
<%@page import="ws.BanqueService"%>
<%@page import="ws.BanqueWS"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    double montant = 0; double res = 0;
    if(request.getParameter("montant")!= null){
    	montant = Double.parseDouble(request.getParameter("montant"));
    	BanqueServiceProxy stub = new BanqueServiceProxy();
    	res = stub.conversionEuroToDH(montant);
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="Banque.jsp">
		  Montant : <input type="text" name="montant" value="<%=montant%>">
		  <button type="submit" value="OK"></button>
		</form>
		<%=montant%> en Euro  = <%=res%> en DH
		
</body>
</html>