package Dependency;

public class Main {
	
	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		Course Java = new Course();
		Java.setCourseName("Teknik Pemrograman Java");
		Course C = new Course();
		C.setCourseName("Pemrograman C");
		
		//adding two courses for new instructor
		instructor.setCourses(Java);
		instructor.setCourses(C);
		
		instructor.printCourses();

	}

}
