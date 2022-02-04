public class Tester {
  public static void main(String[] args) {



            Course course1 = new Course("Science","1111",4);
            Course course2 = new Course("Database Systems","2222",3);




             course1.addStudent("Newton Charles");
             course1.addStudent("Pablo Escobar");
             course1.addStudent("Jimmy Neutron");
             course1.addStudent("Naruto Uzumaki");


             course2.addStudent("Wendell Joseph");
             course2.addStudent("Kaleel Boston");
             course2.addStudent("Shemar Bejai");



             course1.dropStudent("Newton Charles");




         System.out.println("Number of students in course1:  "
                 + course1.getNumberofStudents());
         String[] students = course1.getStudents().toArray(new String[100]);
         for (int i = 0; i < course1.getNumberofStudents(); i++)
             System.out.print(students[i] + " , ");

         System.out.println();
         System.out.print("Number of students in course2: "
                 + course2.getNumberofStudents());
      System.out.println();

      Faculty faculty1 = new Faculty("122","Newtonia Raymond","International Drive");
      System.out.println("Here is your teacher's name for course 1 " + faculty1.getFacultyName());




      Students students1 = new Students("1011101","Charles","Royalton");

      System.out.println("There are other students who do other courses as well. For example,  "+students1.getStudentName()+" is currently studying " );

  }

 }