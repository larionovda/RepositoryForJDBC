package ru.larionov.hospital.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.larionov.hospital.entity.Nurse;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NurseMapper implements RowMapper<Nurse> {
    @Override
    public Nurse mapRow(ResultSet resultSet, int i) throws SQLException {
        Nurse nurse = new Nurse();
        nurse.setId(resultSet.getInt("id"));
        nurse.setFirstName(resultSet.getString("first_name"));
        nurse.setLastName(resultSet.getString("last_name"));
        return nurse;
    }
}
