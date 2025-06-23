package Switch.nested;
import java.util.Scanner;
public class nested {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int Empid= in.nextInt();
        String Department=in.next();

        switch(Empid){
            case 1:
                System.out.println("pavan");
                break;
            case 2:
                System.out.println("ani");
                break;
            case 3:
                switch(Department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case"IS":
                        System.out.println("IS Department");
                        break;
                    default:
                        System.out.println("No department ");
                }
                break;
            default:
                System.out.println("not correct Empid");
        }

    }
}
