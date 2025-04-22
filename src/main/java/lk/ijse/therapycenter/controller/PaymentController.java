package lk.ijse.therapycenter.controller;

import lk.ijse.therapycenter.bo.BOFactory;
import lk.ijse.therapycenter.bo.custom.impl.PaymentBOImpl;
import lk.ijse.therapycenter.dto.PaymentDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PaymentController implements Initializable {

    @FXML
    private Button btnProcess;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableColumn<PaymentDTO, String> colAmount;

    @FXML
    private TableColumn<PaymentDTO, String> colDate;

    @FXML
    private TableColumn<PaymentDTO, String> colPatient;

    @FXML
    private TableColumn<PaymentDTO, String> colPaymentId;

    @FXML
    private TableColumn<PaymentDTO, String> colSession;

    @FXML
    private DatePicker datePickerPayment;

    @FXML
    private Label errorMessage;

    @FXML
    private Label lblPaymentId;

    @FXML
    private ChoiceBox<String> selectPatient;

    @FXML
    private ChoiceBox<String> selectSession;

    @FXML
    private TableView<PaymentDTO> tblPayments;

    @FXML
    private TextField txtAmount;


    private final PaymentBOImpl paymentBO = (PaymentBOImpl) BOFactory.getInstance().getBO(BOFactory.BOType.PAYMENT);

    @FXML
    void generateInvoice(ActionEvent event) {

    }

    @FXML
    void paymentSelectOnAction(MouseEvent event) {

    }

    @FXML
    void printInvoice(ActionEvent event) {

    }

    @FXML
    void processPayment(ActionEvent event) {

    }

    @FXML
    void resetForm(ActionEvent event) {

    }

    @FXML
    void updatePayment(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblPaymentId.setText(paymentBO.getLastPK().orElse("0"));
    }
}
