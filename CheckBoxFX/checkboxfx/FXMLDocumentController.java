package checkboxfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class FXMLDocumentController {
    @FXML
    private CheckBox cbJava;
    
    @FXML
    private CheckBox cbPhp;
    
    @FXML
    private void pegarValores() {
        System.out.println("Java: " + cbJava.selectedProperty().getValue());
        System.out.println("PHP: " + cbPhp.selectedProperty().getValue());
    }
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        pegarValores();
    }
}