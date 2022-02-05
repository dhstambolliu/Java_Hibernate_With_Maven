
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

        OccurrenceEntity nameEntity = occurrenceRepository.findByName("Texas");

        System.out.println("Find occurrence by name is: " + nameEntity.getPlace());

        OccurrenceEntity yearEntity = occurrenceRepository.findByYear(2022);

        System.out.println("Find occurrence by year is: " + yearEntity.getYear());

        DisasterRepository disasterRepository = new DisasterRepository(entityManager);

        OccurrenceEntity findByDisasterName = disasterRepository.findByDisasterName("Earthquake");

        System.out.println("Find disasters by name is: " + findByDisasterName.getPlace());
    }
}
