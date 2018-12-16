import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
import java.net.*;
import java.io.*;
public class GUI {
	public static void main(String[] args)
	{
		new GUI();
	}
	static String[] mode = {"顺序播放","单曲循环","列表循环","随机播放"};  
	public GUI()
	{
		JFrame frame = new JFrame("音乐播放器");
		frame.setLayout(null);
		JPanel buttonpanel = new JPanel();
		buttonpanel.setLayout(new GridLayout(0,4,10,50));
		buttonpanel.setBounds(100, 410, 200, 200);
		JComboBox select = new JComboBox(mode);
		select.setBounds(350,500,90,30); 
		ImageIcon playP = new ImageIcon(Image.class.getResource("/Picture/bofang.png"));
		ImageIcon stopP = new ImageIcon(Image.class.getResource("/Picture/zanting.png"));
		ImageIcon leftP = new ImageIcon(Image.class.getResource("/Picture/left-circle.png"));
		ImageIcon rightP = new ImageIcon(Image.class.getResource("/Picture/right-circle.png"));
		JLabel play = new JLabel();
		JLabel stop = new JLabel();
		JLabel left = new JLabel();
		JLabel right = new JLabel();
		play.setIcon(playP);
		stop.setIcon(stopP);
		left.setIcon(leftP);
		right.setIcon(rightP);
		buttonpanel.add(left);
		buttonpanel.add(play);
		buttonpanel.add(stop);
		buttonpanel.add(right);
		frame.add(new Panel());
		frame.add(select);
		frame.add(buttonpanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200,200,500,600);
		frame.setVisible(true);
	}
	
}

