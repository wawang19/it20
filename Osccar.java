/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author wawang
 */

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        
        
          ItemManager list = new ItemManager();
          
          Scanner wawang = new Scanner(System.in);
          
          
                    
                   while(true){
         System.out.println("1. Entrance");
          System.out.println("2. Insert");
          System.out.println("3. Display");
          System.out.println("4. Updated");
          System.out.println("5. find items");
          System.out.println("6. Deleted all items");
           System.out.println("7. Leave");
       
           String scan = wawang.nextLine();
           
           
           if( scan.equals("A")) {
               System.out.println("hi sir hehe welcome sa akong system");
                String Items = wawang.nextLine();
                     
    
           }else if( scan.equals("B")) {
               System.out.println("What is the item that you would like to Insert?");
                String Items = wawang.nextLine();
                System.out.println();
                list.insertItem( Items);
                     System.out.println();
                     
                     
           } else if( scan.equals("C")){
                     
                     list.displayItems();
                        System.out.println();
                
                if( scan.equals("D")) {
               System.out.println("What would you like to update?");
            int item = Integer.parseInt(wawang.nextLine());
            
                     System.out.println(" And what is the replacement item? ");
                     String repItem = wawang.nextLine();
                     list.updateItem(item, repItem);
                      System.out.println();
                      
                       } else if( scan.equals("E")){
                     
                     System.out.println("What is that you want to find? ");
                     String item = wawang.nextLine();
                     list.findItem(item);
                        System.out.println();
                     
                     
                 
                 } else if( scan.equals("F")){
                     
                    System.out.println("What item would you like to be delete?");
                    list.displayItems();
                     int  index = Integer.parseInt(wawang.nextLine()) ;
                     list.deleteItem(index);
                     System.out.println();
                    
                  
                        
                 } else if( scan.equals("G")){
                     
                     System.out.println("Salamat sa imong pag pili sa akoa!! ");
                    break;
                     
                
                 } else {
                     System.out.println("ByeBye");
                     
                  
                 }
                 
                 
                 
                 }
            
        
                   }
    }
}