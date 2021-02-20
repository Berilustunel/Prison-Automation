package prisonNTP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Revir implements IDosya{

    private String hastalık;
    private String durumu;
    private int mId;
    private DosyaIslem dosyaIslem;

    public Revir() {
        dosyaIslem= new DosyaIslem("Revir.txt");
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getDurumu() {
        return durumu;
    }

    public void setDurumu(String durumu) {
        this.durumu = durumu;
    }

    public String getHastalık() {
        return hastalık;
    }

    public void setHastalık(String hastalık) {
        this.hastalık = hastalık;
    }

    @Override
    public void create(List<String> s) {
        try {
            dosyaIslem.fileWrite(s, "Revir.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<String> read() {
        List<String> slist = new ArrayList<>();
        try {
            slist = dosyaIslem.fileRead("Revir.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return slist;
    }

    @Override
    public void delete(int id) {
        try {
            dosyaIslem.fileDelete("Revir.txt", id);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
