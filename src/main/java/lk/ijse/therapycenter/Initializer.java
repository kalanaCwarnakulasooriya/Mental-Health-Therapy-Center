package lk.ijse.therapycenter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.therapycenter.entity.*;

import java.io.IOException;

public class Initializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent load = FXMLLoader.load((getClass().getResource("/view/LogIn.fxml")));
        stage.setScene(new Scene(load));
        stage.setTitle("Center");
        stage.show();
    }

    public static void main(String[] args) {
        launch();

//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = null;
//        try {
//            transaction = session.beginTransaction();
//
//            // Users
//            User admin = new User();
//            admin.setUsername("superadmin");
//            admin.setPassword("admin456");
//            admin.setRole("Admin");
//
//            User manager = new User();
//            manager.setUsername("manager");
//            manager.setPassword("manager123");
//            manager.setRole("Manager");
//
//            session.persist(admin);
//            session.persist(manager);
//
//            // Therapists
//            Therapist therapist1 = new Therapist();
//            therapist1.setName("Dr. Sarah Johnson");
//            therapist1.setSpecialization("Chiropractic");
//
//            Therapist therapist2 = new Therapist();
//            therapist2.setName("Dr. Michael Green");
//            therapist2.setSpecialization("Occupational Therapy");
//
//            session.persist(therapist1);
//            session.persist(therapist2);
//
//            // Patients
//            Patient patient1 = new Patient();
//            patient1.setName("Charlie Davis");
//            patient1.setContactInfo("charlie.davis@example.com");
//
//            Patient patient2 = new Patient();
//            patient2.setName("Diana Lee");
//            patient2.setContactInfo("diana.lee@example.com");
//
//            session.persist(patient1);
//            session.persist(patient2);
//
//            // Therapy Programs
//            TherapyProgram program1 = new TherapyProgram();
//            program1.setProgramId("P003");
//            program1.setName("Post-Surgery Recovery");
//            program1.setDuration("8 Weeks");
//            program1.setFee(500.00);
//
//            TherapyProgram program2 = new TherapyProgram();
//            program2.setProgramId("P004");
//            program2.setName("Stress Relief Therapy");
//            program2.setDuration("5 Weeks");
//            program2.setFee(300.00);
//
//            session.persist(program1);
//            session.persist(program2);
//
//            // Therapy Sessions
//            TherapySession session1 = new TherapySession();
//            session1.setDate("2025-04-01");
//            session1.setTime("9:00 AM");
//            session1.setTherapist(therapist1);
//            session1.setPatient(patient1);
//            session1.setTherapyProgram(program1);
//
//            TherapySession session2 = new TherapySession();
//            session2.setDate("2025-04-03");
//            session2.setTime("11:00 AM");
//            session2.setTherapist(therapist2);
//            session2.setPatient(patient2);
//            session2.setTherapyProgram(program2);
//
//            session.persist(session1);
//            session.persist(session2);
//
//            // Payments
//            Payment payment1 = new Payment();
//            payment1.setAmount(500.00);
//            payment1.setDate("2025-03-30");
//            payment1.setPatient(patient1);
//            payment1.setTherapySession(session1);
//
//            Payment payment2 = new Payment();
//            payment2.setAmount(300.00);
//            payment2.setDate("2025-04-05");
//            payment2.setPatient(patient2);
//            payment2.setTherapySession(session2);
//
//            session.persist(payment1);
//            session.persist(payment2);
//
//            transaction.commit();
//            System.out.println("Sample data inserted successfully!");
//
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
    }
}