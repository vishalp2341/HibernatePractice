import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "item")
    private String item;

    @Column(name = "price")
    private String price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cid")
    private Customer customer;

    public Orders(int id, String item, String price) {
        super();
        this.id = id;
        this.item = item;
        this.price = price;
    }

    public Orders() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders [id=" + id + ", item=" + item + ", price=" + price + "]";
    }
}
