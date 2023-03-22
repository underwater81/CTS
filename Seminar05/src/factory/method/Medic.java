package factory.method;

public class Medic extends PersonalSpital {
    private String name;

    public Medic(String name) {
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicul "+super.getName());
    }
}
