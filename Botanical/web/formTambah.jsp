<%-- 
    Document   : formTambah
    Created on : Jul 22, 2020, 7:54:06 PM
    Author     : IQBAL NOTEBOOK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Tambah Stok</title>
        <style type="text/css">
            body{
                font-family: cursive;
                color:peru;
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

            div.pesan{
                margin-left: 35%;
                margin-right: 35%;
            }

            h3{
                text-align: center;
            }

            div.pesan input{
                width : 255px;
                font-family: cursive;
            }

            div.pesan select{
                width : 255px;
                font-family: cursive;
                color:graytext;
            }

            input#btn-pesan{
                width : 100px;
                font-family: cursive;
                float: right;
                color:peru;
                background-color: white;
                border: 0.5 solid brown; 
                padding: 2px;
                margin-left: 5px;
            }

            input#btn-pesan:hover{
                width : 100px;
                font-family: cursive;
                float: right;
                color:white;
                background-color: peru;
                border: 0.5 solid white;   
            }

            textarea{
                font-family: cursive;
                color:graytext;
            }

            td#label{
                width : 100px;
            }

            td#field{
                width : 200px;
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
        <div class="header"><jsp:include page="header.jsp"></jsp:include></div>
        <div class="pesan">
        <form action="StockServlet" method="GET">
            <table>
                <tr>
                    <td colspan="2"><h3>Silakan Masukkan Data</h3></td>
                </tr>
                <tr>
                    <td id="label"><h4>Nama Bibit</h4></td>
                    <td id="field"><input type="text" placeholder="Input Data" name="bibit"></td>
                </tr>
                <tr>
                    <td id="label"><h4>Harga</h4></td>
                    <td id="field"><input type="text" placeholder="Masukkan Harga" name="harga"></td>
                </tr>
                <tr>
                    <td colspan="2"> <input id="btn-pesan" type="submit" value="TAMBAH"><input id="btn-pesan" type="reset" value="RESET"></td>
                </tr>
            </table>
        </form>
        </div>
        <br>
       <p align="center"><a class="btn_beranda" href="showstock.jsp">Kembali</a></p><br><br>
        <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
    </body>
</html>

