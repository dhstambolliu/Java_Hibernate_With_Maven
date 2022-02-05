import javax.persistence.EntityManager;

public class DisasterRepository {

    private final EntityManager entityManager;

    public DisasterRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public OccurrenceEntity findByDisasterName(String disasterName) {
        return entityManager.createQuery("SELECT o FROM DisasterEntity d INNER JOIN OccurrenceEntity o ON " +
                        "d.id = o.disasterEntity WHERE name = :disasterName ", OccurrenceEntity.class)
                .setParameter("disasterName", disasterName).getSingleResult();
    }
}
