
package fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import java.io.File;
import javafx.event.ActionEvent;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.media.MediaView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
public class FormedeuxController implements Initializable {

    @FXML
    private AnchorPane accropane;

    
    String chemin = "E:/youtube.exe/poo2.mp4";
    Media med = new Media(new File(chemin).toURI().toString());
    MediaPlayer player = new MediaPlayer(med);
    
    
    @FXML
    private MediaView mediaview;
    @FXML
    private Slider volume;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mediaview.setMediaPlayer(player);
        player.setAutoPlay(true);
        
    }    

    Runnable palyers = ()->player.play();
    @FXML
    private void stop(ActionEvent event) {
        player.setStopTime(Duration.seconds(0));
    }

    @FXML
    private void playe(ActionEvent event) {
        player.setOnPlaying(palyers);
    }

    @FXML
    private void next(ActionEvent event) {
        player.setRate(5.5);
    }

    @FXML
    private void prec(ActionEvent event) {
    }

    @FXML
    private void pauses(ActionEvent event) {
        
    }

    @FXML
    private void repeter(ActionEvent event) {
    }

    @FXML
    private void volumer(MouseDragEvent event) {
        player.setVolume(100.0);
    }

    @FXML
    private void pauseer(MouseDragEvent event) {
        player.setStopTime(Duration.seconds(0));
    }
    
}
