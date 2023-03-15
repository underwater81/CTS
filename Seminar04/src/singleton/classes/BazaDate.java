package singleton.classes;

public class BazaDate {
    private int dimensiuneDate;
    private int numarTabele;
    private String denumire;

    public void setDimensiuneDate(int dimensiuneDate) {
        this.dimensiuneDate = dimensiuneDate;
    }

    public static BazaDate instanta=new BazaDate(100,5,"Angajati");

    private BazaDate(int dimensiuneDate, int numarTabele, String denumire) {
        this.dimensiuneDate = dimensiuneDate;
        this.numarTabele = numarTabele;
        this.denumire = denumire;
    }

    public static BazaDate getInstanta(){
        return BazaDate.instanta;
    }

    @Override
    public String toString() {
        return "BazaDate{" +
                "dimensiuneDate=" + dimensiuneDate +
                ", numarTabele=" + numarTabele +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}
