package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi");
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(); //�� yapan s�n�f, ba�ka i� yapan s�n�f kullanacaksa somut s�n�f kullan�lmaz
	}
}
