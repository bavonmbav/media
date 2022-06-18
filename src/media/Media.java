
package media;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Media extends Application {
    
    Stage s;
    @Override
    public void start(Stage stage){ 
        try {
           
            Parent racine =  FXMLLoader.load(getClass().getResource("/fxml/formebalise.fxml"));
           
            Scene scene = new Scene(racine);
            stage.setScene(scene);
            stage.setTitle("PLAYER");
            stage.getIcons().getClass().getResource("apc.jpg");
            stage.show();
            this.s = stage;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
