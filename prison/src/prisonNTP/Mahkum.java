package prisonNTP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Mahkum extends Kisi implements IDosya {

    private String sucu;
    private String hukumTarihi;
    private int cezaSuresi;
    private int kId;
    private int yatak;
    private DosyaIslem dosyaIslem;

    public Mahkum() {
        dosyaIslem = new DosyaIslem("Mahkum.txt");
    }
    
    
    public int Katki(int elisi, int sanatisi, int tabloisi) {
        // 3 tip iş için de textfieldten o işi kaç kişinin yaptığına dair integer alınacak.
        int toplam = 0, a = 0, b = 0, c = 0;
        a = elisi * 750;
        b = sanatisi * 600;
        c = tabloisi * 500;
        toplam = a + b + c;

        return toplam;
    }

    @Override
    public void create(List<String> s) {
        try {
            dosyaIslem.fileWrite(s, "Mahkum.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<String> read() {
        List<String> slist = new ArrayList<>();
        try {
            slist = dosyaIslem.fileRead("Mahkum.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return slist;
    }

    @Override
    public void delete(int id) {
        try {
            dosyaIslem.fileDelete("Mahkum.txt", id);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public List<String> kodla(Mahkum m) throws IOException {
        List<String> s = new ArrayList<>();
        List<String> t = new ArrayList<>();

        for (int j = 0; j < 41; j++) {
            s.add("");
        }

        s.add(m.getId(), "ID:" + Integer.toString(m.getId()) + "." + "İsim: " + m.getAd()
                + "_" + m.getSoyad() + "|" + " Yaş: " + m.getYas() + "|"
                + " Suçu: " + m.getSucu() + "| Hüküm Tarihi: " + m.getHukumTarihi()
                + "| Ceza süresi: " + m.getCezaSuresi() + "| Koğuş No: " + m.getkId() + "| "
                + "Yatak No: " + m.getYatak() + "|");

        for (int j = 0; j < 41; j++) {
            if (!"".equals(s.get(j))) {
                t.add(s.get(j));
            }
        }
        return t;
    }

    public Mahkum decode(String file, int id) throws IOException {
        Mahkum m = new Mahkum();
        String s;
        s = dosyaIslem.FileReadId(file, id);

        m.setId(Integer.parseInt(s.substring(s.indexOf(":") + 1, s.indexOf("."))));
        m.setAd(s.substring(s.indexOf("İsim: ") + 6, s.indexOf("_")));
        m.setSoyad(s.substring(s.indexOf("_") + 1, s.indexOf("Yaş:") - 2));
        m.setYas(Integer.parseInt(s.substring(s.indexOf("Yaş: ") + 5, s.indexOf("Suçu: ") - 2)));
        m.setSucu(s.substring(s.indexOf("Suçu: ") + 6, s.indexOf("Hüküm") - 2));
        m.setHukumTarihi(s.substring(s.indexOf("Hüküm Tarihi: ") + 14, s.indexOf("Ceza") - 2));
        m.setCezaSuresi(Integer.parseInt(s.substring(s.indexOf("Ceza süresi: ") + 13, s.indexOf("Koğuş") - 2)));
        m.setkId(Integer.parseInt(s.substring(s.indexOf("Koğuş No: ") + 10, s.indexOf("Yatak") - 2)));
        m.setYatak(Integer.parseInt(s.substring(s.indexOf("Yatak No: ") + 10, s.indexOf("Yatak No: ") + 11)));

        return m;
    }

    public String getSucu() {
        return sucu;
    }

    public void setSucu(String sucu) {
        this.sucu = sucu;
    }

    public String getHukumTarihi() {
        return hukumTarihi;
    }

    public void setHukumTarihi(String hukumTarihi) {
        this.hukumTarihi = hukumTarihi;
    }

    public int getCezaSuresi() {
        return cezaSuresi;
    }

    public void setCezaSuresi(int cezaSuresi) {
        this.cezaSuresi = cezaSuresi;
    }

    public int getkId() {
        return kId;
    }

    public void setkId(int kId) {
        this.kId = kId;
    }

    public int getYatak() {
        return yatak;
    }

    public void setYatak(int yatak) {
        this.yatak = yatak;
    }

}
