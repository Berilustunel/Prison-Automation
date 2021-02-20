package prisonNTP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calisan extends Kisi {

    private String gorev;
    private float yevmiye;
    private int mesai;
    private float maas;
    private DosyaIslem dosyaIslem;

    public Calisan() {
    }
    
    public String nobetSec(int id){
        return null;
    }

    public float CalcMaas(float yevmiye, int mesai) {
        float net;
        net = (yevmiye * mesai);
        return net;
    }

    public float CalcMaas(Calisan c) {
        float net;
        net = this.getMaas() + CalcZam();
        return net;
    }

    public float CalcZam() {
        float val;
        val = this.getMaas() * (10 / 100);
        return val;
    }

    public List<String> kodla(Calisan g) throws IOException {
        List<String> s = new ArrayList<>();
        List<String> t = new ArrayList<>();
        for (int j = 0; j < 41; j++) {
            s.add("");
        }

        if (g != null) {
            s.add(g.getId(), "ID:" + Integer.toString(g.getId()) + "." + "İsim: " + g.getAd()
                    + "_" + g.getSoyad() + " |" + " Yaş: " + g.getYas() + "|"
                    + " Görev Yeri: " + g.getGorev() + " " + "|Aylığı: " + g.getMaas()
                    + "| Mesai: " + g.getMesai() + " |Yevmiye: " + g.getYevmiye() + "$");
        }

        for (int j = 0; j < 41; j++) {
            if (!"".equals(s.get(j))) {
                t.add(s.get(j));
            }
        }
        return t;
    }

    public Calisan decode(String file, int id) throws IOException {
        return null;
    }

    public void create(List<String> s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public float getYevmiye() {
        return yevmiye;
    }

    public void setYevmiye(float yevmiye) {
        this.yevmiye = yevmiye;
    }

    public int getMesai() {
        return mesai;
    }

    public void setMesai(int mesai) {
        this.mesai = mesai;
    }

    public float getMaas() {
        return maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }

}
