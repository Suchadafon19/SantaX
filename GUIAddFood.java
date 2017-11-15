import java.awt.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.and;

public class GUIAddFood extends javax.swing.JFrame {
    int foodId=0,calories=0;
    String Foodname;
    double quan=0;
    public GUIAddFood() {
        initComponents();
    }

    GUIAddFood(String Foodname, int calo) {
        this.Foodname = Foodname;
        this.calories = calo;
        initComponents();
        fName.setText(Foodname+" "+calories+" kcals");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        iQuan = new javax.swing.JTextField();
        AddFood = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 30)); // NOI18N
        jLabel1.setText("MENU");

        fName.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        fName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        jLabel3.setText("Quantity :");

        iQuan.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        iQuan.setText("1");

        AddFood.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        AddFood.setText("ADD FOOD");
        AddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFoodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(AddFood))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(iQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(iQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(AddFood)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFoodActionPerformed
        quan = Double.parseDouble(iQuan.getText());
        try {
            findFoodid();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIAddFood.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GUIAddFood.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddFoodActionPerformed
    public void findFoodid() throws ClassNotFoundException, SQLException{
        Connection conn = MySQLConnect.getMySQLConnection();
        PreparedStatement pstm = conn.prepareStatement("select foodId from Menu where foodName = ? and foodKcals = ?");
        pstm.setString(1, Foodname);
        pstm.setInt(2, calories);
        System.out.println(Foodname);
        System.out.println(calories);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            foodId = rs.getInt("foodId");
        }
        System.out.println(foodId);
        System.out.println("123");
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new GUIAddFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddFood;
    private javax.swing.JLabel fName;
    private javax.swing.JTextField iQuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
