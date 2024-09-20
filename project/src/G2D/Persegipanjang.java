package G2D;
import Interface.Bangun2D;

public class Persegipanjang implements Bangun2D {
    protected double p;
    protected double l;

    public Persegipanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    @Override
    public double hitungLuas() {
        double luas = p * l;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = 2 * (p + l);
        return keliling;
    }
}
