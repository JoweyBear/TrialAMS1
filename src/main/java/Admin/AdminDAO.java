package Admin;

import java.sql.ResultSet;

public interface AdminDAO {

    ResultSet fetchAll();
    void save(AdminModel admin);
    void update(AdminModel admin);
    void delete(String admin_id);
}
