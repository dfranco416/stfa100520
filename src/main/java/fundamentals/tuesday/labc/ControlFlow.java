package fundamentals.tuesday.labc;

import java.sql.SQLOutput;

/* today we'll cover control flow
    including if statements, loops, switch, etc
 */
public class ControlFlow {

    public String myMethod(int input){

        if (input == 2){
            return "true";
        }else {
            return "false";
        }
    }
    public String switchMethod(int input){
        switch(input){
            case 1:
                return "That's one";
            case 2:
                return "That's two";
            case 3:
                System.out.println("you need a break");
                break;
            case 4:
                return "That's four";
            case 5:
                return "defualt idk";
        }
        return "other default idk lol";
    }

    public String forMethod() {


        for (int i = 1; i < 5; i++) {
            System.out.println("I am in a for loop!");
        }


        int[] ints = {1, 2, 3, 4};

        for(int el: ints){
            System.out.println(el);
            if(el == 3){
                continue;
            }
        }
        System.out.println("I am after the continue");
        return "nothing";
    }

    public static void main(String[] args) {





    }

}
