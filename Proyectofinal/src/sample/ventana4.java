package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ventana4 {

    @FXML
    Button btnVolver;
    @FXML
    TextField total;
    int ventana1, ventana2, ventana3, ventana4;
    double compra = 0.0;

    public void volver(ActionEvent actionEvent) throws IOException
    {
        Stage stage = (Stage) btnVolver.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventana1.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        ventana1 controller = fxmlLoader.<ventana1>getController();
        controller.cargarDatos(ventana2, ventana3, ventana4);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void cargarDatos(int v2, int v3, int v4, double c1) {
        ventana2 = v2;
        ventana2 = v3;
        ventana2 = v4;
        compra = c1;
        total.setText(String.valueOf(compra));
    }

    public void total(ActionEvent actionEvent) {




    }

    public void salir(ActionEvent actionEvent) {
        Platform.exit();
    }


}
