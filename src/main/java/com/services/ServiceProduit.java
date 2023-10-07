package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IDao;
import com.models.Produit;

@Service
public class ServiceProduit implements IService<Produit> {
	
	@Autowired
	IDao<Produit> daoProduit;

	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return daoProduit.getAll();
	}

}
