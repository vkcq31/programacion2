package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ventana1 {

    @FXML
    Button btnPantallahombre;
    @FXML
    Button btnPantallamujer;


    int ventana2,ventana3, ventana4 =0;



    public void pantallahombre(Event event) throws IOException {
        {

            Stage stage = (Stage) btnPantallahombre.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventana3.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            ventana3 controller = fxmlLoader.<ventana3>getController();
            controller.cargarDatos(ventana2, ventana3, ventana4);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }


    public void pantallamujer(Event event) throws IOException {
        {
            Stage stage = (Stage) btnPantallamujer.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            ventana2 controller = fxmlLoader.<ventana2>getController();
            controller.cargarDatos(ventana2, ventana3, ventana4);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }


    public void cargarDatos(int v2, int v3, int v4) {
        ventana2 = v2;
        ventana3 = v3;
        ventana4 = v4;
    }


}
