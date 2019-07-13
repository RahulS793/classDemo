package com.cjc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test
{
	public static void main(String[] args)
	{
		StandardServiceRegistry  registry=new StandardServiceRegistryBuilder().configure().build();
		MetadataSources mds=new MetadataSources(registry);
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory seFactory=md.getSessionFactoryBuilder().build();
		
		Session session=seFactory.openSession();
		Student stu=new Student();
		stu.setRollno(2);
		stu.setName("abc");
		stu.setAddress("pune");
		
		session.save(stu);
		session.beginTransaction().commit();
		
	}

}
