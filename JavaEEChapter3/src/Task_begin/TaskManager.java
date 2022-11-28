package Task_begin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TaskManager {
//    public static Long id=5l;
//    public static ArrayList<Task> tasks=new ArrayList<>();
//    static {tasks.add(new Task(1l, "Work", "To do work", "2222-12-12", "NO"));
//            tasks.add(new Task(2l, "clean up", "To do work", "2222-12-12", "YES"));
//            tasks.add(new Task(3l, "Walk", "To do work", "2222-12-12", "NO"));
//            tasks.add(new Task(4l, "Wash up", "To do work", "2222-12-12", "NO"));
//    }
    public static void addTask(Task task){
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO tasks (nameoftask, contentoftask, deadlinedata, perfomance)" +
                    "VALUES (?,?,?,?)");
            statement.setString(1, task.getName());
            statement.setString(2, task.getDescription());
            statement.setString(3, task.getDeadlineDate());
            statement.setString(4, task.getPerformance());
            statement.executeUpdate();
            statement.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
//    public static Task getTaskById(Long id){
//        Task novTask=new Task();
//        for (Task task: tasks) {
//            if (task.getId()==id)
//                novTask=task;
//        }
//        return novTask;
//    }
//public static void renameTaskById(Long novid){
//
//    try{PreparedStatement statement=connection.prepareStatement("" +
//            "SELECT * FROM tasks");
//        ResultSet resultSet=statement.executeQuery();
//        while (resultSet.next()){
//            Task task=new Task();
//            task.setId(resultSet.getLong("id"));
//            task.setName(resultSet.getString("nameoftask"));
//            task.setDescription(resultSet.getString("contentoftask"));
//            task.setDeadlineDate(resultSet.getString("deadlinedata"));
//            task.setPerformance(resultSet.getString("perfomance"));
//
//        }
//        statement.close();
//        PreparedStatement statement = connection.prepareStatement("" +
//                    "INSERT INTO tasks (nameoftask, contentoftask, deadlinedata, perfomance)" +
//                    "VALUES (?,?,?,?)");
//                        "SELECT * FROM tasks"+
//                "UPDATE tasks SET nameoftask = 'vanya', contentoftask = '' WHERE id = novid");
//        statement.executeUpdate();
//        statement.close();

//    }
//    catch (Exception e){
//        e.printStackTrace();
//    }
//}
    public static ArrayList <Task> getAllTasks(){
        ArrayList<Task> tasks= new ArrayList<>();
        try {
            PreparedStatement statement=connection.prepareStatement("" +
                    "SELECT * FROM tasks");
            ResultSet resultSet=statement.executeQuery();
                while (resultSet.next()){
                    Task task=new Task();
                    task.setId(resultSet.getLong("id"));
                    task.setName(resultSet.getString("nameoftask"));
                    task.setDescription(resultSet.getString("contentoftask"));
                    task.setDeadlineDate(resultSet.getString("deadlinedata"));
                    task.setPerformance(resultSet.getString("perfomance"));
                    tasks.add(task);
                }
                statement.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return tasks;
    }
//    public static ArrayList<Task> deleteTask(Long id){
//        for (int i=0; i<tasks.size(); i++){
//            if((tasks.get(i).getId())==id){
//                tasks.remove(i);
//            }
//        }
//        return tasks;
//    }
    private static Connection connection;
    static {
        try { Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/newDatabase",
                    "postgres",
                    "postgres");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
