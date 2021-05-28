<%-- 
    Document   : userview
    Created on : Jun 26, 2020, 7:18:50 PM
    Author     : ASUS
--%>


<%@page import="DAO.StockDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.StockModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seluruh Data Stok</title>
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
            
            a.btn_tambah{
                padding: 10px;
                margin-left: 200px;
                background-color: chocolate;
                color: white;
                text-decoration: none;
            }
            
            a.btn_tambah:hover{
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
            StockDAO dao = new StockDAO();
            List<StockModel> stock = dao.getAllStok();
            request.setAttribute("data", stock);
        %>
        <div class="header"><jsp:include page="header.jsp"></jsp:include></div> <br><br>
        <table class="tabel" border="1 brown solid">
            <tr>
                <th>Nama Bibit</th>
                <th>Harga</th>

                <th colspan="2">Actions</th>
            </tr>
            <c:forEach items="${data}" var="u">
            <tr>
                <td>${u.getNamaBibit()}</td>
                <td>${u.getHargaBibit()}</td>

                <td><a href="formPesan.jsp?id=${u.getId()}">Pesan</a></td>
                
            </tr>
            </c:forEach>
        </table>
        <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
    </body>
</html>