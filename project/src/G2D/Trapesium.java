package G2D;
import Interface.Bangun2D;

public class Trapesium implements Bangun2D {
    protected double sisia;
    protected double sisib;
    protected double tinggi;

    public Trapesium(double sisia, double sisib, double tinggi) {
        this.sisia = sisia;
        this.sisib = sisib;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        double luas = ((sisia + sisib) * tinggi) / 2;
        return luas;
    }
    
    public double hitungKeliling(){
        double sisiSamping = Math.sqrt(Math.pow(Math.abs((sisia-sisib)/2), 2) + Math.pow(tinggi, 2));
        double keliling = sisia + sisib + (2 * sisiSamping);
        return keliling;
    }
}
