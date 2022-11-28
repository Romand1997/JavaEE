package Task4_servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class TaskManager {
    public static Long id=5l;
    public static ArrayList<Task> tasks=new ArrayList<>();
    static {tasks.add(new Task(1l, "Work", "To do work", "2222-12-12", "NO"));
            tasks.add(new Task(2l, "clean up", "To do work", "2222-12-12", "YES"));
            tasks.add(new Task(3l, "Walk", "To do work", "2222-12-12", "NO"));
            tasks.add(new Task(4l, "Wash up", "To do work", "2222-12-12", "NO"));
    }
    public static void addTask(Task task){
        task.setId(id);
        tasks.add(task);
        id++;
    }
    public static Task getTaskById(Long id){
        Task novTask=new Task();
        for (Task task: tasks) {
            if (task.getId()==id)
                novTask=task;
        }
        return novTask;
    }
    public static ArrayList getAllTasks(){
        return tasks;
    }
    public static ArrayList<Task> deleteTask(Long id){
        for (int i=0; i<tasks.size(); i++){
            if((tasks.get(i).getId())==id){
                tasks.remove(i);
            }
        }
        return tasks;
    }
    private static Connection connection;
    static {
        try { Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/", "postgres", "postgres");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
