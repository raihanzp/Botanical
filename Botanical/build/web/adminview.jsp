<%-- 
    Document   : adminview
    Created on : Jul 22, 2020, 7:14:33 PM
    Author     : IQBAL NOTEBOOK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.StockModel"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lihat Data Stock</title>
        <style type="text/css">
            body{
                font-family: cursive;
                color:peru;
            }

            table.tabel{
                margin-left: 15%;
                margin-right: 15%;
                margin-top: 2%;
                margin-bottom: 5%;
            }

            h1{
                font-family: cursive;
                color:white;
                font-size: larger;
                font-style: oblique;
                text-align: center;
                padding-top: 10px;
            }

            div.header{
                height: 90px;
                width: 100%;
                background-color: darkgreen;
            }

            div.footer{
                height: 50px;
                width: 100%;
                background-color: darkgreen;
            }

            div.tabel{
                margin-left: 35%;
                margin-right: 35%;
            }

            th{
                font-family: cursive;
                color:peru;
                height: 50px;
            }

            td{
                width : 200px;
                text-align: center;
                color: graytext;
            }
            
            a.btn_beranda{
                padding: 10px;
                background-color: chocolate;
                color: white;
                text-decoration: none;
            }
            
            a.btn_beranda:hover{
                background-color: white;
                color: chocolate;
                border-color: chocolate;
                border-width: 1px;
                border-style: solid;
            }
            
        </style>
    </head>
    <body>
        <%
            StockModel  data = (StockModel) request.getAttribute("data");
            
            String bibit = data.getNamaBibit();
            String harga = data.getHargaBibit();
            
            %>
        <div class="header"><jsp:include page="header.jsp"></jsp:include></div> <br><br>
        <h3 align="center">Data Stok sebagai berikut:</h3>
        <table class="tabel" border="1 brown solid">
            <tr>
                <th>Nama Bibit</th>
                <th>Harga</th>

            </tr>
                        <tr>
                <td><%= bibit %></td>
                <td><%= harga %></td>

            </tr>
        </table>
        <h3 align="center" style="color:red;">===================BERHASIL DISIMPAN!!===================</h3>
        <br>
        <p align="center"><a class="btn_beranda" href="showstock.jsp">Kembali ke Beranda</a></p><br><br>
        <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
    </body>
</html>