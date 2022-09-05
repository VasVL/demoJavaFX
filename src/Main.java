import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 1000, 600, Color.DIMGRAY);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("Жить в эпоху свершений, имея возвышенный нрав, к сожалению трудно");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 24));
        text.setFill(Color.LIGHTGRAY);

        root.getChildren().add(text);
        stage.setScene(scene);
        stage.show();
    }
}