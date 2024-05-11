package doanquanlycuahang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyDialog extends JDialog {

    public String content;
    public int type;
    public final static int ERROR_DIALOG = 1;
    public final static int SUCCESS_DIALOG = 2;
    public final static int INFO_DIALOG = 3;
    public final static int WARNING_DIALOG = 4;
    
    private int action;
    public final static int OK_OPTION = 0;
    public final static int NO_OPTION = 1;
    public final static int CANCEL_OPTION = 2;
    
    public int getAction() {
        return action;
    }

    public MyDialog(String content, int type) {
        this.content = content;
        this.type = type;
        action();
    }
    public void action(){
        if (this.type == 1){
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,content,"Error",JOptionPane.ERROR_MESSAGE);
        } else if (this.type == 2){
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,content,"Success",JOptionPane.INFORMATION_MESSAGE);
        } else if (this.type == 3){
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,content,"Info",JOptionPane.INFORMATION_MESSAGE);
        } else if (this.type == 4){
            action = JOptionPane.showConfirmDialog(null, content);
        }
    }
    
    
}


