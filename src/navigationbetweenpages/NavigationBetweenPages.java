package navigationbetweenpages;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NavigationBetweenPages extends Application {
    
    Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        
        window = primaryStage;
        
        // landing page
        
        Button b1 = new Button("Page 1");
        Button b2 = new Button("Page 2");
        Button b3 = new Button("Page 3");

        Button home1 = new Button("Home");
        Button home2 = new Button("Home");
        Button home3 = new Button("Home");
        
        HBox container0 = new HBox(20, b1, b2, b3);
        
        GridPane welcomeWindow = new GridPane();
        welcomeWindow.setAlignment(Pos.CENTER);
        
        Text welcomeText = new Text("Welcom to the navigation app");
        
        welcomeWindow.add(welcomeText, 0, 0);
        welcomeWindow.add(container0, 0, 1);
        
        // page 1
        
        Button g1b2 = new Button("Page 2");
        Button g1b3 = new Button("Page 3");
        
        HBox container1 = new HBox(20, home1, g1b2, g1b3);
        
        GridPane page1 = new GridPane();
        page1.setAlignment(Pos.CENTER);
        
        Text welcomeTextPage1 = new Text("Welcom to page 1");
        
        page1.add(welcomeTextPage1, 0, 0);
        page1.add(container1, 0, 1);
        
        // page 2
        
        Button g2b1 = new Button("Page 1");
        Button g2b3 = new Button("Page 3");
        
        HBox container2 = new HBox(20, home2, g2b1, g2b3);
        
        GridPane page2 = new GridPane();
        page2.setAlignment(Pos.CENTER);
        
        Text welcomeTextPage2 = new Text("Welcom to page 2");
        
        page2.add(welcomeTextPage2, 0, 0);
        page2.add(container2, 0, 1);
        
        // page 3
        
        Button g3b1 = new Button("Page 1");
        Button g3b2 = new Button("Page 2");
        
        HBox container3 = new HBox(20, home3, g3b1, g3b2);
        
        GridPane page3 = new GridPane();
        page3.setAlignment(Pos.CENTER);
        
        Text welcomeTextPage3 = new Text("Welcom to page 3");        
        
        page3.add(welcomeTextPage3, 0, 0);
        page3.add(container3 , 0, 1);
        
//        // scenes
        
        Scene scene0 = new Scene(welcomeWindow, 300, 250);
        Scene scene1 = new Scene(page1, 300, 250);
        Scene scene2 = new Scene(page2, 300, 250);
        Scene scene3 = new Scene(page3, 300, 250);
        
        // butons configuration
        
        b1.setOnAction(e -> window.setScene(scene1));
        b2.setOnAction(e -> window.setScene(scene2));
        b3.setOnAction(e -> window.setScene(scene3));
        
        g1b2.setOnAction(e -> window.setScene(scene2));
        g1b3.setOnAction(e -> window.setScene(scene3));
        
        g2b1.setOnAction(e -> window.setScene(scene1));
        g2b3.setOnAction(e -> window.setScene(scene3));
        
        g3b1.setOnAction(e -> window.setScene(scene1));
        g3b2.setOnAction(e -> window.setScene(scene2));
        
        home1.setOnAction(e -> window.setScene(scene0));
        home2.setOnAction(e -> window.setScene(scene0));
        home3.setOnAction(e -> window.setScene(scene0));
        
        window.setTitle("Navigation");
        window.setScene(scene0);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
