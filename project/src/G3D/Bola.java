package G3D;
import G2D.Lingkaran;
import Interface.Bangun3D;

public class Bola extends Lingkaran implements Bangun3D{

    public Bola(double r) {
        super(r);
    }

    @Override
    public double hitungVolume() {
        double volume = (hitungLuas() * r * 4) / 3  ;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double LP = 4 * hitungLuas();
        return LP;
    }
}
