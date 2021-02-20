package prisonNTP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class YemekhanePersoneli extends Calisan implements IDosya {

    private DosyaIslem dosyaIslem;

    public YemekhanePersoneli() {
        dosyaIslem=new DosyaIslem("Yemekhane_Personeli.txt");
    }

    @Override
    public float CalcZam() {
        float val;
        val = this.getMaas()/this.getYevmiye()*10;
        return val;
    }

    @Override
    public void create(List<String> s) {
        try {
            dosyaIslem.fileWrite(s, "Yemekhane_Personeli.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<String> read() {
        List<String> slist = new ArrayList<>();
        try {
            slist = dosyaIslem.fileRead("Yemekhane_Personeli.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return slist;
    }

    @Override
    public void delete(int id) {
        try {
            dosyaIslem.fileDelete("Yemekhane_Personeli.txt", id);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public YemekhanePersoneli decode(String file, int id) throws IOException {
        YemekhanePersoneli yp=new YemekhanePersoneli();
        String s;
        s = dosyaIslem.FileReadId(file, id);

        yp.setId(Integer.parseInt(s.substring(s.indexOf(":") + 1, s.indexOf("."))));
        yp.setAd(s.substring(s.indexOf("İsim: ") + 6, s.indexOf("_")));
        yp.setSoyad(s.substring(s.indexOf("_") + 1, s.indexOf("Yaş:") - 2));
        yp.setYas(Integer.parseInt(s.substring(s.indexOf("Yaş: ") + 5, s.indexOf("Görev Yeri: ") - 2)));
        yp.setGorev(s.substring(s.indexOf("Görev Yeri: ") + 12, s.indexOf("Aylığı:") - 2));
        yp.setMaas(Float.parseFloat(s.substring(s.indexOf("Aylığı: ") + 8, s.indexOf("Mesai:") - 2)));
        yp.setMesai(Integer.parseInt(s.substring(s.indexOf("Mesai: ") + 7, s.indexOf("Yevmiye: ") - 2)));
        yp.setYevmiye(Float.parseFloat(s.substring(s.indexOf("Yevmiye: ") + 9, s.indexOf("$"))));

        return yp;
    }

}
