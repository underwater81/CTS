package factory.method;

public class Asistent extends PersonalSpital {
    private String name;

    public Asistent(String name) {
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistentul "+super.getName());
    }
}
