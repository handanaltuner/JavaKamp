package courseAddKodlamaio;

public class CourseManager {



	public void AddToCourse(Course course) {
		System.out.println("Ekledi�im kurs :" + course.courseName);
	}
	public void DeleteToCourse(Course course) {
		System.out.println("Sildi�imiz kurs :" + course.courseName);
	}
	public void chooseToCourse(Course course) {
		System.out.println("Se�ti�imiz kurs :" + course.courseName);
	}
}


