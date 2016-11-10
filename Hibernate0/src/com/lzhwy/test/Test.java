package com.lzhwy.test;



import java.util.List;

import com.lzhwy.pojo.Customer;
import com.lzhwy.util.HibernateUtil;

public class Test {

public static void main(String[] args) {
	/*Customer customer=new Customer("张真源","1927925092@qq.com","8194202114","深圳","你好",'男',"13879798916",false,null,LocalDate.now());
	HibernateUtil util=new HibernateUtil();
	util.save(customer);*/
	/*Customer customer=HibernateUtil.get().get(Customer.class, 1);
	System.out.println(customer);*/
	List<Customer> list=(List) HibernateUtil.get().findAll(Customer.class,"from Customer");
	list.forEach(System.out::println);
}
}
