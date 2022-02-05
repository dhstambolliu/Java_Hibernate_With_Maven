import javax.persistence.EntityManager;

public class OccurrenceRepository {
    private final EntityManager entityManager;

    public OccurrenceRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public OccurrenceEntity findById(Integer id) {
        return entityManager.find(OccurrenceEntity.class, id);
    }
}
