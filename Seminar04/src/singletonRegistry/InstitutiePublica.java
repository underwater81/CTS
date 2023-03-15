package singletonRegistry;
import java.util.HashMap;
import java.util.Map;
public class InstitutiePublica {
    private String denumire;
    private int nrAngajati;
    private static Map<String,InstitutiePublica> registruInstitutii=new HashMap<>();

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    private InstitutiePublica(String denumire, int nrAngajati) {
        this.denumire = denumire;
        this.nrAngajati = nrAngajati;
    }


    public synchronized static InstitutiePublica getInstitutie(String denumire){
        if(registruInstitutii.containsKey(denumire)) {
            return registruInstitutii.get(denumire);
        }
        else {
            InstitutiePublica instanta=new InstitutiePublica(denumire,0);
            registruInstitutii.put(denumire,instanta);
            return instanta;
        }
    }

    public synchronized static InstitutiePublica getInstitutieOptimizata(String denumire){
        if(!registruInstitutii.containsKey(denumire)) {
            InstitutiePublica instanta=new InstitutiePublica(denumire,0);
            registruInstitutii.put(denumire,instanta);
            return instanta;
        }
        return registruInstitutii.get(denumire);
    }

    @Override
    public String toString() {
        return "InstitutiePublica{" +
                "denumire='" + denumire + '\'' +
                ", nrAngajati=" + nrAngajati +
                '}';
    }
}
