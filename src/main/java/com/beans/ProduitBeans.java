package com.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.models.Produit;
import com.services.IService;

@ManagedBean
@SessionScoped
@Component
public class ProduitBeans {
	
	@Autowired
	IService<Produit> serviceProduit;
	
	public List<Produit> getProduits(){
		System.out.println(serviceProduit.getAll().size());
		return serviceProduit.getAll();
	}

}
