package lk.ijse.therapycenter.bo.custom;

import lk.ijse.therapycenter.bo.SuperBO;
import lk.ijse.therapycenter.dto.PatientDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface PatientBO extends SuperBO {
    boolean save(PatientDTO patient);
    boolean update(PatientDTO patient);
    boolean deleteByPK(String pk) throws Exception;
    List<PatientDTO> getAll();
    Optional<PatientDTO> findByPK(String pk);
    Optional<String> getLastPK();
    boolean exist(String id) throws SQLException, ClassNotFoundException;
    ArrayList<String> patientList();
    PatientDTO getAllPatient(String patientName);
}
