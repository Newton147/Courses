

public class Faculty {
    public Faculty(String facultyID, String facultyName, String facultyAddress, String courseList) {
        FacultyID = facultyID;
        FacultyName = facultyName;
        FacultyAddress = facultyAddress;
        CourseList = courseList;
    }

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

    public String getCourseList() {
        return CourseList;
    }

    public void setCourseList(String courseList) {
        CourseList = courseList;
    }

    private String FacultyID, FacultyName, FacultyAddress,CourseList;



}


