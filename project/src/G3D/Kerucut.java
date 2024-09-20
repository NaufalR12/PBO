package G3D;
import G2D.Lingkaran;
import Interface.Bangun3D;

public class Kerucut extends Lingkaran implements Bangun3D{
    private double tinggiKerucut;

    public Kerucut(double r, double tinggiKerucut) {
        super(r);
        this.tinggiKerucut = tinggiKerucut;
    }

    @Override
    public double hitungVolume() {
        double volume = (hitungLuas() * tinggiKerucut) / 3;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double garisPelukis = Math.sqrt((Math.pow(r, 2) + Math.pow(tinggiKerucut, 2)));
        double LP = (PHI * r * garisPelukis) + hitungLuas();
        return LP;
    }
}
