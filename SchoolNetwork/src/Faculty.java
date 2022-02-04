import java.util.ArrayList;

public class Faculty {
    public Faculty(String facultyID, String facultyName, String facultyAddress) {
        FacultyID = facultyID;
        FacultyName = facultyName;
        FacultyAddress = facultyAddress;
    }
    private ArrayList <String>  Course = new ArrayList<>();
    private int Coursenumber = 20;


    public String getFacultyID() {
        return FacultyID;
    }

    public void setFacultyID(String facultyID) {
        FacultyID = facultyID;
    }

    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String facultyName) {
        FacultyName = facultyName;
    }

    public String getFacultyAddress() {
        return FacultyAddress;
    }

    public void setFacultyAddress(String facultyAddress) {
        FacultyAddress = facultyAddress;
    }

    public void setCourseList(String courseList) {
        CourseList = courseList;
    }

    public void getcourselist(){
        for(int i = 0; i < Coursenumber; i++) {
            Course[] courseList = new Course[100];
            System.out.println(courseList[i].getCourseName());
        }

    }

    public void addCourse( String course){
        if(Coursenumber< 19){
            String[] courselist = new String[20];
            courselist[Coursenumber] = course;
            Coursenumber++;
        }


    }


    public void dropCourse (String course){
        for (int i = 0; i < Course.size(); i++) {

            if (course.equalsIgnoreCase(Course.get(i))) {

                Course.remove(i);

            }

        }

    }


    private String FacultyID, FacultyName, FacultyAddress,CourseList;



}


