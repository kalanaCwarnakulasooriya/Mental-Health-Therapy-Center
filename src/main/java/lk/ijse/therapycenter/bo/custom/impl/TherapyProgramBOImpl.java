package lk.ijse.therapycenter.bo.custom.impl;

import lk.ijse.therapycenter.bo.custom.TherapyProgramBO;
import lk.ijse.therapycenter.dao.DAOFactory;
import lk.ijse.therapycenter.dao.custom.impl.TherapyProgramDAOImpl;
import lk.ijse.therapycenter.dto.TherapyProgramDTO;
import lk.ijse.therapycenter.entity.TherapyProgram;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TherapyProgramBOImpl implements TherapyProgramBO {

    private final TherapyProgramDAOImpl therapyProgramDAO = (TherapyProgramDAOImpl) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.THERAPY_PROGRAM);

    @Override
    public boolean save(TherapyProgramDTO therapyProgram) {
        TherapyProgram therapyProgramEntity = convertToEntity(therapyProgram);
        return therapyProgramDAO.save(therapyProgramEntity);
    }

    @Override
    public boolean update(TherapyProgramDTO therapyProgram) {
        TherapyProgram therapyProgramEntity = toEntity(therapyProgram);
        return therapyProgramDAO.update(therapyProgramEntity);
    }

    @Override
    public boolean deleteByPK(String pk) throws Exception {
        return therapyProgramDAO.deleteByPK(pk);
    }

    @Override
    public List<TherapyProgramDTO> getAll() {
        List<TherapyProgramDTO> users = new ArrayList<>();
        List<TherapyProgram> all = therapyProgramDAO.getAll();
        for (TherapyProgram therapyProgram : all) {
            users.add(new TherapyProgramDTO(
                    therapyProgram.getProgramId(),
                    therapyProgram.getName(),
                    therapyProgram.getDuration(),
                    therapyProgram.getFee()
            ));
        }
        return users;
    }

    @Override
    public Optional<TherapyProgramDTO> findByPK(String pk) {
        return Optional.empty();
    }

    @Override
    public Optional<String> getLastPK() {
        return therapyProgramDAO.getLastPK();
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public ArrayList<String> getProgramList() {
        return therapyProgramDAO.getProgramList();
    }

    @Override
    public TherapyProgramDTO getAllTherapyProgram(String programName) {
        TherapyProgram therapyProgram = therapyProgramDAO.getAllTherapyProgram(programName);
        return convertToDTO(therapyProgram);
    }

    public static TherapyProgramDTO convertToDTO(TherapyProgram entity) {
        if (entity == null) {
            return null;
        }
        return new TherapyProgramDTO(
                entity.getProgramId(),
                entity.getName(),
                entity.getDuration(),
                entity.getFee()
        );
    }

    public static TherapyProgram convertToEntity(TherapyProgramDTO dto) {
        if (dto == null) {
            return null;
        }
        return new TherapyProgram(
                dto.getProgramId(),
                dto.getName(),
                dto.getDuration(),
                dto.getFee(),
                null
        );
    }

    public static TherapyProgram toEntity(TherapyProgramDTO dto) {
        if (dto == null) {
            return null;
        }
        return new TherapyProgram(
                dto.getProgramId(),
                dto.getName(),
                dto.getDuration(),
                dto.getFee(),
                null
        );
    }

    public static TherapyProgramDTO toDTO(TherapyProgram entity) {
        if (entity == null) {
            return null;
        }
        return new TherapyProgramDTO(
                entity.getProgramId(),
                entity.getName(),
                entity.getDuration(),
                entity.getFee()
        );
    }

}
