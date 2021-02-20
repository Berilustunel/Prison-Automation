package prisonNTP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ziyaretci extends Kisi implements IDosya {

    private String girisTarihi;
    private int mId;
    private Mahkum m;
    private DosyaIslem dosyaIslem;

    public Ziyaretci() {
        dosyaIslem = new DosyaIslem("Ziyaretci.txt");
    }

    @Override
    public void create(List<String> s) {
        try {
            dosyaIslem.fileWrite(s, "Ziyaretci.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<String> read() {
        List<String> slist = new ArrayList<>();
        try {
            slist = dosyaIslem.fileRead("Ziyaretci.txt");
        } catch (IOException ex) {
            Logger.getLogger(Ziyaretci.class.getName()).log(Level.SEVERE, null, ex);
        }
        return slist;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> kodla(Ziyaretci z) throws IOException {
        List<String> s = new ArrayList<>();

        s.add("Ziyareci id:" + z.getId() + "." + "İsim: " + z.getAd() + "_" + z.getSoyad() + "|" + "Giriş Tarihi: " +
                z.getGirisTarihi() + "|" + "Ziyaret edilen Mahkum ID: " + z.getmId() + "#");

        return s;
    }

    public Ziyaretci decode(String file, int id) throws IOException {
        Ziyaretci z = new Ziyaretci();
        String s;
        s = dosyaIslem.FileReadId(file, id);

        z.setId(Integer.parseInt(s.substring(s.indexOf(":") + 1, s.indexOf("."))));
        z.setAd(s.substring(s.indexOf("İsim: ") + 6, s.indexOf("_")));
        z.setSoyad(s.substring(s.indexOf("_") + 1, s.indexOf("Giriş") - 1));
        z.setGirisTarihi(s.substring(s.indexOf("Tarihi: ") + 8, s.indexOf("Ziyaret") - 1));
        z.setmId(Integer.parseInt(s.substring(s.indexOf("ID:") + 3, s.indexOf("#"))));

        return z;
    }

    public String getGirisTarihi() {
        return girisTarihi;
    }

    public void setGirisTarihi(String girisTarihi) {
        this.girisTarihi = girisTarihi;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }
}
