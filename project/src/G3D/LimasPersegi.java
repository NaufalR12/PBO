package G3D;
import G2D.Persegi;
import Interface.Bangun3D;

public class LimasPersegi extends Persegi implements Bangun3D{
    private double tinggiLimas;

    public LimasPersegi(double sisi, double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
    }

    @Override
    public double hitungVolume() {
        double volume = (hitungLuas() * tinggiLimas) / 3;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double garisBantu = Math.sqrt(Math.pow((sisi / 2), 2) + Math.pow(tinggiLimas, 2));
        double LP =  hitungLuas() + ((hitungKeliling() * garisBantu) / 2);
        return LP;
    }
}
