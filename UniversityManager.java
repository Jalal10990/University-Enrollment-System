public class UniversityManager {
    // create instructor 
   public  Instructor createInstructor(String name, String department){
   return new Instructor(name, department);

    }
    //create course with instrucor
    public Course createCourse(String courseName, int courseCode, Instructor instructor){
        return new Course(courseName, courseCode,instructor);

    }
    //enroll student with course
    public Student  enrollStudent(String studentName, int rollNumber, Course course){
    return new Student(studentName, rollNumber, course);
    } 
}
