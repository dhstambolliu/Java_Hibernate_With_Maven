import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "disaster")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DisasterEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @OneToOne(mappedBy = "disasterEntity")
    private OccurrenceEntity occurrenceEntity;

}
