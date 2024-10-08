package View;

//import Controller.IdleLogoutTimer;
import Controller.*;
import Model.*;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.time.*;
import java.time.format.*;
import java.text.*;
import javax.swing.JPanel;

public class Frame extends javax.swing.JFrame {   
    private User currentUser = new User(null, null);
    private boolean activeUser = false;
  
    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        HomePnl = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        Navigation = new javax.swing.JPanel();
        adminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        managerBtn = new javax.swing.JButton();
        staffBtn = new javax.swing.JButton();
        clientBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(800, 450));

        HomePnl.setBackground(new java.awt.Color(102, 102, 102));
        HomePnl.setPreferredSize(new java.awt.Dimension(801, 500));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Navigation.setBackground(new java.awt.Color(204, 204, 204));

        adminBtn.setBackground(new java.awt.Color(250, 250, 250));
        adminBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminBtn.setText("Admin Home");
        adminBtn.setFocusable(false);
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        managerBtn.setBackground(new java.awt.Color(250, 250, 250));
        managerBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        managerBtn.setText("Manager Home");
        managerBtn.setFocusable(false);
        managerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerBtnActionPerformed(evt);
            }
        });

        staffBtn.setBackground(new java.awt.Color(250, 250, 250));
        staffBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staffBtn.setText("Staff Home");
        staffBtn.setFocusable(false);
        staffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffBtnActionPerformed(evt);
            }
        });

        clientBtn.setBackground(new java.awt.Color(250, 250, 250));
        clientBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clientBtn.setText("Client Home");
        clientBtn.setFocusable(false);
        clientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(250, 250, 250));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setFocusable(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavigationLayout = new javax.swing.GroupLayout(Navigation);
        Navigation.setLayout(NavigationLayout);
        NavigationLayout.setHorizontalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(managerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NavigationLayout.setVerticalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(managerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HomePnlLayout = new javax.swing.GroupLayout(HomePnl);
        HomePnl.setLayout(HomePnlLayout);
        HomePnlLayout.setHorizontalGroup(
            HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePnlLayout.createSequentialGroup()
                .addComponent(Navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomePnlLayout.setVerticalGroup(
            HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Navigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HomePnl, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HomePnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        adminHomePnl.showPnl("home");
        contentView.show(Content, "adminHomePnl");
    }//GEN-LAST:event_adminBtnActionPerformed

    private void managerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerBtnActionPerformed
        managerHomePnl.showPnl("home");
        contentView.show(Content, "managerHomePnl");
    }//GEN-LAST:event_managerBtnActionPerformed

    private void staffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffBtnActionPerformed
        staffHomePnl.showPnl("home");
        contentView.show(Content, "staffHomePnl");
    }//GEN-LAST:event_staffBtnActionPerformed

    private void clientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientBtnActionPerformed
        clientHomePnl.showPnl("home");
        contentView.show(Content, "clientHomePnl");
    }//GEN-LAST:event_clientBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        main.sqlite.logOut(currentUser.getUsername());
        currentUser = null;
        frameView.show(Container, "loginPnl");
    }//GEN-LAST:event_logoutBtnActionPerformed

    public Main main;
    public Login loginPnl = new Login();
    public Register registerPnl = new Register();
    public ForgotPassword forgotPassPnl = new ForgotPassword();

    private AdminHome adminHomePnl = new AdminHome();
    private ManagerHome managerHomePnl = new ManagerHome();
    private StaffHome staffHomePnl = new StaffHome();
    private ClientHome clientHomePnl = new ClientHome(currentUser);
    
    private CardLayout contentView = new CardLayout();
    private CardLayout frameView = new CardLayout();
    
    public void init(Main controller){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("CSSECDV - SECURITY Svcs");
        this.setLocationRelativeTo(null);
        
        this.main = controller;
        loginPnl.frame = this;
        registerPnl.frame = this;
        forgotPassPnl.frame = this;

        
        //adminHomePnl.init(main.sqlite);
        //clientHomePnl.init(main.sqlite);
        //managerHomePnl.init(main.sqlite);
        //staffHomePnl.init(main.sqlite);
        
        Container.setLayout(frameView);
        Container.add(loginPnl, "loginPnl");
        Container.add(registerPnl, "registerPnl");
        Container.add(forgotPassPnl, "forgotPassPnl");

         
        Container.add(HomePnl, "homePnl");
        frameView.show(Container, "loginPnl");
        
        Content.setLayout(contentView);
        //Swapped to initialize only if someone logged in already to get user session
        //Content.add(adminHomePnl, "adminHomePnl");
        //Content.add(managerHomePnl, "managerHomePnl");
        //Content.add(staffHomePnl, "staffHomePnl");
        //Content.add(clientHomePnl, "clientHomePnl");
        
        this.setVisible(true);
        
        
    }
    
    public void hideAllButtons(){
        adminBtn.setVisible(false);
        managerBtn.setVisible(false);
        staffBtn.setVisible(false);
        clientBtn.setVisible(false);
        adminBtn.setEnabled(false);
        managerBtn.setEnabled(false);
        staffBtn.setEnabled(false);
        clientBtn.setEnabled(false);
    }
    
    public void mainNav(final String Username){
        frameView.show(Container, "homePnl");
        hideAllButtons();
        
        activeUser = true;
        currentUser = main.sqlite.getUserInfo(Username);
        //System.out.println("Currently Logged In: " + currentUser.getUsername());
        
        int currentUserRole = currentUser.getRole();
        switch (currentUserRole){
        case 5: //admin
            adminBtn.setVisible(true);
            adminBtn.setEnabled(true);
            adminHomePnl.init(main.sqlite, currentUser);
            Content.add(adminHomePnl, "adminHomePnl");
            adminHomePnl.showPnl("home");
            contentView.show(Content, "adminHomePnl");
            
            break;
        case 4: //manager
            managerBtn.setVisible(true);
            managerBtn.setEnabled(true);
            managerHomePnl.init(main.sqlite, currentUser);
            Content.add(managerHomePnl, "managerHomePnl");
            managerHomePnl.showPnl("home");
            contentView.show(Content, "managerHomePnl");
            break;
        case 3: //staff
            staffBtn.setVisible(true);
            staffBtn.setEnabled(true);           
            staffHomePnl.init(main.sqlite, currentUser);
            Content.add(staffHomePnl, "staffHomePnl");
            staffHomePnl.showPnl("home");
            contentView.show(Content, "staffHomePnl");
            break;
        case 2: //client
            clientBtn.setVisible(true);
            clientBtn.setEnabled(true);
            clientHomePnl = new ClientHome(currentUser); 
            clientHomePnl.init(main.sqlite, currentUser); 
            clientHomePnl.init(main.sqlite, currentUser);
            contentView.show(Content, "clientHomePnl");
            Content.add(clientHomePnl, "clientHomePnl");
            clientHomePnl.showPnl("home");

            break;
        default: // ???
            JOptionPane.showMessageDialog(Container, "A fatal error occured. Please login again", "Unknown Error", JOptionPane.ERROR_MESSAGE);
            frameView.show(Container, "loginPnl");
            break;
        }
        
    }
    
    public void loginNav() {
        //System.out.println("Login Nav: " + currentUser.getUsername());
        if (currentUser!= null) {
            currentUser = null; // Explicitly set currentUser to null upon logout
        }
        frameView.show(Container, "loginPnl"); // Ensure the login panel is shown
    }

    
    public void registerNav(){
        frameView.show(Container, "registerPnl");
    }
    
    public void forgotPassNav(){
        //System.out.println("Frame forgotPassNav: " + currentUser.getUsername());
        frameView.show(Container, "forgotPassPnl");
    }
    
    public boolean registerAction(String username, String password, String confpass, String mfa1, String mfa2) {
        if (password.equals(confpass)) {
            main.sqlite.addUser(username, password, mfa1, mfa2);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean confirmUser(String username, String mfa1, String mfa2){
        
        boolean checkmfa = main.sqlite.checkMFAs(username, mfa1, mfa2);
        if (checkmfa){
            //System.out.println("MFAs are correct");
            return true;
        }else if (checkmfa == false) {
            //System.out.println("MFAs are wrong");
            return false;
        }else{
            //System.out.println("confirmUser Error");
            return false;
        }
    }

    public boolean changePassword(String username, String password, String confpassword) {
        try {
            main.sqlite.changePassword(username, password, confpassword, username);
            return true;
        } catch (Exception e) {
            //System.err.println("An error occurred while changing the password: " + e.getMessage());
            return false;
        }
    }

    
    public boolean checkExistingUser(String username){
        // Check if the username already exists in the database
        User existingUser = main.sqlite.getUserInfo(username);
        if (existingUser != null) {
            //System.out.println("Account Exists: " + existingUser.getUsername());
            return true; // Username exists
            
        }else{
            return false; // user does not exists
        }
    }
    
    public boolean checkAccountStatus(String username){
        User existingUser = main.sqlite.getUserInfo(username);
        
        if (existingUser != null && existingUser.getLocked() == 1) {
            //System.out.println("Account is Locked: " + existingUser.getUsername());
            return true; // Account is Locked
        } else if (existingUser != null && existingUser.getLocked() == 0) {
            //System.out.println("Account is Not Locked: " + existingUser.getUsername());
            return false; // Account is Not Locked
        }else{
            //System.out.println("Account does not exists");
            return false;
        }
    }
    
    public void lockAccount(String username){
        User existingUser = main.sqlite.getUserInfo(username);
        if (existingUser.getLocked() == 1) {
            //System.out.println("Account is Already Locked: " + existingUser.getUsername());
        }
        else if (existingUser.getLocked() == 0){
            //System.out.println("Locking Account of: " + existingUser.getUsername());
            main.sqlite.setUserLockedStatus(username, 1, username);
        }
    }
    
    public boolean loginAction(String username, String password){
        boolean validator = main.sqlite.validateUser(username, password);
        if (validator == true){
            currentUser = main.sqlite.getUserInfo(username);
        }
        return validator;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel HomePnl;
    private javax.swing.JPanel Navigation;
    private javax.swing.JButton adminBtn;
    private javax.swing.JButton clientBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton managerBtn;
    private javax.swing.JButton staffBtn;
    // End of variables declaration//GEN-END:variables
}
