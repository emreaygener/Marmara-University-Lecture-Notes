package com.example.obys;

import javafx.application.Platform;
import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class YeniEkran {

    @FXML
    private Label hosgeldinLabel;

    @FXML
    private ChoiceBox<String> ders1ChoiceBox;

    @FXML
    private ChoiceBox<String> ders2ChoiceBox;

    @FXML
    private ChoiceBox<String> ders3ChoiceBox;

    @FXML
    private Button SecimOnaylaButton;
    @FXML
    private Button CikisButton;

    @FXML
    public void initialize() {

        String[] dersler = {"Matematik", "Fizik", "Kimya", "Biyoloji", "Tarih", "Edebiyat"};

        ders1ChoiceBox.getItems().addAll(dersler);
        ders2ChoiceBox.getItems().addAll(dersler);
        ders3ChoiceBox.getItems().addAll(dersler);
    }
    @FXML
    protected void onSecimOnaylaButtonClick() {
        String ders1 = ders1ChoiceBox.getValue();
        String ders2 = ders2ChoiceBox.getValue();
        String ders3 = ders3ChoiceBox.getValue();

        if (ders1 != null && ders2 != null && ders3 != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ders Seçimi Onayı");
            alert.setHeaderText(null);
            alert.setContentText("Seçilen Dersler:\n1. Ders: " + ders1 + "\n2. Ders: " + ders2 + "\n3. Ders: " + ders3);
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Eksik Seçim");
            alert.setHeaderText(null);
            alert.setContentText("Lütfen tüm dersleri seçiniz!");
            alert.showAndWait();
        }
    }


   public void setOgrenciAdi(String ogrenciAdi) {
        hosgeldinLabel.setText("Hoşgeldiniz, " + ogrenciAdi);
    }

    @FXML
    protected void onCikisButtonClick() {
        Platform.exit();
    }
}
