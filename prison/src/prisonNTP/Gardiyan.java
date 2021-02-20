package prisonNTP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gardiyan extends Calisan implements IDosya {

    private DosyaIslem dosyaIslem;

    public Gardiyan() {
        dosyaIslem = new DosyaIslem("Gardiyan.txt");
    }
    
    @Override
    public String nobetSec(int id){
        String s=null;
        try {
            s=dosyaIslem.FileReadId("Gardiyan.txt",id);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        s=s.substring(s.indexOf("Görev Yeri: ")+12, s.indexOf("Aylığı:")-2);
        
        s=nobetSec(s);
        return s;
    }
    
    public String nobetSec(String s){
        if(s.equals("Koğuş")){
            s="Pazartesi";
        }else if(s.equals("Koridor")){
            s="Salı";
        }else if(s.equals("Güvenlik Odası")){
            s="Çarşamba";
        }else if(s.equals("Giriş")){
            s="Perşembe";
        }else if(s.equals("Avlu")){
            s="Cuma";
        }else if(s.equals("Ofis")){
            s="Cumartesi";
        }else if(s.equals("Revir")){
            s="Pazar";
        }
        
        return s;
    }

    @Override
    public float CalcZam() {
        float val;
        val = (365 / this.getMesai()) + (this.getYevmiye() * 5);
        return val;
    }

    @Override
    public void create(List<String> s) {
        try {
            dosyaIslem.fileWrite(s, "Gardiyan.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<String> read() {
        List<String> slist = new ArrayList<>();
        try {
            slist = dosyaIslem.fileRead("Gardiyan.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return slist;
    }

    @Override
    public void delete(int id) {
        try {
            dosyaIslem.fileDelete("Gardiyan.txt", id);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Gardiyan decode(String file, int id) throws IOException {
        Gardiyan g = new Gardiyan();
        String s;
        s = dosyaIslem.FileReadId(file, id);

        g.setId(Integer.parseInt(s.substring(s.indexOf(":") + 1, s.indexOf("."))));
        g.setAd(s.substring(s.indexOf("İsim: ") + 6, s.indexOf("_")));
        g.setSoyad(s.substring(s.indexOf("_") + 1, s.indexOf("Yaş:") - 2));
        g.setYas(Integer.parseInt(s.substring(s.indexOf("Yaş: ") + 5, s.indexOf("Görev Yeri: ") - 2)));
        g.setGorev(s.substring(s.indexOf("Görev Yeri: ") + 12, s.indexOf("Aylığı:") - 2));
        g.setMaas(Float.parseFloat(s.substring(s.indexOf("Aylığı: ") + 8, s.indexOf("Mesai:") - 2)));
        g.setMesai(Integer.parseInt(s.substring(s.indexOf("Mesai: ") + 7, s.indexOf("Yevmiye: ") - 2)));
        g.setYevmiye(Float.parseFloat(s.substring(s.indexOf("Yevmiye: ") + 9, s.indexOf("$"))));

        return g;
    }
    
}