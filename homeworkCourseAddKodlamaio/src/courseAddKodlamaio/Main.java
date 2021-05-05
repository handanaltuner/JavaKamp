package courseAddKodlamaio;

public class Main {
	public static void main(String args[]) {
		
		Course course1 = new Course(1,"Temel Ders","Engin Demirog");
		Course course2 = new Course (2,"C# Kursu", "Engin Demirog");
		Course course3= new Course (3,"Java Kursu","Engin Demirog");
		
		Course[] courses= {course1,course2,course3};
		for(Course course:courses) {
			System.out.println(course.courseName);
			System.out.println(course.courseTeacher);
		}
		
	}

}



	
