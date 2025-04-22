public class Student {
    String studentName;
    int rollNumber;
    Course course;

    Student(String studentName, int rollNumber, Course course){
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.course = course;

    }
    void displayStudent(){
        System.out.println("the student name is " + studentName + "and roll number is " + rollNumber);
        course.displayCourse();
    }
}
