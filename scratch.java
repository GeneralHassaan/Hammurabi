import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*Tanvir Ahmad, Hassaan Asif
CiSC 3115
Lab 2
 */
public class scratch extends Application {
    double p,total,tamount,per;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Tax Calculator");
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(pane, 350, 440);

        Text sceneTitle = new Text("Tip Calculator");
        sceneTitle.setFont(Font.font("Arial", FontWeight.NORMAL,20));
        pane.add(sceneTitle, 0, 0, 2, 1);
        Label cAmountL= new Label("Check Amount:");
        pane.add(cAmountL, 0, 1);
        final TextField cAmountF = new TextField();
        cAmountF.setAlignment(Pos.BASELINE_RIGHT);
        pane.add(cAmountF, 1, 1);
        Label tPercentL = new Label("Tip Percent %:");
        pane.add(tPercentL,0,2);
        final TextField tPercentF = new TextField();
        tPercentF.setAlignment(Pos.BASELINE_RIGHT);
        pane.add(tPercentF, 1, 2);

// combobox
        Label SplitL = new Label("split");
        pane.add(SplitL,0,3);
        final ComboBox split = new ComboBox();
        split.getItems().addAll(
                "1",
                "2",
                "3"
        );
        split.setValue("1");
        pane.add(split,1,3);
//button
        Button calculateButton = new Button("Calculate");
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(calculateButton);
        pane.add(hbox, 1, 4);
//lower fields
        Label tAmountL= new Label("Tip Amount:");
        pane.add(tAmountL, 0, 5);
        final TextField tAmountF = new TextField();
        tAmountF.setAlignment(Pos.BASELINE_RIGHT);
        pane.add(tAmountF, 1, 5);
        Label TotalL = new Label("Total:");
        pane.add(TotalL,0,6);
        final TextField TotalF = new TextField();
        TotalF.setAlignment(Pos.BASELINE_RIGHT);
        pane.add(TotalF, 1, 6);

        Label PersonL = new Label("Amount Per Person:");
        pane.add(PersonL,0,7);
        final TextField PersonF = new TextField();
        PersonF.setAlignment(Pos.BASELINE_RIGHT);
        pane.add(PersonF, 1, 7);


        calculateButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
//int amount;

                tamount=(((Double.parseDouble(cAmountF.getText()))*(Double.parseDouble(tPercentF.getText())))/100);
                tAmountF.setText("$ "+Double.toString(tamount));
                total=Double.parseDouble(cAmountF.getText())+tamount;
                TotalF.setText("$"+Double.toString(total));
                PersonF.setText("$"+Double.toString(total/2));

            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
