package comboboxfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ComboBoxFX extends Application {
    @Override
    public void start(Stage st) throws Exception {
        Parent rt = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene sc = new Scene(rt);
        
        st.setScene(sc);
        st.setResizable(false);
        st.setTitle("ComboBox");
        st.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}