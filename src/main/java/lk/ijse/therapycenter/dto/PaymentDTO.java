package lk.ijse.therapycenter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO {
    private String id;
    private double amount;
    private String date;
    private PatientDTO patient;
    private TherapySessionDTO therapySession;
}
