package lk.ijse.therapycenter.bo.custom;

import lk.ijse.therapycenter.bo.SuperBO;
import lk.ijse.therapycenter.dto.TherapyProgramDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface TherapyProgramBO extends SuperBO {

    boolean save(TherapyProgramDTO therapyProgram);
    boolean update(TherapyProgramDTO therapyProgram);
    boolean deleteByPK(String pk) throws Exception;
    List<TherapyProgramDTO> getAll();
    Optional<TherapyProgramDTO> findByPK(String pk);
    Optional<String> getLastPK();
    boolean exist(String id) throws SQLException, ClassNotFoundException;
    ArrayList<String> getProgramList();
    TherapyProgramDTO getAllTherapyProgram(String programName);
}
