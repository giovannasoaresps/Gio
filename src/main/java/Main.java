import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Pagamento;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pagamentosPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Pagamento pg= new Pagamento();
        pg.setData(new Date());
        pg.setValor(500);
        System.out.println(pg);
        entityManager.persist(pg);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        entityManager.close();
    }







}
