public class UserInfo {
    String userId;
    String userPassword;
    int userStatus;
    char userProgram;

    public UserInfo(){//default constructor
        setUserPassword("Password69");
        setUserId("userid69");
        setUserStatus(1);
        setUserProgram('R');
    }
    public UserInfo(String id, String password,int status, char program){
        setUserId(id);
        setUserPassword(password);
        setUserStatus(status);
        setUserProgram(program);
    }
    //setters
    public void setUserPassword(String password){userPassword = password;}
    public void setUserId(String id){userId = id;}
    public void setUserStatus(int status) {userStatus = status;}
    public void setUserProgram(char program) {userProgram = program; }
    //getters
    public String getUserPassword(){return userPassword;}
    public String getUserId(){return userId;}
    public int getUserStatus(){return userStatus;}
    public char getUserProgram(){return userProgram;}
}
