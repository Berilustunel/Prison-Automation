package prison;

import prisonNTP.Mahkum;
import prisonNTP.Gardiyan;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import prisonNTP.*;

public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Pane pnYan;
    @FXML
    private Pane pnYPI;
    @FXML
    private Pane pnIP;
    @FXML
    private Pane pnZiyaret;
    @FXML
    private Button btnMahkum;
    @FXML
    private Button btnZiyaretgun;
    @FXML
    private Button btnPersonel;
    @FXML
    private Button btnIdare;
    @FXML
    private Pane pnMI;
    @FXML
    private TextField txtMKIsim;
    @FXML
    private TextField txtMKSoyisim;
    @FXML
    private TextField txtMKYas;
    @FXML
    private TextField txtMKSuc;
    @FXML
    private DatePicker dtHukumTarihi;
    @FXML
    private TextField txtCezaSure;
    @FXML
    private ComboBox<?> cboxMKId;
    @FXML
    private ComboBox<?> cboxKogusId;
    @FXML
    private ComboBox<?> cboxYatakNumara;
    @FXML
    private Button btnMKKayitEkle;
    @FXML
    private TextArea txtareaMKayitlari;
    @FXML
    private Button btnMKyenile;
    @FXML
    private TextField txtfieldMKId;
    @FXML
    private Button btnMKKayitSil;
    @FXML
    private ComboBox<?> cboxMKKogus;
    @FXML
    private ComboBox<?> cboxMKYatak;
    @FXML
    private Button btnMKDegisimUygula;
    @FXML
    private Pane pnPersonel;
    @FXML
    private Button btnGI;
    @FXML
    private Pane pnGI;
    @FXML
    private Pane pnRevir;
    @FXML
    private Pane pnHI;
    @FXML
    private Button btnHI;
    @FXML
// GARDIYAN 
    private TextField txtGIsim;
    @FXML
    private TextField txtGSoyIsim;
    @FXML
    private TextField txtGYas;
    @FXML
    private ComboBox<?> cboxGGorevYeri;
    @FXML
    private TextField txtGMesai;
    @FXML
    private TextField txtGYevmiye;
    @FXML
    private ComboBox<?> cboxGId;
    @FXML
    private Button btnGKayitEkle;
    @FXML
    private TextArea txtAGKayitlari;
    @FXML
    private Button btnGYenile;
    @FXML
    private TextField txtGId;
    @FXML
    private Button btnGKick;
    @FXML
    private ComboBox<?> cboxGGorevYeriD;
    @FXML
    private Button btnGDegisim;
    @FXML
    private TextField txtGZam;
    @FXML
    private Button btnGZam;
    @FXML
//HIZMETLI
    private TextField txtHIsim;
    @FXML
    private TextField txtHSoyIsim;
    @FXML
    private TextField txtHYas;
    @FXML
    private ComboBox<?> cboxHGorevYeri;
    @FXML
    private TextField txtHMesai;
    @FXML
    private TextField txtHYevmiye;
    @FXML
    private ComboBox<?> cboxHId;
    @FXML
    private Button btnHKayitEkle;
    @FXML
    private TextArea txtAHKayitlari;
    @FXML
    private Button btnHYenile;
    @FXML
    private TextField txtHId;
    @FXML
    private Button btnHKick;
    @FXML
    private ComboBox<?> cboxHGorevYeriD;
    @FXML
    private Button btnHDegisim;
    @FXML
    private TextField txtHZam;
    @FXML
    private Button btnHZam;
    @FXML
//YEMEKHANE PERSONELİ
    private TextField txtYPIsim;
    @FXML
    private TextField txtYPSoyIsim;
    @FXML
    private TextField txtYPYas;
    @FXML
    private ComboBox<?> cboxYPGorevYeri;
    @FXML
    private TextField txtYPMesai;
    @FXML
    private TextField txtYPYevmiye;
    @FXML
    private ComboBox<?> cboxYPId;
    @FXML
    private Button btnYPKayitEkle;
    @FXML
    private TextArea txtAYPKayitlari;
    @FXML
    private Button btnYPYenile;
    @FXML
    private TextField txtYPId;
    @FXML
    private Button btnYPKick;
    @FXML
    private ComboBox<?> cboxYPGorevYeriD;
    @FXML
    private Button btnYPDegisim;
    @FXML
    private TextField txtYPZam;
    @FXML
    private Button btnYPZam;
    @FXML
//IDARE PERSONELİ
    private TextField txtIPIsim;
    @FXML
    private TextField txtIPSoyIsim;
    @FXML
    private TextField txtIPYas;
    @FXML
    private ComboBox<?> cboxIPGorevYeri;
    @FXML
    private TextField txtIPMesai;
    @FXML
    private TextField txtIPYevmiye;
    @FXML
    private ComboBox<?> cboxIPId;
    @FXML
    private Button btnIPKayitEkle;
    @FXML
    private TextArea txtAIPKayitlari;
    @FXML
    private Button btnIPYenile;
    @FXML
    private TextField txtIPId;
    @FXML
    private Button btnIPKick;
    @FXML
    private ComboBox<?> cboxIPGorevYeriD;
    @FXML
    private Button btnIPDegisim;
    @FXML
    private TextField txtIPZam;
    @FXML
    private Button btnIPZam;
    @FXML
//ZİYARETÇİ
    private TextField txtZIsim;
    @FXML
    private TextField txtZSoyisim;
    @FXML
    private ComboBox<?> cboxZId;
    @FXML
    private ComboBox<?> cboxZMId;
    @FXML
    private DatePicker dpZ;
    @FXML
    private Button btnZKayit;
    @FXML
    private TextArea txtAZ;
    @FXML
    private Button btnZYenile;
    @FXML
    //EKONOMİ
    private Button Ekonomi;
    @FXML
    private ComboBox<?> cboxElisi;
    @FXML
    private ComboBox<?> cboxTabloisi;
    @FXML
    private Pane pnEkonomi;
    @FXML
    private ComboBox<?> cboxSanatisi;
    @FXML
    private TextField txtKP;
    @FXML
    private Button btnIslem;
    @FXML
    private TextField txtBrutgKP;
    @FXML
    private TextField txtOdenek;
    @FXML
    private Button btnHesapla;
    @FXML
    private TextField txtBrutGelir;
    @FXML
    private TextField txtNetGelir;
    @FXML
    private TextField txtFatura;
    @FXML
    private TextField txtBakim;
    @FXML
    private Button btnTutar;
    @FXML
    private TextField txtGider;
    @FXML
    private TextField txtYeniBakiye;
    @FXML
    private TextArea txtABakiyeListesi;
    @FXML
    private Button btnNet;
    @FXML
    private TextField txtBakiye;
    @FXML
    private Button btnGuncelBakiye;
    @FXML
//REVIR
    private ComboBox<?> cboxRMId;
    @FXML
    private Button btnREkle;
    @FXML
    private TextField txtHastalik;
    @FXML
    private ComboBox<?> cboxDurum;
    @FXML
    private TextField txtIslemTipi;
    @FXML
    private TextArea txtARevir;
    @FXML
    private Button btnRYenile;
    @FXML
    private ComboBox<?> cboxRIdCikar;
    @FXML
    private Button btnRCikar;
    @FXML
//NÖBET LISTESI
    private Button btnNobetListesi;
    @FXML
    private Pane pnNobetListesi;
    @FXML
    private ComboBox<?> cboxNCalisan;
    @FXML
    private ComboBox<?> cboxNId;
    @FXML
    private TextArea txtANListe;
    @FXML
    private Button btnNKayitGoster;
    @FXML

    private Mahkum mahkum = new Mahkum();
    private Revir revir = new Revir();
    private Ekonomi ek = new Ekonomi();
    private Ziyaretci ziyaretci = new Ziyaretci();
    private Calisan calisan;
    private DosyaIslem ds;
    private List<String> slist = new ArrayList<>();
    private List<String> glist = new ArrayList<>();
    private List<String> zlist = new ArrayList<>();
    private List<String> hlist = new ArrayList<>();
    private List<String> yplist = new ArrayList<>();
    private List<String> iplist = new ArrayList<>();
    private List<String> elist = new ArrayList<>();
    private List<String> rlist = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ds = new DosyaIslem();

    }
//MAHKUM İŞLEMLERİ

    private void mahkumRefreshList() {
        int i = 0;
        txtareaMKayitlari.clear();
        slist = mahkum.read();
        while (i < slist.size() && slist.get(i) != null) {
            txtareaMKayitlari.appendText(slist.get(i) + "\n");
            i++;
        }
    }

    @FXML
    private void handleButtonMKD(ActionEvent event) throws IOException {
        String check;
        check = ds.FileReadId("Mahkum.txt", Integer.parseInt(txtfieldMKId.getText()));
        if (check.equals("ID has not been found")) {
            txtareaMKayitlari.appendText(check);
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(txtfieldMKId.getText())) {
            mahkum.delete(Integer.parseInt(txtfieldMKId.getText()));
            mahkumRefreshList();
        }
    }

    @FXML
    private void handleButtonMKC(ActionEvent event) throws IOException {
        mahkum = new Mahkum();
        String check;

        mahkum.setId(Integer.parseInt(cboxMKId.getSelectionModel().getSelectedItem().toString()));
        mahkum.setAd(txtMKIsim.getText());
        mahkum.setSoyad(txtMKSoyisim.getText());
        mahkum.setYas(Integer.parseInt(txtMKYas.getText()));
        mahkum.setSucu(txtMKSuc.getText());
        mahkum.setHukumTarihi(dtHukumTarihi.getValue().toString());
        mahkum.setCezaSuresi(Integer.parseInt(txtCezaSure.getText()));
        mahkum.setkId(Integer.parseInt(cboxKogusId.getSelectionModel().getSelectedItem().toString()));
        mahkum.setYatak(Integer.parseInt(cboxYatakNumara.getSelectionModel().getSelectedItem().toString()));

        check = ds.FileReadId("Mahkum.txt", mahkum.getId());
        if (check.equals("ID has not been found")) {
            if (mahkum != null) {
                slist = mahkum.kodla(mahkum);
            } else {
                txtareaMKayitlari.clear();
                txtareaMKayitlari.appendText("Kayıt için yeni bilgi girin:...");
            }
            slist.addAll(ds.fileRead("Mahkum.txt"));
            mahkum.create(slist);
            mahkumRefreshList();
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(Integer.toString(mahkum.getId()))) {
            txtareaMKayitlari.clear();
            txtareaMKayitlari.setText("Entered ID has already been given to another prisoners\n");
            txtareaMKayitlari.appendText("Please choose a proper ID to proceed\n");
            txtareaMKayitlari.appendText("||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||");
            txtareaMKayitlari.appendText("\nYou can use the 'Yenile' button to access to prisoner list");
            txtareaMKayitlari.appendText("\n||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||\n");
        }
    }

    @FXML
    private void handleButtonMKayitListele(ActionEvent event) throws IOException {
        mahkumRefreshList();
    }

    @FXML
    private void handleButtonMKU(ActionEvent event) throws IOException {
        int t;
        mahkum = new Mahkum();

        mahkum = mahkum.decode("Mahkum.txt", Integer.parseInt(txtfieldMKId.getText()));
        mahkum.delete(Integer.parseInt(txtfieldMKId.getText()));
        t = Integer.parseInt(cboxMKKogus.getSelectionModel().getSelectedItem().toString());
        mahkum.setkId(t);
        t = Integer.parseInt(cboxMKYatak.getSelectionModel().getSelectedItem().toString());
        mahkum.setYatak(t);

        if (mahkum != null) {
            slist = mahkum.kodla(mahkum);
        } else {
            txtareaMKayitlari.clear();
            txtareaMKayitlari.appendText("Kayıt için yeni bilgi girin:...");
        }
        slist.addAll(ds.fileRead("Mahkum.txt"));
        mahkum.create(slist);
        mahkumRefreshList();
    }

    @FXML
    private void handleButtonMahkum(ActionEvent event) {
        pnMI.toFront();
    }
//GARDİYAN İŞLEMLERİ

    private void gardiyanRefreshList() {
        int i = 0;
        calisan = new Gardiyan();
        txtAGKayitlari.clear();
        glist = calisan.read();
        while (i < glist.size() && glist.get(i) != null) {
            txtAGKayitlari.appendText(glist.get(i) + "\n");
            i++;
        }
    }

    @FXML
    private void handleButtonGKC() throws IOException {
        calisan = new Gardiyan();
        String check;

        calisan.setId(Integer.parseInt(cboxGId.getSelectionModel().getSelectedItem().toString()));
        calisan.setAd(txtGIsim.getText());
        calisan.setSoyad(txtGSoyIsim.getText());
        calisan.setYas(Integer.parseInt(txtGYas.getText()));
        calisan.setGorev(cboxGGorevYeri.getSelectionModel().getSelectedItem().toString());
        calisan.setMesai(Integer.parseInt(txtGMesai.getText()));
        calisan.setYevmiye(Float.parseFloat(txtGYevmiye.getText()));
        calisan.setMaas(calisan.CalcMaas(calisan.getYevmiye(), calisan.getMesai()));

        check = ds.FileReadId("Gardiyan.txt", calisan.getId());
        if (check.equals("ID has not been found")) {
            glist = calisan.kodla(calisan);
            glist.addAll(ds.fileRead("Gardiyan.txt"));
            calisan.create(glist);
            gardiyanRefreshList();
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(Integer.toString(calisan.getId()))) {
            txtAGKayitlari.clear();
            txtAGKayitlari.setText("Entered ID has already been given to another guardian\n");
            txtAGKayitlari.appendText("Please choose a proper ID to proceed\n");
            txtAGKayitlari.appendText("||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||");
            txtAGKayitlari.appendText("\nYou can use the 'Yenile' button to access to guardians list");
            txtAGKayitlari.appendText("\n||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||\n");
        }
    }

    @FXML
    private void handleButtonGKayitListele() {
        gardiyanRefreshList();
    }

    @FXML
    private void handleButtonGKUGorev() throws IOException {
        String t;
        calisan = new Gardiyan();

        calisan = calisan.decode("Gardiyan.txt", Integer.parseInt(txtGId.getText()));
        calisan.delete(Integer.parseInt(txtGId.getText()));
        t = cboxGGorevYeriD.getSelectionModel().getSelectedItem().toString();
        calisan.setGorev(t);
        if (calisan != null) {
            glist = calisan.kodla(calisan);
        }
        glist.addAll(ds.fileRead("Gardiyan.txt"));
        calisan.create(glist);
        gardiyanRefreshList();
    }

    @FXML
    private void handleButtonGKUMaas() throws IOException {
        String t;
        calisan = new Gardiyan();

        calisan = calisan.decode("Gardiyan.txt", Integer.parseInt(txtGId.getText()));
        calisan.delete(Integer.parseInt(txtGId.getText()));
        t = txtGZam.getText();
        calisan.setYevmiye(Float.parseFloat(t));
        calisan.setMaas(calisan.CalcMaas(calisan));
        if (calisan != null) {
            glist = calisan.kodla(calisan);
        }
        glist.addAll(ds.fileRead("Gardiyan.txt"));
        calisan.create(glist);
        gardiyanRefreshList();
    }

    @FXML
    private void handleButtonGKD() throws IOException {
        calisan = new Gardiyan();
        String check;
        check = ds.FileReadId("Gardiyan.txt", Integer.parseInt(txtGId.getText()));
        if (check.equals("ID has not been found")) {
            txtAGKayitlari.appendText(check);
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(txtGId.getText())) {
            calisan.delete(Integer.parseInt(txtGId.getText()));
            gardiyanRefreshList();
        }
    }
//HİZMETLİ İŞLEMLERİ

    private void hizmetliRefreshList() {
        int i = 0;
        calisan = new Hizmetli();
        txtAHKayitlari.clear();
        hlist = calisan.read();
        while (i < hlist.size() && hlist.get(i) != null) {
            txtAHKayitlari.appendText(hlist.get(i) + "\n");
            i++;
        }
    }

    @FXML
    private void handleButtonHKayitListele() {
        hizmetliRefreshList();
    }

    @FXML
    private void handleButtonHKC() throws IOException {
        calisan = new Hizmetli();
        String check;

        calisan.setId(Integer.parseInt(cboxHId.getSelectionModel().getSelectedItem().toString()));
        calisan.setAd(txtHIsim.getText());
        calisan.setSoyad(txtHSoyIsim.getText());
        calisan.setYas(Integer.parseInt(txtHYas.getText()));
        calisan.setGorev(cboxHGorevYeri.getSelectionModel().getSelectedItem().toString());
        calisan.setMesai(Integer.parseInt(txtHMesai.getText()));
        calisan.setYevmiye(Float.parseFloat(txtHYevmiye.getText()));
        calisan.setMaas(calisan.CalcMaas(calisan.getYevmiye(), calisan.getMesai()));

        check = ds.FileReadId("Hizmetli.txt", calisan.getId());
        if (check.equals("ID has not been found")) {
            hlist = calisan.kodla(calisan);
            hlist.addAll(ds.fileRead("Hizmetli.txt"));
            calisan.create(hlist);
            hizmetliRefreshList();
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(Integer.toString(calisan.getId()))) {
            txtAHKayitlari.clear();
            txtAHKayitlari.setText("Entered ID has already been given to another guardian\n");
            txtAHKayitlari.appendText("Please choose a proper ID to proceed\n");
            txtAHKayitlari.appendText("||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||");
            txtAHKayitlari.appendText("\nYou can use the 'Yenile' button to access to guardians list");
            txtAHKayitlari.appendText("\n||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||\n");
        }
    }

    @FXML
    private void handleButtonHKD() throws IOException {
        calisan = new Hizmetli();
        String check;
        check = ds.FileReadId("Hizmetli.txt", Integer.parseInt(txtHId.getText()));
        if (check.equals("ID has not been found")) {
            txtAHKayitlari.appendText(check);
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(txtHId.getText())) {
            calisan.delete(Integer.parseInt(txtHId.getText()));
            hizmetliRefreshList();
        }
    }

    @FXML
    private void handleButtonHKUGorev() throws IOException {
        String t;
        calisan = new Hizmetli();

        calisan = calisan.decode("Hizmetli.txt", Integer.parseInt(txtHId.getText()));
        calisan.delete(Integer.parseInt(txtHId.getText()));
        t = cboxHGorevYeriD.getSelectionModel().getSelectedItem().toString();
        calisan.setGorev(t);
        if (calisan != null) {
            hlist = calisan.kodla(calisan);
        }
        hlist.addAll(ds.fileRead("Hizmetli.txt"));
        calisan.create(hlist);
        hizmetliRefreshList();
    }

    @FXML
    private void handleButtonHKUMaas() throws IOException {
        String t;
        calisan = new Hizmetli();

        calisan = calisan.decode("Hizmetli.txt", Integer.parseInt(txtHId.getText()));
        calisan.delete(Integer.parseInt(txtHId.getText()));
        t = txtHZam.getText();
        calisan.setYevmiye(Float.parseFloat(t));
        calisan.setMaas(calisan.CalcMaas(calisan));
        if (calisan != null) {
            hlist = calisan.kodla(calisan);
        }
        hlist.addAll(ds.fileRead("Hizmetli.txt"));
        calisan.create(hlist);
        hizmetliRefreshList();
    }
//YEMEKHANE PERSONELİ İŞLEMLERİ

    private void ypRefreshList() {
        int i = 0;
        calisan = new YemekhanePersoneli();
        txtAYPKayitlari.clear();
        yplist = calisan.read();
        while (i < yplist.size() && yplist.get(i) != null) {
            txtAYPKayitlari.appendText(yplist.get(i) + "\n");
            i++;
        }
    }

    @FXML
    private void handleButtonYPKayitListele() {
        ypRefreshList();
    }

    @FXML
    private void handleButtonYPKC() throws IOException {
        calisan = new YemekhanePersoneli();
        String check;

        calisan.setId(Integer.parseInt(cboxYPId.getSelectionModel().getSelectedItem().toString()));
        calisan.setAd(txtYPIsim.getText());
        calisan.setSoyad(txtYPSoyIsim.getText());
        calisan.setYas(Integer.parseInt(txtYPYas.getText()));
        calisan.setGorev(cboxYPGorevYeri.getSelectionModel().getSelectedItem().toString());
        calisan.setMesai(Integer.parseInt(txtYPMesai.getText()));
        calisan.setYevmiye(Float.parseFloat(txtYPYevmiye.getText()));
        calisan.setMaas(calisan.CalcMaas(calisan.getYevmiye(), calisan.getMesai()));

        check = ds.FileReadId("Yemekhane_Personeli.txt", calisan.getId());
        if (check.equals("ID has not been found")) {
            yplist = calisan.kodla(calisan);
            yplist.addAll(ds.fileRead("Yemekhane_Personeli.txt"));
            calisan.create(yplist);
            ypRefreshList();
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(Integer.toString(calisan.getId()))) {
            txtAYPKayitlari.clear();
            txtAYPKayitlari.setText("Entered ID has already been given to another guardian\n");
            txtAYPKayitlari.appendText("Please choose a proper ID to proceed\n");
            txtAYPKayitlari.appendText("||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||");
            txtAYPKayitlari.appendText("\nYou can use the 'Yenile' button to access to guardians list");
            txtAYPKayitlari.appendText("\n||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||\n");
        }
    }

    @FXML
    private void handleYPKD() throws IOException {
        calisan = new YemekhanePersoneli();
        String check;
        check = ds.FileReadId("Yemekhane_Personeli.txt", Integer.parseInt(txtYPId.getText()));
        if (check.equals("ID has not been found")) {
            txtAYPKayitlari.appendText(check);
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(txtYPId.getText())) {
            calisan.delete(Integer.parseInt(txtYPId.getText()));
            ypRefreshList();
        }
    }

    @FXML
    private void handleButtonYPKUGorev() throws IOException {
        String t;
        calisan = new YemekhanePersoneli();

        calisan = calisan.decode("Yemekhane_Personeli.txt", Integer.parseInt(txtYPId.getText()));
        calisan.delete(Integer.parseInt(txtYPId.getText()));
        t = cboxYPGorevYeriD.getSelectionModel().getSelectedItem().toString();
        calisan.setGorev(t);
        if (calisan != null) {
            yplist = calisan.kodla(calisan);
        }
        yplist.addAll(ds.fileRead("Yemekhane_Personeli.txt"));
        calisan.create(yplist);
        ypRefreshList();
    }

    @FXML
    private void handleButtonYPKUMaas() throws IOException {
        String t;
        calisan = new YemekhanePersoneli();

        calisan = calisan.decode("Yemekhane_Personeli.txt", Integer.parseInt(txtYPId.getText()));
        calisan.delete(Integer.parseInt(txtYPId.getText()));
        t = txtYPZam.getText();
        calisan.setYevmiye(Float.parseFloat(t));
        calisan.setMaas(calisan.CalcMaas(calisan));
        if (calisan != null) {
            yplist = calisan.kodla(calisan);
        }
        yplist.addAll(ds.fileRead("Yemekhane_Personeli.txt"));
        calisan.create(yplist);
        ypRefreshList();
    }
//IDARE PERSONELİ İŞLEMLERİ

    private void ipRefreshList() {
        int i = 0;
        calisan = new Idare();
        txtAIPKayitlari.clear();
        iplist = calisan.read();
        while (i < iplist.size() && iplist.get(i) != null) {
            txtAIPKayitlari.appendText(iplist.get(i) + "\n");
            i++;
        }
    }

    @FXML
    private void handleButtoniPKayitListele() {
        ipRefreshList();
    }

    @FXML
    private void handleButtonIPKC() throws IOException {
        calisan = new Idare();
        String check;

        calisan.setId(Integer.parseInt(cboxIPId.getSelectionModel().getSelectedItem().toString()));
        calisan.setAd(txtIPIsim.getText());
        calisan.setSoyad(txtIPSoyIsim.getText());
        calisan.setYas(Integer.parseInt(txtIPYas.getText()));
        calisan.setGorev(cboxIPGorevYeri.getSelectionModel().getSelectedItem().toString());
        calisan.setMesai(Integer.parseInt(txtIPMesai.getText()));
        calisan.setYevmiye(Float.parseFloat(txtIPYevmiye.getText()));
        calisan.setMaas(calisan.CalcMaas(calisan.getYevmiye(), calisan.getMesai()));

        check = ds.FileReadId("Idare.txt", calisan.getId());
        if (check.equals("ID has not been found")) {
            iplist = calisan.kodla(calisan);
            iplist.addAll(ds.fileRead("Idare.txt"));
            calisan.create(iplist);
            ipRefreshList();
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(Integer.toString(calisan.getId()))) {
            txtAIPKayitlari.clear();
            txtAIPKayitlari.setText("Entered ID has already been given to another guardian\n");
            txtAIPKayitlari.appendText("Please choose a proper ID to proceed\n");
            txtAIPKayitlari.appendText("||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||");
            txtAIPKayitlari.appendText("\nYou can use the 'Yenile' button to access to guardians list");
            txtAIPKayitlari.appendText("\n||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||\n");
        }
    }

    @FXML
    private void handleIPKD() throws IOException {
        calisan = new Idare();
        String check;
        check = ds.FileReadId("Idare.txt", Integer.parseInt(txtIPId.getText()));
        if (check.equals("ID has not been found")) {
            txtAIPKayitlari.appendText(check);
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(txtIPId.getText())) {
            calisan.delete(Integer.parseInt(txtIPId.getText()));
            ipRefreshList();
        }
    }

    @FXML
    private void handleButtonIPKUGorev() throws IOException {
        String t;
        calisan = new Idare();

        calisan = calisan.decode("Idare.txt", Integer.parseInt(txtIPId.getText()));
        calisan.delete(Integer.parseInt(txtIPId.getText()));
        t = cboxIPGorevYeriD.getSelectionModel().getSelectedItem().toString();
        calisan.setGorev(t);
        if (calisan != null) {
            iplist = calisan.kodla(calisan);
        }
        iplist.addAll(ds.fileRead("Idare.txt"));
        calisan.create(iplist);
        ipRefreshList();
    }

    @FXML
    private void handleButtonIPKUMaas() throws IOException {
        String t;
        calisan = new Idare();

        calisan = calisan.decode("Idare.txt", Integer.parseInt(txtIPId.getText()));
        calisan.delete(Integer.parseInt(txtIPId.getText()));
        t = txtIPZam.getText();
        calisan.setYevmiye(Float.parseFloat(t));
        calisan.setMaas(calisan.CalcMaas(calisan));
        if (calisan != null) {
            iplist = calisan.kodla(calisan);
        }
        iplist.addAll(ds.fileRead("Idare.txt"));
        calisan.create(iplist);
        ipRefreshList();
    }
//ZİYARETÇİ İŞLEMLERİ

    private void ziyaretciRefreshList() {
        int i = 0;
        txtAZ.clear();
        zlist = ziyaretci.read();
        while (i < zlist.size() && zlist.get(i) != null) {
            txtAZ.appendText(zlist.get(i) + "\n");
            i++;
        }
    }

    @FXML
    private void handleButtonZiyaretciKayit() throws IOException {
        String check;
        String checkm;

        ziyaretci.setId(Integer.parseInt(cboxZId.getSelectionModel().getSelectedItem().toString()));
        ziyaretci.setAd(txtZIsim.getText());
        ziyaretci.setSoyad(txtZSoyisim.getText());
        ziyaretci.setYas(0);
        ziyaretci.setGirisTarihi(dpZ.getValue().toString());
        ziyaretci.setmId(Integer.parseInt(cboxZMId.getSelectionModel().getSelectedItem().toString()));
        check = ds.FileReadId("Ziyaretci.txt", ziyaretci.getId());
        checkm = ds.FileReadId("Mahkum.txt", ziyaretci.getmId());
        if (check.equals("ID has not been found") && (!checkm.equals("ID has not been found"))) {
            zlist = ziyaretci.kodla(ziyaretci);
            zlist.addAll(ds.fileRead("Ziyaretci.txt"));
            ziyaretci.create(zlist);
            ziyaretciRefreshList();
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(Integer.toString(ziyaretci.getId()))) {
            txtAZ.clear();
            txtAZ.setText("You have either entered an already assinged ID number\nfor the visitor or the ID input for the prisoner is wrong\n\n");
            txtAZ.appendText("Please choose a proper ID to proceed\n");
            txtAZ.appendText("||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||");
            txtAZ.appendText("\nYou can use the 'Yenile' button to access to visitors list");
            txtAZ.appendText("\n||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t||||||||\t|||\n");
        }
    }

    @FXML
    private void handleButtonZiyaretciR() {
        ziyaretciRefreshList();
    }

//EKONOMİ
    @FXML
    private void handleButtonGider() {
        double g = ek.Gider(Double.parseDouble(txtFatura.getText()), Double.parseDouble(txtBakim.getText()));
        txtGider.setText(Double.toString(g));
        txtBakiye.setText(Integer.toString(ek.getBakiye()));
    }

    @FXML
    private void handleButtonKatki() {

        int k = mahkum.Katki(Integer.parseInt(cboxElisi.getSelectionModel().getSelectedItem().toString()), Integer.parseInt(cboxSanatisi.getSelectionModel().getSelectedItem().toString()), Integer.parseInt(cboxTabloisi.getSelectionModel().getSelectedItem().toString()));
        txtKP.setText(Integer.toString(k));
        txtBrutgKP.setText(txtKP.getText().toString());
    }

    @FXML
    private void handleButtonBrutGelir() {

        double bg = ek.brutGelir(Double.parseDouble(txtKP.getText()), Double.parseDouble(txtOdenek.getText()));
        txtBrutGelir.setText(Double.toString(bg));

    }

    @FXML
    private void handleButtonNetGelir() {
        double ng = ek.netGelir(Double.parseDouble(txtBrutGelir.getText()));
        txtNetGelir.setText(Double.toString(ng));
    }

    @FXML
    private void muhasebeRefreshList() {
        int i = 0;
        txtABakiyeListesi.clear();
        elist = ek.read();
        while (i < elist.size() && elist.get(i) != null) {
            txtABakiyeListesi.appendText(elist.get(i) + "\n");
            i++;
        }
    }

    @FXML
    private void handleButtonYeniBakiye() throws IOException {
        double yb = ek.yeniBakiye(Double.parseDouble(txtNetGelir.getText()), Double.parseDouble(txtGider.getText()), ek.getBakiye());
        txtYeniBakiye.setText(Double.toString(yb));
        elist.add("BAKİYE: " + txtYeniBakiye.getText() + " | GELİR: " + txtNetGelir.getText() + " | GİDER: " + txtGider.getText());
        elist.addAll(ds.fileRead("Muhasebe.txt"));
        ds.fileWrite(elist, "Muhasebe.txt");
        muhasebeRefreshList();
        elist.clear();
    }

//NOBET ISLEMLERI
    @FXML
    private void handleButtonNKayitGoster() throws IOException {
        int id = Integer.parseInt(cboxNId.getSelectionModel().getSelectedItem().toString());
        String s;
        String isim = "";
        String check;
        check = ds.FileReadId("Gardiyan.txt", Integer.parseInt(cboxNId.getSelectionModel().getSelectedItem().toString()));
        if (cboxNCalisan.getSelectionModel().getSelectedItem().toString().equals("Gardiyan")) {
            if (check.equals("ID has not been found")) {
                txtANListe.setText(check);
            } else {
                calisan = new Gardiyan();
                isim = ds.FileReadId("Gardiyan.txt", id);
                isim = isim.substring(isim.indexOf("İsim: ") + 6, isim.indexOf("_")) + " " + isim.substring(isim.indexOf("_") + 1, isim.indexOf("Yaş:") - 3);
                s = calisan.nobetSec(id);
                txtANListe.appendText(id + " " + isim + " " + "Nöbet Günü: " + s + "\n");
            }
        } else {
            check = ds.FileReadId("Hizmetli.txt", Integer.parseInt(cboxNId.getSelectionModel().getSelectedItem().toString()));
            if (id > 7 || check.equals("ID has not been found")) {
                txtANListe.setText(check);
            } else {
                calisan = new Hizmetli();
                isim = ds.FileReadId("Hizmetli.txt", id);
                isim = isim.substring(isim.indexOf("İsim: ") + 6, isim.indexOf("_")) + " " + isim.substring(isim.indexOf("_") + 1, isim.indexOf("Yaş:") - 3);
                s = calisan.nobetSec(id);
                txtANListe.appendText(id + " " + isim + " " + "Nöbet Günü: " + s + "\n");
            }

        }

    }

//REVIR
    @FXML
    private void handleButtonRKayit() throws IOException {
        revir.setHastalık(txtHastalik.getText());
        revir.setDurumu(cboxDurum.getSelectionModel().getSelectedItem().toString());
        revir.setmId(Integer.parseInt(cboxRMId.getSelectionModel().getSelectedItem().toString()));
        int id = Integer.parseInt(cboxRMId.getSelectionModel().getSelectedItem().toString());
        String isim = null;
        String satir;
        isim = ds.FileReadId("Mahkum.txt", id);
        isim = isim.substring(isim.indexOf("İsim: ") + 6, isim.indexOf("_")) + " " + isim.substring(isim.indexOf("_") + 1, isim.indexOf("Yaş:") - 2);

        String durum = cboxDurum.getSelectionModel().getSelectedItem().toString();
        if (durum.equals("Ağır")) {
            txtIslemTipi.setText("Hastaneye sevk");
        } else {
            txtIslemTipi.setText("Revirde muayene edilecek");
        }
        satir = "Mahkum ID:" + revir.getmId() + "." + "isim: " + isim + " |Hastalık: " + revir.getHastalık() + " |Durumu: " + revir.getDurumu() + " |Islem: " + txtIslemTipi.getText();
        rlist.add(satir);
        rlist.addAll(ds.fileRead("Revir.txt"));
        revir.create(rlist);
    }

    @FXML
    private void handleButtonRYenile() {
        int i = 0;
        txtARevir.clear();
        rlist = revir.read();
        while (i < rlist.size() && rlist.get(i) != null) {
            txtARevir.appendText(rlist.get(i) + "\n");
            i++;
        }
    }

    @FXML
    private void handleButtonRCikar() throws IOException {
        revir = new Revir();
        String check;
        check = ds.FileReadId("Revir.txt", Integer.parseInt(cboxRIdCikar.getSelectionModel().getSelectedItem().toString()));
        if (check.equals("ID has not been found")) {
            txtARevir.appendText(check);
        } else if (check.substring(check.indexOf(":") + 1, check.indexOf(".")).equals(cboxRIdCikar.getSelectionModel().getSelectedItem().toString())) {
            revir.delete(Integer.parseInt(cboxRIdCikar.getSelectionModel().getSelectedItem().toString()));
        }
    }

//ARAYÜZ KONTROLLERİ
    @FXML
    private void handleButtonPersonel(ActionEvent event) {
        pnPersonel.toFront();
    }

    @FXML
    private void handleButtonGI(ActionEvent event) {
        pnGI.toFront();
    }

    @FXML
    private void handleButtonHI(ActionEvent event) {
        pnHI.toFront();
    }

    @FXML
    private void handleButtonYPI(ActionEvent event) {
        pnYPI.toFront();
    }

    @FXML
    private void handleButtonIP(ActionEvent event) {
        pnIP.toFront();
    }

    @FXML
    private void handleButtonZiyaret(ActionEvent event) {
        pnZiyaret.toFront();
    }

    @FXML
    private void handleButtonRevir(ActionEvent event) {
        pnRevir.toFront();
    }

    @FXML
    private void handleButtonEkonomi(ActionEvent event) {
        pnEkonomi.toFront();
    }

    @FXML
    private void handleButtonNobetListesi(ActionEvent event) {
        pnNobetListesi.toFront();
    }

}
