package singletonRegistry.main;

import singletonRegistry.InstitutiePublica;

public class Main {
    public static void main(String[] args) {
        InstitutiePublica politie=InstitutiePublica.getInstitutieOptimizata("politie");
        InstitutiePublica pompieri=InstitutiePublica.getInstitutieOptimizata("pompieri");
        InstitutiePublica politieLocala=InstitutiePublica.getInstitutieOptimizata("politie");
        //InstitutiePublica politieLocala=InstitutiePublica.getInstitutieOptimizata("politieLocala");

        politie.setNrAngajati(10);
        politieLocala.setNrAngajati(20);
        pompieri.setNrAngajati(5);

        System.out.println(politie);
        System.out.println(politieLocala);
        System.out.println(pompieri);
    }
}
