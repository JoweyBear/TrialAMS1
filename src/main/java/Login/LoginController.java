package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LoginController {

    LoginFrame frame;
    LoginService service;

    public LoginController(LoginFrame frame) {
        this.frame = frame;
        service = new LoginSerImpl(frame);
        this.frame.ntr.addActionListener((ActionEvent e) -> {
            service.login();
        });
        this.frame.psswrd.addKeyListener(new KeyListener() {
            public void actionPerformed(KeyEvent evt) {
                System.out.println("Handled by unknown class listener");
            }

            @Override
            public void keyTyped(KeyEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    service.login();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        });

    }

}
