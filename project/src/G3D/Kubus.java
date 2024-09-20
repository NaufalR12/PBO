package G3D;
import G2D.Persegi;
import Interface.Bangun3D;

public class Kubus extends Persegi implements Bangun3D {

    public Kubus(double sisi) {
        super(sisi);
    }

    @Override
    public double hitungVolume() {
        double volume = hitungLuas() * sisi;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double LP = 6 * hitungLuas();
        return LP;
    }
}

