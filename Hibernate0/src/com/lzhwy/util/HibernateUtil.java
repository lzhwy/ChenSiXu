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
	//创建Session
	private void init() {
		if (sessionFactory == null) {
			Configuration config = new Configuration().configure();
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			
			
		}
	}
	//私有构造方法
	private HibernateUtil() {
	}
	//获取实例
	public static HibernateUtil  get() {
		return util;
	}
	//新增
	public <T> void save(T t) {
		init();
		Transaction tx = session.beginTransaction();
		session.save(t);
		tx.commit();
	}
	//查询一个
	public <T> T get(Class<T> t, Serializable id) {
		init();
		Transaction tx = session.beginTransaction();
		T c = session.get(t, id);
		tx.commit();
		return c;
	}
	//更新
	public <T> void saveOrUpdate(T t) {
		init();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(t);
		;
		tx.commit();
	}
	//删除
	public <T> void delete(T t) {
		init();
		Transaction tx = session.beginTransaction();
		session.delete(t);
		tx.commit();
	}
	//使用Query接口查询所有
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
