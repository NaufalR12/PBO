package G2D;
import Interface.Bangun2D;

public class Jajargenjang implements Bangun2D {
    protected double alas;
    protected double tinggi;

    public Jajargenjang(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas(){
        double luas = (alas * tinggi);
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = 2 * (alas + tinggi) + (Math.random()%2);
        return keliling;
    }
}
