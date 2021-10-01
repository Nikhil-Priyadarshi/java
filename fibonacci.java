package com.company;
public class Fibonacci {
  public static void main(String[] args) {
   int n, t1 = 0, t2 = 1,count=10;
        System.out.print(t1+" "+t2);
        for (int i = 2; i < count; i++) {

            n= t1 + t2;
            System.out.println(" "+n);
            t1 = t2;
            t2 = n;
        }
  }
}
