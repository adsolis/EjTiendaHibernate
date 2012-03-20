package mx.com.sintelti.tienda.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory()
	{
		try
		{
			return new Configuration().configure().buildSessionFactory();
		}
		catch(Throwable th)
		{
			throw new ExceptionInInitializerError(th);
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
		return SESSION_FACTORY;
	}

}
