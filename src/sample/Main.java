package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    private Stage primaryStage;

    private Parent firstOverview;

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Parent getFirstOverview() {
        return firstOverview;
    }

    public void setFirstOverview(Parent firstOverview) {
        this.firstOverview = firstOverview;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    /**
     * 初始化图层firstOverview.xml
     */
    public void initLayoutFirstOverview() {
        try {
            //load layout from fxml file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getClassLoader().getResource("sample/view/firstOverview.fxml"));
            firstOverview = loader.load();

            //show the scene containing the layout
            Scene scene = new Scene(firstOverview);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
