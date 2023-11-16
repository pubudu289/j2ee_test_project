<%-- 
    Document   : stockUpdate
    Created on : Nov 2, 2023, 3:00:35 PM
    Author     : Pubudu Kasun
--%>

<%@page import="java.util.List"%>
<%@page import="modal.Stock"%>
<%@page import="DAO.StockDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stock Update</title>
        <link rel="stylesheet" href="Bootsrap/css/bootstrap.min.css">
        <script src="Bootsrap/jqueary/jquery.min.js"></script>
        <script src="Bootsrap/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="container mt-3">
            <div class="row">
            </div>
            <div class="col-md-4">
                <div class="form-group mt-10 mb-3 ">
                    <input type="button" class="btb btn-warning form-control" id="addnewItem" value="Add New Item">
                </div>
                <h3 class="text-center">Item</h3>
                <table class="table table-active table-striped">
                    <tr>
                        <th>Item ID</th>
                        <th>Item Name</th>
                        <th>Status</th>
                        <th>Image</th>
                        <th>Add Stock</th>
                    </tr>
                    <tbody id="itemTable">

                    </tbody>
                </table>
            </div>

            <div class="col-md-8">
                <h3 class="text-center">Stock</h3>
                <table class="table table-active table-striped">
                    <tr>
                        <th>Stock ID</th>
                        <th>Item ID</th>
                        <th>Item Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Description</th>
                        <th>Status</th>
                        <th>Image</th>
                        <th>Update Stock</th>
                    </tr>
                    <tbody id="updateTable">

                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <!--     modal1-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">ADD NEW STOCK ITEMS</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form action="stockUpdate.jsp" method="POST">

                        <div class="form-group">
                            <div class="row">
                                <div class="col-sm-8">
                                    <div class="form-group">
                                        <label for="item-id" class="col-form-label">Item ID</label>
                                        <input type="text" class="form-control" id="item-id" readonly>
                                    </div>
                                    <div class="form-group">
                                        <label for="item-name" class="col-form-label">Item Name</label>
                                        <input type="text" class="form-control" id="item-name" readonly>
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="card">
                                        <img alt="Iem Image" id="item-image" src="" height="150px" width="120px">
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="item-price" class="col-form-label">Item Price</label>
                            <input type="number" class="form-control" id="item-price">
                        </div>
                        <div class="form-group">
                            <label for="item-qty" class="col-form-label">Quantity</label>
                            <input type="number" class="form-control" id="item-qty">
                        </div>
                        <div class="form-group">
                            <label for="item-desc" class="col-form-label">Description</label>
                            <input type="text" class="form-control" id="item-desc">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" onclick ="stockItemSave()" >Save New Item</button>
                    <button type="button" class="btn btn-warning" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>


    <!--     modal2-->
    <div class="modal fade" id="exampleModal2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel2" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">UPDATE STOCK ITEMS</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form action="stockUpdate.jsp" method="POST">
                        <div class="form-group">
                            <div class="row">
                                <div class="col-sm-8">
                                    <div class="form-group">
                                        <label for="uitem-id" class="col-form-label">Stock ID :</label>
                                        <label class="form-label" id="id"></label><br>
                                        <label for="uitem-id" class="col-form-label">Item ID</label>
                                        <input type="text" class="form-control" id="uitem-id" readonly>
                                    </div>
                                    <div class="form-group">
                                        <label for="uitem-name" class="col-form-label">Item Name</label>
                                        <input type="text" class="form-control" id="uitem-name" readonly>
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="card">
                                        <img alt="Iem Image" id="uitem-image" src="" height="150px" width="120px">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="uitem-price" class="col-form-label">Item Price</label>
                            <input type="number" class="form-control" id="uitem-price">
                        </div>
                        <div class="form-group">
                            <label for="uitem-qty" class="col-form-label">Quantity</label>
                            <input type="number" class="form-control" id="uitem-qty">
                        </div>
                        <div class="form-group">
                            <label for="uitem-desc" class="col-form-label">Description</label>
                            <input type="text" class="form-control" id="uitem-desc">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" onclick ="stockItemUpdate()" >Stock Update</button>
                    <button type="button" class="btn btn-warning" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>





</body>

<script type="text/javascript">

    $(document).ready(function () {
        searchItemTable();
        searchUpdateTable();
    });

    function searchItemTable() {
        var xhttp = new XMLHttpRequest();
        xhttp.onload = function () {

            document.getElementById('itemTable').innerHTML = this.responseText;
        }
        xhttp.open("POST", "stockUpdate");
        xhttp.send();
    }

    function searchUpdateTable() {
        var xhttp = new XMLHttpRequest();
        xhttp.onload = function () {
            document.getElementById('updateTable').innerHTML = this.responseText;
        }
        xhttp.open("POST", "searchUpdateTable");
        xhttp.send();

    }

    function stockUpdate(id, itemid, name, image, price, description, qty) {

        document.getElementById('id').innerHTML = id;
        $('#uitem-id').val(itemid);
        $('#uitem-name').val(name);
        $('#uitem-image').attr("src", image);
        $('#uitem-price').val(price);
        $('#uitem-desc').val(description);
        $('#uitem-qty').val(qty);
    }

    function stockSave(uid, name, image) {
        $('#item-id').val(uid);
        $('#item-name').val(name);
        $('#item-image').attr("src", image);
    }

    function stockItemSave() {
        var Itemid = document.getElementById("item-id").value;
        var price = document.getElementById("item-price").value;
        var qty = document.getElementById("item-qty").value;
        var desc = document.getElementById("item-desc").value;

        var xhttp = new XMLHttpRequest();
        xhttp.onload = function () {
            window.location.replace("stockUpdate.jsp");
        }
        xhttp.open("POST", "StockSave?Itemid=" + Itemid + "&price=" + price + "&qty=" + qty + "&desc=" + desc);
        xhttp.send();
    }

    function stockItemUpdate() {
        var stockid = document.getElementById("id").innerHTML;
        var itemid = document.getElementById("uitem-id").value;
        var price = document.getElementById("uitem-price").value;
        var qty = document.getElementById("uitem-qty").value;
        var desc = document.getElementById("uitem-desc").value;

        var xhttp = new XMLHttpRequest();

        xhttp.onload = function () {
            window.location.replace("stockUpdate.jsp");
        }
        xhttp.open("POST", "StockItemUpdate?stockid=" + stockid + "&itemid=" + itemid + "&price=" + price + "&qty=" + qty + "&description=" + desc);
        xhttp.send();
    }
    
    $(document).ready(function () {
        $("#addnewItem").click(function () {
            window.location.replace("Item.jsp");
        });
    });



</script>

</html>
