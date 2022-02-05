import javax.persistence.EntityManager;

public class OccurrenceRepository {
    private final EntityManager entityManager;

    public OccurrenceRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public OccurrenceEntity findById(Integer id) {
        return entityManager.find(OccurrenceEntity.class, id);
    }

    public OccurrenceEntity findByName(String placeName) {
        return entityManager.createQuery("SELECT o FROM OccurrenceEntity o WHERE place = :placeName ", OccurrenceEntity.class)
                .setParameter("placeName", placeName).getSingleResult();
    }

    public OccurrenceEntity findByYear(int occurrenceYear) {
        return entityManager.createQuery("SELECT o FROM OccurrenceEntity o WHERE year = :occurrenceYear ", OccurrenceEntity.class)
                .setParameter("occurrenceYear", occurrenceYear).getSingleResult();
    }


}
