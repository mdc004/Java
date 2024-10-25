public class triangolocolorato extends triangolo{
    String colore_sfondo;
    String colore_bordo;

    public triangolocolorato(double cateto1, double cateto2, String colore_sfondo, String colore_bordo) {
        super(cateto1, cateto2);
        this.colore_bordo = colore_bordo;
        this.colore_sfondo = colore_sfondo;
    }
    
    public void bordo(String colore_bordo, String colore_sfondo) {
        this.colore_bordo = colore_bordo;
        this.colore_sfondo = colore_sfondo;
    }
    public void bordo(String colore_bordo) {
        this.colore_bordo = colore_bordo;
    }


}
