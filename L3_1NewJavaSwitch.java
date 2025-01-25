package JAVA;

public class L3_1NewJavaSwitch {
    public static void main(String[] args)
    {
        // String day = "Sunday";

        // switch (day) {
        //     case "Monday":
        //     System.out.println("6am");
                
        //         break;
        //     case "Saturday Sunday":
        //     System.out.println("8am");
                
        //         break;
        
        //     default:
        //     System.out.println("7am");
        //         break;
        // }

        // // // New Java Switch Method

        // String day = "Sunday";

        // switch (day) {
        //     case "Monday" -> System.out.println("6am");
                
        //     case "Saturday",  "Sunday" -> System.out.println("8am");
        
        //     default -> System.out.println("7am");

        // }

        // String day = "Sunday";
        // String result = "";

        // result = switch (day) {
        //     case "Monday" -> "6am";  
        //     case "Saturday",  "Sunday" -> "8am";
        //     // // case "Saturday",  "Sunday" -> result = "8am";
        //     default -> "7am";

        // }; // ; since it is an expression now

        // // System.out.println(result);
        String day = "Sunday";
        String result = "";

        result = switch (day) {
            case "Monday" : yield "6am";  
            case "Saturday",  "Sunday" : yield "8am";
            default : yield "7am";

        }; // ; since it is an expression now
        System.out.println(result);
    }
}