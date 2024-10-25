public class Auto extends Veicolo{
    private int numeroPax;
    public Auto(String modello, int anno, int numeroPax){
        super(modello,anno);

        if(numeroPax>=2 && numeroPax<=8)
        {
            this.numeroPax=numeroPax;
        }
        else{this.numeroPax=5;}
    }

    int getNumeroPax(){
        return numeroPax;
    }

    public String toString() {
        return "A" + super.getTarga() + " " + super.getModello() + " " + numeroPax + " posti";
    }
}
