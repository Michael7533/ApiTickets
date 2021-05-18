package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Ticket;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.ResultSet;
import java.util.List;

@Component
public class TicketDao implements Dao<Ticket> {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Ticket> ticketRowMapper;

    public TicketDao(JdbcTemplate jdbcTemplate, RowMapper<Ticket> ticketRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.ticketRowMapper = ticketRowMapper;
    }

    @Override
    public Ticket get(Long id) {
        return jdbcTemplate.queryForObject("select * from ticket where id = ?",
                ticketRowMapper, id);
    }

    @Override
    // que ceux qui sont resolus:

    public List<Ticket> getAll() {
        return jdbcTemplate.query("select * from ticket where solved = false",
                ticketRowMapper);
    }

    @Override
    public void save(Ticket ticket) {
        jdbcTemplate.execute("INSERT INTO ticket (date , content , learnerid, solved) " +
                "VALUES ('" + ticket.getDate() + "','" +
                "" + ticket.getContent() + "','" +
                "" + ticket.getLearnerid() + "','" +
                "" + ticket.getSolved() + "')");

        //recuperation de l id:

        }

    @Override
    public void delete(Long id) {
        jdbcTemplate.execute("DELETE from ticket where id = '" + id +"'");
    }

    @Override
    public void update(Long id, Ticket ticket){
        jdbcTemplate.update("UPDATE ticket set solved = true where id = '\" + id +\"'");
    }

}
