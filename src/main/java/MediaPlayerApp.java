import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;



public class MediaPlayerApp extends Application {
    private MediaPlayer mediaPlayer;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Media Player");

        Button playButton = new Button("Play");
        playButton.setOnAction(e -> mediaPlayer.play());

        Button stopButton = new Button("Stop");
        stopButton.setOnAction(e -> mediaPlayer.stop());

        BorderPane borderPane = new BorderPane();

        Media media = new Media("http://www.example.com/sample.mp4");
        mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        borderPane.setCenter(mediaView);
        borderPane.setBottom(stopButton);
        borderPane.setRight(playButton);

        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
