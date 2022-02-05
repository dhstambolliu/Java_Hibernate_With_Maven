import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "occurrence")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OccurrenceEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "year")
    private int year;

    @Column(name = "place")
    private String place;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "disaster_id")
    private DisasterEntity disasterEntity;

    @OneToMany(mappedBy = "occurrenceEntity")
    private List<AffectedAreasEntity> affectedAreasEntityList;
}
