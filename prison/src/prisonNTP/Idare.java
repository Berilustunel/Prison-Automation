package prisonNTP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Idare extends Calisan implements IDosya{

    private DosyaIslem dosyaIslem;
    
    public Idare() {
        dosyaIslem=new DosyaIslem("Idare.txt");
    }

    @Override
    public float CalcZam(){
        float val;
        val=this.getMaas()*(18/100)+(this.getYevmiye()*10);
        return val;
    }
    
    @Override
    public void create(List<String> s) {
        try {
            dosyaIslem.fileWrite(s, "Idare.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<String> read() {
        List<String> slist = new ArrayList<>();
        try {
            slist = dosyaIslem.fileRead("Idare.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return slist;
    }

    @Override
    public void delete(int id) {
        try {
            dosyaIslem.fileDelete("Idare.txt", id);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public Idare decode(String file, int id) throws IOException {
        Idare ip=new Idare();
        String s;
        s = dosyaIslem.FileReadId(file, id);

        ip.setId(Integer.parseInt(s.substring(s.indexOf(":") + 1, s.indexOf("."))));
        ip.setAd(s.substring(s.indexOf("İsim: ") + 6, s.indexOf("_")));
        ip.setSoyad(s.substring(s.indexOf("_") + 1, s.indexOf("Yaş:") - 2));
        ip.setYas(Integer.parseInt(s.substring(s.indexOf("Yaş: ") + 5, s.indexOf("Görev Yeri: ") - 2)));
        ip.setGorev(s.substring(s.indexOf("Görev Yeri: ") + 12, s.indexOf("Aylığı:") - 2));
        ip.setMaas(Float.parseFloat(s.substring(s.indexOf("Aylığı: ") + 8, s.indexOf("Mesai:") - 2)));
        ip.setMesai(Integer.parseInt(s.substring(s.indexOf("Mesai: ") + 7, s.indexOf("Yevmiye: ") - 2)));
        ip.setYevmiye(Float.parseFloat(s.substring(s.indexOf("Yevmiye: ") + 9, s.indexOf("$"))));

        return ip;
    }

}
