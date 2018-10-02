package MainBranch;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;

public class ExitConfirmMain
{
    static Boolean answer;

    public static boolean ExitConfirm()
    {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        Label quesLabel = new Label("Are You Sure ?");

        Button yesButton = new Button("Yes");
        yesButton.setOnAction( e -> {
            answer = true;
            window.close();
        });

        Button noButton = new Button("No");
        noButton.setOnAction( e -> {
            answer = false;
            window.close();
        });

        HBox layout = new HBox(50);
        layout.getChildren().addAll(yesButton, noButton);
        layout.setAlignment(Pos.BASELINE_CENTER);

        VBox layoutMain = new VBox(30);
        layoutMain.getChildren().addAll(quesLabel, layout);
        layoutMain.setMargin(layout, new Insets(25, 0, 0, 0));
        layoutMain.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layoutMain, 400, 200);
        window.setScene(scene);
        window.initStyle(StageStyle.UNDECORATED);
        window.showAndWait();

        return answer;
    }
}
