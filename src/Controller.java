import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private Spinner<Integer> mySpinner;

    int currentValue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);

        valueFactory.setValue(0);

        mySpinner.setValueFactory(valueFactory);

        currentValue = mySpinner.getValue();

        myLabel.setText(String.valueOf(currentValue));

        mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                currentValue = mySpinner.getValue();

                myLabel.setText(String.valueOf(currentValue));
            }
        });
    }

}
