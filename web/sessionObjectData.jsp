<%-- 
    Document   : sessionObjectData
    Created on : Nov 12, 2023, 2:44:49 AM
    Author     : Pubudu Kasun
--%>

<%@page import="DAO.dto.Student"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="SessionObjectDataServlet">Click Here</a>

        <br>
        <table border="1">
            <tr>
                <th>UUID</th>
                <th>Date</th>
            </tr>
            <%
                if (session.getAttribute("mydata") != null) {
                    List<Student> list = (List<Student>) session.getAttribute("mydata");
                    for (Student student : list) {
            %>
            <tr>
                <td><%= student.getId()%> </td>
                <td><%= student.getName()%> </td>

            </tr>


            <%                }

                }
            %>
        </table>
    </body>
</html>
