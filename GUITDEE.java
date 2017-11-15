import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
public class GUITDEE extends javax.swing.JFrame {
    protected int tdeeP, bmrP;
    protected String genderP;
    protected int heightP,weightP,ageP;
    
    public GUITDEE() {
        
    }
    public GUITDEE(String gender,int height,int weight,int age){
        initComponents();
        ButtonGroup group = new ButtonGroup();
        group.add(lvl1);
        group.add(lvl2);
        group.add(lvl3);
        group.add(lvl4);
        group.add(lvl5);
        genderP = gender;
        heightP = height;
        weightP = weight;
        ageP = age;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lvl1 = new javax.swing.JRadioButton();
        lvl2 = new javax.swing.JRadioButton();
        lvl3 = new javax.swing.JRadioButton();
        lvl4 = new javax.swing.JRadioButton();
        lvl5 = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lvl1.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        lvl1.setText("Level 1 : Sedentary (office job)");
        lvl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvl1ActionPerformed(evt);
            }
        });

        lvl2.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        lvl2.setText("Level 2 : Light Exercise (1-2 days/week)");
        lvl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvl2ActionPerformed(evt);
            }
        });

        lvl3.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        lvl3.setText("Level 3 : Moderate Exercise (3-5 days/week)");
        lvl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvl3ActionPerformed(evt);
            }
        });

        lvl4.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        lvl4.setText("Level 4 : Heavy Exercise (6-7 days/week)");
        lvl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvl4ActionPerformed(evt);
            }
        });

        lvl5.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        lvl5.setText("Level 5 : Athlete (*2 per day)");
        lvl5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvl5ActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 0, 30)); // NOI18N
        jLabel1.setText("STEP 2 : TDEE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvl5)
                    .addComponent(lvl3)
                    .addComponent(lvl2)
                    .addComponent(lvl1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(next)
                        .addComponent(lvl4)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lvl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvl4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvl5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(next)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void lvl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvl1ActionPerformed
        tdeeP = 1;
    }//GEN-LAST:event_lvl1ActionPerformed
    private void lvl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvl2ActionPerformed
        tdeeP = 2;
    }//GEN-LAST:event_lvl2ActionPerformed
    private void lvl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvl3ActionPerformed
        tdeeP = 3;
    }//GEN-LAST:event_lvl3ActionPerformed
    private void lvl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvl4ActionPerformed
        tdeeP = 4;
    }//GEN-LAST:event_lvl4ActionPerformed
    private void lvl5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvl5ActionPerformed
        tdeeP = 5;
    }//GEN-LAST:event_lvl5ActionPerformed
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        BMR();
        try {
            StoreToDB();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUITDEE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GUITDEE.class.getName()).log(Level.SEVERE, null, ex);
        }
        GUITGW form2 = new GUITGW(bmrP,weightP);
        form2.setVisible(true);
        form2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form2.setLocationRelativeTo(null);
        form2.setSize(440,380 );
        
        setVisible(false);
    }//GEN-LAST:event_nextActionPerformed

    public void BMR() {
        if (genderP.equals("f")) {
            bmrP =(int) ((10 * weightP) + (6.25 * heightP) - (5 * ageP) - 161);
        } else if (genderP.equals("m")) {
            bmrP =(int) ((10 * weightP) + (6.25 * heightP) - (5 * ageP) + 5);
        }
        if(tdeeP == 1){
            bmrP *= 1.2;
        }else if(tdeeP == 2){
            bmrP *= 1.375;
        }else if(tdeeP == 3){
            bmrP *= 1.55;
        }else if(tdeeP == 4){
            bmrP *= 1.725;
        }else if(tdeeP == 5){
            bmrP *= 1.9;
        }
    }
    public void StoreToDB() throws ClassNotFoundException, SQLException{
        Connection conn = MySQLConnect.getMySQLConnection();
        PreparedStatement pstm = conn.prepareStatement(
                "insert into Users(username,gender,weight,height,age,tdeeLevel,kcals) "
                +"values (?,?,?,?,?,?,?)") ;
        pstm.setString(1, "A");
        pstm.setString(2, genderP);
        pstm.setInt(3, weightP);
        pstm.setInt(4, heightP);
        pstm.setInt(5, ageP);
        pstm.setInt(6, tdeeP);
        pstm.setInt(7, bmrP);
        int rs = pstm.executeUpdate();
        System.out.println(rs);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUITDEE().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton lvl1;
    private javax.swing.JRadioButton lvl2;
    private javax.swing.JRadioButton lvl3;
    private javax.swing.JRadioButton lvl4;
    private javax.swing.JRadioButton lvl5;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
