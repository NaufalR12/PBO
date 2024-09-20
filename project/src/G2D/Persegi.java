package G2D;
import Interface.Bangun2D;

public class Persegi implements Bangun2D {
    protected double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas() {
        double luas = sisi * sisi;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = 4 * sisi;
        return keliling;
    }
}
