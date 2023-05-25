<%-- 
    Document   : IngresarProducto
    Created on : 10-feb-2017, 12:10:37
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
        <h1>Insertar Producto</h1>
        <%
        int codigo=Integer.parseInt(request.getParameter("codigoproducto"));
        java.lang.String nombre=request.getParameter("nombre");
        float precio=Integer.parseInt(request.getParameter("precio"));
        short stock=(short)Integer.parseInt(request.getParameter("stock"));
        %>
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	servicios.webservices.ArticulosWS_Service service = new servicios.webservices.ArticulosWS_Service();
	servicios.webservices.ArticulosWS port = service.getArticulosWSPort();
	 // TODO initialize WS operation arguments here
	
	// TODO process result here
	java.lang.String result = port.ingresarProducto(codigo, nombre, precio, stock);
	out.println("Resultado = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        out.println("Error: "+ex.getMessage());
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
