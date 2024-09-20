package G3D;
import G2D.Persegipanjang;
import Interface.Bangun3D;

public class PrismaSegi4 extends Persegipanjang implements Bangun3D{
    private double tinggiPrisma;

    public PrismaSegi4(double p, double l, double tinggiPrisma) {
        super(p, l);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        double volume = hitungLuas() * tinggiPrisma;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double LP = (2 * hitungLuas()) + (hitungKeliling() * tinggiPrisma);
        return LP;
    }
}
