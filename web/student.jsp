<%-- 
    Document   : student
    Created on : Oct 28, 2023, 10:48:08 AM
    Author     : Pubudu Kasun
--%>

<%@page import="java.util.List"%>
<%@page import="DAO.dto.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Student</title>



        <link rel="stylesheet" href="Bootsrap/css/bootstrap.min.css">
        <script src="Bootsrap/jqueary/jquery.min.js"></script>
        <script src="Bootsrap/js/bootstrap.min.js"></script>

    </head>

    <body>

        <div class="container bg-info mb-3">

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <h1>ADD NEW STUDENT</h1>
                </div>
                <div class="col-sm-3"></div>
            </div>


            <div class="row">
                <div class="col-sm-2"></div>
                <div class="col-sm-8">
                    <div class="form-group mb-3">
                        <input class="form-control" type="text" name="stuid" id="stuid" placeholder="Student ID"/>
                    </div>
                    <div class="form-group  mb-3">
                        <input class="form-control" type="text" name="name" id="name" placeholder="Student Name"/>
                    </div>
                    <div class="form-group mb-3">
                        <input class="form-control" type="text" name="address" id="age" placeholder="Student Address"/>
                    </div>
                    <div class="form-group mb-3">
                        <button class="btn btn-primary btn-block" id="saveButton">Save Student</button>

                    </div>

                </div>
                <div class="col-sm-2"></div>
            </div>
        </div>




        <!-- Modal -->
        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Customer Saving</h4>
                    </div>
                    <div class="modal-body">
                        <p>Saving Success</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-success" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
        </div>


        <div class="container">
            <div class="row">
                <div class="col-md-1"></div>

                <%
                    if (session.getAttribute("studentlist") != null) {


                %>


                <div class="col-md-10">
                    <table class="table table-light" id="custab2">
                        <tr>
                            <th>STUDENT ID</th>
                            <th>STUDENT NAME</th>
                            <th>STUDENT AGE</th>
                            <th>DELETE ACTION</th>
                        </tr> 
                        <%                            List<Student> list = (List<Student>) session.getAttribute("studentlist");
                            for (Student student : list) {

                        %>
                        <tr>
                            <td><%= student.getId()%></td>
                            <td><%= student.getName()%></td>
                            <td><%= student.getAge()%></td>
                            <td><a href="DeleteStudent?stuid=<%=student.getId()%> "><button class="btn btn-warning">Delete</button></a></td>
                        </tr>
                        <%
                            }
                        %>

                    </table>
                </div>
                <%
                    }

                %>
                <div class="col-md-1"></div>
            </div>
        </div>




    </body>

    <script>

        $(document).ready(function () {
            $("#saveButton").click(function () {
                var stuid = $("#stuid").val();
                var name = $("#name").val();
                var age = $("#age").val();

                $.ajax({
                    type: 'POST',
                    url: "StudentSave",
                    data: {"stuid": stuid, "name": name, "age": age},
                    success: function (data) {
                        window.location = "student.jsp";
                    },
                    error: function () {

                    }
                });
            });

        });
    </script>
</html>
