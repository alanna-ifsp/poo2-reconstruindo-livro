package br.com.unicamp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAODatabase implements DAO {

    EntityManager em;

      public void openConnection(String username, String password) {
        Map<String, String> persistenceMap = new HashMap<>();
        EntityManagerFactory managerFactory;
        persistenceMap.put("javax.persistence.jdbc.user", username);
        persistenceMap.put("javax.persistence.jdbc.password", password);

        managerFactory = Persistence.createEntityManagerFactory("s1400-persistence", persistenceMap);
        em = managerFactory.createEntityManager();
          System.out.println("Teste1" + em);
    }

    @Override
    public List<String> getText(Integer groupId) {
        List<String> completedText;
        System.out.println("Teste" + em);
        Query findText = em.createNativeQuery("SELECT text from Fragmentos f WHERE f.groupId = ? ORDER BY f.line");
        findText.setParameter(1, groupId);
        completedText = findText.getResultList();
        return completedText;
    }
    
   /* public String getFileName(Integer groupId)
    {
        String fileName;
        Query qFileName = em.createNativeQuery("SELECT DISTINCT file from Fragmentos f WHERE f.groupId = ?");
        qFileName.setParameter(1, groupId);
        fileName = (String) qFileName.getSingleResult();
        return fileName;
    };*/

    public static void main(String[] args) {
        DAODatabase dao = new DAODatabase();

        List<String> text = dao.getText(5);

        text.forEach(t -> {
            System.out.println(t);
        });
    }


}
