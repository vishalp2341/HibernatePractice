import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customerdetails")
public class CustomerDetails {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    public CustomerDetails(int id, String email, String phone) {
        super();
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    public CustomerDetails() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CustomerDetails [id=" + id + ", email=" + email + ", phone=" + phone + "]";
    }
}
