package prvr.mavenhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import java.util.List;

public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        // Insert/update the table
        student s1 = new student();
        s1.setName("Praveer");
        s1.setAge(21);
        s1.setMarks(85.25);
        s1.setGender("male");

        Transaction tx = session.beginTransaction();
        session.save(s1);

        // Fetch
        student fetchedStudent = session.get(student.class, 1);
        System.out.println(fetchedStudent);

        // Create Query
//        List<student> students = session.createQuery("from student").list();
//        for (student s1 : students) {
//            System.out.println(s1);
//        }

        // Edit or modify the data (transaction commit)
//        Student sToUpdate = session.get(Student.class, 1);
//        sToUpdate.setName("Golu");
//        sToUpdate.setAge(22);
//        session.saveOrUpdate(sToUpdate);

        // Delete (transaction commit)
//        Student sToDelete = session.get(Student.class, 1);
//        session.delete(sToDelete);

        
        
        tx.commit();
        session.close();
        sf.close();
    }
}
