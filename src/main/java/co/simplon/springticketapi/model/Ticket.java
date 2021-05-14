package co.simplon.springticketapi.model;

import java.time.LocalDateTime;

public class Ticket {
    private Long id;
    private LocalDateTime date;
    private String content;
    private Long learnerid;
    private Boolean solved;




    public Ticket(Long id, LocalDateTime localDateTime, String content, Long learnerid, Boolean solved) {
        this.id = id;
        this.date = localDateTime;
        this.content = content;
        this.learnerid = learnerid;
        this.solved = solved;
        

    }


    public Long getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public Long getLearnerid() { return learnerid; }

    public Boolean getSolved() { return solved; }
}
