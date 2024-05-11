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
    public final static int OK_OPTION = 1;
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
            createWindow(content);
        }
    }
    
    private void createWindow(String string) {
        JFrame frame = new JFrame("Swing Tester");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        createUI(frame);
        frame.setSize(560, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private void createUI(final JFrame frame){
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);
        JButton button = new JButton("Xác nhận");
        final JLabel label = new JLabel();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(frame,"string","Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
                if(result == JOptionPane.YES_OPTION){
                    label.setText("Bạn chọn: Yes");
                    action = OK_OPTION;
                }else if (result == JOptionPane.NO_OPTION){
                    label.setText("Bạn chọn : No");
                    action = CANCEL_OPTION;
                }
            }
        });
        
        panel.add(button);
        panel.add(label);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }
}


