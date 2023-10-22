<%-- 
    Document   : login
    Created on : Oct 22, 2023, 10:41:18 AM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>signing Page</title>


        <link rel="stylesheet" href="Bootsrap/css/all.min.css">
        <link rel="stylesheet" href="Bootsrap/css/bootstrap.min_1.css">
        <link rel="stylesheet" href="Bootsrap/css/style.css">
        <script src="Bootsrap/jqueary/jquery.min.js"></script>

    </head>
    <body class="bg-light">
        <%
            if (request.getSession().getAttribute("UserData") != null) {
                response.sendRedirect("Home.jsp");
            }
        %>

        <div class="container mt-10 pt-5">
            <div class="row">
                <div class="col-5 col-sm-5 col-nd-5 m-auto">
                    <div class="card wrapper">
                        <div class="card-body">
                            <form action="#">
                                <div class="mb-3 text-center">
                                    <h1>Sign In Here</h1>
                                </div>
                                <input type="text"  class="form-control my-4 py-2" id="forUsername" for="forUsername" placeholder="User Name">
                                <input type="text" class="form-control  my-4 py-2" id="forPassword"  for="forPassword"  placeholder="Password">
                                <div class="mb-3">
                                    <button type="button" class="btn btn-success btn-block" id="loginButton"  onclick="login()">Sign In</button>
                                </div>
                                <p class="text-center text-muted " >Register Now for Free By Clicking <a class="term" href="signup.jsp">Register Now</a> Button</p>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>

    <script>

        $(document).ready(function () {
            $('#loginButton').click(function () {

                var userName = $('#forUsername').val();
                var password = $('#forPassword').val();

                $.ajax({
                    type: 'POST',
                    url: "userLogin",
                    data: {"username": userName, "password": password},
                    success: function (data) {
                        if (data === "00") {
                            window.location = "Home.jsp";
                        } else {
                            window.location = "login.jsp";
                        }
                    },
                    error: function () {

                    }

                });

            });
        });
    </script>



</html>
