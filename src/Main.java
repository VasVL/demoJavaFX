import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.DARKGRAY);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("���� � ����� ���������, ���� ����������� ����, � ��������� ������");
        text.setX(50);
        text.setY(50);

        root.getChildren().add(text);
        stage.setScene(scene);
        stage.show();
    }
}