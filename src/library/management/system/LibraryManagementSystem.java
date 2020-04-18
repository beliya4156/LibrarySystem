package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LibraryManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public LibraryManagementSystem() {
		
                setSize(1366,800);
                setLayout(null);
                setLocation(0,0);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                
                b1.setBackground(Color.GREEN);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/first.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                b1.setBounds(580,500,200,60);
		l1.setBounds(0, 0, 1366, 390);
                
                    add(b1);
		add(l1);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login_user().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                LibraryManagementSystem window = new LibraryManagementSystem();
                window.setVisible(true);			
	}
}
