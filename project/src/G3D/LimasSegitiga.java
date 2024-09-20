package G3D;
import G2D.Segitiga;
import Interface.Bangun3D;

public class LimasSegitiga extends Segitiga implements Bangun3D{
    private double tinggiLimas;

    public LimasSegitiga(double alas, double tinggi, double tinggiLimas) {
        super(alas, tinggi);
        this.tinggiLimas = tinggiLimas;
    }

    @Override
    public double hitungVolume() {
        double volume = (hitungLuas() * tinggiLimas) / 3;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
       double tinggiSegi3Samping1 = Math.sqrt(Math.pow((tinggi / 2), 2) + Math.pow(tinggiLimas, 2));
       Segitiga a = new Segitiga(alas, tinggiSegi3Samping1);
       double sisiBantu1 = Math.sqrt(Math.pow((alas / 2), 2) + Math.pow(tinggiSegi3Samping1, 2));
       double sisiBantu2 = Math.sqrt(Math.pow((alas / 2), 2) + Math.pow(tinggi, 2));
       double tinggiSegi3Samping2 = Math.sqrt(Math.pow(sisiBantu1, 2) - Math.pow((sisiBantu2/2), 2));
       Segitiga b = new Segitiga(sisiBantu2, tinggiSegi3Samping2);
       double LP = hitungLuas() + a.hitungLuas() + (2 * b.hitungLuas());
       return LP; 
    }
}

