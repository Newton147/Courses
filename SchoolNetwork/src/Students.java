public class Students {
    public Students(String studentID, String studentName, String studentAddress, String courseList) {
        StudentID = studentID;
        StudentName = studentName;
        StudentAddress = studentAddress;
        CourseList = courseList;
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

    public String getCourseList() {
        return CourseList;
    }

    public void setCourseList(String courseList) {
        CourseList = courseList;
    }

    private String StudentID, StudentName, StudentAddress, CourseList;
}
