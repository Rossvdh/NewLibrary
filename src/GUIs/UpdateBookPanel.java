/*Panel for updating and deleting books
 Ross van der Heyde
 Started 19 January 2014*/
package GUIs;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import library.AutoCompletion;
import library.Book;
import library.BookType;
import library.Driver;
import library.Fiction;
import library.Genre;
import library.NonFiction;
import library.Series;
import library.Shop;

/**
 * A <code>JPanel</code> that provides functionality and interface for updating
 * and deleting books from the database.
 *
 * @author Ross van der Heyde
 */
public class UpdateBookPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateBookPanel.
     *
     * @param d <code>Driver</code> that provides some methods.
     */
    public UpdateBookPanel(Driver d) {
        initComponents();
        driver = d;
        radDum.setVisible(false);
        setComboUpdateModel();

        comboNewValue.setVisible(false);
        comboDewey1.setVisible(false);
        comboDewey2.setVisible(false);
        comboDewey3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupUpdate = new javax.swing.ButtonGroup();
        lUpdateBook = new javax.swing.JLabel();
        lID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        butDelete = new javax.swing.JButton();
        tfDeleteID = new javax.swing.JTextField();
        radFiction = new javax.swing.JRadioButton();
        radNonFiction = new javax.swing.JRadioButton();
        radDum = new javax.swing.JRadioButton();
        updateMessPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboUpdate = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        tfUpdateID = new javax.swing.JTextField();
        lNewValue = new javax.swing.JLabel();
        tfNewValue = new javax.swing.JTextField();
        butUpdate = new javax.swing.JButton();
        butClearAll = new javax.swing.JButton();
        butClearTextPane = new javax.swing.JButton();
        comboNewValue = new javax.swing.JComboBox();
        comboDewey1 = new javax.swing.JComboBox();
        comboDewey2 = new javax.swing.JComboBox();
        comboDewey3 = new javax.swing.JComboBox();

        lUpdateBook.setText("<html><b><u>Delete/update a book</u></b>");

        lID.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lID.setText("Book ID:");

        jLabel3.setText("<html><b>Delete</b>");

        butDelete.setText("Delete");
        butDelete.setToolTipText("Delete the book from the database.");
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
            }
        });

        tfDeleteID.setToolTipText("Enter the ID number of the book to delete.");

        groupUpdate.add(radFiction);
        radFiction.setText("Fiction");
        radFiction.setToolTipText("Select whether the book to update is fiction or non-fiction");
        radFiction.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radFictionItemStateChanged(evt);
            }
        });

        groupUpdate.add(radNonFiction);
        radNonFiction.setText("Non-fiction");
        radNonFiction.setToolTipText("Select whether the book to update is fiction or non-fiction");

        groupUpdate.add(radDum);
        radDum.setText("dum");

        updateMessPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Messages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));

        textPane.setToolTipText("Messages from the database appear here.");
        jScrollPane1.setViewportView(textPane);

        javax.swing.GroupLayout updateMessPanelLayout = new javax.swing.GroupLayout(updateMessPanel);
        updateMessPanel.setLayout(updateMessPanelLayout);
        updateMessPanelLayout.setHorizontalGroup(
            updateMessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateMessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateMessPanelLayout.setVerticalGroup(
            updateMessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateMessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("<html><b>Update</b>");

        jLabel2.setText("Update:");

        comboUpdate.setToolTipText("Select the attribute tht you wish to update.");
        comboUpdate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboUpdateItemStateChanged(evt);
            }
        });

        jLabel4.setText("Book ID:");

        tfUpdateID.setToolTipText("Enter the ID number of the book to update.");

        lNewValue.setText("New value:");

        tfNewValue.setToolTipText("Enter the new value for the attribut to update.");

        butUpdate.setText("Update");
        butUpdate.setToolTipText("Update the book's attribute");
        butUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUpdateActionPerformed(evt);
            }
        });

        butClearAll.setText("Clear all");
        butClearAll.setToolTipText("Clear text from all text fields and the text area.");
        butClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClearAllActionPerformed(evt);
            }
        });

        butClearTextPane.setText("Clear messages");
        butClearTextPane.setToolTipText("Remove the messages from the message area.");
        butClearTextPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClearTextPaneActionPerformed(evt);
            }
        });

        comboNewValue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboDewey1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDewey1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboDewey1ItemStateChanged(evt);
            }
        });

        comboDewey2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDewey2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboDewey2ItemStateChanged(evt);
            }
        });

        comboDewey3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(radDum)
                .addContainerGap(1087, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butClearTextPane)
                        .addGap(35, 35, 35)
                        .addComponent(butClearAll))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 637, Short.MAX_VALUE)
                                .addComponent(butUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lUpdateBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lID)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tfDeleteID, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(radFiction)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(radNonFiction))
                                                    .addComponent(comboUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(410, 410, 410)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfUpdateID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lNewValue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfNewValue, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                                            .addComponent(comboNewValue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboDewey1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboDewey2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboDewey3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butDelete))
                            .addComponent(jSeparator1))
                        .addGap(75, 75, 75)
                        .addComponent(updateMessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lUpdateBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lID)
                            .addComponent(tfDeleteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radFiction)
                            .addComponent(radNonFiction))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(tfUpdateID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNewValue)
                            .addComponent(butUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboDewey1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboDewey2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboDewey3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(updateMessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butClearAll)
                    .addComponent(butClearTextPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(radDum)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //get ID and deleting from database
    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        //same delete method for fiction and nonFiction
        Book book = new Book(Integer.parseInt(tfDeleteID.getText()));
        //title and author obtained from database in the constructor

        System.out.println("library.UpdateBookPanel.butDeleteActionPerformed(). book.toString(): " + book);

        if (book.deleteFromDatabase()) {
            driver.appendToPane(textPane, "Book deleted successfully.\n", Color.green);
        } else {
            driver.appendToPane(textPane, "Book could not be deleted.\n", Color.red);
        }
    }//GEN-LAST:event_butDeleteActionPerformed

    //get field to update and new value, then update the Book in the database
    private void butUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUpdateActionPerformed
        if (radFiction.isSelected()) {
            /*Object[] tempFields = {"Title", "Author", "First published",
            "Price", "Place bought", "Month bought", "Year bought",
            "Series", "Number in series", "Genre", "Type of book"};*/
            //fiction
            //<editor-fold defaultstate="collapsed" desc="fiction">
            Fiction book = new Fiction(Integer.parseInt(tfUpdateID.getText()));

            boolean success = false;
            String newValue = "";

            switch (comboUpdate.getSelectedIndex()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6: {
                    success = updateGeneralAttributes();
                    break;
                }
                case 7: {
                    //7 series
                    Series ser = new Series(comboNewValue.getSelectedItem().toString());

                    newValue = Integer.toString(ser.getId());

                    success = book.updateInDatabase(comboUpdate.getSelectedItem().toString(), newValue);

                    break;
                }
                case 8: {
                    //number in series
                    newValue = tfNewValue.getText();
                    success = book.updateInDatabase("noInSeries", newValue);
                    break;
                }
                case 9: {
                    //9 genre
                    Genre gen = new Genre(comboNewValue.getSelectedItem().toString());

                    newValue = Integer.toString(gen.getId());

                    success = book.updateInDatabase(comboUpdate.getSelectedItem().toString(), newValue);
                    break;
                }
                case 10: {
                    //10 type
                    BookType type = new BookType(comboNewValue.getSelectedItem().toString());

                    newValue = Integer.toString(type.getID());

                    success = book.updateInDatabase(comboUpdate.getSelectedItem().toString(), newValue);
                    break;
                }
                default: {
                    driver.errorMessageNormal("Please select an attribute to update.");
                    success = false;
                }
            }

            //inform user of success/failure
            if (success) {
                //success
                driver.appendToPane(textPane, "Book " + book.getID() + " updated successfully.\n", Color.green);
            } else {
                //fail
                driver.appendToPane(textPane, "Book " + book.getID() + " could not be updated.\n", Color.red);
            }
            //</editor-fold>

        } else if (radNonFiction.isSelected()) {
            //nonFiction
            //<editor-fold defaultstate="collapsed" desc="nonFiction">
            /*Object[] tempFields = {"Title", "Author",
                "First published", "Price", "Place bought",
                "Month bought", "Year bought", "Dewey Number"};*/
            NonFiction book = new NonFiction(Integer.parseInt(tfUpdateID.getText()));

            boolean success = false;

            DefaultComboBoxModel temp = (DefaultComboBoxModel) comboUpdate.getModel();

            if (comboUpdate.getSelectedIndex() == temp.getIndexOf("Dewey Number")) {
                //dewey number

                //get new dewey number
                int deweyNumber = comboDewey1.getSelectedIndex() * 100
                        + comboDewey2.getSelectedIndex() * 10
                        + comboDewey3.getSelectedIndex();

                //execute update
                success = book.updateInDatabase("deweyNumber", Integer.toString(deweyNumber));

            } else {
                //not dewey number
                success = updateGeneralAttributes();
            }

            //inform user
            if (success) {
                //success
                driver.appendToPane(textPane, "Book " + book.getID() + " updated successfully.\n", Color.green);
            } else {
                //fail
                driver.appendToPane(textPane, "Book  " + book.getID() + "could not be updated.\n", Color.red);
            }
//</editor-fold>
        } else {
            //niether selected
            driver.errorMessageNormal("Please select either fiction or non-fiction.");
        }
    }//GEN-LAST:event_butUpdateActionPerformed

//clear all text
    private void butClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearAllActionPerformed
        textPane.setText("");
        tfDeleteID.setText("");
        tfNewValue.setText("");
        tfUpdateID.setText("");
        radDum.setSelected(true);
    }//GEN-LAST:event_butClearAllActionPerformed

    //clear messages from textPane
    private void butClearTextPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearTextPaneActionPerformed
        textPane.setText("");
    }//GEN-LAST:event_butClearTextPaneActionPerformed

    private void radFictionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radFictionItemStateChanged
        setComboUpdateModel();
    }//GEN-LAST:event_radFictionItemStateChanged

    //set combos and textFields eidtable or enabled depending on what is selected.
    private void comboUpdateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboUpdateItemStateChanged
        String item = comboUpdate.getSelectedItem().toString();
        switch (item) {
            case "Author": {
                comboNewValue.setModel(driver.getComboBoxModel(6));
                comboNewValue.setEditable(true);
                AutoCompletion.enable(comboNewValue);

                comboNewValue.setVisible(true);
                comboDewey1.setVisible(false);
                comboDewey2.setVisible(false);
                comboDewey3.setVisible(false);
                tfNewValue.setEditable(false);
                tfNewValue.setBackground(Color.gray);
                break;
            }
            case "Genre": {
                //genre
                comboNewValue.setModel(driver.getComboBoxModel(1));
                comboNewValue.setVisible(true);
                comboNewValue.setEditable(false);

                comboDewey1.setVisible(false);
                comboDewey2.setVisible(false);
                comboDewey3.setVisible(false);
                tfNewValue.setEditable(false);
                tfNewValue.setBackground(Color.gray);
                break;
            }
            case "Type of book": {
                //type of book
                comboNewValue.setModel(driver.getComboBoxModel(2));
                comboNewValue.setVisible(true);
                comboNewValue.setEditable(false);

                comboDewey1.setVisible(false);
                comboDewey2.setVisible(false);
                comboDewey3.setVisible(false);
                tfNewValue.setEditable(false);
                tfNewValue.setBackground(new Color(214, 217, 223));
                break;
            }
            case "Series": {
                comboNewValue.setModel(driver.getComboBoxModel(5));
                comboNewValue.setEditable(true);
                AutoCompletion.enable(comboNewValue);

                comboNewValue.setVisible(true);
                comboDewey1.setVisible(false);
                comboDewey2.setVisible(false);
                comboDewey3.setVisible(false);
                tfNewValue.setEditable(false);
                tfNewValue.setBackground(Color.gray);
                break;
            }
            case "Place bought": {
                //shop
                comboNewValue.setModel(driver.getComboBoxModel(0));
                comboNewValue.setVisible(true);
                comboNewValue.setEditable(false);

                comboDewey1.setVisible(false);
                comboDewey2.setVisible(false);
                comboDewey3.setVisible(false);
                tfNewValue.setEditable(false);
                tfNewValue.setBackground(new Color(214, 217, 223));
                break;
            }
            case "Dewey Number": {
                //set dewey combos
                comboDewey1.setModel(driver.getComboBoxModel(3));
                comboDewey1.setVisible(true);
                comboDewey2.setVisible(true);
                comboDewey3.setVisible(true);
                comboNewValue.setVisible(false);
                comboNewValue.setEditable(false);

                tfNewValue.setEditable(false);
                tfNewValue.setBackground(new Color(214, 217, 223));
                break;
            }
            default: {
                tfNewValue.setEditable(true);
                tfNewValue.setBackground(Color.white);
                comboDewey1.setVisible(false);
                comboDewey2.setVisible(false);
                comboDewey3.setVisible(false);
                comboNewValue.setVisible(false);
                comboNewValue.setEditable(false);

                break;
            }
        }
    }//GEN-LAST:event_comboUpdateItemStateChanged

    private void comboDewey1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboDewey1ItemStateChanged
        //get dewey level 1 number
        int dew1 = comboDewey1.getSelectedIndex() * 100;

        //set model for dewey2
        DefaultComboBoxModel model = driver.getDewey2Model(dew1, comboDewey1.getSelectedItem());

        //set dew2's model
        comboDewey2.setModel(model);
    }//GEN-LAST:event_comboDewey1ItemStateChanged

    private void comboDewey2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboDewey2ItemStateChanged
        //get dewey level 2 number
        int dew2 = (comboDewey1.getSelectedIndex() * 100) + comboDewey2.getSelectedIndex() * 10;

        //set model for dewey3
        comboDewey3.setModel(driver.getDewey3Model(dew2, comboDewey2.getSelectedItem()));
    }//GEN-LAST:event_comboDewey2ItemStateChanged

    //set model of comboUpdate depending on whether fiction or nonFiction is selected
    private void setComboUpdateModel() {
        Object[] fields;

        if (radDum.isSelected() || radFiction.isSelected()) {
            //set to fiction Fields
            Object[] tempFields = {"Title", "Author", "First published",
                "Price", "Place bought", "Month bought", "Year bought",
                "Series", "Number in series", "Genre", "Type of book"};

            fields = tempFields;
        } else {
            //set to nonFiction fields
            Object[] tempFields = {"Title", "Author",
                "First published", "Price", "Place bought",
                "Month bought", "Year bought", "Dewey Number"};
            fields = tempFields;
        }

        //create comboBoxModel and set model
        DefaultComboBoxModel model = new DefaultComboBoxModel(fields);
        comboUpdate.setModel(model);
    }

    //get field name given index selected in comboBox
    private String getSelectedField(int x) {
        if (radFiction.isSelected()) {
            //set to fiction Fields
            String[] tempFields = {"Title", "Author", "Series", "NoInSeries",
                "FirstPublished", "Genre", "TypeOfBook", "Price", "PlaceBought",
                "Mnth", "Yr"};

            return tempFields[x];
        } else if (radNonFiction.isSelected()) {
            //set to nonFiction fields
            String[] tempFields = {"Title", "Author", "DeweyNumber",
                "FirstPublished", "Price", "PlaceBought",
                "Mnth", "Yr"};
            return tempFields[x];
        } else {
            driver.errorMessageNormal("Please select fiction or non-fiction.");
            return null;
        }
    }

    /**
     * Update a book's attributes in the database.
     *
     * @return boolean indicating successful update
     */
    private boolean updateGeneralAttributes() {
        //get attribute to update
        String field = comboUpdate.getSelectedItem().toString();

        //get new value
        String newValue;
        if (field.equals("Author")) {
            //You will have to re-think updating authors completely
            newValue = comboUpdate.getSelectedItem().toString();
        } else if (field.equals("Place bought")) {
            Shop shop = new Shop(comboNewValue.getSelectedItem().toString());

            newValue = Integer.toString(shop.getID());

        } else {
            newValue = tfNewValue.getText();
        }

        //create book
        Book book = new Book(Integer.parseInt(tfUpdateID.getText()));

        if (book.updateInDatabase(field, newValue)) {
            appendToPane(textPane, "The book " + book.getID() + " was updated successfully.\n", Color.green);
            return true;
        } else {
            appendToPane(textPane, "The book " + book.getID() + " was could not be updated.\n", Color.red);
            return false;
        }

    }

    /**
     * Add text to JTextPane for messages
     *
     * @param tp JTextPane to add text tor
     * @param msg Text to be added
     * @param c Colour of text
     */
    private void appendToPane(JTextPane tp, String msg, Color c) {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butClearAll;
    private javax.swing.JButton butClearTextPane;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butUpdate;
    private javax.swing.JComboBox comboDewey1;
    private javax.swing.JComboBox comboDewey2;
    private javax.swing.JComboBox comboDewey3;
    private javax.swing.JComboBox comboNewValue;
    private javax.swing.JComboBox comboUpdate;
    private javax.swing.ButtonGroup groupUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lID;
    private javax.swing.JLabel lNewValue;
    private javax.swing.JLabel lUpdateBook;
    private javax.swing.JRadioButton radDum;
    private javax.swing.JRadioButton radFiction;
    private javax.swing.JRadioButton radNonFiction;
    private javax.swing.JTextPane textPane;
    private javax.swing.JTextField tfDeleteID;
    private javax.swing.JTextField tfNewValue;
    private javax.swing.JTextField tfUpdateID;
    private javax.swing.JPanel updateMessPanel;
    // End of variables declaration//GEN-END:variables
    private Driver driver = null;
}
