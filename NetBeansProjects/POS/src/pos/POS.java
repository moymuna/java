
package pos;

import pos.dao.UserDao;
import pos.model.User;

public class POS {

    public static void main(String[] args) {
        User u= new User("badrul", "badrul1234");
        UserDao dao=new UserDao();
        dao.saveUseer(u);
        
    }
    
}
