public class Course {
     String courseName;
     int courseCode;
     Instructor instructor;

    Course(String courseName, int courseCode, Instructor instructor){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;

    }
    void displayCourse(){
        System.out.println("the course name is " + courseName +" and course code is " + courseCode);
//call displayInstructor
      instructor.displayInstructor();
    }
}
