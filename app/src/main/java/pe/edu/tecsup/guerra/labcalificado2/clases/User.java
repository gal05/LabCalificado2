package pe.edu.tecsup.guerra.labcalificado2.clases;

import com.orm.dsl.Table;

/**
 * Created by Alumno on 20/04/2018.
 */
@Table
public class User {
    private String unsername;
    private String password;
    private String fullname;
    private String email;


    public User( String unsername, String password, String fullname, String email) {

        this.unsername = unsername;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
    }

    public User() {
    }


    public String getUnsername() {
        return unsername;
    }

    public void setUnsername(String unsername) {
        this.unsername = unsername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                ", unsername='" + unsername + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
