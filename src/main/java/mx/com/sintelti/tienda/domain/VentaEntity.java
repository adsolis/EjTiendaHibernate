package mx.com.sintelti.tienda.domain;

import java.util.Set;

public class VentaEntity implements Persistible 
{
	private Long id;
	private double subTotal;
	private double totalVenta;
	private Set<Producto> productos;
	
	public VentaEntity()
	{
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
	
	
	
	
	
	//listar productos vendidos y cuantos subtotal y total
	//relaciones de muchos a uno
	//
}
