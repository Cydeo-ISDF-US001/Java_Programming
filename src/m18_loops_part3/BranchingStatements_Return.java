package m18_loops_part3;

public class BranchingStatements_Return {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            if(i ==3){
               // continue; // skips: jumps to the next iteration of the loop
               // break; // exits the loop: jumps out of the loop's body
                return; // exits the method: jumps out of the method
            }
            System.out.println(i);
        }

        System.out.println("Hello World");
        System.out.println("Hello Cydeo");

    }

}
