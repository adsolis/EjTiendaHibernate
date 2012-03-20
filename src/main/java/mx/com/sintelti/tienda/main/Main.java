package mx.com.sintelti.tienda.main;

import javax.swing.JOptionPane;

import mx.com.sintelti.tienda.DAO.OperacionesCRUD;
import mx.com.sintelti.tienda.domain.Producto;



public class Main 
{
	public static void main(String[] args) 
	{
		Producto prodTienda = new Producto();
		
	
		for(int i = 1; i<=3; i++)
		{
			args = JOptionPane.showInputDialog("Ingrese Nombre, Marca, Precio").split(",");
			prodTienda = new Producto(args);
			OperacionesCRUD.create(prodTienda);
		}
		
		for(Producto productos : OperacionesCRUD.list())
		{
			System.out.println(" "+productos.getId()+".-:\t"+productos);
		}
		/*
		
		Long id = Long.parseLong(JOptionPane.showInputDialog("Id Producto"));
		prodTienda.setNoDuenio(id);
		prodTienda = (Producto) OperacionesCRUD.read(prodTienda);
		System.out.println("\n"+prodTienda);*/
	}
}
