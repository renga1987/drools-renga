package com.javainuse.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Product;
import com.javainuse.service.JewelleryShopService;

@RestController
public class JewelleryShopController {

	private final JewelleryShopService jewelleryShopService;

	@Autowired
	public JewelleryShopController(JewelleryShopService jewelleryShopService) {
		this.jewelleryShopService = jewelleryShopService;
	}

	@RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
	public Product getQuestions(@RequestParam(required = true) String type) {

		Product product = new Product();
		product.setOrderType("TC");
		List<String> solutionTypeList = new ArrayList<>();		
		solutionTypeList.add("PRI");
		solutionTypeList.add("SIP");
		solutionTypeList.add("BI");
	    solutionTypeList.add("Metro-e");
		product.setSolutionType(solutionTypeList);
		jewelleryShopService.getProductDiscount(product);

		return product;
	}

}
