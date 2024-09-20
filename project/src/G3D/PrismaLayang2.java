package G3D;
import G2D.Layang2;
import Interface.Bangun3D;

public class PrismaLayang2 extends Layang2 implements Bangun3D{
    private double tinggiPrisma;

    public PrismaLayang2(double d1, double d2, double tinggiPrisma) {
        super(d1, d2);
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
