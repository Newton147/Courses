import java.util.ArrayList;

public class Course {
    public String CourseName;
    public String CourseID;
    public int NumberofStudents;
    public ArrayList <String>Students = new ArrayList<>();

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

    public ArrayList<String> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<String> students) {
        Students = students;
    }

    public Course(String courseName, String courseID, int numberofStudents) {
        this.CourseName = courseName;
        this.CourseID = courseID;
        this.NumberofStudents = 0;
    }


    public void addStudent(String student){
        NumberofStudents++;
        Students.add(student);
    }



    public void dropStudent(String students) {

        for (int i = 0; i < Students.size(); i++) {

            if (students.equalsIgnoreCase(Students.get(i))) {

                Students.remove(i);

            }

        }

    }











/*

    public void dropStudent(String student) {
        ListIterator<Students> listIterator = Students.listIterator(0);
        while (listIterator.hasNext()) {
            if (student.contains((CharSequence) Students)) {
                listIterator.remove();
                break;

            }
            System.out.println();
        }
    }
*/




}














