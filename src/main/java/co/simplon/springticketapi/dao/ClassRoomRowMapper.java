package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.ClassRoom;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ClassRoomRowMapper implements RowMapper<ClassRoom> {

    @Override
    public ClassRoom mapRow(ResultSet resultset, int i) throws SQLException{
        return new ClassRoom(resultset.getLong("id"), resultset.getString("classroomname"));
    }
}


