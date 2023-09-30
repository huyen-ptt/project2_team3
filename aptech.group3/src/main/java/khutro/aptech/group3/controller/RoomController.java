package khutro.aptech.group3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import khutro.aptech.group3.App;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RoomController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void handleAddRoom() throws IOException {
        App.setRoot("add_room");
    }
}
