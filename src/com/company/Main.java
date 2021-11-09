package com.company;
public class Main {

    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        liste.add(40);
        liste.add(20);
        liste.add(35);
        liste.add(65);
        System.out.println(liste.toString());
        System.out.println("Dizinin kapasitesi: "+liste.getCapacity());
        System.out.println("Dizinin eleman sayısı: "+liste.getSize());

        System.out.println(liste.getArr()[0]); //dizinin ilk elemanı.
        liste.get(2);
        liste.set(2, 100);
        System.out.println(liste.indexOf(20));
        System.out.println(liste.lastIndexOf(20));
        System.out.println(liste.isEmpty() ? "Boş" : "Dolu");

        System.out.println(liste.toString());
        System.out.println("65 Değeri: "+liste.contains(65));
        System.out.println("120 Değeri: "+liste.contains(20));
    }
}
