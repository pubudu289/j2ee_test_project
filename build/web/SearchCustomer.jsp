<%-- 
    Document   : SearchCustomer
    Created on : Oct 16, 2023, 2:46:21 PM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Customer</title>
        <link rel="stylesheet" href="Bootsrap/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <h1> Search Customer via Customer ID:</h1>
                </div>
                <div class="col-md-2"></div>
            </div>

            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-2">
                    <label>Customer ID:</label>
                </div>
                <div class="col-md-3">
                    <input class="form-control" type="text" name="cusid" id="cusid"/>
                </div>
                <div class="col-md-1">
                    <button class="btn btn-warning btn-block" onclick="search()">Search</button>
                </div>
                <div class="col-md-4"></div>
            </div>

        </div>
        <br>

        <div class="container">
            <div class="row">
                <div class="col-md-1"></div>
                <div class="col-md-10">
                    <table class="table table-light" id="custab1">
                        <tr>
                            <th>ID</th>
                            <th>FIRST NAME</th>
                            <th>LAST NAME</th>
                            <th>EMAIL</th>
                            <th>USERNAME</th>
                            <th>PASSWORD</th>
                            <th>STATUS</th>
                        </tr> 
                        <tbody id="tabbody"></tbody>
                    </table>
                </div>
                <div class="col-md-1"></div>
            </div>
        </div>

    </body> 
    <script>
        function search() {
            var cusid = document.getElementById('cusid').value;
            var xhttp = new XMLHttpRequest();
                
            xhttp.onload = function () {
                var response = this.responseText;
                document.getElementById('tabbody').innerHTML = response;
            }
            xhttp.open('GET', 'CustomerSearch?cusid=' + cusid);
            xhttp.send();
        }
    </script>
</html>
