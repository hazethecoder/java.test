import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = scanner.nextLine();

        System.out.println("enter your age: ");
        int age = scanner.nextInt();

        System.out.print("enter your grades: ");
        double grades = scanner.nextDouble();

        System.out.print("are you a guy? (TRUE OR FALSE ONLY) ");
        boolean guy = scanner.nextBoolean();

        System.out.println("Hello, " + name);
        System.out.println("You are  " + age + " years old");
        System.out.println("Your grades are:  " + grades);
        System.out.println("looks like its...." + guy);


        scanner.close();


    }
}