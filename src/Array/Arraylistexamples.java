package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistexamples {
    public static void main(String[] args) {
        //syntax

        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(10);

//        list.add(23);
//        list.add(243);
//        list.add(1345);
//        list.add(27);
//        list.add(30);
//        list.add(132);
//
//
//        System.out.println(list.contains(27));
//
//        System.out.println(list);
//
//        list.set(2,24);
//        System.out.println(list);

        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        

        //get items at any index

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
            
        }
        System.out.println(list);



    }
}
