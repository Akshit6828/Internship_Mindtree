package brand;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "phone_brand", uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length=11, nullable=false, unique=true)
    private Integer id;

    @Column(name = "name", length=30, nullable=true)
    private String name;

    @OneToMany(mappedBy="brand")
    private Set<Phone> phones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Phone> getPhones(String brand) {
        return phones;
    }

    public void setItems(Set<Phone> phones) {
        this.phones = phones;
    }
}
