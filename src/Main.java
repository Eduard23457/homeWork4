public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен " + age + " нужно немного подождать");
        }

        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов нужно надеть шапку");
        }else {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        }

        System.out.println("Задача 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        System.out.println("Задача 4");
        int agePeople = 5;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в детский садик");
        }else if (agePeople >= 7 && agePeople <= 17) {
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в школу");
        }else if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в университет");
        }else if (agePeople > 24) {
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить на работу");
        }
            System.out.println("Задача 5");
            int kid = 10;
            if (kid < 5) {
                System.out.println("Если возраст ребенка равен " + kid + " то ему нельзя кататься на атракционе");
            }else if (kid >= 5 && kid <= 14) {
                System.out.println("Если возраст ребенка равен " + kid + " можно кататься на аттракционе в сопровождении");
            }else if (kid > 14) {
                System.out.println("Если возраст ребенка равен " + kid + " без сопровождения взрослого");
            }
            System.out.println("Задача 6");
            int place = 50;
            if (place <= 60) {
                System.out.println("Есть сидячие места");
            }else if (place <= 102) {
                System.out.println("Есть стоячие места");
            }else {
                System.out.println("Мест не осталось");
            }

            System.out.println("Задача 7");
            int one = 1;
            int two = 2;
            int three = 3;
            if (three > two && three > one) {
                System.out.println(three);
            }else if (two > one) {
                System.out.println(two);
            }else {
                System.out.println(one);









        }





    }
}