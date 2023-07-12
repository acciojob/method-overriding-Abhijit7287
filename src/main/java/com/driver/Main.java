package com.driver;

public class Main {
  
   public static void main (String[]args){
     
    Parent b = new Child();
    
    System.out.println(b.meth());
    
    Child a = new Child();
    
    System.out.println(a.meth());
       
   }
}
   class Parent {
       
      public String meth(){
       return "Invoking method from class A";
      }
       
   }
   class Child extends Parent
   {   
       @Override
       public String meth(){
       return "Method is overridden in Extendend class B";
       }
   }
