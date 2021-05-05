package inheritance2;

public class Main {

	public static void main(String[] args) {//birbirinin alternatifi olan kodlar için if yazýlmaz
		// TODO Auto-generated method stub

			CustomerManager customerManager = new CustomerManager();
			customerManager.add(new EmailLogger());
	}

}
