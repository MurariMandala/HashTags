<%@page import="java.util.Map"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${Msg}

<% 
if(request.getAttribute("HashTagsMap")!=null){
	HashMap hm=(HashMap)request.getAttribute("HashTagsMap");
	Set set=(Set)hm.entrySet();
	Iterator mapitr=set.iterator();
	
	%>
	
										
<table>
<thead>
<tr><th>Hash Tag </th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Count</th></tr></thead>

   <%
   int n=0;
	while(mapitr.hasNext()){
		Map.Entry mapentry=(Map.Entry)mapitr.next();
		String key=(String)mapentry.getKey();
		String value=(String)mapentry.getValue();
		n=n+1;
		%>
		<tr><td><%=n%>&nbsp;&nbsp;&nbsp;<%=key%></td>
	    											 <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=value%></td></tr>
		<%--   <%= key%>  -  <%= value%><br> --%>
<%	}
   %></table><%	
	
}

%>

</body>
</html>