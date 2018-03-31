package JsoupGuı;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.example.NewsDroid.JsoupConnect;

public class JsoupFrame {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Jsoup Control");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 500));
		frame.getContentPane().add(panel);
		panel.setBackground(Color.lightGray);
		panel.setLayout(null);

		JButton buttonRun = new JButton("Run");
		buttonRun.setBounds(80, 80, 80, 40);
		buttonRun.setBackground(Color.blue);
		buttonRun.setOpaque(true);
		
		
		buttonRun.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JsoupConnect connect;
				try {
					connect = new JsoupConnect("http://www.haber7.com.tr/dunya",
					"div[id=\"page\"]>div>li>a", "http://www.sabah.com.tr");
					connect.imageAdd("img", "alt");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		
		panel.add(buttonRun);
		frame.add(panel);
		

		
	}

}
