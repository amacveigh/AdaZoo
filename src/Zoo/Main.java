package Zoo;

import Zoo.animals.Animal;
import Zoo.animals.Hippo;
import Zoo.animals.Sloth;
import Zoo.pens.BasePen;
import Zoo.pens.DryPen;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);


        List<Animal> animalList = new ArrayList<>();

//        Hippo hippo = new Hippo("Jamie"); is this irrelevant code?
//        animalList.add(hippo);
        animalList.add(new Hippo("Jamie"));
        animalList.add(new Sloth("Simon"));

        List<BasePen> penList = new ArrayList<>();
        penList.add(new DryPen("Agatha", 40.0));

        //DryPen agatha = new DryPen("Agatha", 40.0);
        System.out.println(penList);
        System.out.println(animalList);
    }

}



