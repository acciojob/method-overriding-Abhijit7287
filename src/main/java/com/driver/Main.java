package com.driver;

public class Main {
  
   public static void main (String[]args){
     
    Child b = new Child();
    
    String s = b.meth("abc");
    
    System.out.println(s);
    
    String s1 = b.meth2("abc");
    
     System.out.println(s1);
       
   }
   public static class Parent {
       
      public static String meth(String s){
       return "Invoking method from class A";
      }
       
   }
   public static class Child extends Parent
   {
       public static String meth2(String s){
       return "Method is overridden in Extendend class B";
       }
   }
}