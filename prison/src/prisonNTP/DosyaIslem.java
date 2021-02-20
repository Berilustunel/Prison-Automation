package prisonNTP;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DosyaIslem {

    private File fl;

    public DosyaIslem() {
    }

    public DosyaIslem(String fileName) {
        try {
            fl = new File(fileName);
            if (!fl.exists()) {
                fl.createNewFile();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void fileWrite(List<String> aList, String file) throws IOException {
        Path main = Paths.get(file);
        Files.write(main, aList);
    }

    public List<String> fileRead(String file) throws IOException {
        Path main = Paths.get(file);
        List<String> slist;
        slist = Files.readAllLines(main);
        return slist;
    }

    public String FileReadId(String file, int id) throws IOException {
        List<String> slist = new ArrayList<>();
        String s = null;
        slist = fileRead(file);
        int i = 0;
        while (i < slist.size()) {
            s = slist.get(i);
            if (Integer.parseInt(s.substring(s.indexOf(":") + 1, s.indexOf("."))) == id) {
                return s;
            }
            i++;
        }
        return "ID has not been found";
    }

    public void fileDelete(String file, int id) throws IOException {
        Path main = Paths.get(file);
        List<String> slist = new ArrayList<>();
        String s = null;
        slist = fileRead(file);
        int i = 0;
        while (i < slist.size()) {
            s = slist.get(i);
            if (Integer.parseInt(s.substring(s.indexOf(":") + 1, s.indexOf("."))) == id) {
                slist.remove(i);
            }
            i++;
        }
        Files.write(main, slist, Charset.defaultCharset());
    }

}
