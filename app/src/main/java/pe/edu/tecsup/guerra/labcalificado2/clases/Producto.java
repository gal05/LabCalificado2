package pe.edu.tecsup.guerra.labcalificado2.clases;

import com.orm.dsl.Table;

/**
 * Created by Alumno on 20/04/2018.
 */
@Table
public class Producto {
    private Long id;
    private String nombre;
    private String precio;
    private String descripcion;
    private String imganes;
    private String etiqueta1;
    private String owner;

    public Producto() {
    }

    public Producto(String nombre, String precio, String descripcion, String imganes, String etiqueta1, String owner) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.imganes = imganes;
        this.etiqueta1 = etiqueta1;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImganes() {
        return imganes;
    }

    public void setImganes(String imganes) {
        this.imganes = imganes;
    }

    public String getEtiqueta1() {
        return etiqueta1;
    }

    public void setEtiqueta1(String etiqueta1) {
        this.etiqueta1 = etiqueta1;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio='" + precio + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imganes='" + imganes + '\'' +
                ", etiqueta1='" + etiqueta1 + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
