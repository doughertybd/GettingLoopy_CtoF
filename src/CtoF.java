import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        double celsius = 0;
        double fahrenheit = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a valid Celsius temperature to convert to Fahrenheit: ");

        while(!in.hasNextDouble())
        {
            System.out.println("Wrong input, please enter again");
            in.next();
        }
        celsius = in.nextDouble();
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Your " + celsius + "C is " + fahrenheit + "F");
    }
}
