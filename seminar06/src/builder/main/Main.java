package builder.main;

import builder.model.ContBancar;
import builder.model.ContBancarBuilder;
import builder.model.ContBuilder;
import builder.model.IBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder contBuilder = new ContBuilder();
        ContBancar contBancar1 = contBuilder.setNume("Andreea").setCardAtasat(true).build();
        System.out.println(contBancar1);

        ContBancar contBancar2 = contBuilder.setNume("Matei").setCardAtasat(true).build();
        System.out.println(contBancar1);
        System.out.println(contBancar2);

        IBuilder contBancarBuilder = new ContBancarBuilder();
        ContBancar contBancar3 = contBancarBuilder.setInternetBanking(true).setNume("Bob").build();
        ContBancar contBancar4 = contBancarBuilder.setCardAtasat(true).setNume("Mircea").build();

        System.out.println(contBancar3);
        System.out.println(contBancar4);
    }
}