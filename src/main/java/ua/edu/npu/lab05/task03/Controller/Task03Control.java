package ua.edu.npu.lab05.task03.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Task03Control {
   @FXML
    public CheckBox jam;
   @FXML
   public ChoiceBox jamSelect;

    public void init(javafx.event.ActionEvent actionEvent) {
        if (jam.isSelected() ) {
            jamSelect.setDisable(false);
        }
        else {
            jamSelect.setDisable(true);
        }
    }
}
