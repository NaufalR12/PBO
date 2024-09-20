package G3D;
import G2D.Lingkaran;
import Interface.Bangun3D;

public class Tabung extends Lingkaran implements Bangun3D{
    private double tinggiTabung;

    public Tabung(double r, double tinggiTabung) {
        super(r);
        this.tinggiTabung = tinggiTabung;
    }

    @Override
    public double hitungVolume() {
        double volume = hitungLuas() * tinggiTabung;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double LP = hitungKeliling() * (r + tinggiTabung);
        return LP;
    }
}
