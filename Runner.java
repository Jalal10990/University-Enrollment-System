public class Runner {
    public static void main(String[] args) {
        //create universityManager object
        UniversityManager manager = new UniversityManager();

        //create Instructor object
        Instructor instructor = manager.createInstructor("Shah Jalal", "BS(SE)");

        //create course with instructor
        Course course = manager.createCourse("Programming", 99, instructor);
    
    //enroll student in course
    Student student = manager.enrollStudent("Shaoib", 99, course);
//display full student details
System.out.println("---Student Profile---");
student.displayStudent();
    }
}
