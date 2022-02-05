import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "affectedareas")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class AffectedAreasEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "casualties")
    private String casualties;

    @Column(name = "fatalities")
    private String fatalities;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "occurrence_id")
    private OccurrenceEntity occurrenceEntity;

}
