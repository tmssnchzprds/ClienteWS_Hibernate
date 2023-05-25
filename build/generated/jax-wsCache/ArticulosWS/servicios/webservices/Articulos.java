
package servicios.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para articulos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="articulos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idArticulo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idCategoria" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="novedad" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="oferta" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="pvp" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "articulos", propOrder = {
    "descripcion",
    "idArticulo",
    "idCategoria",
    "nombre",
    "novedad",
    "oferta",
    "pvp",
    "stock"
})
public class Articulos {

    protected String descripcion;
    protected int idArticulo;
    protected short idCategoria;
    protected String nombre;
    protected boolean novedad;
    protected boolean oferta;
    protected float pvp;
    protected Short stock;

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idArticulo.
     * 
     */
    public int getIdArticulo() {
        return idArticulo;
    }

    /**
     * Define el valor de la propiedad idArticulo.
     * 
     */
    public void setIdArticulo(int value) {
        this.idArticulo = value;
    }

    /**
     * Obtiene el valor de la propiedad idCategoria.
     * 
     */
    public short getIdCategoria() {
        return idCategoria;
    }

    /**
     * Define el valor de la propiedad idCategoria.
     * 
     */
    public void setIdCategoria(short value) {
        this.idCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad novedad.
     * 
     */
    public boolean isNovedad() {
        return novedad;
    }

    /**
     * Define el valor de la propiedad novedad.
     * 
     */
    public void setNovedad(boolean value) {
        this.novedad = value;
    }

    /**
     * Obtiene el valor de la propiedad oferta.
     * 
     */
    public boolean isOferta() {
        return oferta;
    }

    /**
     * Define el valor de la propiedad oferta.
     * 
     */
    public void setOferta(boolean value) {
        this.oferta = value;
    }

    /**
     * Obtiene el valor de la propiedad pvp.
     * 
     */
    public float getPvp() {
        return pvp;
    }

    /**
     * Define el valor de la propiedad pvp.
     * 
     */
    public void setPvp(float value) {
        this.pvp = value;
    }

    /**
     * Obtiene el valor de la propiedad stock.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStock() {
        return stock;
    }

    /**
     * Define el valor de la propiedad stock.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStock(Short value) {
        this.stock = value;
    }

}
