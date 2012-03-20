package mx.com.sintelti.tienda.DAO;

import java.util.List;

import mx.com.sintelti.tienda.domain.Persistible;
import mx.com.sintelti.tienda.Util.HibernateUtil;


import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;



public class OperacionesCRUD<T>
{
	private Session session;
	
	public static void create(T obj)
	{
		//if(obj instanceof T)
		//{
			session = mx.com.sintelti.tienda.Util.HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.save(obj);
			session.getTransaction().commit();
		//}
		/*else
		{
			System.out.println("no es instancia de producto");
		}*/
	}
	
	
	public static T read(Persistible obj)
	{
		session = mx.com.sintelti.tienda.Util.HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();		
		
		T objNuevo = (T) session.createCriteria(obj.getClass)
									.add(Restrictions.idEq(obj.getId()))
									.uniqueResult();
		return objNuevo;
	}
	
	
	public static void update(T obj)
	{
		Session session = mx.com.sintelti.tienda.Util.HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//Producto actualizar = (T)obj;
		
		/*Producto producto = (T) session.createCriteria(Producto.class)
									.add(Restrictions.idEq(((Producto)obj).getId()))
									.uniqueResult();
		
		producto.setNombreProd(actualizar.getNombreProd());
		producto.setMarcaProd(actualizar.getMarcaProd());
		producto.setPrecioProd(actualizar.getPrecioProd());*/
		
		session.update(obj);
		session.getTransaction().commit();
	}
	
	
	
	public static void delete(T obj)
	{
		session = mx.com.sintelti.tienda.Util.HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
//		Producto producto = (T) session.createCriteria(T.class)
//									.add(Restrictions.idEq(((Producto)obj).getId()))
//									.uniqueResult();
//		
		session.delete((T)obj);
		session.getTransaction().commit();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<T> list(Persistible obj)
	{
		Session session = mx.com.sintelti.tienda.Util.HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//List<Producto> productos =(List<Producto>) session.createCriteria(Producto.class).list();
		return (List<T>)session.createCriteria(obj.getClass()).list();
	}
	
}
