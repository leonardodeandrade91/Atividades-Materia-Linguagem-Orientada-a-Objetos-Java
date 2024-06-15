package contjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class FXMLDocumentController implements Initializable {
    @FXML
    private Label lblNum;
    
    @FXML
    private Slider sliNum;
    
    @FXML
    private void clicouItem(ActionEvent event) {
        Alert al = new Alert(Alert.AlertType.WARNING);
        
        al.setTitle("Aviso");
        al.setHeaderText("Aviso do Sistema!");
        al.setContentText("O Aplicativo será Fechado!");
        al.show();
        
        al.setOnCloseRequest((e) -> Platform.exit());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sliNum.addEventFilter(MouseEvent.MOUSE_DRAGGED, event -> 
            lblNum.setText(Integer.toString((int)sliNum.getValue()))
        );
    }     
}