package lk.ijse.therapycenter.dao.custom;

import lk.ijse.therapycenter.dao.CrudDAO;
import lk.ijse.therapycenter.entity.Therapist;

import java.util.ArrayList;

public interface TherapistDAO extends CrudDAO<Therapist,String> {
    ArrayList<String> therapistList();
    Therapist getAllTherapist(String therapistName);
}
