package ooplntro;



public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product(1,"Lenovo V14",1500,"16 GB Ram",10);//Örnek oluþturma,referans oluþturma, intance
		
		
		
		Product product2= new Product();//Örnek oluþturma,referans oluþturma, intance
		product2.setId(1);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		Product product3 = new Product();
		product3.setId(1);
		product3.setName("Hp 5");
		product3.setDetail("5gb"); 
		product3.setDiscount(10);
		
		Product[] products = {product1, product2, product3};
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("içecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("içecek");
		
		System.out.println(category1.getName+"!");//okuma
		System.out.println(category2.getName+"!");
				
		ProductManager productManager = new ProductManager();
		productManager.addToCard(product1);
		
		productManager.addToCard(product2);
		
		productManager.addToCard(product3);
	
	}

}
