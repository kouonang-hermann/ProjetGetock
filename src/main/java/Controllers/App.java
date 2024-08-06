package Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[]args){
        launch(args);
    }

    @Override
    public void start(Stage window){
        try {
            // recuperer le fichier fxml dans les ressources et le convertire en parent
            String name;
            Parent root = FXMLLoader.load(getClass().getResource("/view/connexion.fxml"));


            //inserer le parent(root) dans une scene
            Scene scene = new Scene(root);

            //ajouter la scene au stage(window)
            window.setScene(scene);
            window.show();

        } catch (Exception exception ){
            exception.printStackTrace();
        }
    }
}
