package homework3Week;

public class Instructor extends User{ //sen bir müþterisin//müsterinin geniþletilmiþ hali

		
		 public Instructor() {
			 
			 
		 }
		private String Instructors;
		
		@Override
		public void add() {
			System.out.println("Egitmen eklendi");
		}
		@Override
		public void delete() {
			
			System.out.println("Egitmen cikarildi.");
		}
		
		public void addCourse() {
			
			System.out.println("Yeni kurs  eklendi.");
		}
		public String getInstructors() {
			return Instructors;
		}
		public void setInstructors(String instructors) {
			Instructors = instructors;
		}
	}


