package kz.bitlab.servlets.Task1;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<User> users = new ArrayList<>();
    static {
        users.add(new User("Roma", "Danov", "Jun", 11111));
        users.add(new User("Masha", "Mois", "middle", 22222));
    }
    public static ArrayList<User> getUsers(){
        return users;
    }
    public static void addUser(User user){
        users.add(user);
    }
}
