import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.DARKGRAY);

        Image icon = new Image("img.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Проверка расходов");
        primaryStage.setWidth(420);
        primaryStage.setHeight(420);
        primaryStage.setResizable(false);
        //primaryStage.setX(500);
        //primaryStage.setY(250);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("You can't escape unless you press \"q\"");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}