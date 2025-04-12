package Admin.Views;

import java.awt.event.ActionListener;

public class EditPanel extends javax.swing.JPanel {

    public EditPanel() {
        initComponents();
        admin_id.putClientProperty("JTextField.placeholderText", "Admin ID");
        pstn.putClientProperty("JTextField.placeholderText", "Position");
        adfname.putClientProperty("JTextField.placeholderText", "First Name");
        admname.putClientProperty("JTextField.placeholderText", "Middle Name");
        adlname.putClientProperty("JTextField.placeholderText", "Last Name");

        jLabel3.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        adlname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        adfname = new javax.swing.JTextField();
        admname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        admin_id = new javax.swing.JTextField();
        pstn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pdt = new javax.swing.JButton();
        scn = new javax.swing.JButton();
        clr = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(119, 141, 169));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(13, 27, 42), 2, true), "Edit Admin", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bahnschrift", 1, 36))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(adlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 310, 30));

        jLabel1.setText("Personal Infromatiom:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 20));
        jPanel2.add(adfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 310, 30));
        jPanel2.add(admname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 310, 30));

        jLabel2.setText("University Information");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, 20));
        jPanel2.add(admin_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 310, 30));
        jPanel2.add(pstn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, 30));

        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 210, 240));

        pdt.setFont(new java.awt.Font("Instruction", 0, 14)); // NOI18N
        pdt.setText("update");
        jPanel2.add(pdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, 190, -1));

        scn.setFont(new java.awt.Font("Instruction", 0, 14)); // NOI18N
        scn.setText("Scan");
        jPanel2.add(scn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 190, -1));

        clr.setFont(new java.awt.Font("Instruction", 0, 14)); // NOI18N
        clr.setText("clear");
        jPanel2.add(clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, 190, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void buttonListener(ActionListener a){
        pdt.addActionListener(a);
        scn.addActionListener(a);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField adfname;
    public javax.swing.JTextField adlname;
    public javax.swing.JTextField admin_id;
    public javax.swing.JTextField admname;
    public javax.swing.JButton clr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JButton pdt;
    public javax.swing.JTextField pstn;
    public javax.swing.JButton scn;
    // End of variables declaration//GEN-END:variables
}
