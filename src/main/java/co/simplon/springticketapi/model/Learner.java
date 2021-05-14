package co.simplon.springticketapi.model;

public class Learner {
    private Long id;
    private String name;
    private Long promo;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getPromo() {
        return promo;
    }

    public Learner(Long id, String name, Long promo) {
        this.id = id;
        this.name = name;
        this.promo = promo;



    }

    @Override
    public String toString() {
        return "Learner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", promo=" + promo +
                '}';
    }
}
