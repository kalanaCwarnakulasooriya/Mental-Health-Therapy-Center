package lk.ijse.therapycenter.bo.custom.impl;

import lk.ijse.therapycenter.bo.custom.PaymentBO;
import lk.ijse.therapycenter.dao.DAOFactory;
import lk.ijse.therapycenter.dao.custom.impl.PaymentDAOImpl;
import lk.ijse.therapycenter.dto.PaymentDTO;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class PaymentBOImpl implements PaymentBO {

    private final PaymentDAOImpl paymentDAO = (PaymentDAOImpl) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.PAYMENT);

    @Override
    public boolean save(PaymentDTO payment) {
        return false;
    }

    @Override
    public boolean update(PaymentDTO payment) {
        return false;
    }

    @Override
    public boolean deleteByPK(String pk) throws Exception {
        return false;
    }

    @Override
    public List<PaymentDTO> getAll() {
        return List.of();
    }

    @Override
    public Optional<PaymentDTO> findByPK(String pk) {
        return Optional.empty();
    }

    @Override
    public Optional<String> getLastPK() {
        return paymentDAO.getLastPK();
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return false;
    }
}
