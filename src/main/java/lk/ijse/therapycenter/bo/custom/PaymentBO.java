package lk.ijse.therapycenter.bo.custom;

import lk.ijse.therapycenter.bo.SuperBO;
import lk.ijse.therapycenter.dto.PaymentDTO;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface PaymentBO extends SuperBO {

    boolean save(PaymentDTO payment);
    boolean update(PaymentDTO payment);
    boolean deleteByPK(String pk) throws Exception;
    List<PaymentDTO> getAll();
    Optional<PaymentDTO> findByPK(String pk);
    Optional<String> getLastPK();
    boolean exist(String id) throws SQLException, ClassNotFoundException;

}
