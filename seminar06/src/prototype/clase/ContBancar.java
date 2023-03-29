package prototype.clase;

import builder.model.ContBuilder;

import java.util.HashMap;
import java.util.Map;

public class ContBancar implements IContClonable{
    private String detinator;
    private Map<String,Integer> documente;
    private int numarFileDosar;

    private ContBancar(){
        this.documente=null;
    }
    public ContBancar(String detinator,Map<String, Integer>documente,int numarFileDosar) {
        int suma = 0;
        for (Integer file : documente.values()) {
            suma += file;
        }
        if (numarFileDosar == suma) {
            this.detinator=detinator;
            this.documente=documente;
            this.numarFileDosar=numarFileDosar;
        }else{
            throw new IllegalArgumentException("Numar incorect");
        }
    }

    @Override
    public IContClonable cloneaza() {
        ContBancar contBancarCopie=new ContBancar();
        contBancarCopie.detinator=detinator;
        contBancarCopie.numarFileDosar=numarFileDosar;

        contBancarCopie.documente=new HashMap<>();
        for(String key:this.documente.keySet()){
            contBancarCopie.documente.put(key,this.documente.get(key));
        }
        return contBancarCopie;
    }
}
