import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Arc myCircle;
    private double x;
    private double y;

    public void up(ActionEvent e){
        //System.out.println("Up!");
        myCircle.setCenterY(y -= 3);
        myCircle.setStartAngle(135);
    }

    public void down(ActionEvent e){
        //System.out.println("Down!");
        myCircle.setCenterY(y += 3);
        myCircle.setStartAngle(-45);
    }

    public void right(ActionEvent e){
        //System.out.println("Right!");
        myCircle.setCenterX(x += 3);
        myCircle.setStartAngle(45);
    }

    public void left(ActionEvent e){
        //System.out.println("Left!");
        myCircle.setCenterX(x -= 3);
        myCircle.setStartAngle(-135);
    }
}
