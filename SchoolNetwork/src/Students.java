import java.util.ArrayList;

public class Students {
    private String StudentID, StudentName, StudentAddress;
    private ArrayList <String>  Course = new ArrayList<>();
    private int Coursenumber = 20;

    public int getCoursenumber() {
        return Coursenumber;
    }

    public void setCoursenumber(int coursenumber) {
        Coursenumber = coursenumber;
    }

    public Students(int coursenumber) {
        Coursenumber = coursenumber;
    }

public void getcourselist(){
    for(int i = 0; i < Coursenumber; i++) {
        Course[] courseList = new Course[100];
        System.out.println(courseList[i].getCourseName());
    }

}

    public void addCourse(Course courses) {
        for (int i = 0; i < Coursenumber; i++) {
            Course[] courselist = new Course[100];
            courselist[Coursenumber] = courses;
            Coursenumber++;
        }

    }


    public void dropCourse(String course){
        for (int i = 0; i < Course.size(); i++) {

            if (course.equalsIgnoreCase(Course.get(i))) {

                Course.remove(i);

            }

        }
    }

    public Students(String studentID, String studentName, String studentAddress) {
        this.StudentID = studentID;
        this.StudentName = studentName;
        this.StudentAddress = studentAddress;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }



}
