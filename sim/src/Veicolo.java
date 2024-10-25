public abstract class Veicolo {
    private static int cont;
    private final int targa;
    private String modello;
    int anno;
    public Veicolo(String modello, int anno){
        this.modello = modello;

        if(anno >= 1800 && anno <= 2023){
            this.anno=anno;
        } else {
            this.anno=2023;
        }

        targa = cont++;
    }

    String getModello(){
        return modello;
    }

    public int getAnno(){
        return anno;
    }

    public int getTarga(){
        return targa;
    }
}
