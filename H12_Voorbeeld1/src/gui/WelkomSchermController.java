package gui;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class WelkomSchermController extends VBox
{
    public WelkomSchermController()
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("WelkomScherm.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try
        {
            loader.load();
        }
        catch (IOException ex)
        {
            throw new RuntimeException(ex);
        }
    }       
}
