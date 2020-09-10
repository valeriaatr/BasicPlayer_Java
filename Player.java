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
public class Player {
    //declare constants for LVL and WHT
    Scanner input = new Scanner(System.in);
    private int LVL;
    private int LOAD;
    private String name;
    Player (){
        LVL=25;
        LOAD=75;
        name = "-default-";
    }
    public void setName (String n){
        this.name = n;
    }
    public void setLevel (int lvl){ //try print out in main
        if (lvl>=0 && lvl<=LVL) 
            this.LVL = lvl;
        else {
            System.out.println(name + " cannot be of " + lvl + " level");
        System.out.print("Enter new value (25 max): ");
            this.LVL= input.nextInt();
        }
    }
    public void setCapacity (int wht){ //try print out in main
        if (wht>0 && wht<=75) 
            this.LOAD=wht;
        else if (wht>75) {
            System.out.println(name +" cannot carry more than " + wht + " (75 max)");
            System.out.print("Enter new value: ");
            this.LOAD= input.nextInt();
        }
    }
    public String getName (){
        return name;
    }
    public int showLevel (){
        return LVL;
    }
    public int showCapacity (){
        return LOAD;
    }
    @Override
    public String toString(){
        String s= "Created "+ name + " of " + LVL + " level, carrying capacity of " + LOAD;
        return s;
    }
}
