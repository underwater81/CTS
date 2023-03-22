package factory.method;

public class Brancardier extends PersonalSpital {
    private String name;

    public Brancardier(String name) {
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Brancardierul "+ super.getName());
    }
}
