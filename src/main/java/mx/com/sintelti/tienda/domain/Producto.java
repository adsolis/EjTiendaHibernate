package mx.com.sintelti.tienda.domain;

public class Producto implements Persistible
{
	
	private Long noProducto;
	
	String nombreProd;
	String marcaProd;
	int precioProd;

	private static Producto producto = new Producto();
	
	
	
	public Producto()
	{
		
	}
	
	public Producto(String... datos)
	{
		this.nombreProd = datos[0];
		this.marcaProd = datos[1];//Integer.parseInt(datos[1]);
		this.precioProd = Integer.parseInt(datos[2]);
	}

	public String getNombreProd() {
		return nombreProd;
	}

	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}

	public String getMarcaProd() {
		return marcaProd;
	}

	public void setMarcaProd(String marcaProd) {
		this.marcaProd = marcaProd;
	}

	public int getPrecioProd() {
		return precioProd;
	}

	public void setPrecioProd(int precioProd) {
		this.precioProd = precioProd;
	}
	
	
	public Long getId() 
	{
		return noProducto;
	}

	public void setId(Long id) 
	{
		this.noProducto = id;
		
	}
	
	@Override
	public String toString() 
	{		
		return "El producto "+this.nombreProd+" de la marca "+this.marcaProd+ " y cuesta  "+this.precioProd ;
	}			
	
}
