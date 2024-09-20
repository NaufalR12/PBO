package G2D;
import Interface.Bangun2D;


public class Belahketupat implements Bangun2D{
    protected double d1;
    protected double d2;
    public Belahketupat(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    
    @Override
    public double hitungLuas() {
        double luas = (d1 * d2) / 2;
        return luas;
    }
    
    public double hitungKeliling(){
        double sisi = Math.sqrt(Math.pow((d1/2),2)+ Math.pow((d2/2),2));
        double keliling = 4 * sisi;
        return keliling;
    }
}