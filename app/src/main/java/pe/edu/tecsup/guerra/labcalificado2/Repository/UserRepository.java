package pe.edu.tecsup.guerra.labcalificado2.Repository;

import com.orm.SugarRecord;
import com.orm.util.NamingHelper;

import java.util.List;

import pe.edu.tecsup.guerra.labcalificado2.clases.User;

/**
 * Created by Alumno on 20/04/2018.
 */

public class UserRepository {

    public static List<User> list(){
        List<User> users = SugarRecord.listAll(User.class);
        return users;
    }

    public static User read(Long id){
        User user = SugarRecord.findById(User.class, id);
        return user;
    }

    public static void create(String username, String password, String fullname,String email){
        User user = new User(username, password,fullname,email);
        SugarRecord.save(user);
    }

    public static void update(String username, String password, String fullname,String email){
        User user = (User) SugarRecord.find(User.class,email);
        user.setUnsername(username);
        user.setPassword(password);
        user.setFullname(fullname);
        //user.setEmail(email);
        SugarRecord.save(user);
    }

    public static void delete(Long id){
        User user = SugarRecord.findById(User.class, id);
        SugarRecord.delete(user);
    }

    public static boolean  validar(String username, String password){
        List<User> userList= SugarRecord.findWithQuery(User.class,"Select * from "+ NamingHelper.toSQLName(User.class)+ " where username = ?",username);
        //all and find
        //List<User> lol = SugarRecord.find(User.class,"username=?",username);

        if (userList.isEmpty()||userList==null){
            return true;
        }else{
            return false;
        }
    }

}
