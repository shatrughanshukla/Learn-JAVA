package JAVA;
public class L1_2SumCalculator {
    public static void main(String[] args) {
        if (args.length == 2) {
            int num1 = Integer.parseInt(args[0]); // Convert first argument to integer
            int num2 = Integer.parseInt(args[1]); // Convert second argument to integer
            System.out.println("Sum: " + (num1 + num2));
        } else {
            System.out.println("Please provide exactly two numbers.");
        }
    }
}

// public class MyProgram {
//     public static void main(String[] args) {
//         if (args.length > 0) {
//             System.out.println("You provided these arguments:");
//             for (String arg : args) {
//                 System.out.println(arg);
//             }
//         } else {
//             System.out.println("No arguments were provided.");
//         }
//     }
// }

// // USING command line arguments