package G3D;
import G2D.Jajargenjang;
import Interface.Bangun3D;

public class PrismaJajargenjang extends Jajargenjang implements Bangun3D{
    private double tinggiPrisma;

    public PrismaJajargenjang(double alas, double tinggi, double tinggiPrisma) {
        super(alas, tinggi);
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
