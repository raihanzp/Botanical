<%-- 
    Document   : formEdit
    Created on : Jul 22, 2020, 7:59:02 PM
    Author     : IQBAL NOTEBOOK
--%>

<%@page import="model.StockModel"%>
<%@page import="DAO.StockDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Form Edit Data</title>
                
    </head>
    <body>
        <%
            StockDAO dao = new StockDAO();
            String id = request.getParameter("id");
            StockModel data = dao.getStokById(Integer.parseInt(id));
        %>
        <div class="header"><jsp:include page="header.jsp"></jsp:include></div><br>
        <div class="pesan">
        <form action="EditServlet" method="GET">
            <table>
                <input type="hidden" name="id" value="<%=data.getId()%>"/>
                <tr>
                    <td id="label"><h4>Nama Bibit</h4></td>
                    <td id="field"><input type="text" value="<%= data.getNamaBibit()%>" name="bibit"></td>
                </tr>
                <tr>
                    <td id="label"><h4>Harga</h4></td>
                    <td id="field"><input type="text" value="<%= data.getHargaBibit()%>" name="harga"></td>
                </tr>
                <tr>
                    <td colspan="2"><input id="btn-pesan" type="submit" value="EDIT"><input id="btn-pesan" type="reset" value="RESET"></td>
                </tr>
            </table>
        </form>
        </div><br><br>
        <p align="center"><a class="btn_beranda" href="showstock.jsp">Kembali</a></p><br><br>
        <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
    </body>
</html>

