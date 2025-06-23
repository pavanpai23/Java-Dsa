package loops;

public class Loop {
    public static void main(String[] args) {
        /*
        Syntax for if statement:
        if(boolean expression is true or flase){
        //body
        else{
        //do this
        }
         */
        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);

        //multiple if-else
        if(salary>10000) {
            salary += 2000; //salary=salary+2000
        }
        else if(salary>20000) {
            salary += 3000;
        }
            else{
                salary+=1000;
            }
        System.out.println(salary);
        }

    }
