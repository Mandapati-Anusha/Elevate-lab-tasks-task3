public class User {
    private int userId;
    private String name;
    private String phoneNo;

    // Constructor
    public User(int userId, String name, String phoneNo) {
        this.userId = userId;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    // Display User Info
    public void display() {
        System.out.println("User ID  : " + userId);
        System.out.println("Name     : " + name);
        System.out.println("Phone No : " + phoneNo);
    }
}
