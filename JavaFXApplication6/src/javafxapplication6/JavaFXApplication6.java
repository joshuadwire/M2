/**
 * Copyright acme rocket  2016
 * akasdjfbakjfbkdsbadkfbad
aksdjfakdjfnakjdfa  from command line
 */

package javafxapplication6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author robertwaters
 */
public class JavaFXApplication6 extends Application {
    //add a comment
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Begin Game");
        System.out.println("Starting Down");
        System.out.println("Doing something big");
        launch(args);
    }

    public void doIt() { }
    

   public void doIt2() { }
}
