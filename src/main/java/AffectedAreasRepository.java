import javax.persistence.EntityManager;
import java.util.List;

public class AffectedAreasRepository {
    private final EntityManager entityManager;

    public AffectedAreasRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public List<String> findDisasterPlace(Integer casualties) {
        return entityManager.createQuery("SELECT o.place FROM OccurrenceEntity o INNER JOIN AffectedAreasEntity a ON " +
                        "o.id = a.id WHERE a.casualties > :casualties ", String.class)
                .setParameter("casualties", casualties).getResultList();
    }

}
