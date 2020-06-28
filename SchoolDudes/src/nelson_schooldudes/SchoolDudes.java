/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_schooldudes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class SchoolDudes {

    Scanner input = new Scanner(System.in);
    int menuItem;
    boolean quit = false;

    ArrayList<CollegeEmployee> collegeEmployee = new ArrayList<>();
    ArrayList<Faculty> faculty = new ArrayList<>();
    ArrayList<Student> student = new ArrayList<>();

    public void dude() {
        Admin adminthis = new Admin();

        boolean quit = false;
        do {
            System.out.println("\n");
            System.out.println("\n************************* MAIN MENU *************************");
            System.out.println("1. Add A Dude");
            System.out.println("2. Find A Dude");
            System.out.println("3. Display All Dudes");
            System.out.println("0. Quit the School Dudes App");
            System.out.println("\nPlease make a selection from the main menu above: ");

            menuItem = input.nextInt();
            switch (menuItem) {
                case 1:
                    addDude();
                    break;
                case 2:
                    find();
                    break;
                case 3:
                    displayAll();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.print("\nInvalid choice.");
            }
        } while (!quit);
        adminthis.sayGoodbye();
    }

    public void addDude() {
        do {

            System.out.println("\n************************ ADD A DUDE *************************");
            System.out.println("1. Enter a student");
            System.out.println("2. Enter a college employee");
            System.out.println("3. Enter a member of the faculty");
            System.out.println("0. Return to the previous menu");

            menuItem = input.nextInt();
            switch (menuItem) {
                case 1:
                    Student student = new Student();

                    System.out.println("ENTER FIRST NAME");
                    student.setFirstName(input.next());

                    System.out.println("ENTER LAST NAME");
                    student.setLastName(input.next());

                    System.out.println("ENTER STREET ADDRESS");
                    student.setStreetAddress(input.next());

                    System.out.println("ENTER ZIP CODE");
                    student.setZipCode(input.next());

                    System.out.println("ENTER PHONE NUMBER");
                    student.setPhoneNumber(input.next());

                    System.out.println("ENTER MAJOR");
                    student.setMajor(input.next());

                    System.out.println("ENTER GPA");
                    while (!input.hasNextDouble()) {
                        System.out.print("You must enter a valid number! Try again: ");
                        input.nextDouble();
                    }
                    student.setGpa(input.nextDouble());
                    break;
                case 2:
                    CollegeEmployee collegeEmployee = new CollegeEmployee();

                    System.out.println("ENTER FIRST NAME");
                    collegeEmployee.setFirstName(input.next());

                    System.out.println("ENTER LAST NAME");
                    collegeEmployee.setLastName(input.next());

                    System.out.println("ENTER STREET ADDRESS");
                    collegeEmployee.setStreetAddress(input.next());

                    System.out.println("ENTER ZIP CODE");
                    collegeEmployee.setZipCode(input.next());

                    System.out.println("ENTER PHONE NUMBER");
                    collegeEmployee.setPhoneNumber(input.next());

                    System.out.println("ENTER SOCIAL SECURITY NUMBER (NO DASHES OR SPACES)");
                    collegeEmployee.setSsn(input.next());

                    System.out.println("ENTER DEPARTMENT");
                    collegeEmployee.setDepartment(input.next());

                    System.out.println("ENTER SALARY");
                    while (!input.hasNextDouble()) {
                        System.out.print("You must enter a valid number! Try again: ");
                        input.nextDouble();
                    }
                    collegeEmployee.setSalary(input.nextDouble());
                    break;
                case 3:
                    Faculty faculty = new Faculty();

                    System.out.println("ENTER FIRST NAME");
                    faculty.setFirstName(input.next());

                    System.out.println("ENTER LAST NAME");
                    faculty.setLastName(input.next());

                    System.out.println("ENTER STREET ADDRESS");
                    faculty.setStreetAddress(input.next());

                    System.out.println("ENTER ZIP CODE");
                    faculty.setZipCode(input.next());

                    System.out.println("ENTER PHONE NUMBER");
                    faculty.setPhoneNumber(input.next());

                    System.out.println("ENTER SOCIAL SECURITY NUMBER (NO DASHES OR SPACES)");
                    faculty.setSsn(input.next());

                    System.out.println("ENTER DEPARTMENT");
                    faculty.setDepartment(input.next());

                    System.out.println("ENTER SALARY");
                    while (!input.hasNextDouble()) {
                        System.out.print("You must enter a valid number! Try again: ");
                        input.nextDouble();
                    }
                    faculty.setSalary(input.nextDouble());

                    System.out.println("Are you tenured member of the faculty? [Y/N]");
                    if (input.next().equalsIgnoreCase("y")) {
                        faculty.setTenured(true);
                    }
                    if (input.next().equalsIgnoreCase("n")) {
                        faculty.setTenured(false);
                    } else {
                        System.out.print("You must enter [Y/N] Try again: ");
                    }
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.print("\nInvalid choice.");
            }
        } while (!quit);
        dude();
    }

    public void find() {

        //incomplete method
        System.out.println("\n************************ FIND A DUDE *************************");
        String search;
        do {
            System.out.println("Please enter the last name of the person you would like to find");
            search = input.next();
            System.out.println("Would you like to search again? [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                quit = true;
            } else {
                find();
            }
        } while (!quit);
        dude();
    }

    public void displayAll() {

        //incomplete method
        do {

            System.out.println("\n*********************** DISPLAY DUDES ***********************");
            System.out.println("1. Display students");
            System.out.println("2. Display college employees");
            System.out.println("3. Display the faculty");
            System.out.println("0. Return to the previous menu");

            menuItem = input.nextInt();
            switch (menuItem) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.print("\nInvalid choice.");
            }
        } while (!quit);
        dude();
    }
}
