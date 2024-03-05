package lk.ijse.chatApp.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import lk.ijse.chatApp.utill.Navigation;

import java.io.IOException;

public class LoginFormController {
    public JFXTextField txtName;
    private static LoginFormController controller;
    public LoginFormController() { controller = this;}
    public static LoginFormController getController() { return controller;}

    public void userLoginBtnOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.switchNavigation("ChatRoom.fxml",actionEvent);
    }
}
