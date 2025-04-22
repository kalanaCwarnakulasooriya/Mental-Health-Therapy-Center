package lk.ijse.therapycenter.bo;

import lk.ijse.therapycenter.bo.custom.impl.*;
import lk.ijse.therapycenter.bo.custom.impl.*;

public class BOFactory {

    private static BOFactory boFactory;
    private BOFactory() {

    }

    public static BOFactory getInstance() {
        return boFactory==null?boFactory=new BOFactory():boFactory;
    }

    public enum BOType {
        PATIENT,
        PAYMENT,
        THERAPIST,
        THERAPY_PROGRAM,
        THERAPY_SESSION,
        USER
    }

    public SuperBO getBO(BOType type) {
        return switch (type) {
            case PATIENT -> new PatientBOImpl();
            case PAYMENT -> new PaymentBOImpl();
            case THERAPIST -> new TherapistBOImpl();
            case THERAPY_PROGRAM -> new TherapyProgramBOImpl();
            case THERAPY_SESSION -> new TherapySessionBOImpl();
            case USER -> new UserBOImpl();
        };
    }

}