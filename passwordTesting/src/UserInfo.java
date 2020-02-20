public class UserInfo {
    String userId;
    String userPassword;

    public UserInfo(){//default constructor
        setUserPassword("Password69");
        setUserId("userid69");
    }

    public UserInfo(String id, String password){
        setUserId(id);
        setUserPassword(password);
    }


    //setters
    public void setUserPassword(String password){userPassword = password;}
    public void setUserId(String id){userId = id;}
    //getters
    public String getUserPassword(){return userPassword;}
    public String getUserId(){return userId;}
}
