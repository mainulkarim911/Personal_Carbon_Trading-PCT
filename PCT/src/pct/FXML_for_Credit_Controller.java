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
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import static pct.FXML3Controller.flag_search;

/**
 * FXML Controller class
 *
 * @author Mainul Karim
 */
public class FXML_for_Credit_Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private ImageView iv1;

    @FXML
    private Image i1;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;

    @FXML
    private Label l5;

    @FXML
    private Label l6;

    @FXML
    private Label l7;

    @FXML
    private Label l8;

    @FXML
    private Label l9;
    
    @FXML
    private TextField t1;

    @FXML
    private TextArea ta1;

    @FXML
    private void handleButtonAction1(ActionEvent event) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML3.fxml"));
            Parent root = (Parent) loader.load();
            FXML3Controller secController = loader.getController();
            FXML3Controller.flag4 = 0;
            FXML3Controller.flag5 = -1;
            FXML3Controller.flag6 = 1;
            FXML3Controller.i = 0;
            FXML3Controller.j = 0;
            FXML3Controller.m = 1;
            secController.F3();
            Scene scene2 = new Scene(root);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();
            System.out.println(event.getSource());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void handleButtonAction2(ActionEvent event) throws Exception {
        Parent root2 = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene2 = new Scene(root2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();

    }

    @FXML
    private void handleButtonAction3(ActionEvent event) throws Exception {
        Parent root2 = FXMLLoader.load(getClass().getResource("FXML1.fxml"));
        Scene scene2 = new Scene(root2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();

    }
    
    @FXML
    private void handleButtonAction11(ActionEvent event) throws Exception {
        try {
            flag_search = 0;
            if (t1.getText().isEmpty()) {
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
                secController.F9();
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

            x = Integer.parseInt(t1.getText());
            t1.setText(null);

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

    public void F1() throws Exception {
        try {
            i1 = new Image("/pct/Photos/Tree_02.jpg");
            iv1.setImage(i1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void F3() throws Exception {
        try {
            i1 = new Image("/pct/Photos/Tree_01.jpg");
            iv1.setImage(i1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void F4() throws Exception {
        try {
            i1 = new Image("/pct/Photos/Tree_03.jpg");
            iv1.setImage(i1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void F2() throws Exception {
        try {

            int x = FXML3Controller.flag7;
            FileReader f3 = new FileReader("Ad.txt");
            BufferedReader r2 = new BufferedReader(f3);

            FileReader f7 = new FileReader("Ad_ID.txt");
            BufferedReader r7 = new BufferedReader(f7);

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
            ta1.setText(null);
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

                flag3 = 1;

            }
            r2.close();

            if (flag3 == 1) {
                ta1.setText(null);
                int Credit;
                String Id = id.get(x);
                String Id_end = id.get(x) + "End";
                Credit = (Integer.parseInt(n.get(x)) * Integer.parseInt(s.get(x))) / 48;
                File file3 = new File(p.get(x));
                i1 = new Image(file3.toURI().toString());
                iv1.setImage(i1);
                l1.setText("Credit: " + Credit);
                l2.setText("NID No: " + nid.get(x));
                l3.setText("Phone Number: " + phone.get(x));
                l4.setText("Tree Name/Type: " + name.get(x));
                l5.setText("Number of Tree: " + n.get(x));
                if (Integer.parseInt(s.get(x)) == 12) {
                    l6.setText("Tree Size: Small");
                } else if (Integer.parseInt(s.get(x)) == 24) {
                    l6.setText("Tree Size: Medium");
                } else if (Integer.parseInt(s.get(x)) == 48) {
                    l6.setText("Tree Size: Large");
                }
                l7.setText("Credit: " + Credit);
                l8.setText("Googe Location: " + location.get(x));
                l9.setText("Email: " + email.get(x));

                FileReader f4 = new FileReader("Ad1.txt");
                BufferedReader r3 = new BufferedReader(f4);

                while ((l = r3.readLine()) != null) {
                    if (flag4 == 1) {
                        detail.add(l);
                    }
                    if (Id.compareTo(l) == 0) {
                        flag4 = 1;
                    } else if (Id_end.compareTo(l) == 0) {
                        flag4 = 0;
                        int y;
                        y = detail.size() - 1;
                        detail.remove(y);

                    }

                }
                r3.close();

                ta1.appendText("Detail: ");

                for (int j = 0; j < detail.size(); j++) {
                    ta1.appendText(detail.get(j) + "\n");
                }

            } else {
                if (FXML3Controller.flag7 == 0) {
                    F1();
                } else if (FXML3Controller.flag7 == -1) {
                    F3();
                } else if (FXML3Controller.flag7 == 1) {
                    F4();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void F5() throws Exception {
        try {

            int x = FXML_for_Credit_03Controller.flag7;
            FileReader f3 = new FileReader("Search.txt");
            BufferedReader r2 = new BufferedReader(f3);

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

            ta1.setText("Detail: Unknown");
            String k, l, m;

            while ((k = r2.readLine()) != null) {
                String A[] = k.split(" ######Alhamdulillah ");
                nid.add(A[0]);
                phone.add(A[1]);
                name.add(A[2]);
                n.add(A[3]);
                s.add(A[4]);
                credit.add(A[5]);
                location.add(A[6]);
                email.add(A[7]);
                p.add(A[8]);
                flag3 = 1;

            }
            r2.close();

            if (flag3 == 1) {
                File file3 = new File(p.get(x));
                i1 = new Image(file3.toURI().toString());
                iv1.setImage(i1);
                l1.setText("Credit: " + credit.get(x));
                l2.setText("NID No: " + nid.get(x));
                l3.setText("Phone Number: " + phone.get(x));
                l4.setText("Tree Name/Type: " + name.get(x));
                l5.setText("Number of Tree: " + n.get(x));
                if (Integer.parseInt(s.get(x)) == 12) {
                    l6.setText("Tree Size: Small");
                } else if (Integer.parseInt(s.get(x)) == 24) {
                    l6.setText("Tree Size: Medium");
                } else if (Integer.parseInt(s.get(x)) == 48) {
                    l6.setText("Tree Size: Large");
                }
                l7.setText("Credit: " + credit.get(x));
                l8.setText("Googe Location: " + location.get(x));
                l9.setText("Email: " + email.get(x));

            } else {
                if (FXML_for_Credit_03Controller.flag7 == 0) {
                    F1();
                } else if (FXML_for_Credit_03Controller.flag7 == -1) {
                    F3();
                } else if (FXML_for_Credit_03Controller.flag7 == 1) {
                    F4();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    
    public ArrayList<String> credit = new ArrayList<String>();
    

}
