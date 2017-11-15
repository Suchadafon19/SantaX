import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUIFoodDB extends javax.swing.JFrame {
    String Foodname;
    int calories;
    public GUIFoodDB() {
        initComponents();
        showDataCombo();     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FoodList = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FoodList.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        FoodList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "รายการอาหาร" }));
        FoodList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodListActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        jLabel1.setText("Food Lists");

        next.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(FoodList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(200, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FoodList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void FoodListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodListActionPerformed
        String Food=(String)FoodList.getSelectedItem();
        String prepare ="";
        int count=0;
        for(int num=Food.length()-7;num>=0;num--){
            if(Food.charAt(num)!=' '){
                prepare = Food.charAt(num)+prepare;
            }else{
                count=num;
                break;
            }
        }
        calories = Integer.parseInt(prepare);
        Foodname="";
        for(int num2=0;num2<count;num2++){
            Foodname += Food.charAt(num2);
        }
    }//GEN-LAST:event_FoodListActionPerformed
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        GUIAddFood form = new GUIAddFood(Foodname,calories);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_nextActionPerformed

    public void showDataCombo(){
        try{
            String sql = "select * from Menu";//where ownerName='null'
            Connection conn = MySQLConnect.getMySQLConnection() ;
            PreparedStatement pstm = conn.prepareStatement(sql) ;
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                String name = rs.getString("foodName");
                String calo = rs.getString("foodKcals");
                FoodList.addItem(name+" "+calo+" kcals");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFoodDB().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox FoodList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
