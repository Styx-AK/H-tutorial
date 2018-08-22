//public class Main {
//
//    public static void main(String[] args) {
//        UsersCRUD usersCRUD = new UsersCRUD();
//
//        User users1 = new User();
//        users1.setName("John");
//        users1.setEmail("john_connar@gmail.com");
//        users1.setPassword("somepswd123");
//        usersCRUD.save(users1);
//
//        User users2 = new User();
//        users2.setName("Sara");
//        users2.setEmail("sarra_mother@gmail.com");
//        users2.setPassword("qwerty123");
//        usersCRUD.save(users2);
//
//        usersCRUD.getAll().forEach(it->System.out.println(it));
//
//        User userWithId1 = usersCRUD.getById(5);
//        System.out.println(userWithId1);
//
//        usersCRUD.delete(userWithId1);
//
//        usersCRUD.getAll().forEach(it->System.out.println(it));
//    }
//}
