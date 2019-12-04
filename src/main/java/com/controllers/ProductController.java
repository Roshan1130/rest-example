package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtos.ProductDto;
import com.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	private ProductService ps;
	
	@GetMapping(value="/get")
	public ProductDto getProduct() {
		return ps.getData();
	}

	public ProductService getPs() {
		return ps;
	}

	public void setPs(ProductService ps) {
		this.ps = ps;
	}

}
