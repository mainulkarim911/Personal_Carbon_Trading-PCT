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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import static pct.FXML3Controller.flag_search;

/**
 * FXML Controller class
 *
 * @author Mainul Karim
 */
public class FXML_for_Credit_03Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    private ImageView iv1;

    @FXML
    private ImageView iv3;

    @FXML
    private ImageView iv2;

    @FXML
    private Image i1;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private TextField t1;
    
    @FXML
    private Label l_search;
    
    @FXML
    private Button bb1;

    @FXML
    private Button bb2;
    
    @FXML
    private Button bb3;

    @FXML
    private Button bb4;
    
    @FXML
    private AnchorPane a2;
    
    @FXML
    private AnchorPane a3;
    
    @FXML
    private AnchorPane a1;

    @FXML
    private WebView webview;

    @FXML
    private void handleButtonAction1(ActionEvent event) throws Exception {
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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void handleButtonAction2(ActionEvent event) throws Exception {
        try {
            Parent root2 = FXMLLoader.load(getClass().getResource("FXML.fxml"));
            Scene scene2 = new Scene(root2);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();
        } catch (Exception e) {
        }

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
    private void handleButtonAction4(ActionEvent event) throws Exception {
        try {

            File file = new File(d);
            i1 = new Image(file.toURI().toString());
            iv1.setImage(i1);
            iv3.setImage(i1);
            iv2.setImage(i1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void handleButtonAction5(ActionEvent event) throws Exception {
        System.out.println("Facebook");
        final WebEngine fb = webview.getEngine();
        String urlweb = "https://www.facebook.com";
        fb.load(urlweb);
    }

    @FXML
    private void handleButtonAction6(ActionEvent event) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_for_Credit.fxml"));
            Parent root = (Parent) loader.load();
            FXML_for_Credit_Controller secController = loader.getController();
            flag7 = flag4;
            secController.F5();
            Scene scene2 = new Scene(root);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    private void handleButtonAction7(ActionEvent event) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_for_Credit.fxml"));
            Parent root = (Parent) loader.load();
            FXML_for_Credit_Controller secController = loader.getController();
            flag7 = flag6;
            secController.F5();
            Scene scene2 = new Scene(root);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    private void handleButtonAction8(ActionEvent event) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_for_Credit.fxml"));
            Parent root = (Parent) loader.load();
            FXML_for_Credit_Controller secController = loader.getController();
            flag7 = flag5;
            secController.F5();
            Scene scene2 = new Scene(root);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    private void handleButtonAction9(ActionEvent event) throws Exception {
        try {
            i++;
            j++;
            m++;
            n.clear();
            s.clear();
            p.clear();

            FileReader f3 = new FileReader("Search.txt");
            BufferedReader r2 = new BufferedReader(f3);

            String k;

            while ((k = r2.readLine()) != null) {
                String A[] = k.split(" ######Alhamdulillah ");
                credit.add(A[5]);
                p.add(A[8]);
                flag3 = 1;
                System.out.println(p.get(0));
            }
            r2.close();

            if (flag3 == 1) {
                flag3 = 0;
                int sizeofp;
                sizeofp = p.size();

                if (i >= sizeofp) {
                    i = 0;
                    l2.setText("Credit: " + credit.get(i));
                    File file1 = new File(p.get(i));
                    i1 = new Image(file1.toURI().toString());
                    iv2.setImage(i1);
                    flag4 = 0;
                } else {
                    l2.setText("Credit: " + credit.get(i));
                    File file1 = new File(p.get(i));
                    i1 = new Image(file1.toURI().toString());
                    iv2.setImage(i1);
                    flag4 = i;
                }

                if (j >= sizeofp) {
                    j = 0;
                    l1.setText("Credit: " + credit.get(j));
                    File file3 = new File(p.get(j));
                    i1 = new Image(file3.toURI().toString());
                    iv1.setImage(i1);
                    flag5 = 0;
                } else {
                    System.out.println(sizeofp);
                    l1.setText("Credit: " + credit.get(j));
                    File file3 = new File(p.get(j));
                    i1 = new Image(file3.toURI().toString());
                    iv1.setImage(i1);
                    System.out.println(j);
                    flag5 = j;
                }

                if (m >= sizeofp) {
                    m = 0;
                    l3.setText("Credit: " + credit.get(m));
                    File file2 = new File(p.get(m));
                    i1 = new Image(file2.toURI().toString());
                    iv3.setImage(i1);
                    flag6 = 0;
                } else {
                    l3.setText("Credit: " + credit.get(m));
                    File file2 = new File(p.get(m));
                    i1 = new Image(file2.toURI().toString());
                    iv3.setImage(i1);
                    flag6 = m;
                }

            } else {
                flag3 = 0;
                F4();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleButtonAction10(ActionEvent event) throws Exception {
        try {
            i--;
            j--;
            m--;
            n.clear();
            s.clear();
            p.clear();

            FileReader f3 = new FileReader("Search.txt");
            BufferedReader r2 = new BufferedReader(f3);

            String k;

            while ((k = r2.readLine()) != null) {
                String A[] = k.split(" ######Alhamdulillah ");
                credit.add(A[5]);
                p.add(A[8]);
                flag3 = 1;
                System.out.println(p.get(0));
            }
            r2.close();

            if (flag3 == 1) {
                flag3 = 0;
                int sizeofp;
                sizeofp = p.size();

                if (i < 0) {
                    i = sizeofp - 1;
                    l2.setText("Credit: " + credit.get(i));
                    File file1 = new File(p.get(i));
                    i1 = new Image(file1.toURI().toString());
                    iv2.setImage(i1);
                    flag4 = 0;
                } else {
                    l2.setText("Credit: " + credit.get(i));
                    File file1 = new File(p.get(i));
                    i1 = new Image(file1.toURI().toString());
                    iv2.setImage(i1);
                    flag4 = i;
                }

                if (j < 0) {
                    j = sizeofp - 1;
                    l1.setText("Credit: " + credit.get(j));
                    File file3 = new File(p.get(j));
                    i1 = new Image(file3.toURI().toString());
                    iv1.setImage(i1);
                    flag5 = 0;
                } else {
                    System.out.println(sizeofp);
                    l1.setText("Credit: " + credit.get(j));
                    File file3 = new File(p.get(j));
                    i1 = new Image(file3.toURI().toString());
                    iv1.setImage(i1);
                    System.out.println(j);
                    flag5 = j;
                }

                if (m < 0) {
                    m = sizeofp - 1;
                    l3.setText("Credit: " + credit.get(m));
                    File file2 = new File(p.get(m));
                    i1 = new Image(file2.toURI().toString());
                    iv3.setImage(i1);
                    flag6 = 0;
                } else {
                    l3.setText("Credit: " + credit.get(m));
                    File file2 = new File(p.get(m));
                    i1 = new Image(file2.toURI().toString());
                    iv3.setImage(i1);
                    flag6 = m;
                }

            } else {
                flag3 = 0;
                F4();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
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
                secController.F10();
                Scene scene2 = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(scene2);
                window.show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void handleButtonAction12(ActionEvent event) throws Exception {
        try {
            FileWriter f8 = new FileWriter("Search.txt");
            BufferedWriter w8 = new BufferedWriter(f8);
            w8.flush();
            w8.write("jasfj");
            w8.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void F0() {
        try {
            
            x= Integer.parseInt(t1.getText());
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
            String k, l,m;
            
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
                
                for(int r=0; r<sizeofn;r++){
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if(Credit == x){
                        flag_search=1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n" );
                    }
                }
                
                for(int r=0; r<sizeofn;r++){
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if((Credit <= x+1 && Credit != x && Credit >= x-1)){
                        flag_search=1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n" );
                    }
                }
                
                for(int r=0; r<sizeofn;r++){
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if((Credit <= x+2 && Credit != x && Credit != x+1 && Credit != x-1 && Credit >= x-2)){
                        flag_search=1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n" );
                    }
                }
                
                for(int r=0; r<sizeofn;r++){
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if((Credit <= x+3 && Credit != x && Credit != x+1 && Credit != x-1 && Credit != x+2 && Credit != x-2 && Credit >= x-3)){
                        flag_search=1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n" );
                    }
                }
                
                for(int r=0; r<sizeofn;r++){
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if((Credit <= x+4 && Credit != x && Credit != x+1 && Credit != x-1 && Credit != x+2 && Credit != x-2 && Credit != x+3 && Credit != x-3 && Credit >= x-4)){
                        flag_search=1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n" );
                    }
                }
                
                for(int r=0; r<sizeofn;r++){
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if((Credit <= x+5 && Credit != x && Credit != x+1 && Credit != x-1 && Credit != x+2 && Credit != x-2 && Credit != x+3 && Credit != x-3 && Credit != x+4 && Credit != x-4 && Credit >= x-5)){
                        flag_search=1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n" );
                    }
                }
                
                for(int r=0; r<sizeofn;r++){
                    Credit = (Integer.parseInt(n.get(r)) * Integer.parseInt(s.get(r))) / 48;
                    if((Credit <= x+6 && Credit != x && Credit != x+1 && Credit != x-1 && Credit != x+2 && Credit != x-2 && Credit != x+3 && Credit != x-3 && Credit != x+4 && Credit != x-4 && Credit != x+5 && Credit != x-5 && Credit >= x-6)){
                        flag_search=1;
                        w8.write(nid.get(r) + " ######Alhamdulillah " + phone.get(r) + " ######Alhamdulillah " + name.get(r) + " ######Alhamdulillah " + n.get(r) + " ######Alhamdulillah " + s.get(r) + " ######Alhamdulillah " + Credit + " ######Alhamdulillah " + location.get(r) + " ######Alhamdulillah " + email.get(r) + " ######Alhamdulillah " + p.get(r) + "\n" );
                    }
                }
                
                w8.close();
                System.out.println("Done");
                
                if(flag_search==1){
                    
                }
                else {
                    
                }

            } else {
                flag2 = 0;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void F3() {
        try {

            FileReader f3 = new FileReader("Search.txt");
            BufferedReader r2 = new BufferedReader(f3);

            String k;
            credit.clear();
            p.clear();
            

            while ((k = r2.readLine()) != null) {
                String A[] = k.split(" ######Alhamdulillah ");
                credit.add(A[5]);
                p.add(A[8]);
                flag3 = 1;
                System.out.println(p.get(0));
            }
            r2.close();

            if (flag3 == 1) {
                flag3 = 0;
                int sizeofc,sizeofp;
                sizeofc = credit.size();
                sizeofp = p.size();
                flag5 = sizeofp - 1;
                j = flag5;
                if (sizeofp == 1) {
                    flag6 = 0;
                    m = 0;
                }

                l2.setText("Credit: " + credit.get(0));
                File file1 = new File(p.get(0));
                i1 = new Image(file1.toURI().toString());
                iv2.setImage(i1);

                l1.setText("Credit: " + credit.get(sizeofc-1));
                File file3 = new File(p.get(sizeofp - 1));
                i1 = new Image(file3.toURI().toString());
                iv1.setImage(i1);

                if (sizeofc - 1 == 0 && sizeofp - 1 == 0) {
                    l3.setText("Credit: " + credit.get(0));
                    File file2 = new File(p.get(0));
                    i1 = new Image(file2.toURI().toString());
                    iv3.setImage(i1);
                } else {
                    l3.setText("Credit: " + credit.get(1));
                    File file2 = new File(p.get(1));
                    i1 = new Image(file2.toURI().toString());
                    iv3.setImage(i1);
                }

            } else {
                flag3 = 0;
                F4();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void F4() {
        i1 = new Image("/pct/Photos/Tree_01.jpg");
        iv1.setImage(i1);
        i1 = new Image("/pct/Photos/Tree_02.jpg");
        iv2.setImage(i1);
        i1 = new Image("/pct/Photos/Tree_03.jpg");
        iv3.setImage(i1);
    }
    
    public void F5(){
        if(FXML3Controller.flag_search==0){
            a1.setVisible(false);
            a2.setVisible(false);
            a3.setVisible(false);
            bb1.setVisible(false);
            bb2.setVisible(false);
            bb3.setVisible(false);
            bb4.setVisible(false);
            l_search.setText("Search Result Does Not Match");
        }
        
        else{
            F3();
        }
        
    }
    
    public void F6(){
        if(FXML1Controller.flag_search==0){
            a1.setVisible(false);
            a2.setVisible(false);
            a3.setVisible(false);
            bb1.setVisible(false);
            bb2.setVisible(false);
            bb3.setVisible(false);
            bb4.setVisible(false);
            l_search.setText("Search Result Does Not Match");
        }
        
        else{
            F3();
        }
        
    }
    
    public void F7(){
        if(FXML2Controller.flag_search==0){
            a1.setVisible(false);
            a2.setVisible(false);
            a3.setVisible(false);
            bb1.setVisible(false);
            bb2.setVisible(false);
            bb3.setVisible(false);
            bb4.setVisible(false);
            l_search.setText("Search Result Does Not Match");
        }
        
        else{
            F3();
        }
        
    }
    
    public void F8(){
        if(FXMLController.flag_search==0){
            a1.setVisible(false);
            a2.setVisible(false);
            a3.setVisible(false);
            bb1.setVisible(false);
            bb2.setVisible(false);
            bb3.setVisible(false);
            bb4.setVisible(false);
            l_search.setText("Search Result Does Not Match");
        }
        
        else{
            F3();
        }
        
    }
    
    public void F9(){
        if(FXML_for_Credit_Controller.flag_search==0){
            a1.setVisible(false);
            a2.setVisible(false);
            a3.setVisible(false);
            bb1.setVisible(false);
            bb2.setVisible(false);
            bb3.setVisible(false);
            bb4.setVisible(false);
            l_search.setText("Search Result Does Not Match");
        }
        
        else{
            F3();
        }
        
    }
    
    public void F10(){
        if(FXML_for_Credit_03Controller.flag_search==0){
            a1.setVisible(false);
            a2.setVisible(false);
            a3.setVisible(false);
            bb1.setVisible(false);
            bb2.setVisible(false);
            bb3.setVisible(false);
            bb4.setVisible(false);
            l_search.setText("Search Result Does Not Match");
        }
        
        else{
            F3();
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
    
    public ArrayList<String> credit = new ArrayList<String>();
    

}
