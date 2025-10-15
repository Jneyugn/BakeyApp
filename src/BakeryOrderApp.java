package bakeryapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BakeryOrderForm extends Application {
    
    @Override
    public void start(Stage stage) {
        
        Label lblName = new Label("Customer Name:");
        TextField txtName = new TextField();
        
        Label lblPhone = new Label("Phone Number:");
        TextField txtPhone = new TextField();

        Label lblCakeType = new Label("Select Cake Type:");
        ComboBox<String> comboCake = new ComboBox<>();
        comboCake.getItems().addAll(
            "Apple", "Carrot", "Cheesecake", "Chocolate", "Coffee", "Opera", "Tiramisu"
        );
        comboCake.setPromptText("Choose one");

        Button btnSave = new Button("Save");
        btnSave.setStyle("-fx-background-color: #d1c4e9;");
        
        Button btnQuit = new Button("Quit");
        btnQuit.setStyle("-fx-background-color: #d1c4e9;");

        btnQuit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });

        HBox nameBox = new HBox(10, lblName, txtName);
        HBox phoneBox = new HBox(10, lblPhone, txtPhone);
        HBox buttonBox = new HBox(10, btnSave, btnQuit);
        
        VBox vbox = new VBox(15, nameBox, phoneBox, lblCakeType, comboCake, buttonBox);
        vbox.setPadding(new Insets(15, 20, 15, 20));
        
        Scene scene = new Scene(vbox, 400, 250);
        stage.setTitle("Bakery Orders");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
