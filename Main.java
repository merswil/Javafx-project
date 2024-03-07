package org.example.javafx_001;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Construction Cost Estimator");

        BorderPane borderPane = new BorderPane();

        VBox vboxLeft = new VBox();
        vboxLeft.setStyle("-fx-background-color: #800080;");  // purple color
        VBox.setVgrow(vboxLeft, Priority.ALWAYS);


        VBox vboxCenter = new VBox();
        vboxCenter.setStyle("-fx-background-color: #333333;");   // dark gray color
        VBox.setVgrow(vboxCenter, Priority.ALWAYS);

        Label messageLabel = new Label("Welcome to Construction Cost Estimator");
        messageLabel.setStyle("-fx-text-fill: white; -fx-font-size: 20px;"); // Styling label
        vboxCenter.getChildren().add(messageLabel);
        vboxCenter.setAlignment(Pos.CENTER);

        Button dashboard = new Button("Dash Board");
        dashboard.setPrefSize(300,120);
        VBox.setMargin(dashboard, new Insets(10));

        Button cusInfoButton = new Button("Customer Info");
        cusInfoButton.setPrefSize(300,120);
        VBox.setMargin(cusInfoButton, new Insets(10));

        Button landButton = new Button("Land");
        landButton.setPrefSize(300,120);
        VBox.setMargin(landButton, new Insets(10));

        Button constructionButton = new Button("Construction");
        constructionButton.setPrefSize(300,120);
        VBox.setMargin(constructionButton, new Insets(10));

        Button designButton = new Button("Design");
        designButton.setPrefSize(300,120);
        VBox.setMargin(designButton, new Insets(10));

        Button doneButton = new Button("Done");
        doneButton.setPrefSize(300,120);
        VBox.setMargin(doneButton, new Insets(10));

        Button enquiries = new Button("Enquiries");
        enquiries.setPrefSize(300,120);
        VBox.setMargin(enquiries, new Insets(10));

        Button feedback = new Button("Feedback");
        feedback.setPrefSize(300,120);
        VBox.setMargin(feedback, new Insets(10));

        vboxLeft.getChildren().addAll(dashboard,cusInfoButton, landButton, constructionButton, designButton, doneButton,enquiries,feedback);

        borderPane.setLeft(vboxLeft);
        borderPane.setCenter(vboxCenter);

        Scene scene = new Scene(borderPane,1000,1000); // Added width and height to the scene
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
