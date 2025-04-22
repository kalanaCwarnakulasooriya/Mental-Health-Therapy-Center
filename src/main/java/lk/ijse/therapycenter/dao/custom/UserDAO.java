package lk.ijse.therapycenter.dao.custom;

import lk.ijse.therapycenter.dao.CrudDAO;
import lk.ijse.therapycenter.entity.User;

public interface UserDAO extends CrudDAO<User,String> {
    boolean cheackUser(String email);
    User getSelectUser(String userName);
}
