import java.util.Random;
import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        int user_inp = user.nextInt(3);

        Random computer=new Random();
        int computer_inp=computer.nextInt(3);

        String user_move,computer_move;

        if(computer_inp==0){
            computer_move="rock";
        }
         else if (computer_inp==1){
            computer_move="paper";
        }
         else {
             computer_move="scissor";
        }


        switch(user_inp){
            case 0:
            System.out.println("you :"+"rock");
            System.out.println(" vs ");
            System.out.println("computer:"+computer_move);
        }
        if(computer_inp== user_inp){
            System.out.println("\n match draw");
        }
        else if((user_inp==0 && computer_inp==2) || (user_inp==1 && computer_inp==0) || (user_inp==2 && computer_inp==1))
        {
            System.out.println("\n you won");
    }
        else {
            System.out.println("\n computer won");
        }
    }
}
