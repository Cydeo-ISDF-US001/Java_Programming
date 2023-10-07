package m15_selection_statements_part2;

public class SwitchWithLambdaArrow {

    public static void main(String[] args) {

        int n = 8;

        switch (n) {
            case 1 -> {
                System.out.println("Monday");
                System.out.println("WeekDay01");
            }

            case 2 -> {
                System.out.println("Tuesday");
                System.out.println("WeekDay02");
            }

            case 3 -> {
                System.out.println("Wednesday");
                System.out.println("WeekDay03");
            }

            case 4 -> {
                System.out.println("Thursday");
                System.out.println("WeekDay04");
            }

            case 5 -> {
                System.out.println("Friday");
                System.out.println("WeekDay05");
            }

            case 6, 7 ->  System.out.println("Weekend");

            default -> System.out.println("Invalid Number");
        }


    }

}