package ca.mcgill.cs.swdesign.m6;

import java.time.LocalTime;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Press a button to get the current date and time.
 */
public class DateTimeButtonApp extends Application
{
    /**
     * @param pArgs This main method does not take any arguments.
     */
    public static void main(String[] pArgs)
    {
        launch(pArgs);
    }

    @Override
    public void start(Stage pPrimaryStage) throws Exception
    {
        Button btn = new Button(LocalTime.now().toString());
        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            
            @Override
            public void handle(ActionEvent pEvent)
            {
                btn.setText(LocalTime.now().toString());
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        pPrimaryStage.setTitle("It's date time!");
        pPrimaryStage.setScene(scene);
        pPrimaryStage.show();
    }
    
}
