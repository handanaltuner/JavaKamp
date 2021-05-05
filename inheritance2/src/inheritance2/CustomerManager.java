package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi");
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(); //Ýþ yapan sýnýf, baþka iþ yapan sýnýf kullanacaksa somut sýnýf kullanýlmaz
	}
}
