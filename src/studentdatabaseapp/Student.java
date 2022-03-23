package studentdatabaseapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String studentID;
    private int idLength = 5;
    private String course = "";
    private String yearOfBirth;
    private int gradeLevel;
    private double balance = 0;
    private static int id = 1000;
    private static int costOfCourse = 600;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student's year of birth: ");
        this.yearOfBirth = in.nextLine();

        System.out.println("Grade level:\n 1- freshmen\n2 - sophomore\n3 - junior\n4 - senior");
        this.gradeLevel = in.nextInt();

//        setStudentID();
//        System.out.println(firstName + " " + lastName + " " + yearOfBirth + " " + gradeLevel + " " + studentID);

    }

    // generate id

    public void setStudentID() {
        id++;
        this.studentID = gradeLevel + "" + id;
    }
    //enroll in courses

    public void enrollCourse () {
        System.out.println("Choose a course to enroll (Q to quit):");
        String stuCourse;

        while (0 != 1){
            Scanner in = new Scanner(System.in);
            stuCourse = in.nextLine();
            if (!stuCourse.equalsIgnoreCase("Q")){
                course = course + "\n" + stuCourse;
                balance = balance + costOfCourse;
            }else {
                break;
            }

        }
        //System.out.println("Enrolled in:" + course);

    }

    public void viewBalance () {
        System.out.println("Tuition balance is: $" + balance);
    }

    public void payTuition () {
        viewBalance();
        System.out.println("What amount would you like to pay?: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        balance = balance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();

    }

    //show info

    public String toString () {
        return "Name: " + firstName + " " + lastName +
                "\nBirth year: " + yearOfBirth +
                "\nGrade: " + gradeLevel +
                "\nStudent id: " + studentID +
                "\nCourses enrolled: " + course +
                "\nBalance: " + balance;
    }




}
