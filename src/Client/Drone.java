/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

import java.util.Scanner;

/**
 *
 * @author Jorrel
 */
public class Drone {
      private String Name;
      private String ID;
      private int x;
      private int y;
      private boolean registered = false;
      private boolean recalled = false;
        
  //Constructor
 public Drone(){
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter Drone Name: ");
     this.Name = scanner.nextLine();
     System.out.print("Enter Drone ID:");
     this.ID = scanner.nextLine();
     scanner.close();
 }
 //resigstering drone to the server
 public void register() {
     if (!registered) {
         this.x = 0;
         this.y = 0;
         String message = "REGISTER|" + this.ID + "|" + this.Name + "|" +this.y;
         sendMessage (message);
         registered = true;
     } else {
         System.out.println("The drone is already registered!");
     }
     
 }

    private void sendMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
