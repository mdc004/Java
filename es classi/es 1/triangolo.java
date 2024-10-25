public class triangolo {
    double cateto1;
    double cateto2;

    public double calc_ipotenusa() {
        return Math.sqrt(cateto1*cateto1+cateto2*cateto2);
    }

    public triangolo(double cateto1, double cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

}
