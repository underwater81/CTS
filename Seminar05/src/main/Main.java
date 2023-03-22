package main;

import simple.factory.PersonalSpital;
import simple.factory.SimpleFactory;
import simple.factory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<PersonalSpital> list=new ArrayList<>();
        SimpleFactory simpleFactory = new SimpleFactory();
        PersonalSpital personalSpital1 = simpleFactory.createPersonal(TipPersonal.Medic, "Andrei");
        PersonalSpital personalSpital2 = simpleFactory.createPersonal(TipPersonal.Brancardier, "Ion");
        PersonalSpital personalSpital3 = simpleFactory.createPersonal(TipPersonal.Asistent, "vasile");
        PersonalSpital personalSpital4 = simpleFactory.createPersonal(TipPersonal.Medic, "Paul");
        PersonalSpital personalSpital5 = simpleFactory.createPersonal(TipPersonal.Anestezist, "Dan");

        list.addAll(List.of(personalSpital1,personalSpital2,personalSpital3,personalSpital4,personalSpital5));


        }
    }
