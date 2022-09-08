package com.bct.practice;



   interface ConstructorInterface{
        Hello display(String say);
    }
    
    class Hello{
        //constructor
        Hello(String say) {
            System.out.println("Gm guys "+ say);
        }
    }
    public class Number1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ConstructorInterface ref = Hello::new;
        ref.display("How ya all doin??");
    }
    }