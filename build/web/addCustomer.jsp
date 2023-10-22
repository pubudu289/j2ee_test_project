<%-- 
    Document   : addCustomer
    Created on : Oct 16, 2023, 9:19:16 PM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Customer</title>



        <link rel="stylesheet" href="Bootsrap/css/bootstrap.min.css">
        <script src="Bootsrap/jqueary/jquery.min.js"></script>
        <script src="Bootsrap/js/bootstrap.min.js"></script>

    </head>

    <body>

        <div class="container bg-info mb-3">

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <h1>ADD NEW CUSTOMER</h1>
                </div>
                <div class="col-sm-3"></div>
            </div>


            <div class="row">
                <div class="col-sm-2"></div>
                <div class="col-sm-8">
                    <div class="form-group mb-3">
                        <input class="form-control" type="text" name="cusid1" id="cusid1" placeholder="Customer ID"/>
                    </div>
                    <div class="form-group  mb-3">
                        <input class="form-control" type="text" name="fname" id="fname" placeholder="Customer First Name"/>
                    </div>
                    <div class="form-group mb-3">
                        <input class="form-control" type="text" name="lname" id="lname" placeholder="Customer Last Name"/>
                    </div>
                    <div class="form-group  mb-3">
                        <input class="form-control" type="text" name="email" id="email" placeholder="Customer Email"/>
                    </div>
                    <div class="form-group mb-3">
                        <input class="form-control" type="text" name="uname" id="uname" placeholder="Customer User Name"/>
                    </div>
                    <div class="form-group  mb-3">
                        <input class="form-control" type="password" name="pass1" id="pass1" placeholder="Password"/>
                    </div>
                    <div class="form-group mb-3">
                        <input class="form-control" type="password" name="pass2" id="pass2" placeholder="Confirm Password"/>
                    </div>
                    <div class="form-group  mb-3 id_100">
                        <select class="form-control" id="stat">
                            <option value="1">Active</option>
                            <option value="0">Inactive</option>
                        </select>
                    </div>
                    <div class="form-group mb-3">
                        <button class="btn btn-primary btn-block" onclick="CustomerSave()">Save Customer</button>
                        
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
                <div class="col-md-10">
                    <table class="table table-light" id="custab2">
                        <tr>
                            <th>ID</th>
                            <th>FIRST NAME</th>
                            <th>LAST NAME</th>
                            <th>EMAIL</th>
                            <th>USERNAME</th>
                            <th>PASSWORD</th>
                            <th>STATUS</th>
                            <th>UPDATE ACTION</th>
                            <th>DELETE ACTION</th>
                        </tr> 
                        <tbody id="tab3"></tbody>

                    </table>
                </div>
                <div class="col-md-1"></div>
            </div>
        </div>




    </body>

    <script>
        $(document).ready(function (){
            CustomersSearch() 
        });
        
        function CustomerSave() {
            var id = document.getElementById('cusid1').value;
            var fname = document.getElementById('fname').value;
            var lname = document.getElementById('lname').value;
            var mail = document.getElementById('email').value;
            var uname = document.getElementById('uname').value;
            var pass1 = document.getElementById('pass1').value;
            var pass2 = document.getElementById('pass2').value;
            var stat = document.getElementById('stat').value;

            var xhttp = new XMLHttpRequest();

            xhttp.onload = function () {
                $("input:text").val("");
                $("input:password").val("");
                $("div.id_100 select").val("1").change();
                CustomersSearch();
                $('#myModal').modal('toggle');
            
            }
            xhttp.open("POST", "CustomerSave?cusid1=" + id + "&fname=" + fname + "&lname=" + lname + "&uname=" + uname + "&email=" + mail + "&pass1=" + pass1 + "&pass2=" + pass2 + "&stat=" + stat);
            xhttp.send();

        }

        function CustomersSearch() {
            var xhttp = new XMLHttpRequest();
            xhttp.onload = function () {
                document.getElementById('tab3').innerHTML = this.responseText;
            }
            xhttp.open("POST", "CustomersLoad");
            xhttp.send();
        }
    </script>
</html>
