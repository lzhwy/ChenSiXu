package com.lzhwy.util;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private Session session = null;
	private SessionFactory sessionFactory = null;
	private static HibernateUtil util=new HibernateUtil();
	//����Session
	private void init() {
		if (sessionFactory == null) {
			Configuration config = new Configuration().configure();
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			
			
		}
	}
	//˽�й��췽��
	private HibernateUtil() {
	}
	//��ȡʵ��
	public static HibernateUtil  get() {
		return util;
	}
	//����
	public <T> void save(T t) {
		init();
		Transaction tx = session.beginTransaction();
		session.save(t);
		tx.commit();
	}
	//��ѯһ��
	public <T> T get(Class<T> t, Serializable id) {
		init();
		Transaction tx = session.beginTransaction();
		T c = session.get(t, id);
		tx.commit();
		return c;
	}
	//����
	public <T> void saveOrUpdate(T t) {
		init();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(t);
		;
		tx.commit();
	}
	//ɾ��
	public <T> void delete(T t) {
		init();
		Transaction tx = session.beginTransaction();
		session.delete(t);
		tx.commit();
	}
	//ʹ��Query�ӿڲ�ѯ����
	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(Class<T> t,String hql) {
		init();
		Transaction tx = session.beginTransaction();
		Query query=session.createQuery(hql);
		List<T> list=query.getResultList();
		tx.commit();
		return list;
	}

}
