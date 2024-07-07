package Model;

public class User {
    private int id;
    private String username;
    private String password;
    private int role = 2;
    private int locked = 0;
    private String mfa1;
    private String mfa2;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public User(int id, String username, String password, int role, int locked, String mfa1, String mfa2){
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.locked = locked;
        this.mfa1 = mfa1;
        this.mfa2 = mfa2;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }
    
    public String getmfa1() {
        return mfa1;
    }

    public void setmfa1(String mfa1) {
        this.mfa1 = mfa1;
    }
    
    public String getmfa2() {
        return mfa2;
    }

    public void setmfa2(String mfa2) {
        this.mfa2 = mfa2;
    }
}
