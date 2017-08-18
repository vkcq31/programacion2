package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Controller {
    @FXML
    ImageView imagen1;
    @FXML
    ImageView imagen2;
    @FXML
    ImageView imagen3;
    @FXML
    ImageView imagen4;
    @FXML
    ImageView imagen5;
    @FXML
    ImageView imagen6;

    Image cangrejo = new Image(getClass().getResource("cangrejo.png").toExternalForm());
    Image panda = new Image(getClass().getResource("panda.png").toExternalForm());
    Image perro = new Image(getClass().getResource("perro.png").toExternalForm());
    Image e1 = new Image(getClass().getResource("e1.png").toExternalForm());

    int x, falla = 0;
    String op1;
    String op2;


    public void nuevo(ActionEvent actionEvent)
    {
        imagen1.setImage(e1);
        imagen2.setImage(e1);
        imagen3.setImage(e1);
        imagen4.setImage(e1);
        imagen5.setImage(e1);
        imagen6.setImage(e1);
    }
    
    public void salir(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void cambiar_imagen1(Event event)
    {
        x++;
        imagen1.setImage(cangrejo);
        if (x == 2) {
            if (op1 != op2) {
                falla++;
            }
        }
        if (falla == 3) {
            //PERDISTE
        }



    }

    public void cambiar_imagen2(Event event)
    {
        x++;
        imagen2.setImage(perro);
        if (x == 2) {
            if (op1 != op2) {
                falla++;
            }
        }
        if (falla == 3) {
            //PERDISTE
        }
    }

    public void cambiar_imagen3(Event event)
    {
        x++;
        imagen3.setImage(panda);
        if (x == 2) {
            if (op1 != op2) {
                falla++;
            }
        }
        if (falla == 3) {
            //PERDISTE
        }
    }

    public void cambiar_imagen4(Event event)
    {
        x++;
        imagen4.setImage(perro);
        if (x == 2) {
            if (op1 != op2) {
                falla++;
            }
        }
        if (falla == 3) {
            //PERDISTE
        }
    }

    public void cambiar_imagen5(Event event)
    {
        x++;
        imagen5.setImage(panda);
        if (x == 2) {
            if (op1 != op2) {
                falla++;
            }
        }
        if (falla == 3) {
            //PERDISTE
        }
    }

    public void cambiar_imagen6(Event event)
    {
        x++;
        imagen6.setImage(cangrejo);
        if (x == 2) {
            if (op1 != op2) {
                falla++;
            }
        }
        if (falla == 3) {
            //PERDISTE
        }
    }
}