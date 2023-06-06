import db.*;
import db.service.*;

class Intentory {

    public static void main(String[] args) {
        DbDriver dbobj = new DbDriver();
        dbobj.getConnection();
        ExecuteQuery eq = new ExecuteQuery();
        eq.execute();
        Session s = new Session();
        s.getSession();

    }

}
