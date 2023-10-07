package m15_selection_statements_part2;

public class TernaryNumber {

    public static void main(String[] args) {

        int num = 0;

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println( "Number is " +result);

    }

}
