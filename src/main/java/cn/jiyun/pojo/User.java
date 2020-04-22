package cn.jiyun.pojo;

/**
 * @author shkstart
 * @user 祝继蒙
 * @date 2020/4/22 - 12:40
 */
public class User {
    private String uid;
    private String usex;
    private String uaddress;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", usex='" + usex + '\'' +
                ", uaddress='" + uaddress + '\'' +
                '}';
    }
}
