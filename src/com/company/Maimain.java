package com.company;
import java.util.Scanner;
public class Maimain {
    public static void main(String[] args){
        System.out.println("Выперите режим игры");
        System.out.println("1) Игрок против игрока");
        System.out.println("2) Игрок против компьютера");
        System.out.println("3) Компьютер против компьютера");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i==1){
            System.out.println("Выберите размер поля");
            System.out.println("1) 3*3");
            System.out.println("2) 4*4");
            System.out.println("3) 5*5");
            Scanner on = new Scanner(System.in);
            int x = on.nextInt();
            if (x==1){
                System.out.println("Вы выбрали 3*3");
                Main11.main(args);
            }else if (x==2){
                System.out.println("Вы выбрали 4*4");
                Main12.main(args);
            }else if (x==3){
                System.out.println("Вы выбрали 5*5");
                Main13.main(args);
            }
        }else if (i==2){
            System.out.println("Выберите размер поля");
            System.out.println("1) 3*3");
            System.out.println("2) 4*4");
            System.out.println("3) 5*5");
            Scanner an = new Scanner(System.in);
            int x = an.nextInt();
            if (x==1){
                System.out.println("Вы выбрали 3*3");
                Main21.main(args);
            }else if (x==2){
                System.out.println("Вы выбрали 4*4");
                Main22.main(args);
            }else if (x==3){
                System.out.println("Вы выбрали 5*5");
                Main23.main(args);
            }
        }else if (i==3){
            System.out.println("Выберите размер поля");
            System.out.println("1) 3*3");
            System.out.println("2) 4*4");
            System.out.println("3) 5*5");
            Scanner yn = new Scanner(System.in);
            int x = yn.nextInt();
            if (x==1){
                System.out.println("Вы выбрали 3*3");
                Main31.main(args);
            }else if (x==2){
                System.out.println("Вы выбрали 4*4");
                Main32.main(args);
            }else if (x==3){
                System.out.println("Вы выбрали 5*5");
                Main33.main(args);
            }
        }

    }
}
