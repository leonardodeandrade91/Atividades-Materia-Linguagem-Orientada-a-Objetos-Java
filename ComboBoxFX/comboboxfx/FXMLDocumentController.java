package comboboxfx;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import model.Categoria;

public class FXMLDocumentController implements Initializable {
    @FXML
    private ComboBox<Categoria> categorias;
    
    @FXML
    private List<Categoria> cats = new ArrayList<>();
    
    @FXML
    private ObservableList<Categoria> obsCats;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarCategorias();
    }
    
    public void carregarCategorias() {
        Categoria categoria1 = new Categoria(1, "Bebidas");
        Categoria categoria2 = new Categoria(2, "Comidas");
        
        cats.add(categoria1);
        cats.add(categoria2);
        
        obsCats = FXCollections.observableArrayList(cats);
        
        categorias.setItems(obsCats);
    }
}