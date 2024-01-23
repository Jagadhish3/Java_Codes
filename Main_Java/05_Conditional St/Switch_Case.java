class Switch_Case {
    public static void main(String[] args) {
        // int n=5;

        // switch(n){
        //     case 1:
        //     System.out.println("Monday");
        //     break;
        //     case 2:
        //     System.out.println("Tuesday");
        //     break;
        //     case 3:
        //     System.out.println("Wednesday");
        //     break;
        //     case 4:
        //     System.out.println("Thursday");
        //     break;
        //     case 5:
        //     System.out.println("Friday");
        //     break;
        //     case 6:
        //     System.out.println("Saturday");
        //     break;
        //     default:
        //     System.out.println("Sunday");
        //     break;

        // }

        // String day = "Tuesday";
        // String output="";
        // switch(day){
        //     case "Monday","Tuesday":
        //         //System.out.println("Class From 7 to 9 PM");
        //         output="Class From 7 to 9 PM";
        //         break;
        //     case "Wednesday":
        //         System.out.println("Class From 7 to 8 PM");
        //         break;
        //     default:
        //         System.out.println("No Class");
        //         break;
        //     }
        //     System.out.println(output);
        String day = "Sunday";
        switch(day){
            case "Monday","Tuesday" -> output="Class From 7 to 9 PM";
            case "Wednesday" -> System.out.println("Class From 7 to 8 PM");
            default -> System.out.println("No Class");
         } //No use of break statements
        
    }
}
