package studentdatabaseapp;

import java.util.*;

public class StudentDatabaseApp {



    public static void main(String[] args) {




        //ask how many new users we want to add
        //create  n number of new students

        System.out.println("How many students would you to add to DB?:");
        Scanner in = new Scanner (System.in);
        int quantity = in.nextInt();

        List<Student> listOfStudents = new ArrayList<>();

        for (int i=0; i< quantity; i++){
            Student stu1 = new Student();
            stu1.setStudentID();
            stu1.enrollCourse();
            stu1.payTuition();
            listOfStudents.add(stu1);

            if (i == quantity-1){
                System.out.println("Enrolled students:\n");
                for (int j=0; j< listOfStudents.size(); j++ ){
                    System.out.println("New student:\n" + listOfStudents.get(j));
                }
            }

        }



//        List<Student> studentsList = new ArrayList<>();
//        System.out.println("How many students will be added to the database\n" +
//                "answer: ");
//        Scanner in = new Scanner(System.in);
//        int quantity = in.nextInt();
//
//        System.out.println("Enter students in order (first name, last name, year): ");
//
//        for (int i = 0; i < quantity; i++) {
//
//
//            }
//            if (i == (quantity - 1)) {
//                in.close();
//            }
//        }
//        for (int i = 0; i < studentsList.size(); i++) {
//
//            System.out.println("Students: " + studentsList.get(i).toString());
//
//        }

    }

}