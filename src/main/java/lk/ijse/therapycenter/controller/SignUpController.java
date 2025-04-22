package lk.ijse.therapycenter.controller;

import lk.ijse.therapycenter.bo.BOFactory;
import lk.ijse.therapycenter.bo.custom.impl.UserBOImpl;
import lk.ijse.therapycenter.dto.UserDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private Button btSignUp;

    @FXML
    private ChoiceBox<String> choiceRole;

    @FXML
    private AnchorPane mainAnchor;

    @FXML
    private PasswordField txtConfirmPassword;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    private Label lblError;

    private final UserBOImpl userBO = (UserBOImpl) BOFactory.getInstance().getBO(BOFactory.BOType.USER);

    @FXML
    void navLogInPage(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {

        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String role = choiceRole.getValue();
        String confirmPassword = txtConfirmPassword.getText();

        String lastId = userBO.getLastPK().orElse("U001");

        System.out.println(lastId);
        System.out.println(userName);
        System.out.println(password);
        System.out.println(role);
        System.out.println(confirmPassword);

        if(userName.isEmpty() || password.isEmpty() || role.isEmpty() || confirmPassword.isEmpty()){
            lblError.setText("Please fill all the fields");
            return;
        }

        if(password.length() < 8){
            lblError.setText("Password must be at least 8 characters");
            return;
        }

        if(!password.equals(confirmPassword)){
            lblError.setText("Password does not match");
            return;
        }

        if(userBO.cheackUser(userName)){
            lblError.setText("User already exist");
            return;
        }

        UserDTO userDTO = new UserDTO();
        userDTO.setId(lastId);
        userDTO.setUsername(userName);
        userDTO.setPassword(password);
        userDTO.setRole(role);

        boolean result = userBO.save(userDTO);

        if(result){
            mainAnchor.getChildren().add(FXMLLoader.load(getClass().getResource("/view/LogIn.fxml")));
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("User sign up failed");
            alert.show();
            return;
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceRole.getItems().addAll("Admin", "Receptionist");
    }
}
