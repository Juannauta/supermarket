package com.juanvilladev.juanvilladevsupermarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table (name = "productos")
public class Producto {

    @Id
//    Ahora debemos de crear la anotación @GeneratedValue
//    porque esta clave primaria se va a generar de forma automatica con una estrategia dandole identidad.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Al cambiar el nombre, se debe de crear una anotación
//    con @column y colocar el nombre que realmente trae de la base de datos.
//    Siempre que una columna se llamae diferente debemos incluir esta anotación.
//    NOTA: Como esta es la clave primaria debemos agregar la anotación @Id

    @Column(name = "id_producto")
    private Integer idProducto ;

    private String nombre;

    @Column(name= "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
