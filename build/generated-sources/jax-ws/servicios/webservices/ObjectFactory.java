
package servicios.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicios.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarProducto_QNAME = new QName("http://webservices.servicios/", "BuscarProducto");
    private final static QName _BuscarProductoResponse_QNAME = new QName("http://webservices.servicios/", "BuscarProductoResponse");
    private final static QName _IngresarProducto_QNAME = new QName("http://webservices.servicios/", "IngresarProducto");
    private final static QName _IngresarProductoResponse_QNAME = new QName("http://webservices.servicios/", "IngresarProductoResponse");
    private final static QName _DetalleArticulo_QNAME = new QName("http://webservices.servicios/", "detalleArticulo");
    private final static QName _DetalleArticuloResponse_QNAME = new QName("http://webservices.servicios/", "detalleArticuloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarProducto }
     * 
     */
    public BuscarProducto createBuscarProducto() {
        return new BuscarProducto();
    }

    /**
     * Create an instance of {@link BuscarProductoResponse }
     * 
     */
    public BuscarProductoResponse createBuscarProductoResponse() {
        return new BuscarProductoResponse();
    }

    /**
     * Create an instance of {@link IngresarProducto }
     * 
     */
    public IngresarProducto createIngresarProducto() {
        return new IngresarProducto();
    }

    /**
     * Create an instance of {@link IngresarProductoResponse }
     * 
     */
    public IngresarProductoResponse createIngresarProductoResponse() {
        return new IngresarProductoResponse();
    }

    /**
     * Create an instance of {@link DetalleArticulo }
     * 
     */
    public DetalleArticulo createDetalleArticulo() {
        return new DetalleArticulo();
    }

    /**
     * Create an instance of {@link DetalleArticuloResponse }
     * 
     */
    public DetalleArticuloResponse createDetalleArticuloResponse() {
        return new DetalleArticuloResponse();
    }

    /**
     * Create an instance of {@link Articulos }
     * 
     */
    public Articulos createArticulos() {
        return new Articulos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.servicios/", name = "BuscarProducto")
    public JAXBElement<BuscarProducto> createBuscarProducto(BuscarProducto value) {
        return new JAXBElement<BuscarProducto>(_BuscarProducto_QNAME, BuscarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.servicios/", name = "BuscarProductoResponse")
    public JAXBElement<BuscarProductoResponse> createBuscarProductoResponse(BuscarProductoResponse value) {
        return new JAXBElement<BuscarProductoResponse>(_BuscarProductoResponse_QNAME, BuscarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.servicios/", name = "IngresarProducto")
    public JAXBElement<IngresarProducto> createIngresarProducto(IngresarProducto value) {
        return new JAXBElement<IngresarProducto>(_IngresarProducto_QNAME, IngresarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.servicios/", name = "IngresarProductoResponse")
    public JAXBElement<IngresarProductoResponse> createIngresarProductoResponse(IngresarProductoResponse value) {
        return new JAXBElement<IngresarProductoResponse>(_IngresarProductoResponse_QNAME, IngresarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleArticulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.servicios/", name = "detalleArticulo")
    public JAXBElement<DetalleArticulo> createDetalleArticulo(DetalleArticulo value) {
        return new JAXBElement<DetalleArticulo>(_DetalleArticulo_QNAME, DetalleArticulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleArticuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.servicios/", name = "detalleArticuloResponse")
    public JAXBElement<DetalleArticuloResponse> createDetalleArticuloResponse(DetalleArticuloResponse value) {
        return new JAXBElement<DetalleArticuloResponse>(_DetalleArticuloResponse_QNAME, DetalleArticuloResponse.class, null, value);
    }

}
