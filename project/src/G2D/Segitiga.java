package G2D;
import Interface.Bangun2D;

public class Segitiga implements Bangun2D {
    protected double alas;
    protected double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        double luas = (alas * tinggi) / 2;
        return luas;
    }
    
    public double hitungKeliling(){
        double sisiSamping = Math.sqrt(Math.pow((alas / 2), 2) + Math.pow(tinggi, 2));
        double keliling = (2 * sisiSamping) + alas;
        return keliling;
    }
}

