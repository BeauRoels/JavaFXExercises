package main;

import gui.WelkomSchermController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUp extends Application
{
    
    @Override
    public void start(Stage primaryStage)
    {   
        WelkomSchermController root = new WelkomSchermController();
        Scene scene = new Scene(root, 600, 400);
        
        primaryStage.setTitle("Welkom!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }    
}
