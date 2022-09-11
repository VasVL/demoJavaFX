import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] destiny = { "Death", "Slavery", "Anime" };

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myChoiceBox.getItems().addAll(destiny);
        myChoiceBox.setOnAction(this::getDestiny);
    }

    public void getDestiny(ActionEvent event){

        String myDestiny = myChoiceBox.getValue();
        myLabel.setText(myDestiny);
    }
}
