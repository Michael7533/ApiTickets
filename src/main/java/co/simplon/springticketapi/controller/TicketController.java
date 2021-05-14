package co.simplon.springticketapi.controller;

import co.simplon.springticketapi.dao.TicketDao;
import co.simplon.springticketapi.model.Learner;
import co.simplon.springticketapi.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/tickets")
@RestController
public class TicketController {

    private final TicketDao ticketDao;

    public TicketController(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketDao.getAll();
    }

    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable Long id) {
        return ticketDao.get(id);
    }

    @PostMapping
    public Ticket postTicket(@RequestBody Ticket ticket) { ticketDao.save(ticket); return null; }

    @DeleteMapping("/{id}")
    public Ticket deleteTicket(@PathVariable Long id) {ticketDao.delete(id); return null;}

    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id, @RequestBody Ticket ticket) {ticketDao.update(id, ticket); return null;}
}
