package prisonNTP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ekonomi implements IDosya{

    private int bakiye;
    private DosyaIslem dosyaIslem;
    
    public Ekonomi() {
        dosyaIslem = new DosyaIslem("Muhasebe.txt"); //null a düşmesini engelliyoruz.
        this.bakiye = 200000;
    }
    
    public double brutGelir(double kazanilanPara, double odenek){
        // kazanilanpara mahkum classındaki katki metodundan gelecek. Odenek inputla alınacak.
        return kazanilanPara + odenek;
    }

    public double netGelir(double brut) {
        double vergi = 0.18;
        double net = brut * (1 - vergi);
        return net;
    }

    public double Gider(double x, double y) {
        double gider = x + y;
        return gider;
    }

    public double yeniBakiye(double gelir, double gider, double bakiye) {
        double kar = gelir - gider;
        bakiye += kar;
        return bakiye;
    }
    
    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public void create(List<String> s) {
        try {
            dosyaIslem.fileWrite(s, "Muhasebe.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<String> read() {
         List<String> slist = new ArrayList<>();
        try {
            slist = dosyaIslem.fileRead("Muhasebe.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return slist;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
