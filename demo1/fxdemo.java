package com.example.demo1;


    import javafx.application.Application;
    import javafx.collections.FXCollections;
    import javafx.event.ActionEvent;
import javafx.event.EventHandler;
    import javafx.geometry.Insets;
    import javafx.geometry.Pos;
    import javafx.scene.Scene;
    import javafx.scene.control.*;
    import javafx.scene.layout.BorderPane;
    import javafx.scene.layout.GridPane;
    import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class fxdemo  extends Application {

        @Override
        public void start(Stage primaryStage) {
            BorderPane pane = new BorderPane();
            Label lb1 = new Label("fxLabel");
            TextField txt = new TextField();
            Button btn = new Button("submit");
            HBox hb = new HBox(20);
            hb.getChildren().addAll(lb1, txt, btn);
            pane.setTop(hb);

            txt.setOnMouseClicked(event -> {
                txt.setText("why u click me");
                Alert a = new Alert(Alert.AlertType.INFORMATION,"Again why u click");
                a.show();
            });
            Tooltip tooltip = new Tooltip("tooltip text");
            tooltip.setStyle("-fx_background_colore:red;_fx_font_size:20;");
            Tooltip.install(btn,tooltip);
            GridPane grd = new GridPane();
            grd.setHgap(20);
            grd.setVgap(20);
            RadioButton rbt1 = new RadioButton("Male");
            RadioButton rbt2 = new RadioButton("Female");
            grd.addColumn(4,rbt1,rbt2);
            ToggleGroup tgl = new ToggleGroup ();
            rbt1.setToggleGroup;
            rbt2.setToggleGroup();
            rbt1.setPadding(new Insets(20));
            rbt2.setPadding(new Insets(20));
            String[] data={"please select","java","pyton","forten"};
            ComboBox combox = new ComboBox(FXCollections.observableArrayList());
            combox.getSelectionModel().selectFirst();
            grd.setAlignment(Pos.BOTTOM_CENTER);
            grd.add(combox ,2,3);
            ListView lstw = new ListView();
            lstw.setItems(FXCollections.observableArrayList(data));
            grd.add(lstw ,2,4);
            lstw.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            pane.setLeft(grd);

txt.setTooltip(tooltip);
            VBox vb = new VBox(20);
            Label lb3 = new Label("please choose one or more");
            CheckBox cb1= new CheckBox("Java");
            CheckBox cb2= new CheckBox("C++");
            vb.getChildren().addAll(lb3,cb1,cb2);
            pane.setRight(vb);

            Scene scene = new Scene(pane, 300, 250);
            btn.setOnAction(new Controller(txt,cb1,cb2));

            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        public static void main(String[] args) {
            launch(args);
        }

    }

