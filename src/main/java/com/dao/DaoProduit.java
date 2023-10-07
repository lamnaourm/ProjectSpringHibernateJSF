package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.models.Produit;

@Transactional
@EnableTransactionManagement
@Repository
public class DaoProduit implements IDao<Produit>{
	
	@Autowired
	SessionFactory sessionFactory;


	@Override
	public List<Produit> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Produit").list();
	}

}
