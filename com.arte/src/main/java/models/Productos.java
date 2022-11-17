package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")

public class Productos implements Serializable {

	@Id
	@Column(name="id")
	public int id;
	
	@Column(name="nombre")
	public String nombre;
	
	@Column(name="cantidad")
	public int cantidad;
	
	@Column(name="precio_compra")
	public double precioCompra;
	
	@Column(name="precio_venta")
	public double precioVenta;
	
	@Column(name="ID_proveedor")
	public int idProveedor;

	public Productos() {
		
	}

	public Productos(String nombre, int cantidad, double precioCompra, double precioVenta, int idProveedor) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.idProveedor = idProveedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioCompra="
				+ precioCompra + ", precioVenta=" + precioVenta + ", idProveedor=" + idProveedor + "]";
	}

	
	
}
