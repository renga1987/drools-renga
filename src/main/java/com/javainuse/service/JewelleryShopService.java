package com.javainuse.service;

import java.util.SortedMap;
import java.util.TreeMap;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.Product;

@Service
public class JewelleryShopService {

	@Autowired
	private KieContainer kieContainer;


	public Product getProductDiscount(Product product) {
		try {	
		
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		for(String solutionType : product.getSolutionType()) {
				Product newProduct = new Product();
				newProduct.setOrderType(product.getOrderType());
				newProduct.setSolType(solutionType);
				kieSession.insert(newProduct);
				kieSession.fireAllRules();
				sm.put(newProduct.getWeightAge(), newProduct.getJobType());
		}
		kieSession.dispose();
		System.out.println(sm);
		System.out.println("Result:"+sm.entrySet().stream().findFirst().get().getValue());

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	private Product callRule(KieSession kieSession,Product product) {
		kieSession.insert(product);
		kieSession.fireAllRules();
		return product;
	}
}