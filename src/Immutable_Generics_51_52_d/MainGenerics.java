package Immutable_Generics_51_52_d;

import Generics_51_52_d.Box;

public class MainGenerics {
    public static void main(String [] args){
    Box<Integer> integerBox = new Generics_51_52_d.Box<>();
    Box<String> stringBox = new Box<>();
        integerBox.set(12);
        stringBox.set("Bob");

        System.out.println("возвращает объект, хранящийся в контейнере : " + integerBox.get());
        System.out.println("проверяет, пуст ли контейнер : " + integerBox.isEmpty());
        System.out.println("очищает контейнер : ");
        integerBox.clear();
        System.out.println("Проверяем пуст ли контейнер после очистки :" + integerBox.isEmpty()+"\n");


        System.out.println("возвращает объект, хранящийся в контейнере : " + stringBox.get());
        System.out.println( "проверяет, пуст ли контейнер : " + stringBox.isEmpty());
        System.out.println("очищает контейнер : ");
        stringBox.clear();
        System.out.println("Проверяем пуст ли контейнер после очистки :" + stringBox.isEmpty());
}
}