package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.conctretes.Product;

public interface ProductService {
	List<Product> getAll();
}
