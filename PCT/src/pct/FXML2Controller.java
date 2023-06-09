/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mainul Karim
 */
public class FXML2Controller implements Initializable {

    @FXML
    private TextField t1;

    @FXML
    private TextField t2;

    @FXML
    private TextField t3;

    @FXML
    private TextField t4;

    @FXML
    private TextField t5;
    
    @FXML
    private TextField t6;

    @FXML
    private Label l1;

    @FXML
    private void handleButtonAction1(ActionEvent event) throws Exception {
        Parent root2 = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene2 = new Scene(root2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();

    }

    @FXML
    private void handleButtonAction2(ActionEvent event) throws Exception {
        Parent root2 = FXMLLoader.load(getClass().getResource("FXML1.fxml"));
        Scene scene2 = new Scene(root2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();

    }

    @FXML
    private void handleButtonAction3(ActionEvent event) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML3.fxml"));
            Parent root = (Parent) loader.load();
            FXML3Controller secController = loader.getController();
            secController.F3();
            Scene scene2 = new Scene(root);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();
            System.out.println(event.getSource());
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    private void handleButtonAction4(ActionEvent event) throws Exception {
        try {

            FileWriter f1 = new FileWriter("SignUp.txt", true);
            BufferedWriter w1 = new BufferedWriter(f1);
            if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty()) {
                if (t1.getText().isEmpty()) {
                    l1.setText("Please Enter First Name");
                    l1.setVisible(true);
                    System.out.println(l1.getText());
                } else if (t2.getText().isEmpty()) {
                    l1.setText("Please Enter Last Name");
                    l1.setVisible(true);
                    System.out.println(l1.getText());
                } else if (t3.getText().isEmpty()) {
                    l1.setText("Please Enter Email Address");
                    l1.setVisible(true);
                    System.out.println(l1.getText());
                } else if (t4.getText().isEmpty()) {
                    l1.setText("Please Enter Password");
                    l1.setVisible(true);
                    System.out.println(l1.getText());
                } else if (t5.getText().isEmpty()) {
                    l1.setText("Please Enter Password Again to Conirm");
                    l1.setVisible(true);
                    System.out.println(l1.getText());
                }

            }else if (t4.getText() == null ? t5.getText() != null : !t4.getText().equals(t5.getText())) {
                l1.setText("Those passwords didn't match . Try again");
                l1.setVisible(true);
            } else {
                l1.setVisible(false);
                w1.write(t1.getText() + " " + t2.getText() + " " + t3.getText() + " " + t4.getText() + "\n");
                w1.close();
                Parent root2 = FXMLLoader.load(getClass().getResource("FXML.fxml"));
                Scene scene2 = new Scene(root2);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(scene2);
                window.show();

            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
    @FXML
    private void handleButtonAction11(ActionEvent event) throws Exception {
        try {
            flag_search = 0;
            if (t6.getText().isEmpty()) {
                System.out.println("Search Bar Empty");
            } else {
                F0();
                FXML_for_Credit_03Controller.flag4 = 0;
                FXML_for_Credit_03Controller.flag5 = -1;
                FXML_for_Credit_03Controller.flag6 = 1;
                FXML_for_Credit_03Controller.i = 0;
                FXML_for_Credit_03Controller.j = 0;
                FXML_for_Credit_03Controller.m = 1;
                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_for_Credit_03.fxml"));
                Parent root = (Parent) loader.load();
                FXML_for_Credit_03Controller secController = loader.getController();
                secController.F7();
                Scene scene2 = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(scene2);
                window.show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void F0() {
        try {

            x = Integer.parseInt(t6.getText());
            t6.setText(null);

            FileReader f3 = new FileReader("Ad.txt");
            BufferedReader r2 = new BufferedReader(f3);

            FileReader f7 = new FileReader("Ad_ID.txt");
            BufferedReader r7 = new BufferedReader(f7);

            FileWriter f8 = new FileWriter("Search.txt");
            BufferedWriter w8 = new BufferedWriter(f8);

            id.clear();
            nid.clear();
            phone.clear();
            location.clear();
            email.clear();
            name.clear();
            n.clear();
            s.clear();
            p.clear();
            n.clear();
            s.clear();
            detail.clear();
            String k, l, m;

            while ((m = r7.readLine()) != null) {
                id.add(m);

            }
            r7.close();

            while ((k = r2.readLine()) != null) {
                String A[] = k.split(" ######Alhamdulillah ");
                email.add(A[0]);
                nid.add(A[1]);
                phone.add(A[2]);
                location.add(A[3]);
                n.add(A[4]);
                name.add(A[5]);
                s.add(A[6]);
                p.add(A[7]);

                flag2 = 1;

            }
            r2.close();

            if (flag2 == 1) {
                flag2 = 0;
                int Credit, sizeofn, sizeofs, sizeofp;
                sizeofn = n.size();
                sizeofs = s.size();
                sizeofp = p.size();

                for (int r = 0; r < sizeofn; r++) {
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if (Credit == x) {
                        flag_search = 1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n");
                    }
                }

                for (int r = 0; r < sizeofn; r++) {
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if ((Credit <= x + 1 && Credit != x && Credit >= x - 1)) {
                        flag_search = 1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n");
                    }
                }

                for (int r = 0; r < sizeofn; r++) {
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if ((Credit <= x + 2 && Credit != x && Credit != x + 1 && Credit != x - 1 && Credit >= x - 2)) {
                        flag_search = 1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n");
                    }
                }

                for (int r = 0; r < sizeofn; r++) {
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if ((Credit <= x + 3 && Credit != x && Credit != x + 1 && Credit != x - 1 && Credit != x + 2 && Credit != x - 2 && Credit >= x - 3)) {
                        flag_search = 1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n");
                    }
                }

                for (int r = 0; r < sizeofn; r++) {
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if ((Credit <= x + 4 && Credit != x && Credit != x + 1 && Credit != x - 1 && Credit != x + 2 && Credit != x - 2 && Credit != x + 3 && Credit != x - 3 && Credit >= x - 4)) {
                        flag_search = 1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n");
                    }
                }

                for (int r = 0; r < sizeofn; r++) {
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if ((Credit <= x + 5 && Credit != x && Credit != x + 1 && Credit != x - 1 && Credit != x + 2 && Credit != x - 2 && Credit != x + 3 && Credit != x - 3 && Credit != x + 4 && Credit != x - 4 && Credit >= x - 5)) {
                        flag_search = 1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n");
                    }
                }

                for (int r = 0; r < sizeofn; r++) {
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if ((Credit <= x + 6 && Credit != x && Credit != x + 1 && Credit != x - 1 && Credit != x + 2 && Credit != x - 2 && Credit != x + 3 && Credit != x - 3 && Credit != x + 4 && Credit != x - 4 && Credit != x + 5 && Credit != x - 5 && Credit >= x - 6)) {
                        flag_search = 1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n");
                    }
                }

                w8.close();
                System.out.println("Done");

            } else {
                flag2 = 0;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<String> id = new ArrayList<String>();
    public ArrayList<String> nid = new ArrayList<String>();
    public ArrayList<String> phone = new ArrayList<String>();
    public ArrayList<String> location = new ArrayList<String>();
    public ArrayList<String> email = new ArrayList<String>();
    public ArrayList<String> name = new ArrayList<String>();
    public ArrayList<String> p = new ArrayList<String>();
    public ArrayList<String> n = new ArrayList<String>();
    public ArrayList<String> s = new ArrayList<String>();
    public ArrayList<String> detail = new ArrayList<String>();
    int flag2 = 0, flag3 = 0, x = 0;
    String d = "/pct/Photos/Tree_02.jpg";
    static int flag4 = 0, flag5 = -1, flag6 = 1, flag7, flag_search = 0;
    static int i = 0, j = 0, m = 1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
