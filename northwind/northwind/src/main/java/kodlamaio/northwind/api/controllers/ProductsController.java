package kodlamaio.northwind.api.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.conctretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productservice;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productservice = productService;
	}

	
	
	@GetMapping("/getall")
	public  List <Product> getAll(){
		return this.productservice.getAll();
}
}

//kodlama.io/api/products