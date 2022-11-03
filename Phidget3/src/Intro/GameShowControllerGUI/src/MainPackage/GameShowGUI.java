package Intro.GameShowControllerGUI.src.MainPackage;

//Imports all required packages
import com.phidget22.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.logging.*;

public class GameShowGUI extends javax.swing.JFrame 
{
    //Declares and initializes variables
    static Random rndm = new Random();
    static DecimalFormat decfor = new DecimalFormat("0");
    static String answer = "";
    static int one, two, three; 
   
    public GameShowGUI() 
    {
        //Initializes GUI
        initComponents();
    }
    
    //Sets colour of text field in regards to what team pressed first
    public static void changeColour(boolean green)
    {
        if(green)
        {
            GreenScoreTxtField.setForeground(Color.green);
            RedScoreTxtField.setForeground(Color.black);
        }
        else
        {
            RedScoreTxtField.setForeground(Color.red);
            GreenScoreTxtField.setForeground(Color.black);
        }
    }
    
    //Resets colour of text fields
    public static void resetColour()
    {
        GreenScoreTxtField.setForeground(Color.black);
        RedScoreTxtField.setForeground(Color.black);
    }
    
    //Returns the random question as a string
    public static String getQuestion()
    {
        // First number
        one = rndm.nextInt(5)+1;
        // Second number
        two = rndm.nextInt(5)+1;
        // Operator
        three = rndm.nextInt(3);
        if(three == 1 && one <= 3 && two > one)
        {
           two = one + 1;
        }
        String operator = "";
        //Switch combines random number into mathematical operator
        switch(three)
        {
            case (0):
                operator = "+";
                break;
            case (1):
                operator = "-";
                break;
            case (2):
                operator = "*";
                break;
        }
        
        return (one+operator+two);
    }
    
    //Returns the answer to the randomly generated math problem
    public static void getAnswer()
    {
        //Switch passes the numbers to the right operator
        switch(three)
        {
            case(0):
                answer = decfor.format(one+two);
                break;
            case(1):
                answer = decfor.format(one-two);
                break;
            case(2):
                answer = decfor.format(one*two);
                break;
        }    
    }
    
    //Changes the score text field of each team
    public static void changeTxt(int g, int r)
    {
        GreenScoreDisplay.setText(""+g);
        RedScoreDisplay.setText(""+r);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GreenScoreTxtField = new javax.swing.JLabel();
        RedScoreTxtField = new javax.swing.JLabel();
        GreenScoreDisplay = new javax.swing.JLabel();
        RedScoreDisplay = new javax.swing.JLabel();
        QuestionButton = new javax.swing.JButton();
        QuestionTxtField = new javax.swing.JTextField();
        gScorePlus = new javax.swing.JButton();
        gScoreMinus = new javax.swing.JButton();
        rScorePlus = new javax.swing.JButton();
        rScoreMinus = new javax.swing.JButton();
        AnswerTxtField = new javax.swing.JTextField();
        AnswerButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(350, 100));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));

        GreenScoreTxtField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        GreenScoreTxtField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GreenScoreTxtField.setText("Green Score:");
        GreenScoreTxtField.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GreenScoreTxtField.setMaximumSize(new java.awt.Dimension(60, 14));
        GreenScoreTxtField.setMinimumSize(new java.awt.Dimension(3604, 14));
        GreenScoreTxtField.setPreferredSize(new java.awt.Dimension(100, 50));

        RedScoreTxtField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        RedScoreTxtField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedScoreTxtField.setText("Red Score:");

        GreenScoreDisplay.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        GreenScoreDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GreenScoreDisplay.setText("0");

        RedScoreDisplay.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        RedScoreDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedScoreDisplay.setText("0");

        QuestionButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        QuestionButton.setText("Get Question");
        QuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionButtonActionPerformed(evt);
            }
        });

        QuestionTxtField.setEditable(false);
        QuestionTxtField.setBackground(new java.awt.Color(255, 255, 255));
        QuestionTxtField.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        QuestionTxtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        gScorePlus.setText("+");
        gScorePlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gScorePlusActionPerformed(evt);
            }
        });

        gScoreMinus.setText("-");
        gScoreMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gScoreMinusActionPerformed(evt);
            }
        });

        rScorePlus.setText("+");
        rScorePlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rScorePlusActionPerformed(evt);
            }
        });

        rScoreMinus.setText("-");
        rScoreMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rScoreMinusActionPerformed(evt);
            }
        });

        AnswerTxtField.setEditable(false);
        AnswerTxtField.setBackground(new java.awt.Color(255, 255, 255));
        AnswerTxtField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        AnswerTxtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        AnswerButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        AnswerButton.setText("Answer");
        AnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerButtonActionPerformed(evt);
            }
        });

        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gScorePlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gScoreMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(GreenScoreTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(RedScoreTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(GreenScoreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RedScoreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(QuestionTxtField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AnswerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RefreshButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(AnswerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rScorePlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rScoreMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GreenScoreTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RedScoreTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GreenScoreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RedScoreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rScoreMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gScorePlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rScorePlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(gScoreMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(QuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuestionTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AnswerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnswerButton))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RefreshButton)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionButtonActionPerformed
        //"Get Question" button is pressed
        QuestionTxtField.setText(getQuestion());
        AnswerTxtField.setText("");
        resetColour();
    }//GEN-LAST:event_QuestionButtonActionPerformed

    private void gScoreMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gScoreMinusActionPerformed
        //Subtracts one point from green score
        ControllerLogic.greenScore--;
        changeTxt(ControllerLogic.greenScore, ControllerLogic.redScore);
    }//GEN-LAST:event_gScoreMinusActionPerformed

    private void gScorePlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gScorePlusActionPerformed
        //Adds one point to green score
        ControllerLogic.greenScore++;
        changeTxt(ControllerLogic.greenScore, ControllerLogic.redScore);
    }//GEN-LAST:event_gScorePlusActionPerformed

    private void rScoreMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rScoreMinusActionPerformed
        //Subtracts one point from red score
        ControllerLogic.redScore--;
        changeTxt(ControllerLogic.greenScore, ControllerLogic.redScore);
    }//GEN-LAST:event_rScoreMinusActionPerformed

    private void rScorePlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rScorePlusActionPerformed
        //Adds one point to red score
        ControllerLogic.redScore++;
        changeTxt(ControllerLogic.greenScore, ControllerLogic.redScore);
    }//GEN-LAST:event_rScorePlusActionPerformed

    private void AnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerButtonActionPerformed
        //Passes the answer from the method to  text field for display
        getAnswer();
        AnswerTxtField.setText(""+answer);
    }//GEN-LAST:event_AnswerButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        //Resets the GUI to new game values
        ControllerLogic.greenScore = 0;
        ControllerLogic.redScore = 0;
        AnswerTxtField.setText("");
        QuestionTxtField.setText("");
        resetColour();
        changeTxt(ControllerLogic.greenScore, ControllerLogic.redScore);
    }//GEN-LAST:event_RefreshButtonActionPerformed
  
    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameShowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameShowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameShowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameShowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new GameShowGUI().setVisible(true);
                //This try sets up the phidget listeners and logic 
                try 
                {
                    ControllerLogic.ControllerInitialization();
                    
                } catch (PhidgetException ex) 
                {
                    Logger.getLogger(GameShowGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnswerButton;
    private javax.swing.JTextField AnswerTxtField;
    private static javax.swing.JLabel GreenScoreDisplay;
    private static javax.swing.JLabel GreenScoreTxtField;
    private javax.swing.JButton QuestionButton;
    private javax.swing.JTextField QuestionTxtField;
    private static javax.swing.JLabel RedScoreDisplay;
    private static javax.swing.JLabel RedScoreTxtField;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton gScoreMinus;
    private javax.swing.JButton gScorePlus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rScoreMinus;
    private javax.swing.JButton rScorePlus;
    // End of variables declaration//GEN-END:variables
}
