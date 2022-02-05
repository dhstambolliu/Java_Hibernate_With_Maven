
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("Hibernate.cfg.xml")
                .buildSessionFactory();

        EntityManager entityManager = sessionFactory.createEntityManager();

        OccurrenceRepository occurrenceRepository = new OccurrenceRepository(entityManager);
        System.out.println(occurrenceRepository.findById(1));
    }
}
