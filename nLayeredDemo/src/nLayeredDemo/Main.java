package nLayeredDemo;



import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Todo : Sprint IoC ile ��z�lecek
		ProductService productService = new ProductManager(new HibernateProductDao(),
				new  JLoggerManagerAdapter()); 
			
		Product product= new Product(1,1,"Elma",12,50);
		productService.add(product);
		
		
		}
}

