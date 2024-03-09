package solver.viajero.interfaces;

/**
 *
 * @author francisco
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class login extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear los elementos de la interfaz de usuario
        Text usernameLabel = new Text("Usuario:");
        Text passwordLabel = new Text("Contraseña:");
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Iniciar sesión");

        // Crear un contenedor para organizar los elementos
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setStyle("-fx-background-color: #C0C0C0;");

        // Agregar los elementos al contenedor
        gridPane.add(usernameLabel, 0, 0);
        gridPane.add(usernameField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(loginButton, 1, 2);

        // Crear un objeto de tipo Scene
        Scene scene = new Scene(gridPane);

        // Configurar la ventana principal
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
