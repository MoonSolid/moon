package com.moon.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);
   
   final int SIZE = 100;
   int count = 0;
   
   int[] no = new int[SIZE];
   String[] title = new String[SIZE];
   Date[] today = new Date[SIZE];
   int[] viewCount = new int[SIZE];
   String response; 
   
   for (int i = 0; i < SIZE; i++) {
   
   
   System.out.print("번호?");
    no[i] = keyboard.nextInt();
   keyboard.nextLine();
   
   System.out.print("내용?");
    title[i] = keyboard.nextLine();
   
    today[i] = new Date(System.currentTimeMillis());
    
    viewCount[i] = 0;
    
    count++;
    
    System.out.println();
    
    System.out.print("계속 입력하시겠습니까?(Y/n) ");
    response = keyboard.nextLine();
    if (!response.equalsIgnoreCase("y")) {
    break;
    }
   }
    
   keyboard.close();
   for (int i = 0; i < count; i++) {
     System.out.printf("%d,%s,       %s,%d\n",no[i],title[i],today[i],viewCount[i]);
   }
   
   
  }
}
