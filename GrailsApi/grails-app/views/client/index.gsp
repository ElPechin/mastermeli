<%--
  Created by IntelliJ IDEA.
  User: acrosetto
  Date: 2019-04-24
  Time: 11:15
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sites</title>
    <asset:javascript src="application.js"/>
</head>

<body>
    <table border="0">
        <tr>
            <th>
                <table id="tabla"><g:select name="sites" from="${result}" optionKey="id" optionValue="name" onchange="showSite(this.value)"/></table>
            </th>
            <td id="new"></td>
            <td id="new2"></td>
        </tr>
    </table>
    <g:javascript>
        function showSite(parametro){
            $("#tabla tr").remove();
            var URL="${createLink(controller:'client',action:'showCategories')}";
            $.ajax({
                url:URL,
                data: {id:parametro},
                success: function (resp) {
                            console.log('success')
                            Object.keys(resp).forEach(function(k){
                                var idCategoria = resp[k].id
                                $('#tabla').append('<tr><td size="30">'+ resp[k].name +'</td><td size="3"><button type="button" onclick="itemCategoria(\''+idCategoria+'\')">Show</button></td></tr>');
                        });
                }
            });
        }
        function itemCategoria(categoria){
            var URLc="${createLink(controller:'client',action:'showSubCategories')}";
            $.ajax({
                url:URLc,
                data: {id:categoria},
                success: function (respc) {
                            console.log(respc)
                            var colorFondo = Math.random();
                            respc.children_categories.forEach(function(k){
                                if(k != null){
                                    console.log("longitud de k " + k.length)
                                    $("#new").append('<tr bgcolor="\''+colorFondo+'\'"><td>'+ k.name + '</td><td><button type="button" onclick="itemCategoria(\''+k.id+'\')">Show</button>' +
    '<td><button type="button" onclick="BorrarTablaCategorias()">Borar</button></td></tr>');
                                }
                                if ( k == null ) {
                                    console.log("El item seleccionado posee ID: "+ k.id + " y Name: "+ k.name);
                                }
                        });
                }
            });
        }
        function BorrarTablaCategorias(){
            $("#new").empty();
        }
    </g:javascript>
</body>
</html>