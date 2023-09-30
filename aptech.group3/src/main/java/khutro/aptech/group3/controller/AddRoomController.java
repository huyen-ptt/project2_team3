package khutro.aptech.group3.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import khutro.aptech.group3.database.ConnectionProvider;
import khutro.aptech.group3.model.RoomModel;
import khutro.aptech.group3.utils.AlertMessage;

public class AddRoomController implements Initializable {

    ConnectionProvider connection = new ConnectionProvider();
//    RoomDaoImpl roomDao = new RoomDaoImpl(connection.getConnection());

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private TextField occupancyTextField;

    @FXML
    private ChoiceBox<String> statusChoiceBox;

    @FXML
    private Button buttonUploadFiles;

    @FXML
    private ChoiceBox<String> typeChoiceBox;

    @FXML
    private TextField addressTextField;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private Button buttonSubmit;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Các logic khởi tạo của bạn ở đây.
    }

    public void Submit(ActionEvent event) {
        // Lấy giá trị từ các trường dữ liệu
        String name = nameTextField.getText().trim();
        String price = priceTextField.getText().trim();
        String occupancy = occupancyTextField.getText().trim();
        String status = statusChoiceBox.getValue().trim();
        String type = typeChoiceBox.getValue().trim();
        String address = addressTextField.getText().trim();
        String description = descriptionTextArea.getText().trim();

        // Kiểm tra xem các trường dữ liệu có rỗng hay không
        if (name.isEmpty() || price.isEmpty() || occupancy.isEmpty() || status == null || type == null || address.isEmpty() || description.isEmpty()) {
            AlertMessage.showAlert("Error", "Chưa nhập đủ thông tin");
        } else {
            try {
                // Tạo đối tượng RoomModel từ các giá trị đã hứng

//                boolean isSuccess = roomDao.insertRoom(roomModel);
                if (true) {
                    clearFields();
//                    refreshTable();
                    AlertMessage.showAlert("Success", "Room information saved successfully.");
                } else {
                    AlertMessage.showAlert("Error", "Failed to save room information.");
                }
            } catch (NumberFormatException e) {
                AlertMessage.showAlert("Error", "Invalid number format in one or more fields.");
            }
        }
    }

    public void clearFields() {
        nameTextField.clear();
        priceTextField.clear();
        occupancyTextField.clear();
        addressTextField.clear();
        descriptionTextArea.clear();
    }
}
