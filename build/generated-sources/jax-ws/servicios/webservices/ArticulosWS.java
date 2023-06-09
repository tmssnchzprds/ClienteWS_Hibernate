
package servicios.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ArticulosWS", targetNamespace = "http://webservices.servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ArticulosWS {


    /**
     * 
     * @param codigo
     * @param precio
     * @param stock
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "IngresarProducto")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "IngresarProducto", targetNamespace = "http://webservices.servicios/", className = "servicios.webservices.IngresarProducto")
    @ResponseWrapper(localName = "IngresarProductoResponse", targetNamespace = "http://webservices.servicios/", className = "servicios.webservices.IngresarProductoResponse")
    @Action(input = "http://webservices.servicios/ArticulosWS/IngresarProductoRequest", output = "http://webservices.servicios/ArticulosWS/IngresarProductoResponse")
    public String ingresarProducto(
        @WebParam(name = "codigo", targetNamespace = "")
        int codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "precio", targetNamespace = "")
        float precio,
        @WebParam(name = "stock", targetNamespace = "")
        short stock);

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BuscarProducto")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "BuscarProducto", targetNamespace = "http://webservices.servicios/", className = "servicios.webservices.BuscarProducto")
    @ResponseWrapper(localName = "BuscarProductoResponse", targetNamespace = "http://webservices.servicios/", className = "servicios.webservices.BuscarProductoResponse")
    @Action(input = "http://webservices.servicios/ArticulosWS/BuscarProductoRequest", output = "http://webservices.servicios/ArticulosWS/BuscarProductoResponse")
    public String buscarProducto(
        @WebParam(name = "codigo", targetNamespace = "")
        int codigo);

    /**
     * 
     * @param codigo
     * @return
     *     returns servicios.webservices.Articulos
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "detalleArticulo", targetNamespace = "http://webservices.servicios/", className = "servicios.webservices.DetalleArticulo")
    @ResponseWrapper(localName = "detalleArticuloResponse", targetNamespace = "http://webservices.servicios/", className = "servicios.webservices.DetalleArticuloResponse")
    @Action(input = "http://webservices.servicios/ArticulosWS/detalleArticuloRequest", output = "http://webservices.servicios/ArticulosWS/detalleArticuloResponse")
    public Articulos detalleArticulo(
        @WebParam(name = "codigo", targetNamespace = "")
        int codigo);

}
