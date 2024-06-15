package introjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    @FXML
    private Label labelOlaMundo;
    
    @FXML
    private TextField txtNome;
    
    @FXML
    private void acaoDoBotao(ActionEvent event) {
        labelOlaMundo.setText(txtNome.getText().trim());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }     
}