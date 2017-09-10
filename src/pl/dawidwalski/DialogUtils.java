package pl.dawidwalski;

import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class DialogUtils {

    public static String createNickDialog(String message){
        TextInputDialog dialog = new TextInputDialog("Your nick");
        dialog.setTitle("Write your nick");

        if (message == null){
            dialog.setHeaderText("Set nick");
        }else {
            dialog.setHeaderText(message);
        }
        dialog.setContentText("Your nick:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            return result.get();
        }
        return null;
    }

    public static void showDialog(String title, String header, String msg){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(msg);
        alert.show();
    }

}
