<%--
  Created by IntelliJ IDEA.
  User: acrosetto
  Date: 2019-04-26
  Time: 09:49
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
   <meta name="layout" content="main"/>
   <title>Client Categories</title>
</head>
<body>
<div>
    <form action="/responseClient" method ="post">
        <table>
            <th><p>Ingrese los siguientes datos, y seleccione Enviar para continuar.</p></th>
            <tr>
                <td>Sitio</td><td><input type="text" id="site_id" name="site_id"></td>
            </tr>
            <tr>
                <td>Metodo de Pago</td>
                <td>
                    <select name="payment_method" id="payment_method">
                        <option value="rapipago">Rapipago</option>
                        <option value="pagofacil">PagoFacil</option>
                        <option value="cobroexpress">CobroExpress</option>
                        <option value="serfin">Serfin</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Ordenar por:</td>
                <td>
                    <select name="order" id="orderby">
                        <option value="distance">Distance</option>
                        <option value="agency_code">Agency Code</option>
                        <option value="address">Address</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Latitud</td><td><input type="text" id="latitude" name="latitude"></td>
                <td>Longitud</td><td><input type="text" id="longitude" name="longitude"></td>
            </tr>
            <tr>
                <td>Offset</td><td><input type="text" id="offset" name="offset"></td>
            </tr>
            <tr><td colspan="3"><input type="reset"></td><td colspan="3"><input type="submit"></td></tr>
        </table>
    </form>
</div>
</body>
</html>