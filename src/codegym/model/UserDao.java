package codegym.model;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static{
        users = new ArrayList<>();
        User user1= new User();
        user1.setAccount("Linh");
        user1.setPassword("Hanoi");
        user1.setName("Linh Vu");
        user1.setEmail("linh@gmail.com");
        user1.setAge(28);
        users.add(user1);

        User user2= new User();
        user2.setAccount("Ha");
        user2.setPassword("PhuTho");
        user2.setName("HaDo");
        user2.setEmail("ha@gmail.com");
        user2.setAge(30);
        users.add(user2);

        User user3= new User();
        user3.setAccount("Son");
        user3.setPassword("TamNong");
        user3.setName("Son Vu");
        user3.setEmail("son@gmail.com");
        user3.setAge(26);
        users.add(user3);

    }

    public  static  User checkLogin(Login login){
        for(User user:users){
            if(user.getAccount().equals(login.getAccount())){
                return user;
            }
        }
        return null;
    }

}
