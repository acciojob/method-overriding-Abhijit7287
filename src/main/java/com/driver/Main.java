package com.driver;


public class Main {
  
   public static void main (String[]args){
     
    A objB = new B();

        // Task 3: Call the method 'meth' of class A with object of class B
        String result1 = objB.meth(2,3);
        System.out.println("Task 3 Result: " + result1);

        // Task 5: Call the overridden method from objB
        
        B objA = new B();
        
        String result2 = objA.meth(4,5);
        System.out.println("Task 5 Result: " + result2);
                                    
   }
}
   
  
