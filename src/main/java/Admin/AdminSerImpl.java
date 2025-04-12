package Admin;

import Admin.Views.*;
import java.awt.CardLayout;

public class AdminSerImpl implements AdminService{
    AdminDAO dao =  new AdminDAOImpl();
    AdminPanel adminPanel;
    AddPanel addPanel;
    EditPanel editPanel;
    
    public AdminSerImpl(AdminPanel adminPanel, AddPanel addPanel, EditPanel editPanel){
        this.adminPanel = adminPanel;
        this.addPanel = addPanel;
        this.editPanel = editPanel;
        
        
    }
    
    public void addButton(){
        CardLayout cl = (CardLayout) adminPanel.jPanel2.getLayout();
        adminPanel.jPanel2.add(addPanel, "AddAdmin");
        cl.show(adminPanel.jPanel2, "AddAdmin");
        System.out.println("AddButtonClicked");
    }
}
