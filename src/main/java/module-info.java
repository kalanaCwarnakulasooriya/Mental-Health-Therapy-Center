module edu.ijse.therapycenter.therapycenter {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires static lombok;
    requires jakarta.persistence;

    requires java.naming;
    requires modelmapper;
    requires bcrypt;
    requires java.desktop;

    opens lk.ijse.therapycenter.controller to javafx.fxml;

    opens lk.ijse.therapycenter.entity to org.hibernate.orm.core;
    opens lk.ijse.therapycenter.config to jakarta.persistence;

//    opens lk.ijse.gdse.supermarket.dto.tm to javafx.base;

    exports lk.ijse.therapycenter;
    exports lk.ijse.therapycenter.controller;
}