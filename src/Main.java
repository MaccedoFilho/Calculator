import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        String texto = """
                welcome to the program!
                choose one of the options
                1- addition
                2- subtraction
                3- multiplication
                4- division
                5- square root
                6- percentage
                """;

        System.out.println(texto);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

            System.out.println("enter a number: ");
            number1 = scanner.nextInt();
            System.out.println("enter another number: ");
            number2 = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("result: " + (number1 + number2));
                    break;
                case 2:
                    System.out.println("result: " + (number1 - number2));
                    break;
                case 3:
                    System.out.println("result: " + (number1 * number2));
                    break;
                case 4:
                    System.out.println("result: " + (number1 / number2));
                    break;
                case 5:
                    if (number1 >= 0){
                        System.out.println("Square root: " + Math.sqrt(number1));
                    } else {
                        System.out.println("Error: Square root is negative");
                    }
                    break;
                case 6:
                    System.out.println("porcentagem: " + ((number1 / 100.0) * number2) + "%");
                    break;
                default:
                    System.out.println("Error: Invalid choice");
            }
            scanner.close();
        }
    }
