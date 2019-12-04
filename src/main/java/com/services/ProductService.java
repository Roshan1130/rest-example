package com.services;

import com.dtos.ProductDto;

public class ProductService {
	
	public ProductDto getData() {
		ProductDto pd = new ProductDto();
		pd.setStudentId(12);
		pd.setStudentName("Roshan Ramtel");
		pd.setStudentGrade(3.83);
		return pd;
	}

}
