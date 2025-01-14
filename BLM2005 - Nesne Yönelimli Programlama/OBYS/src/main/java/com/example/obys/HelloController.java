package com.example.obys;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private TextField OgrenciSifreTF;
    @FXML
    private TextField OgrenciAdTF;
    @FXML
    private Button GirisButton;

    private ArrayList<Ogrenci> ogrenciListesi = new ArrayList<>();

    public HelloController() {
        ogrenciListesi.add(new Ogrenci("Ahmet", "1234"));
        ogrenciListesi.add(new Ogrenci("Ayse", "5678"));
        ogrenciListesi.add(new Ogrenci("Merve", "91011"));
    }


    @FXML
    protected void onGirisButtonClick() {
        String kullaniciAdi = OgrenciAdTF.getText();
        String sifre = OgrenciSifreTF.getText();
        boolean girisBasarili = false;

        for (Ogrenci ogrenci : ogrenciListesi) {
            if (ogrenci.getKullaniciAdi().equals(kullaniciAdi) && ogrenci.getSifre().equals(sifre)) {
                girisBasarili = true;
                break;
            }
        }

        if (girisBasarili) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Giriş Başarılı");
            alert.setHeaderText(null);
            alert.setContentText("Giriş başarılı!");
            alert.showAndWait();

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("YeniEkran.fxml"));
                Parent root = loader.load();

                YeniEkran yeniEkranController = loader.getController();
                yeniEkranController.setOgrenciAdi(kullaniciAdi);

                Stage stage = (Stage) GirisButton.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hatalı Giriş");
            alert.setHeaderText(null);
            alert.setContentText("Kullanıcı adı veya şifre hatalı!");
            alert.showAndWait();
        }
    }
}

