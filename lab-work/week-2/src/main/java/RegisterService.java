import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterService {
    private static RegisterService instance = null;

    private RegisterService() {
    }

    public static RegisterService getInstance() {
        if (instance == null) {
            instance = new RegisterService();
        }
        return instance;
    }

    public void addUser(String user, String password) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement("insert into user (user_name,password) values(?,?) ");
            statement.setString(1, user);
            statement.setString(2, password);
            int i = statement.executeUpdate();
            System.out.println(i + " records inserted");

            connection.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

    }

    public User loadUser(String userName) {
        User user;
        try {
            user = new User();
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement("select * from user where user_name=?");
            statement.setString(1, userName);
            ResultSet rs = statement.executeQuery();
            rs.next();
            String name = rs.getString("user_name");
            String password = rs.getString("password");
            user.setUserName(name);
            user.setPassword(password);
            connection.close();
            return user;
        } catch (IOException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean validate(String name) {
        if (loadUser(name) == null) {
            return true;
        }
        return false;
    }

    public boolean login(String username, String password) {
        User user = loadUser(username);
        return user != null && user.getPassword().equals(password);
    }
}
