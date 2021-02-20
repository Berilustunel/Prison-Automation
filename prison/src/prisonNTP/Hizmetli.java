package prisonNTP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Hizmetli extends Calisan implements IDosya{

    private DosyaIslem dosyaIslem;

    public Hizmetli() {
       dosyaIslem=new DosyaIslem("Hizmetli.txt");
    }

    @Override
    public String nobetSec(int id){
        String s="";
        try {
            s=dosyaIslem.FileReadId("Gardiyan.txt",id);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if(id==1){
            s="Pazartesi";
        }else if(id==2){
            s="Salı";
        }else if(id==3){
            s="Çarşamba";
        }else if(id==4){
            s="Perşembe";
        }else if(id==5){
            s="Cuma";
        }else if(id==6){
            s="Cumartesi";
        }else if(id==7){
            s="Pazar";
        }
        
        return s;
    }

    @Override
    public float CalcZam(){
        float val;
        val=this.getYevmiye()*20;
        return val;
    }

    @Override
    public void create(List<String> s) {
        try {
            dosyaIslem.fileWrite(s, "Hizmetli.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<String> read() {
        List<String> slist=new ArrayList<>();
        try {
            slist=dosyaIslem.fileRead("Hizmetli.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       return slist;
    }

    @Override
    public void delete(int id) {
        try {
            dosyaIslem.fileDelete("Hizmetli.txt", id);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Hizmetli decode(String file, int id) throws IOException {
        Hizmetli h=new Hizmetli();
        String s;
        s = dosyaIslem.FileReadId(file, id);

        h.setId(Integer.parseInt(s.substring(s.indexOf(":") + 1, s.indexOf("."))));
        h.setAd(s.substring(s.indexOf("İsim: ") + 6, s.indexOf("_")));
        h.setSoyad(s.substring(s.indexOf("_") + 1, s.indexOf("Yaş:") - 2));
        h.setYas(Integer.parseInt(s.substring(s.indexOf("Yaş: ") + 5, s.indexOf("Görev Yeri: ") - 2)));
        h.setGorev(s.substring(s.indexOf("Görev Yeri: ") + 12, s.indexOf("Aylığı:") - 2));
        h.setMaas(Float.parseFloat(s.substring(s.indexOf("Aylığı: ") + 8, s.indexOf("Mesai:") - 2)));
        h.setMesai(Integer.parseInt(s.substring(s.indexOf("Mesai: ") + 7, s.indexOf("Yevmiye: ") - 2)));
        h.setYevmiye(Float.parseFloat(s.substring(s.indexOf("Yevmiye: ") + 9, s.indexOf("$"))));

        return h;
    }

}
