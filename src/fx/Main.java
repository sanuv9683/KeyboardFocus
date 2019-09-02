/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx;

import java.awt.event.KeyEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

/**
 *
 * @author sanu
 */
public class Main extends Application{

    

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent=FXMLLoader.load(this.getClass().getResource("/fx/CustomerForm.fxml"));
        Scene mainSeceScene= new Scene(parent);
        
        
//        set a key combination
       final KeyCombination keyCo= new KeyCodeCombination(KeyCode.A, KeyCombination.CONTROL_DOWN);
        
        //setting keypress event
        mainSeceScene.setOnKeyPressed(new EventHandler<javafx.scene.input.KeyEvent>(){
            @Override
            public void handle(javafx.scene.input.KeyEvent event) {
                if (keyCo.match(event)) {
                    System.out.println("Key Combination Matched");
                }
            }
        });
        
        
        primaryStage.setScene(mainSeceScene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
