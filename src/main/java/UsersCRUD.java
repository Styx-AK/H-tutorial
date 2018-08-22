import java.util.List;

import org.hibernate.Session;

public class UsersCRUD {

    public void save(User users) {
        Session session = HibernateUtill.getSessionFactory().openSession(); //открываем сессию
        session.beginTransaction();
        session.save(users); //пользуемся ее методами
        session.flush();
        session.close();
    }

    public void delete(User users) {
        Session session = HibernateUtill.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(users); //пользуемся ее методами
        session.flush();
        session.close();
    }

    public List<User> getAll() {
        Session session = HibernateUtill.getSessionFactory().openSession();
        return session.createCriteria(User.class).list();
    }

    public User getById(Integer id) {
        Session session = HibernateUtill.getSessionFactory().openSession();
        User users = session.get(User.class, id);
        return users;
    }
}
