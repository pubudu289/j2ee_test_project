<%-- 
    Document   : itemcart
    Created on : Nov 11, 2023, 1:55:09 PM
    Author     : Pubudu Kasun
--%>

<%@page import="java.util.Base64"%>
<%@page import="org.apache.commons.io.FileUtils"%>
<%@page import="java.io.File"%>
<%@page import="DAO.dto.SessionCartItem"%>
<%@page import="DAO.dto.SessionCart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Item cart</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
              rel="stylesheet"/>
        <!--         Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
              rel="stylesheet"/>
        <!--         MDB -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.css"
              rel="stylesheet"/>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.js" ></script>

    </head>
    <section class="h-100" style="background-color: #eee;">
        <div class="container h-100 py-5">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-10">

                    <div class="d-flex justify-content-between align-items-center mb-4">
                        <h3 class="fw-normal mb-0 text-black">Shopping Cart</h3>
                        <div>
                            <p class="mb-0"><span class="text-muted">Sort by:</span> <a href="#!" class="text-body">price <i
                                        class="fas fa-angle-down mt-1"></i></a></p>
                        </div>
                    </div>
                    <%
                        if (session.getAttribute("cart") != null) {
                            SessionCart sessionCart = (SessionCart) session.getAttribute("cart");
                            if (sessionCart.getItemList() != null) {
                                for (SessionCartItem cartItem : sessionCart.getItemList()) {

                                    String imgPath = cartItem.getItem().getImgurl().replace("\\", "/");
                                    byte[] fileContent = FileUtils.readFileToByteArray(new File(imgPath));
                                    String encodedString = Base64.getEncoder().encodeToString(fileContent);
                                    String imgBase64 = "data:image/jpeg;base64," + encodedString;

                    %>


                    <div class="card rounded-3 mb-4">
                        <div class="card-body p-4">
                            <div class="row d-flex justify-content-between align-items-center">
                                <div class="col-md-2 col-lg-2 col-xl-2">
                                    <img
                                        src="<%= imgBase64%> "
                                        class="img-fluid rounded-3" alt="Cotton T-shirt">
                                </div>
                                <div class="col-md-3 col-lg-3 col-xl-3">
                                    <p class="lead fw-normal mb-2"><%= cartItem.getItem().getName()%> </p>
                                    <p><span class="text-muted">Size: </span>M <span class="text-muted">Color: </span>Grey</p>
                                </div>
                                <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                                    <button class="btn btn-link px-2" 
                                            onclick="this.parentNode.querySelector('input[type=number]').stepDown()">
                                        <i class="fas fa-minus"></i>
                                    </button>

                                    <input id="itemqty" min="0" name="quantity" value="1" type="number"
                                           class="form-control form-control-sm " disabled/>

                                    <button class="btn btn-link px-2" id="stepUp"
                                            onclick="this.parentNode.querySelector('input[type=number]').stepUp(); changeQty('<%=cartItem.getStockid()%>','<%=cartItem.getUnitprice()%>','itemqty')">
                                        <i class="fas fa-plus"></i>
                                    </button>
                                </div>
                                <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
                                    <h5 class="mb-0" id="<%=cartItem.getStockid()%>">LKR <%= cartItem.getUnitprice()%> </h5>
                                    <p>Total : LKR <span id="total1"></span></p>
                                </div>
                                <div class="col-md-1 col-lg-1 col-xl-1 text-end">
                                    <a href="#!" class="text-danger"><i class="fas fa-trash fa-lg"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%            }
                            }

                        }

                    %>

                    <div class="card mb-4">
                        <div class="card-body p-4 d-flex flex-row">
                            <div class="form-outline flex-fill">
                                <input type="text" id="form1" class="form-control form-control-lg" />
                                <label class="form-label" for="form1">Discound code</label>
                            </div>
                            <button type="button" class="btn btn-outline-warning btn-lg ms-3">Apply</button>
                        </div>
                    </div>

                    <div class="card">
                        <div class="card-body">
                            <button type="button" class="btn btn-warning btn-block btn-lg">Proceed to Pay</button>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </section>
</body>


<script>
    function changeQty(stockid,unitprice,qty) {
        var sid = stockid;
       // var qty = document.getElementById("qty").value;
       // var price = parseInt(document.getElementById("totalPrice").innerHTML.split(" ")[1]) ;
        console.log(sid + " "+qty+" " + unitprice);
//
//        $.ajax({
//            type: 'POST',
//            url: "ChangeQty",
//            data:{
//                "sid": sid,
//                "qty": qty,
//               "price": price
//            },
//            success: function (data) {
//                console.log(data);
//                window.location.reload();
//            },
//            error: function () {
//
//            }
//        });


    }



//    var stepUp = document.querySelector("#stepUp");
//
//    stepUp.addEventListener("click", () => {
//        var num = parseFloat(document.getElementById("form1").value);
//
//        console.log(num);
//        var price = document.getElementById('totalPrice').innerHTML.split(" ")[1];
//
//        var total = num * price;
//        document.getElementById('total1').innerHTML = total;
//    });

</script>



</html>
