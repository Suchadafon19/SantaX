import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
public class GUITGW extends javax.swing.JFrame {
    protected int bmrP,tWeightP,tDayP,weightP,bmrPL;
    public GUITGW() {
        initComponents();
    }
    public GUITGW(int bmr,int weight) {
        weightP = weight;
        bmrP = bmr;
        initComponents();
    }                     
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tWeight = new javax.swing.JTextField();
        tDay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        output = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        output2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 0, 30)); // NOI18N
        jLabel1.setText("STEP3 : Set Weight Target");

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        jLabel3.setText("Target Weight (KG)");

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        jLabel4.setText("Duration (DAYS)");

        tWeight.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N

        tDay.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        next.setText("Finish");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel2.setText("Your TDEE is");

        output.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        output.setText(String.valueOf(bmrP));

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel6.setText("Kcals");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tWeight)
                    .addComponent(tDay, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(output2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(output)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(8, 8, 8)
                .addComponent(output2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(21, 21, 21))
        );

        pack();
    }                     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        tWeightP = Integer.valueOf(tWeight.getText());
        tDayP = Integer.valueOf(tDay.getText());
        calTGW();
    }       
    public void calTGW(){
        int weight = tWeightP-weightP;
        int bmr = weight*6614;
        bmr = bmr/tDayP;
        bmr = bmrP-bmr;
        if(bmr<0){
            output2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18));
            output2.setText("Cannot be true. Pleae insert again");
        }
        if(bmr>=0){
            output2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18));
            output2.setText("ปริมาณพลังงานที่เเนะนำต่อวัน "+String.valueOf(bmr)+" Kcals");
            bmrPL=bmr;  
        }
    }    
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {                                     
        try {
            StoreToDB();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GUITDEE.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
    }   
    public void StoreToDB() throws ClassNotFoundException, SQLException{
        Connection conn = MySQLConnect.getMySQLConnection();
        PreparedStatement pstm = conn.prepareStatement(
        "update Users set kcals=?,targetWeight=? where username=?");
        pstm.setInt(1, bmrPL);
        pstm.setInt(2, tWeightP);
        pstm.setString(3, "A");
        pstm.executeUpdate();
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUITGW().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel output;
    private javax.swing.JLabel output2;
    private javax.swing.JTextField tDay;
    private javax.swing.JTextField tWeight;
    // End of variables declaration                   
}
