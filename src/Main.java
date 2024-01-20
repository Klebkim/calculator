import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        Calculator brokenCalculator = new Calculator();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//
//        System.out.println("Please enter a command below");
//        System.out.println("1. Add");
//        System.out.println("2. Subtract");
//        System.out.println("3. Multiply");
//        System.out.println("4. Divide");
//        System.out.println("5. Clear");
//
//        int response = scanner.nextInt();
//
//        System.out.println("Please enter a number for the command");
//        double myDouble = scanner.nextDouble();
//
////        if (response == 1) {
////            brokenCalculator.add(myDouble);
////        } else if (response == 2) {
////            brokenCalculator.subtract(myDouble);
////        }
////        else if (response == 3) {
////            brokenCalculator.multiply(myDouble);
////        } else if (response == 4) {
////            brokenCalculator.divide(myDouble);
////        } else if (response == 5) {
////            brokenCalculator.clear();
////        }
//        switch (response){
//        case 1:
//            System.out.println(brokenCalculator.add(myDouble));
//            break;
//        case 2:
//            System.out.println(brokenCalculator.subtract(myDouble));
//        break;
//        case 3:
//            System.out.println(brokenCalculator.multiply(myDouble));
//        break;
//        case 4:
//            System.out.println(brokenCalculator.divide (myDouble));
//        break;
//        case 5:
//            brokenCalculator.clear();
//        break;

        Calculator riggedCalculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {

        System.out.println("Please enter a command below");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exponents");
        System.out.println("6. Clear");

        int response = scanner.nextInt();

        System.out.println("Please enter a number for the command");
        double myDouble = scanner.nextDouble();
            if (response == 1) {
            riggedCalculator.mysteryFunction(myDouble);
        } else if (response == 2) {
            riggedCalculator.mysteryFunction2(myDouble);
        }
        else if (response == 3) {
            riggedCalculator.mysteryFunction3(myDouble);
        } else if (response == 4) {
            riggedCalculator.mysteryFunction4(myDouble);
        } else if (response == 5) {
                riggedCalculator.mysteryFunction5(myDouble);
            } else if (response == 6) {
            riggedCalculator.clear();
        }
        }
}

}