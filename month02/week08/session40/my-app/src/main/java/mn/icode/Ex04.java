package mn.icode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex04 extends Application {
public static void main(String[] args) {
    launch(args);
}
    @Override
    public void start(Stage stage) throws Exception {
        Button redbutton = new Button("Ulaan");
        Button greenbutton = new Button("Nogoon");
        Button bluebutton = new Button("Tsenher");

        HBox buttons = new HBox( 10, redbutton, greenbutton, bluebutton);
        VBox Haruulah = new VBox( buttons);

        redbutton.setOnAction(e -> {
            Haruulah.setStyle("-fx-background-color: red;");
        });
        greenbutton.setOnAction(e->{
            Haruulah.setStyle("-fx-background-color: green");
        });
        bluebutton.setOnAction(e->{
            Haruulah.setStyle("-fx-background-color: blue");
        });
 stage.setScene(new Scene(Haruulah));
       stage.setTitle("Exercise01");
       stage.show();
    }
    }

