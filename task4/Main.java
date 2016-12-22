package task4;

import task2.AbstractDAO;

public class Main {
    private static int userId = 0;

    public static void main(String[] args) {
        User user = new User(userId++, "Vadim");
        AbstractDAO<User> userDAO = new UserDAO<>();
        userDAO.save(user);
        userDAO.getList().forEach(System.out::println);

        AbstractDAO<Integer> integgerDao = new UserDAO<>();
        integgerDao.save(1);
        integgerDao.getList().forEach(System.out::println);
    }
}
