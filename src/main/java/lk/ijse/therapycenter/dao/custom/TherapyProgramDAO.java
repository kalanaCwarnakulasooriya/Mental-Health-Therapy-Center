package lk.ijse.therapycenter.dao.custom;

import lk.ijse.therapycenter.dao.CrudDAO;
import lk.ijse.therapycenter.entity.TherapyProgram;

import java.util.ArrayList;

public interface TherapyProgramDAO extends CrudDAO<TherapyProgram,String> {
    ArrayList<String> getProgramList();
    TherapyProgram getAllTherapyProgram(String programName);
}
