package model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Data
@Entity
public class Lot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int price;
    private boolean state;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_player")
    private Player player;
}
