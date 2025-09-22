package Switch;
import java.util.Scanner;
public class Switch_Statement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       String fruit=in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("king of fruit");
            case "Apple" -> System.out.println("Red colour fruit");
            case "orange" -> System.out.println("orange colour fruit ");
            case "Grapes" -> System.out.println("Small");
            default -> System.out.println("Inavlid fruit");
        }

        int day = in.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 ->System.out.println("Friday");
            case 6 ->System.out.println("Saturday");
            case 7  -> System.out.println("Sunday");

//        switch(day){
//            case 1,2,3,4,5 -> System.out.println("Weakday");
//            case 6,7 -> System.out.println("weakend");
        }
    }
}
