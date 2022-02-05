import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "occurrence")
@AllArgsConstructor
@NoArgsConstructor
@Data


public class OccurrenceEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "year")
    private int year;

    @Column(name = "place")
    private String place;

    @OneToOne
    @JoinColumn(name = "disaster_id")
    private DisasterEntity disasterEntity;
}
