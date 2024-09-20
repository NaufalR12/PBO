package G3D;
import G2D.Trapesium;
import Interface.Bangun3D;

public class PrismaTrapesium extends Trapesium  implements Bangun3D{
    private double tinggiPrisma;

    public PrismaTrapesium(double sisia, double sisib, double tinggi, double tinggiPrisma) {
        super(sisia, sisib, tinggi);
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
