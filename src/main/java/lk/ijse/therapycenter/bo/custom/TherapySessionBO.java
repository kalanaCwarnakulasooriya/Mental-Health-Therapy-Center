package lk.ijse.therapycenter.bo.custom;

import lk.ijse.therapycenter.bo.SuperBO;
import lk.ijse.therapycenter.dto.TherapySessionDTO;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface TherapySessionBO extends SuperBO {

    boolean save(TherapySessionDTO therapySession);
    boolean update(TherapySessionDTO therapySession);
    boolean deleteByPK(String pk) throws Exception;
    List<TherapySessionDTO> getAll();
    Optional<TherapySessionDTO> findByPK(String pk);
    Optional<String> getLastPK();
    boolean exist(String id) throws SQLException, ClassNotFoundException;
}
