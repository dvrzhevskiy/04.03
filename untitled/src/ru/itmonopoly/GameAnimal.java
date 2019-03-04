package ru.itmonopoly;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class GameAnimal {
    static Animal first;

    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        first=new Animal();
        first.name="собака";
        //Animal newAnimal;
        Animal last=first;
        System.out.println("Введите название животного:");
        while (flag){

            try {
                String animalName ;
                animalName = reader.readLine();
                if (animalName.equals("no")) {
                    break;
                }
                last.next=new Animal();
                last.next.name =animalName ;
                last=last.next;
            } catch (Exception e){
                System.out.println("Неправильный ввод!!!");
            }

            if(last.name.equals("no")){
                flag=false;
            }
        }
        Animal a1 = first;
        while (!(a1==null)){
            System.out.println(a1.name);
            a1 = a1.next;
        }


    }
}
