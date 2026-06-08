package mn.icode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label text = new Label("Click me");
        Button button = new Button("Click");
        VBox layout = new VBox(10, text, button);
        Scene scene = new Scene( layout, 200, 150);

        stage.setTitle("Small Window");
        stage.setScene(scene);
        stage.show();
    }
}
