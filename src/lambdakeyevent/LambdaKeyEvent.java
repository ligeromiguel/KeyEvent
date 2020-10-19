/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdakeyevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Miguel Ligero
 */
public class LambdaKeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Creación del Texto, sus coordenadas iniciales y valor
        Text tx = new Text (20,20,"A");
        
        //Evento SetOnKeyPressed (Lambda)
        tx.setOnKeyPressed((KeyEvent e) -> {  
            switch(e.getCode())
            {
                case DOWN:
                    tx.setLayoutY(tx.getLayoutY()+10);
                    break;
                case UP:
                    tx.setLayoutY(tx.getLayoutY()-10);
                    break;
                case RIGHT:
                    tx.setLayoutX(tx.getLayoutX()+10);
                    break;
                case LEFT:
                    tx.setLayoutX(tx.getLayoutX()-10);
                    break;
                default:
                    tx.setText(tx.getText());
                    break;
           
        }
                  
    });
        
        
        Pane root = new Pane();
  
        tx.setFocusTraversable(true);
        root.getChildren().add(tx);
        Scene scene = new Scene(root, 220, 40);
        
        primaryStage.setTitle("KeyEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
