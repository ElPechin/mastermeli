<%--
  Created by IntelliJ IDEA.
  User: acrosetto
  Date: 2019-04-26
  Time: 11:23
--%>

<%@ page import="grails.converters.JSON" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <span class="glyphicon glyphicon-search" aria-hidden="true"></span>

    <style>
        table, th, td, tr, h3 {
            border: 2px solid black;
            align-items: center;
            vertical-align: middle;
            text-align: center;
            font-family: 'DejaVu Sans', Arial, Helvetica, sans-serif;
        }
        button, submitButton {
            font-family: -apple-system;
            align-content: end;
        animation: alternate;
        }
    </style>

    <title>Agencias Encontradas</title>

</head>

<body>
<h3>Agencias Encontradas</h3>
<div class="container">
    <!-- Content here -->

<table>
    <tr><td colspan="13"><g:submitButton type="button" name="AGENCIAS FAVORITAS"/></td></tr>
    <tr></tr>
    <g:each var="agency" in="${agencies}">
        <tr>
            <th scope="row">Agency Code</th><th>${agency.agency_code}</th>
            <td bgcolor="#daa520">Description</td><td>${agency.description}</td>
            <td bgcolor="#daa520">Payment Method</td><td>${agency.payment_method_id}</td>
            <td bgcolor="#daa520">City</td><td>${agency.address.city}</td>
            <td bgcolor="#daa520">State</td><td>${agency.address.state}</td>
            <td style="vertical-align:middle" colspan="2" action="addAgency">
                <g:form id="${agency.id}" action="addAgency" method="post">
                    <g:submitButton class="glyphicon glyphicon-align-left" name="FAVORITO" type="button"/>
                </g:form>
            </td>
            <td style="vertical-align:middle" colspan="2">
                <g:form id="${agency.id}" action="deleteAgency" method="post">
                    <g:submitButton name="DELETE" type="button"/>
                </g:form>
            </td>

    </g:each>
</table>
</div>
</body>
</html>

%{--<g:javascript>
 function addAgency(agency) {
    var URL="${createLink(controller: 'Client', action: 'addAgency')}";
    $.ajax({
        url:URL,
        type: 'POST',
        body: {agency: agency},
        success: function (data){
            alert("Guardado");
        }
    });
  }
</g:javascript>--}%

%{--

--}%
