/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mainul Karim
 */
public class PCT extends Application {
    
    public static int flag=1 ;
    public static String name="Welcome";
    public static String username="Unknown";
    public static ArrayList<String> a1 = new ArrayList<String>();
    
    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML3.fxml"));
        Parent root = (Parent) loader.load();
        FXML3Controller secController = loader.getController();
        secController.F3();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Save The World");
        stage.resizableProperty().setValue(false);
        stage.show();
    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        launch(args);
       
    }
    
}
