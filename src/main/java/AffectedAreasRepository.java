import javax.persistence.EntityManager;

public class AffectedAreasRepository {
    private final EntityManager entityManager;

    public AffectedAreasRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


}
