package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Learner;
import co.simplon.springticketapi.model.Ticket;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LearnerDao implements Dao<Learner> {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Learner> learnerRowMapper;

    public LearnerDao(JdbcTemplate jdbcTemplate, RowMapper<Learner> learnerRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.learnerRowMapper = learnerRowMapper;
    }


    @Override
    public Learner get(Long id) {

        return jdbcTemplate.queryForObject("select * from learner where id = ?",
                learnerRowMapper, id);

    }

    @Override
    public List<Learner> getAll() {
        return jdbcTemplate.query("select * from learner",
                learnerRowMapper);

    }

    @Override
    public void save(Learner learner) {
        jdbcTemplate.execute("INSERT INTO learner (name , promo) " +
                "VALUES ('" + learner.getName() + "','" +
                "" + learner.getPromo() + "')");
    }


    @Override
    public void delete(Long id) {
        jdbcTemplate.execute("DELETE from learner where id = '" + id +"'");    }

    @Override
    public void update(Long id, Learner learner){
        System.out.println(learner);
        jdbcTemplate.update("UPDATE learner set name = ?, promo = ? where id = ?", learner.getName(), learner.getPromo(), id);
    }

}
