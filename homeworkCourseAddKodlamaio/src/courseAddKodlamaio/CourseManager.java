package courseAddKodlamaio;

public class CourseManager {



	public void AddToCourse(Course course) {
		System.out.println("Eklediðim kurs :" + course.courseName);
	}
	public void DeleteToCourse(Course course) {
		System.out.println("Sildiðimiz kurs :" + course.courseName);
	}
	public void chooseToCourse(Course course) {
		System.out.println("Seçtiðimiz kurs :" + course.courseName);
	}
}


