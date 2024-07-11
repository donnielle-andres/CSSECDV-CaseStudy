package Controller;

import Model.History;
import Model.Logs;
import Model.Product;
import Model.User;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Model.PasswordFunctions;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SQLite {
    
    public int DEBUG_MODE = 0;
    String driverURL = "jdbc:sqlite:" + "database.db";
    
    public void createNewDatabase() {
        try (Connection conn = DriverManager.getConnection(driverURL)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Database database.db created.");
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void createHistoryTable() {
        String sql = "CREATE TABLE IF NOT EXISTS history (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " username TEXT NOT NULL,\n"
            + " name TEXT NOT NULL,\n"
            + " stock INTEGER DEFAULT 0,\n"
            + " timestamp TEXT NOT NULL\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table history in database.db created.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void createLogsTable() {
        String sql = "CREATE TABLE IF NOT EXISTS logs (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " event TEXT NOT NULL,\n"
            + " username TEXT NOT NULL,\n"
            + " desc TEXT NOT NULL,\n"
            + " timestamp TEXT NOT NULL\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table logs in database.db created.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
     
    public void createProductTable() {
        String sql = "CREATE TABLE IF NOT EXISTS product (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " name TEXT NOT NULL UNIQUE,\n"
            + " stock INTEGER DEFAULT 0,\n"
            + " price REAL DEFAULT 0.00\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table product in database.db created.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
     
    public void createUserTable() {
        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS users (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " username TEXT NOT NULL UNIQUE,\n"
            + " password TEXT NOT NULL,\n"
            + " role INTEGER DEFAULT 2,\n"
            + " locked INTEGER DEFAULT 0,\n"
            + " mfa1 TEXT NOT NULL,\n"
            + " mfa2 TEXT NOT NULL\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sqlCreateTable);
            System.out.println("Table users in database.db created.");

            /*
            // Fetch and print the column names
            String sqlFetchColumns = "PRAGMA table_info(users)";
            ResultSet rs = stmt.executeQuery(sqlFetchColumns);
            while (rs.next()) {
                System.out.println(rs.getString("name")); // Prints the column name
            }
            */
        } catch (Exception ex) {
            System.err.println("createUserTable Error: " + ex.getMessage());
        }
    }
    
    public void dropHistoryTable() {
        String sql = "DROP TABLE IF EXISTS history;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table history in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void dropLogsTable() {
        String sql = "DROP TABLE IF EXISTS logs;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table logs in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void dropProductTable() {
        String sql = "DROP TABLE IF EXISTS product;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table product in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void dropUserTable() {
        String sql = "DROP TABLE IF EXISTS users;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table users in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void addHistory(String username, String name, int stock, String timestamp) {
        String sql = "INSERT INTO history(username,name,stock,timestamp) VALUES('" + username + "','" + name + "','" + stock + "','" + timestamp + "')";
        String formattedDateTime = getTime();
        addLogs( "BOUGHT", username, username + "bought "+stock+" "+name, formattedDateTime);
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void addLogs(String event, String username, String desc, String timestamp) {
        String sql = "INSERT INTO logs(event,username,desc,timestamp) VALUES('" + event + "','" + username + "','" + desc + "','" + timestamp + "')";
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void addProduct(String name, int stock, double price, String userActor) {
        String sql = "INSERT INTO product(name,stock,price) VALUES('" + name + "','" + stock + "','" + price + "')";
        String formattedDateTime = getTime();
        addLogs( "ADDPD", userActor, name + " was added with qty "+stock+" and price "+price, formattedDateTime);
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    

    
    
    //FOR LOG IN
    public boolean validateUser(String username, String password) {
        String sql = "SELECT password, locked FROM users WHERE username = ?";
        String hashedPass = null;
        boolean isLocked = false;

        try (Connection conn = DriverManager.getConnection(driverURL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Set the value for the username parameter
            pstmt.setString(1, username);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    hashedPass = rs.getString("password");
                    isLocked = rs.getBoolean("locked");
                } else {
                    //System.out.println("Username or Password is incorrect");
                    return false;
                }
            }
        } catch (Exception ex) {
            //System.out.println("Error retrieving user: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }

        if (isLocked) {
            //System.out.println("Account is locked");
            return false;
        }

        if (hashedPass != null) {
            String formattedDateTime = getTime();
            boolean isCorrect = PasswordFunctions.checkHashed(password, hashedPass);
            if (isCorrect){
                addLogs( "LOGIN", username, username + " logged in", formattedDateTime);
            }
            else{
               addLogs( "FAILLGN", username, username + " failed to logged in", formattedDateTime); 
            }
            return isCorrect;
        } else {
            return false;
        }
    }

    
    // FOR FORGET PASSWORD
    public boolean confirmUserForgot(String username, String mfa1, String mfa2) {
        String sql = "SELECT username, mfa1, mfa2 FROM users WHERE username = ?";
        String hashedMfa1 = null;
        String hashedMfa2 = null;

        try (Connection conn = DriverManager.getConnection(driverURL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Set the value for the username parameter
            pstmt.setString(1, username);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    hashedMfa1 = rs.getString("mfa1");
                    hashedMfa2 = rs.getString("mfa2");
                    
                } else {
                    System.out.println("Hashed MFAs are incorrect");
                    return false;
                }
            }
        } catch (Exception ex) {
            System.out.println("confirmUserForgot - Error retrieving user: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }

        if (hashedMfa1 != null && PasswordFunctions.checkHashed(mfa1, hashedMfa1) && 
            hashedMfa2 != null && PasswordFunctions.checkHashed(mfa2, hashedMfa2)) {
            return true;
        } else {
            return false;
        }
    }
    
    
    
    public ArrayList<History> getHistory(){
        String sql = "SELECT id, username, name, stock, timestamp FROM history";
        ArrayList<History> histories = new ArrayList<History>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                histories.add(new History(rs.getInt("id"),
                                   rs.getString("username"),
                                   rs.getString("name"),
                                   rs.getInt("stock"),
                                   rs.getString("timestamp")));
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return histories;
    }
    
        public ArrayList<History> getUserHistory(String user) {
        String sql = "SELECT id, username, name, stock, timestamp FROM history WHERE username = ?";
        ArrayList<History> histories = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(driverURL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            // Set the value for the username parameter
            pstmt.setString(1, user);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    histories.add(new History(rs.getInt("id"),
                                              rs.getString("username"),
                                              rs.getString("name"),
                                              rs.getInt("stock"),
                                              rs.getString("timestamp")));
                }
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return histories;
    }
    
    public ArrayList<Logs> getLogs(){
        String sql = "SELECT id, event, username, desc, timestamp FROM logs";
        ArrayList<Logs> logs = new ArrayList<Logs>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                logs.add(new Logs(rs.getInt("id"),
                                   rs.getString("event"),
                                   rs.getString("username"),
                                   rs.getString("desc"),
                                   rs.getString("timestamp")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return logs;
    }
    
    public ArrayList<Product> getProduct(){
        String sql = "SELECT id, name, stock, price FROM product";
        ArrayList<Product> products = new ArrayList<Product>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                products.add(new Product(rs.getInt("id"),
                                   rs.getString("name"),
                                   rs.getInt("stock"),
                                   rs.getFloat("price")));
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return products;
    }
    
    public ArrayList<User> getUsers(){
        String sql = "SELECT id, username, password, role, locked, mfa1, mfa2 FROM users";
        ArrayList<User> users = new ArrayList<User>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                users.add(new User(rs.getInt("id"),
                                   rs.getString("username"),
                                   rs.getString("password"),
                                   rs.getInt("role"),
                                   rs.getInt("locked"),
                                   rs.getString("mfa1"),
                                   rs.getString("mfa2")));
            }
        } catch (Exception ex) {}
        return users;
    }
    
    public User getUserInfo(String username) {
        String sql = "SELECT id, username, password, role, locked, mfa1, mfa2 FROM users WHERE username='" + username + "';";
        User activeUser = null;

        try (Connection conn = DriverManager.getConnection(driverURL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
                if (rs.next()) {
                    activeUser = new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("role"),
                        rs.getInt("locked"),
                        rs.getString("mfa1"),
                        rs.getString("mfa2")
                            
                    );

            }
        } catch (Exception ex) {
            System.err.println("Get User Info Error: " + ex.getMessage());
        }

        return activeUser;
    }
   
    
    public void addUser(String username, String password, int role, String mfa1, String mfa2) {
        String hashedPassword = PasswordFunctions.hashInput(password);
        String hashedmfa1 = PasswordFunctions.hashInput(mfa1);
        String hashedmfa2 = PasswordFunctions.hashInput(mfa2);

        String sql = "INSERT INTO users(username,password,role,locked,mfa1,mfa2) VALUES(?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(driverURL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, hashedPassword);
            pstmt.setInt(3, role);
            pstmt.setString(4, hashedmfa1);
            pstmt.setString(5, hashedmfa2);
            pstmt.executeUpdate();

        } catch (Exception ex) {
            // Log the exception message or stack trace for debugging
            System.err.println("Add User Error: " + ex.getMessage());
        }
        String formattedDateTime = getTime();
        addLogs( "RGSTR", username, username + " was registered", formattedDateTime);
    }
    
    public void addUser(String username, String password, String mfa1, String mfa2) {
        String hashedPassword = PasswordFunctions.hashInput(password);
        String hashedmfa1 = PasswordFunctions.hashInput(mfa1);
        String hashedmfa2 = PasswordFunctions.hashInput(mfa2);
        
        String sql = "INSERT INTO users(username,password,mfa1,mfa2) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(driverURL);
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, hashedPassword);
            pstmt.setString(3, hashedmfa1);
            pstmt.setString(4, hashedmfa2);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void removeUser(String username, String userActor) {
        String sql = "DELETE FROM users WHERE username='" + username + "';";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            String formattedDateTime = getTime();
            addLogs("DELETE", userActor, userActor + " has deleted "+username, formattedDateTime);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void deleteProduct(String name, String userActor) {
        String sql = "DELETE FROM product WHERE name = ?";

        try (Connection conn = DriverManager.getConnection(driverURL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            addLogs( "DELPD", userActor, name + " (Product) was deleted.", getTime());
        } catch (Exception ex) {
            System.out.println("Error deleting product: " + ex.getMessage());
        }
    }
    
    public void editProduct(String name, String newName, int stock, double price, String userActor) {
        String sql = "UPDATE product SET name = ?, stock = ?, price = ? WHERE name = ?";

        try (Connection conn = DriverManager.getConnection(driverURL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, stock);
            pstmt.setDouble(3, price);
            pstmt.setString(4, name);
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                String formattedDateTime = getTime();
                addLogs("EDTPD", userActor, name + " (Product) was edited.", formattedDateTime);
   
            } else {
                System.out.println("Product '" + name + "' not found.");
            }
        } catch (Exception ex) {
            System.out.println("Error updating product: " + ex.getMessage());
        }
    }

        

    public Product getProduct(String name){
        String sql = "SELECT name, stock, price FROM product WHERE name='" + name + "';";
        Product product = null;
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            product = new Product(rs.getString("name"),
                                   rs.getInt("stock"),
                                   rs.getFloat("price"));
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return product;
    }
    
    public boolean buyProduct(String name, int quantity) {
        String selectSql = "SELECT stock FROM product WHERE name=?";
        String updateSql = "UPDATE product SET stock=? WHERE name=?";
        try (Connection conn = DriverManager.getConnection(driverURL);
             PreparedStatement selectStmt = conn.prepareStatement(selectSql);
             PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
            selectStmt.setString(1, name);
            try (ResultSet rs = selectStmt.executeQuery()) {
                if (rs.next()) {
                    int currentStock = rs.getInt("stock");
                    if (currentStock >= quantity) {
                        int newStock = currentStock - quantity;
                        updateStmt.setInt(1, newStock);
                        updateStmt.setString(2, name);
                        updateStmt.executeUpdate();
                        return true; 
                    } else {
                        System.out.println("Not enough stock available.");
                        return false;
                    }
                } else {
                    System.out.println("Product not found.");
                    return false; 
                }
            }
        } catch (Exception ex) {
            System.out.print(ex);
            return false; 
        }
    }
    
    
    public boolean changePassword(String username, String newPassword, String confPass, String userActor) {
        if(newPassword.equals(confPass)&&PasswordFunctions.validatePassword(newPassword, username)){
            String hashedPassword = PasswordFunctions.hashInput(newPassword);
            String sql = "UPDATE users SET password = ? WHERE username = ?";
            try (Connection conn = DriverManager.getConnection(driverURL);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, hashedPassword);
                pstmt.setString(2, username);
                int affectedRows = pstmt.executeUpdate();
                if (affectedRows > 0) {
                    String formattedDateTime = getTime();
                    addLogs("PASSCHG", userActor,userActor + " has changed the password of "+username, formattedDateTime);
                    return true;
                } else {
                    System.out.println("User not found: " + username);
                    return true;
                }
            } catch (Exception ex) {
                System.out.print(ex);
            }
            
        }
        else{
            return false;
        }
        return false;
    }
    
    
    public boolean editUserRole(String username, int newRole, String userActor) {
        String sql = "UPDATE users SET role = ? WHERE username = ?";
        try (Connection conn = DriverManager.getConnection(driverURL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, newRole);
            pstmt.setString(2, username);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                String formattedDateTime = getTime();
                addLogs("ROLECHG", userActor, userActor + " changed the role of "+ username +" to " + newRole , formattedDateTime);
                System.out.println("Role updated successfully for user: " + username);
                return true;
            } else {
                System.out.println("User not found: " + username);
                return false;
            }
        } catch (Exception ex) {
            System.out.print(ex);
            return false;
        }
    }
    
    public boolean setUserLockedStatus(String username, int lockedStatus, String userActor) {
        if (lockedStatus != 0 && lockedStatus != 1) {
            System.out.println("Invalid locked status: " + lockedStatus);
            return false;
        }

        String sql = "UPDATE users SET locked = ? WHERE username = ?";
        int finalStatus = (lockedStatus == 0) ? 0 : 1;
        System.out.println("locked status to set: " + lockedStatus);
        System.out.println("Final status to set: " + finalStatus);

        try (Connection conn = DriverManager.getConnection(driverURL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, finalStatus);
            pstmt.setString(2, username);
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                String status = (finalStatus == 1) ? "locked" : "unlocked";
                String formattedDateTime = getTime();
                addLogs("LOCKCHG", userActor, userActor + " has set " + username + " to status: " + status, formattedDateTime);
                System.out.println("Status change successful for user: " + username);
                return true;
            } else {
                System.out.println("User not found: " + username);
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            return false;
        }
    }

    
    public boolean accountStatus(String username) {
        String sql = "SELECT locked FROM users WHERE username = ?";
        try (Connection conn = DriverManager.getConnection(driverURL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Retrieve the locked status as an integer
                int lockedInt = rs.getInt("locked");

                // Convert the integer to a boolean based on its value               
                if (lockedInt == 1){
                    System.out.println(username + "is Locked" );
                    return true;   
                }else if (lockedInt == 0){
                    System.out.println(username + "is Not Locked" );
                    return false;
                }

            } else {
                System.out.printf("User not found: %s%n", username);
                return false;
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
        
        return false;
    }

    
    
    public void logOut(String username){
        String formattedDateTime = getTime();
        addLogs("LOGOUT", username, username + " has logged out", formattedDateTime);
    }
    
   
    
    public String getTime(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
}