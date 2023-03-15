package main;

import singleton.classes.BazaDate;
import singleton.classes.Secretariat;

public class Main {
    public static void main(String[] args) {

        Secretariat secretariat1=Secretariat.getInstanta(2043,100);
        Secretariat secretariat2=Secretariat.getInstanta(2011,20);

        System.out.println(secretariat1);
        System.out.println(secretariat2);

        BazaDate bazaDate1=BazaDate.getInstanta();
        BazaDate bazaDate2=BazaDate.getInstanta();
        bazaDate2.setDimensiuneDate(50);
        bazaDate1.setDimensiuneDate(300);

        System.out.println(bazaDate1);
        System.out.println(bazaDate2);
    }
}