package lk.ijse.therapycenter.controller;

import lk.ijse.therapycenter.bo.BOFactory;
import lk.ijse.therapycenter.bo.custom.impl.UserBOImpl;
import lk.ijse.therapycenter.dto.UserDTO;
import lk.ijse.therapycenter.util.PasswordUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LogInController {

    @FXML
    private AnchorPane mainAnchor;

    @FXML
    private Button btSignIn;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    private final UserBOImpl userBO = (UserBOImpl) BOFactory.getInstance().getBO(BOFactory.BOType.USER);

    @FXML
    void navHomePage(ActionEvent event) throws IOException {
        String userName = txtEmail.getText();
        String password = txtPassword.getText();

        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("Empty");
            return;
        }

        boolean result = userBO.cheackUser(userName);

        if(result){
            UserDTO userDTO = userBO.cheackPassword(userName);

            String role = userDTO.getRole();
            String hashedDTO = userDTO.getPassword();

            System.out.println("In controller" + hashedDTO);
            System.out.println(role);

            boolean isPasswordValid = PasswordUtils.verifyPassword(password, hashedDTO);

            if(!isPasswordValid){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Invalid password");
                alert.show();
            }else {
                if(role.equals("Admin")){
                    mainAnchor.getChildren().clear();
                    mainAnchor.getChildren().add(FXMLLoader.load(getClass().getResource("/view/AdminDash.fxml")));
                }else if(role.equals("Receptionist")){
                    mainAnchor.getChildren().clear();
                    mainAnchor.getChildren().add(FXMLLoader.load(getClass().getResource("/view/ReceptionistDash.fxml")));
                }
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid email");
            alert.showAndWait();
        }

    }

    @FXML
    void navSignUp(MouseEvent event) throws IOException {
        mainAnchor.getChildren().clear();
        mainAnchor.getChildren().add(FXMLLoader.load(getClass().getResource("/view/SignUp.fxml")));
    }

}
