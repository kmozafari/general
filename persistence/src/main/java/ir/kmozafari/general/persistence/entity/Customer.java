package ir.kmozafari.general.persistence.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kourosh on 9/18/16.
 */

@Entity
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String lastname;

    private String nationlNumber;

    @OneToMany
    private List<OrderHistory> orders;

    @OneToMany
    private List<Basket> baskets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getNationlNumber() {
        return nationlNumber;
    }

    public void setNationlNumber(String nationlNumber) {
        this.nationlNumber = nationlNumber;
    }


    public List<OrderHistory> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderHistory> orders) {
        this.orders = orders;
    }

    public List<Basket> getBaskets() {
        return baskets;
    }

    public void setBaskets(List<Basket> baskets) {
        this.baskets = baskets;
    }
}
