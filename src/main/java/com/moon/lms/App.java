package com.moon.lms;

import java.sql.Date;
import java.util.Scanner;
public class App {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int SIZE = 100;
    int count = 0;
    String response;

    class Lesson {
      int no;
      String title;
      String description;
      Date startDate;
      Date endDate;
      int totalHours;
      int dayHours;
    }

    Lesson[] lessons = new Lesson[SIZE];


    for (int i = 0; i < SIZE; i++) {

     Lesson lesson = new Lesson();

      System.out.print("번호?");
      lesson.no = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("수업명?");
      lesson.title = keyboard.nextLine();

      System.out.print("설명?");
      lesson.description = keyboard.nextLine();

      System.out.print("시작일?");
      lesson.startDate = Date.valueOf(keyboard.next());

      System.out.print("종료일?");
      lesson.endDate = Date.valueOf(keyboard.next());


      System.out.print("총수업시간?");
      lesson.totalHours = keyboard.nextInt();


      System.out.print("일수업시간?");
      lesson.dayHours = keyboard.nextInt();
      keyboard.nextLine();
       
      lessons[i] = lesson;
      count++;

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      if(!response.equalsIgnoreCase("y"))
        break;

    }
    System.out.println();

    for (int i = 0; i < count; i++) {
      Lesson lesson = lessons[i];
      System.out.printf("%d, %s  ,  %s ~ %s ,  %d\n",
          lesson.no,lesson.title,lesson.startDate,
          lesson.endDate,lesson.totalHours);
    }


    keyboard.close();
  }
}






