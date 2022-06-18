
package controler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;


public class FormebaliseController implements Initializable {

    @FXML
    private AnchorPane panel;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void clicker(ActionEvent event) throws IOException {
     AnchorPane racine =  FXMLLoader.load(getClass().getResource("/fxml/formedeux.fxml"));
       panel.getChildren().setAll(racine);
    }
    
}
