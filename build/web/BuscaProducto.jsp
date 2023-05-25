<%-- 
    Document   : BuscaProducto
    Created on : 10-feb-2017, 11:51:03
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado Producto</h1>
        <%
        int codigo=Integer.parseInt(request.getParameter("codigoproducto"));
        
        %>
    
        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicios.webservices.ArticulosWS_Service service = new servicios.webservices.ArticulosWS_Service();
	servicios.webservices.ArticulosWS port = service.getArticulosWSPort();
	 // TODO initialize WS operation arguments here
	
	// TODO process result here
	java.lang.String result = port.buscarProducto(codigo);
	out.println("Datos del Articulo = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        out.println("Error: "+ex.getMessage());
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
