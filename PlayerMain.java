/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Player;
import java.util.Scanner;

/**
 *
 * @author C0443852
 */
public class PlayerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Player user1 = new Player();
        Player user2 = new Player();
        int choice1;
        Player[] object = new Player[2];
                for (int i=0; i<object.length; i++){
                    if (object[i]==null)//check why strings are the same
                        object[i]=user1;
                    else if (object[i]==user1)
                        object[i]=user2;
                    System.out.println("\tComplete your character: ");
                    System.out.println("1 - Fill a name\n2 - Set capacity\n3 - Set level");
                    System.out.println("0 - Complete and exit");
                    do {
                        System.out.print("---Select an option: ");
                        choice1= input.nextInt();
                        if (choice1==1){
                            System.out.print("Input name: ");
                            user1.setName(input.next());
                        }
                        else  if (choice1==2){
                            System.out.print("Set capacity: ");
                            user1.setCapacity(input.nextInt());
                        }
                        else if (choice1==3){
                            System.out.print("Set Level: ");
                            user1.setLevel(input.nextInt());
                        }
                    } while (choice1!=0);
                    
        } for (int i=0; i<object.length; i++)
            System.out.println(object[i].toString());
    }
}
   