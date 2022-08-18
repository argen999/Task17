package Main;

import Task17.*;

public class OOP17 {
    public static void main(String[] args) {
        Animal animal1 = new Sheep(45,3,"Белый","Эркек");
        Animal animal2 = new Sheep(79,2,"Белый","Ургаачы");
        Animal animal3 = new Sheep(135,2,"Черный","Эркек");


        Animal animal11 = new Cow(769,4,"Коричневый","Ургаачы");
        Animal animal22 = new Cow(687,2,"Коричневый","Ургаачы");
        Animal animal33 = new Cow(993,3,"Коричневый","Ургаачы");
        Animal animal44 = new Cow(764,4,"Коричневый","Ургаачы");
        Animal animal55 = new Cow(1002,2,"Коричневый","Ургаачы");


        Animal animal111 = new Horse(350,5,"Серебристый","Эркек");
        Animal animal222 = new Horse(300,4,"Черный","Ургаачы");


        Farm farm1 = new Farm("Сокулук","Cултангази");
        System.out.println("Первая Ферма: \n"+farm1);
        Animal[] animals = {animal1,animal2,animal3,animal11,animal22,animal33,animal44,animal55,animal111,animal222};
        int a = 0, b = 0, v = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getClass().getSimpleName().equals("Sheep")) {
                System.out.println("-----Овцы-----");
                System.out.println("ВЕС = "+animals[i].getWeight() );
                System.out.println("ВОЗРАСТ = "+animals[i].getAge() );
                System.out.println("ЦВЕТ = "+animals[i].getColour() );
                System.out.println("ПОЛ = "+animals[i].getGender() );
                System.out.println("---------------------------");
                a++;
            } else if (animals[i].getClass().getSimpleName().equals("Cow")) {
                System.out.println("-----Коровы-----");
                System.out.println("ВЕС = "+animals[i].getWeight() );
                System.out.println("ВОЗРАСТ = "+animals[i].getAge() );
                System.out.println("ЦВЕТ = "+animals[i].getColour() );
                System.out.println("ПОЛ = "+animals[i].getGender() );
                System.out.println("---------------------------");
                b++;
            } else if (animals[i].getClass().getSimpleName().equals("Horse")) {
                System.out.println("-----Лошади-----");
                System.out.println("ВЕС = "+animals[i].getWeight() );
                System.out.println("ВОЗРАСТ = "+animals[i].getAge() );
                System.out.println("ЦВЕТ = "+animals[i].getColour() );
                System.out.println("ПОЛ = "+animals[i].getGender() );
                System.out.println("---------------------------");
                v++;
            }
        }
        System.out.println(a+" Овец");
        System.out.println(b+" Коров");
        System.out.println(v+" Лошади");

        System.out.println("\n\n\n\n\n"+"-----------------------------------------------");

        Farm farm2 = new Farm("Ыссык Кол","Токтосун");
        System.out.println("Вторая ферма \n"+farm2);
        Animal[] animals1 = {animal1,animal33,animal222};
        int num = 0, num1 = 0, num2 = 0;
        for (int i = 0; i < animals1.length; i++) {
            if (animals1[i].getClass().getSimpleName().equals("Sheep")){
                System.out.println("-----Овцы-----");
                System.out.println("ВЕС = "+animals[i].getWeight() );
                System.out.println("ВОЗРАСТ = "+animals[i].getAge() );
                System.out.println("ЦВЕТ = "+animals[i].getColour() );
                System.out.println("ПОЛ = "+animals[i].getGender() );
                System.out.println("---------------------------");
                num++;
            } else if (animals1[i].getClass().getSimpleName().equals("Cow")) {
                System.out.println("-----Коровы-----");
                System.out.println("ВЕС = "+animals[i].getWeight() );
                System.out.println("ВОЗРАСТ = "+animals[i].getAge() );
                System.out.println("ЦВЕТ = "+animals[i].getColour() );
                System.out.println("ПОЛ = "+animals[i].getGender() );
                System.out.println("---------------------------");
                num1++;
            } else if (animals1[i].getClass().getSimpleName().equals("Horse")) {
                System.out.println("-----Лошади-----");
                System.out.println("ВЕС = "+animals[i].getWeight() );
                System.out.println("ВОЗРАСТ = "+animals[i].getAge() );
                System.out.println("ЦВЕТ = "+animals[i].getColour() );
                System.out.println("ПОЛ = "+animals[i].getGender() );
                System.out.println("---------------------------");
                num2++;
            }
        }
        System.out.println(num+" Овец");
        System.out.println(num1+" Коров");
        System.out.println(num2+" Лошади");

    }

}
