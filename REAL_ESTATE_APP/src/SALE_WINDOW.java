
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1BestCsharp
 */
public class SALE_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form SALE_WINDOW
     */
    public SALE_WINDOW() {
        initComponents();
        
        
        // set border to the jpanel title
        Border panel_title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255,10,0));
        jPanel_Title.setBorder(panel_title_border);
        
        // set border to the jbuttons
        Border button_border = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(255,255,255));
        jButton_Add_Sale.setBorder(button_border);
        jButton_Edit_Sale.setBorder(button_border);
        jButton_Remove_Sale.setBorder(button_border);
        
        // populate the jtable properties with the property id, owner id, and price
        fillJtableProperties();
        
        // populate the jtable clients with the client id, first name and last name
        fillJtableClients();
        
        // populate the jtable sales
        fillJtableSales();
        
        // change the jtable row height
        jTable_Clients.setRowHeight(40);
        jTable_Properties.setRowHeight(40);
        jTable_Sales.setRowHeight(40);
        // change the jtable selection background
        jTable_Clients.setSelectionBackground(new Color(27,150,77));
        jTable_Properties.setSelectionBackground(new Color(20,120,10));
        jTable_Sales.setSelectionBackground(new Color(0,70,0));
        
    }
    
    
    // create a function to populate the jtable with properties data
    public void fillJtableProperties()
    {
        P_PROPERTY property = new P_PROPERTY();
        ArrayList<P_PROPERTY> propertyList = property.propertiesList();
        
        // the jtable columns 0      1    
        String[] colNames = {"ID","Owner Id","Price"};
        
        // the jtable row
        // ownersList.size() = the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[propertyList.size()][3];
        
        // add data form the list to the rows
        for(int i = 0; i < propertyList.size(); i++)
        {
            rows[i][0] = propertyList.get(i).getId();
            rows[i][1] = propertyList.get(i).getOwnerId();
            rows[i][2] = propertyList.get(i).getPrice();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Properties.setModel(model);
        
    }
    
    // create a function to populate the jtable with clients data
    public void fillJtableClients()
    {
        P_CLIENT client = new P_CLIENT();
        ArrayList<P_CLIENT> clientList = client.clientsList();
        
        // the jtable columns
        String[] colNames = {"ID","First Name","Last Name"};
        
        // the jtable row
        // ownersList.size() = the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[clientList.size()][3];
        
        // add data form the list to the rows
        for(int i = 0; i < clientList.size(); i++)
        {
            rows[i][0] = clientList.get(i).getId();
            rows[i][1] = clientList.get(i).getFname();
            rows[i][2] = clientList.get(i).getLname();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Clients.setModel(model);
        
        
    }
    
    // create a function to populate the jtable with sales data
    public void fillJtableSales()
    {
        P_SALE sale = new P_SALE();
        ArrayList<P_SALE> salesList = sale.salesList();
        
        // the jtable columns
        String[] colNames = {"ID","Property","Client","Price","Date"};
        
        // the jtable row
        // ownersList.size() = the size of the arraylist
        // 5 = the number of columns
        Object[][] rows = new Object[salesList.size()][5];
        
        // add data form the list to the rows
        for(int i = 0; i < salesList.size(); i++)
        {
            rows[i][0] = salesList.get(i).getId();
            rows[i][1] = salesList.get(i).getPropertyId();
            rows[i][2] = salesList.get(i).getClientId();
            rows[i][3] = salesList.get(i).getFinalPrice();
            rows[i][4] = salesList.get(i).getSellingDate();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Sales.setModel(model);
        
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_PropertyID = new javax.swing.JTextField();
        jButton_Add_Sale = new javax.swing.JButton();
        jButton_Edit_Sale = new javax.swing.JButton();
        jButton_Remove_Sale = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_ClientID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_FinalPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Properties = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Clients = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser_SaleDate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Sales = new javax.swing.JTable();
        jButton_Refresh_Sales_Table = new javax.swing.JButton();
        jButton_Refresh_Clients_Table = new javax.swing.JButton();
        jButton_Add_Client = new javax.swing.JButton();
        jButton_Refresh_Properties_Table = new javax.swing.JButton();
        jButton_Add_Property = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jPanel_Title.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sale");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(531, 531, 531))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Property ID:");

        jTextField_Id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextField_PropertyID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jButton_Add_Sale.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Add_Sale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Sale.setText("Add");
        jButton_Add_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_SaleActionPerformed(evt);
            }
        });

        jButton_Edit_Sale.setBackground(new java.awt.Color(0, 153, 255));
        jButton_Edit_Sale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit_Sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_Sale.setText("Edit");
        jButton_Edit_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_SaleActionPerformed(evt);
            }
        });

        jButton_Remove_Sale.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Sale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove_Sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove_Sale.setText("Remove");
        jButton_Remove_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_SaleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Client ID:");

        jTextField_ClientID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Final Price:");

        jTextField_FinalPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Date:");

        jTable_Properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_PropertiesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Properties);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Properties List");

        jTable_Clients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ClientsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Clients);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Clients List");

        jDateChooser_SaleDate.setDateFormatString("dd/MM/yyyy");
        jDateChooser_SaleDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Sales List");

        jTable_Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SalesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_Sales);

        jButton_Refresh_Sales_Table.setBackground(new java.awt.Color(255, 204, 0));
        jButton_Refresh_Sales_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Refresh_Sales_Table.setText("Refresh");
        jButton_Refresh_Sales_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_Sales_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_Sales_TableActionPerformed(evt);
            }
        });

        jButton_Refresh_Clients_Table.setBackground(new java.awt.Color(255, 204, 0));
        jButton_Refresh_Clients_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Refresh_Clients_Table.setText("Refresh");
        jButton_Refresh_Clients_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_Clients_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_Clients_TableActionPerformed(evt);
            }
        });

        jButton_Add_Client.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Add_Client.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Client.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Client.setText("Add New Client");
        jButton_Add_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ClientActionPerformed(evt);
            }
        });

        jButton_Refresh_Properties_Table.setBackground(new java.awt.Color(255, 204, 0));
        jButton_Refresh_Properties_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Refresh_Properties_Table.setText("Refresh");
        jButton_Refresh_Properties_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_Properties_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_Properties_TableActionPerformed(evt);
            }
        });

        jButton_Add_Property.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Add_Property.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Property.setText("Add New Property");
        jButton_Add_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_PropertyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDateChooser_SaleDate, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                .addComponent(jLabel6)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_FinalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(jTextField_ClientID)
                                        .addComponent(jTextField_PropertyID))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Add_Sale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton_Remove_Sale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Edit_Sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(jButton_Refresh_Sales_Table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Add_Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jButton_Refresh_Clients_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jButton_Refresh_Properties_Table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Add_Property, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_PropertyID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ClientID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FinalPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser_SaleDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(jButton_Add_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Edit_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Remove_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Refresh_Sales_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Refresh_Clients_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Refresh_Properties_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Add_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void jButton_Add_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_SaleActionPerformed

        // add a new Sale
        //int id = Integer.valueOf(jTextField_Id.getText());
        
        try
        {
            int propertyId = Integer.valueOf(jTextField_PropertyID.getText());
            int clientId = Integer.valueOf(jTextField_ClientID.getText());
            String finalPrice = jTextField_FinalPrice.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String sellingate = dateFormat.format(jDateChooser_SaleDate.getDate());

            P_SALE sale = new P_SALE(0, propertyId, clientId, finalPrice, sellingate);

            if(new P_SALE().addNewSale(sale))
            {
                JOptionPane.showMessageDialog(null, "A New Sale Has Been Created and Added", "Add Sale", 1);
            }
            else{
                   JOptionPane.showMessageDialog(null, "Sale Not Created", "Add Sale", 2);
                }

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Select The Property Id, Client Id and The Sale Date", "Add Sale Error", 2);
        }
        
    }//GEN-LAST:event_jButton_Add_SaleActionPerformed

    private void jButton_Edit_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_SaleActionPerformed

       // edit the selected sale

       try
       {
             int id = Integer.valueOf(jTextField_Id.getText());
             int propertyId = Integer.valueOf(jTextField_PropertyID.getText());
             int clientId = Integer.valueOf(jTextField_ClientID.getText());
             String finalPrice = jTextField_FinalPrice.getText();
             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
             String sellingate = dateFormat.format(jDateChooser_SaleDate.getDate());

             P_SALE sale = new P_SALE(id, propertyId, clientId, finalPrice, sellingate);

             if(new P_SALE().editSale(sale))
             {
                 JOptionPane.showMessageDialog(null, "Sale Data Has Been Updated", "Edit Sale", 1);
             }
             else{
                    JOptionPane.showMessageDialog(null, "Sale Data Not Updated", "Edit Sale", 2);
                 }
       }
       catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Select The Sale Id, Client Id and The Sale Date", "Edit Sale Error", 2);
        } 
        
    }//GEN-LAST:event_jButton_Edit_SaleActionPerformed

    private void jButton_Remove_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_SaleActionPerformed

        // remove the selected sale
        
            try{
                int id = Integer.valueOf(jTextField_Id.getText());

                if(new P_SALE().deleteSale(id))
                {
                    JOptionPane.showMessageDialog(null, "Sale Data Has Been Deleted", "Delete Sale", 1);
                }
                else{
                       JOptionPane.showMessageDialog(null, "Sale Data Not Deleted", "Delete Sale", 2);
                    }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Select The Sale Id", "Delete Sale Error", 2);
            }
    }//GEN-LAST:event_jButton_Remove_SaleActionPerformed

    private void jTable_PropertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_PropertiesMouseClicked

        int selectedRowIndex = jTable_Properties.getSelectedRow();
        jTextField_PropertyID.setText(jTable_Properties.getValueAt(selectedRowIndex, 0).toString());
        jTextField_FinalPrice.setText(jTable_Properties.getValueAt(selectedRowIndex, 2).toString());
        
    }//GEN-LAST:event_jTable_PropertiesMouseClicked

    private void jTable_ClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClientsMouseClicked
        
        int selectedRowIndex = jTable_Clients.getSelectedRow();
        jTextField_ClientID.setText(jTable_Clients.getValueAt(selectedRowIndex, 0).toString());
        
    }//GEN-LAST:event_jTable_ClientsMouseClicked

    private void jTable_SalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SalesMouseClicked
       
        // display the selected sale data
        int selectedRowIndex = jTable_Sales.getSelectedRow();
        jTextField_Id.setText(jTable_Sales.getValueAt(selectedRowIndex, 0).toString());
        jTextField_PropertyID.setText(jTable_Sales.getValueAt(selectedRowIndex, 1).toString());
        jTextField_ClientID.setText(jTable_Sales.getValueAt(selectedRowIndex, 2).toString());
        jTextField_FinalPrice.setText(jTable_Sales.getValueAt(selectedRowIndex, 3).toString());
        
        // display the date in jdatechooser
        Date saleDate;
        try {
            saleDate = new SimpleDateFormat("yyyy-MM-dd").parse(jTable_Sales.getValueAt(selectedRowIndex, 4).toString());
            jDateChooser_SaleDate.setDate(saleDate);
        } catch (ParseException ex) {
            Logger.getLogger(SALE_WINDOW.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTable_SalesMouseClicked

    private void jButton_Refresh_Sales_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_Sales_TableActionPerformed
        
        // refresh the jtable sales
        fillJtableSales();
        
    }//GEN-LAST:event_jButton_Refresh_Sales_TableActionPerformed

    private void jButton_Refresh_Clients_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_Clients_TableActionPerformed
        
        // refresh the jtable clients
        fillJtableClients();
        
    }//GEN-LAST:event_jButton_Refresh_Clients_TableActionPerformed

    private void jButton_Add_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ClientActionPerformed
        
        // open the client form
        CLIENT_WINDOW clientform = new CLIENT_WINDOW();
        clientform.setVisible(true);
        clientform.pack();        
        clientform.setLocationRelativeTo(null);
        clientform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton_Add_ClientActionPerformed

    private void jButton_Refresh_Properties_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_Properties_TableActionPerformed
        
        // refresh the jtable properties
        fillJtableProperties();
        
    }//GEN-LAST:event_jButton_Refresh_Properties_TableActionPerformed

    private void jButton_Add_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_PropertyActionPerformed
        
        // open the property form
        PROPERTY_WINDOW propertyform = new PROPERTY_WINDOW();
        propertyform.setVisible(true);
        propertyform.pack();        
        propertyform.setLocationRelativeTo(null);
        propertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton_Add_PropertyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALE_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Client;
    private javax.swing.JButton jButton_Add_Property;
    private javax.swing.JButton jButton_Add_Sale;
    private javax.swing.JButton jButton_Edit_Sale;
    private javax.swing.JButton jButton_Refresh_Clients_Table;
    private javax.swing.JButton jButton_Refresh_Properties_Table;
    private javax.swing.JButton jButton_Refresh_Sales_Table;
    private javax.swing.JButton jButton_Remove_Sale;
    private com.toedter.calendar.JDateChooser jDateChooser_SaleDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_Clients;
    private javax.swing.JTable jTable_Properties;
    private javax.swing.JTable jTable_Sales;
    private javax.swing.JTextField jTextField_ClientID;
    private javax.swing.JTextField jTextField_FinalPrice;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_PropertyID;
    // End of variables declaration//GEN-END:variables
}
