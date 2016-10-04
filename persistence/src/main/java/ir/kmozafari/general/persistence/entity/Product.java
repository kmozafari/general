package ir.kmozafari.general.persistence.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kourosh on 9/15/16.
 */

@Entity
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<OrderHistory> orders;

    @ManyToMany(mappedBy = "products")
    private List<Basket> baskets;


    public List<Basket> getBaskets() {
        return baskets;
    }

    public void setBaskets(List<Basket> baskets) {
        this.baskets = baskets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderHistory> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderHistory> orders) {
        this.orders = orders;
    }
}
