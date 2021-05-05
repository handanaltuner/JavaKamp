package homework3Week;

public class Main {
	public static void main(String[] args) {
		
		Student student = new Student();
		
		
		Student mete =new  Student();
		mete.setFirstName("Mete");
		mete.setLastName("Eker");
		mete.setEmail("mete@gmail.com");
				
				
		
		Instructor engin = new Instructor();
		engin.setFirstName("Engin");
		engin.setLastName("Demirog"); 
		
		User[] users= {mete};
		UserManager userManager=new UserManager();
		userManager.add(engin);
		userManager.addMultiply(users);
		
		
	
		
		
		
	}
}
