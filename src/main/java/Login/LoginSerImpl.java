package Login;

import Admin.AdminModel;
import AdminDashboard.Dashboard;
import Utilities.GlobalVar;

public class LoginSerImpl implements LoginService {

    LoginDAO dao = new LoginDAOImpl();
    LoginFrame frame;

    public LoginSerImpl(LoginFrame frame) {
        this.frame = frame;
    }

    @Override
    public void login() {
        String user = frame.srnm.getText();
        String pass = frame.psswrd.getText();
        AdminModel admin = dao.adminLogin(user, pass);
        GlobalVar.loggedInAdmin = admin;
        if (admin != null) {
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
            frame.setVisible(false);
        }

    }

}
