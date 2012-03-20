package mx.com.sintelti.business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;

import mx.com.sintelti.tienda.DAO.OperacionesCRUD;
import mx.com.sintelti.tienda.Util.SpringUtil;
import mx.com.sintelti.tienda.domain.Producto;

public class Almacen 
{
	private Producto producto;
	private static ApplicationContext context;
	private static BufferedReader br;	
	private static OperacionesCRUD<Producto> crudProductos;
	
	public void init()
	{
		context = SpringUtil.getContext();
		br = new BufferedReader(new InputStreamReader(System.in));
		crudProductos = new OperacionesCRUD<Producto>();
	}
	
	public void agregarProducto()
	{
		producto = context.getBean("producto",Producto.class);
		leerDatosProducto();
		crudProductos.create(producto);
	}
	
	public Producto obtenerProducto(long id)
	{
		producto = context.getBean("producto",Producto.class);
		producto.setId(id);
		return crudProductos.read(producto);
		/*leerDatosProducto();
		crudProductos.update(producto);
		return null;*/
	}
	
	public void actualizarProducto(long id)
	{
		producto = context.getBean("producto",Producto.class);
		producto.setId(id);
		producto = crudProductos.read(producto);
		System.out.println("::: Actualizando :::");
		System.out.println(producto);
		System.out.println("::::::::::::::::::::");
		leerDatosProducto();
		crudProductos.update(producto);
	}
	
	private Producto leerDatosProducto()
	{
		try
		{
			System.out.println("Nombre: ");
			producto.setNombreProd(br.readLine());
			System.out.println("Marca: ");
			producto.setMarcaProd(br.readLine());
			System.out.println("Precio: ");
			producto.setPrecioProd(Integer.parseInt(br.readLine()));
						
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
	}
}
