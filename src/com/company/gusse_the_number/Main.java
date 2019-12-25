package com.company.gusse_the_number;

import java.util.Scanner;

         // Создать пустой проект промисать метод main()

         class Homework {
    private static Scanner scanner = new Scanner (System.in);
        public static void main(String[] args) {
            proOne();
            System.out.println("a*(b+(c/d)) = " + proTwo(2,4,6,8));
            System.out.println(proThree(-5, 20));
            proFour(45 );
            System.out.println(proFive(-3));
            proSix("Михаил");
        }

        //Создать переменные всех пройденных типов данных, и инициализировать их значения;
        static void proOne() {
            System.out.println("Задание №2.");
            byte t = 20;
            char c = 'm';
            short z = -12345;
            int p = 9876;
            long k = 45678L;
            float f = 1546.36f;
            double d = 56747.67;
            boolean b = true;
            System.out.println("Значение для boolean = " + b);
            System.out.println("Значение для byte = " + t);
            System.out.println("Значение для char = " + c);
            System.out.println("Значение для short = " + z);
            System.out.println("Значение для int = " + p);
            System.out.println("Значение для long = " + k);
            System.out.println("Значение для float = " + f);
            System.out.println("Значение для double = " + d);
        }

        //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – входные параметры этого метода;
        static double proTwo(double a, double b, double c, double d) {
            System.out.println("Задание №3.");
            return a*(b+(c/d));
        }

        //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
        // в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        static boolean proThree(int a, int b) {
            System.out.println("Задание №4.");
            int sum = a + b;
            if (sum > 10 && sum < 20) return true;
            else return false;
        }

        //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
        // положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом;
        static void proFour(int a) {
            System.out.println("Задание №5.");
            if (a >= 0)
                System.out.println("Число " + a + " положительное");
            else
                System.out.println("Число " + a + " отрицательное");
        }

        //Написать метод, которому в качестве параметра передается целое число,
        // метод должен вернуть true, если число отрицательное;
        static boolean proFive(int a) {
            System.out.println("Задание №6.");
            if (a <= 0) return true;
            else return false;
        }

        //Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        static void proSix(String name) {
            System.out.println("Задание №7.");
            System.out.println("Привет, " + name + "!");
        }


    }


