package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ventana2 {

    @FXML
    Button btnVolver;
    @FXML
     Button btnMostrarcompra;


    int ventana2, ventana3, ventana4;
    double compra = 0.0;

    public void rm1(ActionEvent actionEvent) {
        compra = compra + 17.99;
    }

    public void rm2(ActionEvent actionEvent) {
        compra = compra + 13.99;
    }

    public void rm3(ActionEvent actionEvent) {
        compra = compra + 18.99;
    }

    public void rm4(ActionEvent actionEvent) {
        compra = compra + 36.99;
    }

    public void rm5(ActionEvent actionEvent) {
        compra = compra + 86.99;
    }

    public void rm6(ActionEvent actionEvent) {
        compra = compra + 28.99;
    }

    public void mostrarcompra(ActionEvent actionEvent) throws IOException {
            if (compra > 0 ) {
                System.out.println("Hola Celine");
                Stage stage = (Stage) btnMostrarcompra.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventana4.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                ventana4 controller = fxmlLoader.<ventana4>getController();
                controller.cargarDatos(ventana2, ventana3, ventana4, compra);
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Freedom Boutique");
                alert.setHeaderText("Shopping Cart");
                alert.setContentText("No ha realizado ninguna compra.");
                alert.showAndWait();
            }
        }


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
    public void cargarDatos(int v2, int v3, int v4) {
        ventana2 = v2;
        ventana2 = v3;
        ventana2 = v4;
    }

}

