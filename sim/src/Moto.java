public class Moto extends Veicolo{
    private int cavalli;

    public Moto(String modello, int anno, int cavalli){
        super(modello,anno);
        if(cavalli>=200 && cavalli<=2000)
        {this.cavalli=cavalli;}
        else{this.cavalli=1000;}
    }

    public int getCavalli() {
        return cavalli;
    }

    @Override
    public String toString() {
        return "M" + super.getTarga() + " " + super.getModello() + " " + cavalli + " cavalli";
    }
}
