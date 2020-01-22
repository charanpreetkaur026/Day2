import java.util.*;
public class luckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luckynum, numentered;
        Random ran= new Random();
        luckynum = ran.nextInt(15);
       // System.out.println("Lucky number is:  "+luckynum);
        for(int i=1; i<=5; i++){
            System.out.println("Enter Your Lucky Number: ");
            numentered = scanner.nextInt();
            if(numentered>15)
                System.out.println("Sorry!! You can't enter a number greater than 15");
            if(numentered == luckynum){
                System.out.println("Congratulations!!! You Won");
                break;
            }else{
                if(i==5)
                    System.out.println("Ooops!! You Failed");
                continue;

            }
        }
        System.out.println("Lucky number was:  "+luckynum);
    }
}
