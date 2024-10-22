package CodigoGon.Fiadito.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class IndexController implements Initializable {

    @FXML
    private Button diaria;

    @FXML
    public void abrirDiaria() throws Exception {
        Stage ventanaNueva = new Stage();
        FXMLLoader cargarVentana = new FXMLLoader(getClass().getResource("/templates/Diaria.fxml"));
        Parent root = cargarVentana.load();
        Scene escena = new Scene(root);
        ventanaNueva.setScene(escena);


        ventanaNueva.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
    }
}
