<%-- 
    Document   : Employee
    Created on : Oct 19, 2023, 2:31:00 AM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Employee</title>
        <link rel="stylesheet" href="Bootsrap/css/bootstrap.min.css">
        <script src="Bootsrap/jqueary/jquery.min.js"></script>
        <script src="Bootsrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container bg-light mb-5">

            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <h1>LOAD EMPLOYEES</h1>
                </div>
                <div class="col-sm-3"></div>
            </div>


            <div class="row">
                <div class="col-md-1"></div>
                <div class="col-md-10">
                    <table class="table table-light" id="custab2">
                        <tr>
                            <th>ID</th>
                            <th>EMP NO</th>
                            <th>FIRST NAME</th>
                            <th>LAST NAME</th>
                            <th>MOBILE</th>
                            <th>EMAIL</th>
                            <th>SALARY</th>
                            <th>ACCESS ACTION</th>
                            <th>DELETE ACTION</th>
                        </tr> 
                        <tbody id="tabdes"></tbody>

                    </table>
                </div>
                <div class="col-md-1"></div>
            </div>
        </div>




        <!--     modal-->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Set Temporary User</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="Employee.jsp" method="POST">
                            <div class="form-group">
                                <label for="recipient-name" class="col-form-label">Employee ID</label>
                                <input type="text" class="form-control" id="recipient-uid" readonly>
                            </div>
                            <div class="form-group">
                                <label for="recipient-name" class="col-form-label">USer Name</label>
                                <input type="text" class="form-control" id="recipient-uname">
                            </div>
                            <div class="form-group">
                                <label for="recipient-name" class="col-form-label">Password</label>
                                <input type="text" class="form-control" id="recipient-pw">
                            </div>

                            <div class="form-group  id_100">
                                <label for="recipient-name" class="col-form-label">Status</label>
                                <select class="form-control" id="recipient-stat">
                                    <option value="1">Active</option>
                                    <option value="0">Inactive</option>
                                </select>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" onclick="userSave()">Save User</button>
                        <button type="button" class="btn btn-success">Update User</button>
                        <button type="button" class="btn btn-warning" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>



    </body>
    <script type="text/javascript">
        $(document).ready(function () {
            searchTable();
        });



        function searchTable() {
            var xhttp = new XMLHttpRequest();
            xhttp.onload = function () {
                document.getElementById('tabdes').innerHTML = this.responseText;
            }
            xhttp.open("POST", "EmployeeSearch");
            xhttp.send();
        }
        function load(uid) {
            $('#recipient-uid').val(uid);
            
        }


        function userSave() {
            var userid = document.getElementById('recipient-uid').value;
            var username = document.getElementById('recipient-uname').value;
            var password = document.getElementById('recipient-pw').value;
            var stat = document.getElementById('recipient-stat').value;

            var xhttp = new XMLHttpRequest();
            xhttp.onload = function () {
                $("input:text").val("");
                $("input:password").val("");
                $("div.id_100 select").val("1").change();
               
            }
            xhttp.open("POST", "SaveSystemUser?userid=" + userid + "&username=" + username + "&password=" + password + "&stat=" + stat);
            xhttp.send();
        }
    </script>
</html>
