package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.ClassRoom;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class ClassRoomDao implements Dao<ClassRoom> {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<ClassRoom> classRoomRowMapper;

    public ClassRoomDao(JdbcTemplate jdbcTemplate, RowMapper<ClassRoom> classRoomRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.classRoomRowMapper = classRoomRowMapper;
    }

    @Override
    public ClassRoom get(Long id) {
        return null;
    }

    @Override
    public List<ClassRoom> getAll() {
        return null;
    }

    @Override
    public void save(ClassRoom classRoom) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, ClassRoom classRoom) {

    }
}

