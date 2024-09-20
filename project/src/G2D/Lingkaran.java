package G2D;
import Interface.Bangun2D;

public class Lingkaran implements Bangun2D {
    protected double r;
    protected static final double PHI = Math.PI;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public double hitungLuas() {
        double luas = PHI * r * r;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = 2 * PHI * r;
        return keliling;
    }
}
