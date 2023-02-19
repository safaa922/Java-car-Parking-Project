/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.carparkingproject2;

import java.util.ArrayList;
import java.util.Scanner;
public class CarParkingProject2 {

    
     public static int CalcMoney(int Hours,int perHour){
        
        int cost = perHour*Hours;
        return cost;   
    }
     
  /*  public static void Status(int free){
        
        System.out.println("FreeSpace : "+free);  
    }
    */
    
    public static void main(String[] args) {
        
         ArrayList <Integer> IDs = new ArrayList();
         IDs.add(-1);
        Scanner in =new Scanner(System.in);
         int perHour=0;
         int free =100;
         int space=0;
         
         while(true){
             
          System.out.println("Select Your Option");
         System.out.println("**************************");
         System.out.println("Option 1 : Add a vehicle ? ");
         System.out.println("Option 2 : Release a vehicle ? ");
         System.out.println("Option 3 : Show Parking Status ? "); 
          System.out.println("---------------------------");
         int option = in.nextInt();
         if(option==1){        
                 
                 
          System.out.println("Enter Your ID Number");
       int id = in.nextInt();      
       IDs.add(id);
       
        System.out.println("What's Your Vehicle Type ?");
         System.out.println("Enter the number of your Option");
         System.out.println("**************************");
         System.out.println("Option 1 : Truck");
         System.out.println("Option 2 : Bus");
         System.out.println("Option 3 : Car");
         System.out.println("Option 4 : Motorcycle");
         System.out.println("---------------------------");
          
          
       int Type = in.nextInt();
       
              switch (Type) {
                  case 1:
                     // Vehicle Truck = new Vehicle();
                     // Truck.space=7;
                      space =7;
                      perHour=15;
                      if(free>=7){
                          System.out.println("Vehicle is Added Successfully !");
                          System.out.println("------------------------------------------");
                           free-=7;
                      }     
                      else {
                        System.out.println("No Enough Space");  
                        System.out.println("------------------------------------------");
                      }
                      break;
                  case 2:
                      space =10;
                      perHour=15;
                      if(free>=10){
                          System.out.println("Vehicle is Added Successfully !");
                          System.out.println("------------------------------------------");
                       free-=10;
                      }   
                      else {
                        System.out.println("No Enough Space");  
                        System.out.println("------------------------------------------");
                      }
                      break;
                      
                  case 3:
                      space =5;
                      perHour=10;
                      if(free>=5){
                          System.out.println("Vehicle is Added Successfully !");
                          System.out.println("------------------------------------------");
                           free-=5;
                      }
                      else {
                        System.out.println("No Enough Space"); 
                        System.out.println("------------------------------------------");
                      }
                      break;
                      
                  case 4:
                      space =2;
                      perHour=5;
                      if(free>=2){
                          System.out.println("Vehicle is Added Successfully !");
                          System.out.println("------------------------------------------");
                          free-=2;
                      }  
                      else {
                        System.out.println("No Enough Space");  
                        System.out.println("------------------------------------------");
                      }
                      break;
                  default:
                      break;
              }
       
       //*****************************************************************
    }
         
         else if(option==2){ 
             
           while(true){
     
      System.out.println("Enter Your ID Number");
       int ID = in.nextInt();
      if(IDs.contains(ID)){
          System.out.println("Vehicle Left Successfully !"); 
          System.out.println("------------------------------------------");
          IDs.remove(ID);
        free += space;
        //--------------------------------
         System.out.println("Enter Your parking Hours");
         int Hours = in.nextInt();
          System.out.println("Total Cost : "+CalcMoney(Hours,perHour)+"$");
          System.out.println("------------------------------------------");
          break;
      }
      else{
          System.out.println("Wrong id number! ,try again"); 
      }
      
           } 
      }
       }
     }
         }
         
