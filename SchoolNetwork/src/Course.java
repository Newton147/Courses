public class Course {
    private String CourseName;
    private String CourseID;
    private int NumberofStudents;
    private String[] Students = new String[100];
    public Course(String courseName, String courseID) {
        this.CourseName = courseName;
        this.CourseID =  courseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public int getNumberofStudents() {
        return NumberofStudents;
    }

    public void setNumberofStudents(int numberofStudents) {
        NumberofStudents = numberofStudents;
    }

    public String[] getStudents() {
        return Students;
    }

    public void setStudents(String[] students) {
        Students = students;
    }


    public Course(String CourseName){
    this.CourseName = CourseName;
}



public void addStudent(String student){
    Students[NumberofStudents] = student;
    NumberofStudents++;
}

    public void dropStudent(String student){
        Students[NumberofStudents] = student;
        NumberofStudents--;
    }

}


