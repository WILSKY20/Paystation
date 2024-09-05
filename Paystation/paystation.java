//import java.util.*;
import java.util.Scanner; 

public class paystation{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Do you want to purchase?");
            char answer = scan.next().charAt(0);
            if(answer == 'y'){
                while(true){
                    System.out.println("For every minute, is 5 cents.");
                    System.out.println("How much money are you inserting into the machine?");
                    Integer amount = scan.nextInt();
                    Integer time = amountofTime(amount);
                    String receipt = receipt(amount, time);
                    System.out.println("Your Receipt: " + receipt);

                    System.out.println("Continue?");
                    String answer1 = scan.nextLine();
                    if (answer1 == "yes") {
                        continue;
                    } else {
                        break;
                    }
                }
            } else if(answer == 'n'){
                return;
            }
            scan.close();
        }
    }

    public static Integer amountofTime(Integer amount){
        Integer totalTime = amount/5;
        return totalTime;
    }

    public static void Cancel(){
        return;
    }

    public static String receipt(Integer amount, Integer time){
        return "The amount you input is: " + amount + '\n' + "Your given time for " + amount + "cents is: " + time;
    }
}