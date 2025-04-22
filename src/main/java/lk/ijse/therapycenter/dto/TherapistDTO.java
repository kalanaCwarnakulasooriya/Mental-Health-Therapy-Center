package lk.ijse.therapycenter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TherapistDTO {
    private String id;
    private String name;
    private String specialization;

//    @OneToMany(mappedBy = "therapist")
//    private List<TherapySessionsDTO> therapySessions;

}
