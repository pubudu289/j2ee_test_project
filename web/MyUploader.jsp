<%-- 
    Document   : MyUploader
    Created on : Oct 28, 2023, 2:24:13 PM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>file uploader</title>
        <link rel="stylesheet" href="Bootsrap/css/bootstrap.min_1.css">
        <script src="Bootsrap/jqueary/jquery.min.js"></script>
        <script src="Bootsrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="row">
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
                <div class="container">
                    <div class="form-group">
                        <form class="row g-3" action="MyUpload" enctype="multipart/form-data" method="post">
                            <div class="col-sm-8">
                                <label class="fom-label">File id</label>
                                <input type="text" class="form-control" id="id" name="id">
                            </div>
                            <div class="col-sm-8">
                                <label class="fom-label">File</label>
                                <input type="file" class="form-control" id="file" name="file">
                                
                            </div>
                            <div class="col-sm-8 mb-3">
                                <input type="submit" class="btn btn-danger" value="Upload">
                            </div>
                        </form>
                    </div>
                </div>
                
            </div>
            <div class="col-sm-2"></div>
        </div>
    </body>
</html>
