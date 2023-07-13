package com.driver;

public class Main {
  
   public static void main (String[]args){
     
    B a = new B();
    
    System.out.println(a.meth(5,8));
                                    
   }
}
   class A {
       
      public String meth(int a,int b){
       return "Invoking method from class A";
      }
       
   }
   class B extends A                            
   {   
       @Override
       public String meth(int a,int b){
       return "Method is overridden in Extendend class B";
       }
   }
