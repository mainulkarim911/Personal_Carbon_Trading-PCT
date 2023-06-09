/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mainul Karim
 */
public class FXML1Controller implements Initializable {

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
    private TextField t7;

    @FXML
    private TextField t8;

    @FXML
    private TextField t9;

    @FXML
    private TextField t10;
    
    @FXML
    private TextField t11;

    @FXML
    private TextArea a1;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;

    @FXML
    private MenuButton b3;

    @FXML
    private CheckBox c1;

    @FXML
    private CheckBox c2;

    @FXML
    private CheckBox c3;

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
        if (PCT.flag == 0) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                Parent root = (Parent) loader.load();
                FXMLDocumentController secController = loader.getController();
                secController.F1();
                secController.F3();
                Scene scene2 = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(scene2);
                window.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            l3.setVisible(true);
            l2.setVisible(false);
            l1.setVisible(false);
        }
    }

    @FXML
    private void handleButtonAction4(ActionEvent event) throws Exception {
        if (PCT.flag == 0) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML2.fxml"));
                Parent root = (Parent) loader.load();
                FXML1Controller secController = loader.getController();
                secController.F2();
                Scene scene2 = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(scene2);
                window.show();
            } catch (Exception e) {
                System.out.println(e);
                //e.printStackTrace();
            }
        } else {
            l2.setVisible(true);
            l3.setVisible(false);
            l1.setVisible(false);
        }

    }

    @FXML
    private void handleButtonAction5(ActionEvent event) throws Exception {
        try {

            FileWriter f1 = new FileWriter("SignUp.txt", true);
            BufferedWriter w1 = new BufferedWriter(f1);
            if (t4.getText() == null ? t5.getText() != null : !t4.getText().equals(t5.getText())) {
                l1.setVisible(true);
                l2.setVisible(false);
                l3.setVisible(false);
            } else {
                l1.setVisible(false);
                l2.setVisible(false);
                l3.setVisible(false);
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
    private void handleButtonAction6(ActionEvent event) throws Exception {
        PCT.flag = 1;
        Parent root2 = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene2 = new Scene(root2);
        Stage window = (Stage) ((Node) b3).getScene().getWindow();
        window.setScene(scene2);
        window.show();

    }

    @FXML
    private void handleButtonAction7(ActionEvent event) throws Exception {
        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter fileExtensions = new FileChooser.ExtensionFilter("Photo or Video", "*.jpg", "*.png", "*.mp4");
        fc.getExtensionFilters().add(fileExtensions);
        List<File> sf = fc.showOpenMultipleDialog(null);
        for (int i = 0; i < sf.size(); i++) {
            PCT.a1.add(sf.get(i).getAbsolutePath());
            System.out.println(sf.get(i).getPath());
        }

    }

    @FXML
    private void handleButtonAction8(ActionEvent event) throws Exception {
        if (event.getSource() == c1 && flag1 == 0) {
            c2.setDisable(true);
            c3.setDisable(true);
            flag1 = 1;
            size = "12";
        } else if (event.getSource() == c1 && flag1 == 1) {
            c2.setDisable(false);
            c3.setDisable(false);
            flag1 = 0;
        }
    }

    @FXML
    private void handleButtonAction9(ActionEvent event) throws Exception {
        if (event.getSource() == c2 && flag1 == 0) {
            c1.setDisable(true);
            c3.setDisable(true);
            flag1 = 1;
            size = "24";
        } else if (event.getSource() == c2 && flag1 == 1) {
            c1.setDisable(false);
            c3.setDisable(false);
            flag1 = 0;
        }
    }

    @FXML
    private void handleButtonAction10(ActionEvent event) throws Exception {
        if (event.getSource() == c3 && flag1 == 0) {
            c1.setDisable(true);
            c2.setDisable(true);
            flag1 = 1;
            size = "48";
        } else if (event.getSource() == c3 && flag1 == 1) {
            c1.setDisable(false);
            c2.setDisable(false);
            flag1 = 0;
        }
    }

    @FXML
    private void handleButtonAction11(ActionEvent event) throws Exception {

        try {
            if (t6.getText().isEmpty() || t7.getText().isEmpty() || t8.getText().isEmpty() || t9.getText().isEmpty() || t10.getText().isEmpty() || a1.getText().isEmpty() || PCT.a1.get(0).isEmpty() || flag1 == 0) {

                if (t6.getText().isEmpty()) {
                    l4.setText("Please Enter NID NO");
                    l4.setVisible(true);
                    System.out.println(l4.getText());
                } else if (t7.getText().isEmpty()) {
                    l4.setText("Please Enter Phone Number");
                    l4.setVisible(true);
                    System.out.println(l4.getText());
                } else if (t8.getText().isEmpty()) {
                    l4.setText("Please Enter Google Location");
                    l4.setVisible(true);
                    System.out.println(l4.getText());
                } else if (t9.getText().isEmpty()) {
                    l4.setText("Please Enter Number of Trees");
                    l4.setVisible(true);
                    System.out.println(l4.getText());
                } else if (t10.getText().isEmpty()) {
                    l4.setText("Please Enter Name or Type of Tree");
                    l4.setVisible(true);
                    System.out.println(l4.getText());
                } else if (flag1 == 0) {
                    l4.setText("Please Enter the Size of Tree");
                    l4.setVisible(true);
                    System.out.println(l4.getText());
                } else if (PCT.a1.get(0).isEmpty()) {
                    l4.setText("Please Enter Photo or Video");
                    l4.setVisible(true);
                    System.out.println(l4.getText());
                } else if (a1.getText().isEmpty()) {
                    l4.setText("Please Enter Detail Information");
                    l4.setVisible(true);
                    System.out.println(l4.getText());
                }

            } else {
                System.out.println("Hi");
                l4.setVisible(false);
                arraysize = PCT.a1.size();
                try {
                    FileWriter f2 = new FileWriter("Ad.txt", true);
                    BufferedWriter w2 = new BufferedWriter(f2);
                    
                    FileWriter f3 = new FileWriter("Ad1.txt", true);
                    BufferedWriter w3 = new BufferedWriter(f3);
                    
                    FileWriter f4 = new FileWriter("Ad_ID.txt", true);
                    BufferedWriter w4 = new BufferedWriter(f4);
                    
                    FileReader f5 = new FileReader("Ad_ID.txt");
                    BufferedReader r5 = new BufferedReader(f5);

                    w2.write(PCT.username + " ######Alhamdulillah " + t6.getText() + " ######Alhamdulillah " + t7.getText() + " ######Alhamdulillah " + t8.getText() + " ######Alhamdulillah " + t9.getText() + " ######Alhamdulillah " + t10.getText() + " ######Alhamdulillah " + size);
                    for (int i = 0; i < arraysize; i++) {
                        w2.write(" ######Alhamdulillah " + PCT.a1.get(i));
                    }
                    w2.write("\n");
                    w2.close();
                    
                    if (f5 == null) {
                        System.out.println("hada");
                        w3.write("######Alhamdulillah " + ID + " ######Alhamdulillah" + "\n" + a1.getText() + "\n" + "######Alhamdulillah " + ID + " ######AlhamdulillahEnd" + "\n");
                        w3.close();
                    }
                    else{
                        String string;
                        while((string=r5.readLine())!=null){
                            String A44[] = string.split(" ");
                             id1 = Integer.parseInt(A44[1])+1;
                        }
                        w3.write("######Alhamdulillah " + id1 + " ######Alhamdulillah" + "\n" + a1.getText() + "\n" + "######Alhamdulillah " + id1 + " ######AlhamdulillahEnd" + "\n" );
                        w3.close();
                    }

                    if (f5 == null) {
                        w4.write("######Alhamdulillah " + ID + " ######Alhamdulillah" + "\n");
                        w4.close();
                    }
                    else{
                        String string;
                        while((string=r5.readLine())!=null){
                            String A44[] = string.split(" ");
                             id1 = Integer.parseInt(A44[1])+1;
                        }
                        w4.write("######Alhamdulillah " + id1 + " ######Alhamdulillah" + "\n");
                        w4.close();
                    }
                    r5.close();

                    PCT.a1.clear();
                } catch (Exception e) {
                    System.out.println("Error");
                }

                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                Parent root = (Parent) loader.load();
                FXMLDocumentController secController = loader.getController();
                secController.F1();
                secController.F3();
                Scene scene2 = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(scene2);
                window.show();

            }

        } catch (Exception e) {
            l4.setText("Please Enter Photo or Video");
            l4.setVisible(true);
            System.out.println(l4.getText());
        }

    }
    
    @FXML
    private void handleButtonAction12(ActionEvent event) throws Exception {
        try {
            flag_search = 0;
            if (t11.getText().isEmpty()) {
                System.out.println("Search Bar Empty");
            } else {
                F0();
                FXML_C_04Controller .flag4 = 0;
                FXML_C_04Controller .flag5 = -1;
                FXML_C_04Controller .flag6 = 1;
                FXML_C_04Controller .i = 0;
                FXML_C_04Controller .j = 0;
                FXML_C_04Controller .m = 1;
                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_C_04.fxml"));
                Parent root = (Parent) loader.load();
                FXML_C_04Controller secController = loader.getController();
                secController.F5();
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

            x = Integer.parseInt(t11.getText());
            t11.setText(null);

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

    public void F2() {
        b3.setText("Hi, " + PCT.name);
    }

    int flag1 = 0, arraysize,id1;
    String size;
    static int ID = 111;
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
