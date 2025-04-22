package lk.ijse.therapycenter.dao.custom;

import lk.ijse.therapycenter.dao.CrudDAO;
import lk.ijse.therapycenter.entity.Patient;

import java.util.ArrayList;

public interface PatientDAO extends CrudDAO<Patient,String> {
    ArrayList<String> patientList();
    Patient getAllPatient(String patientName);
}
