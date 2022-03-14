import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class Cisterna extends JFrame {

	private JPanel contentPane;
	private JLabel deptoSelected;
	private JLabel lblCisterna;
	private JLabel correctIncorrect;
	private int auxBarraCis = 54;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cisterna frame = new Cisterna();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cisterna() {
		setTitle("Cisterna");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 100,672, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		JButton buttonDepto1 = new JButton("Departamento 1\r\n");
		buttonDepto1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonDepto1.setBackground(Color.LIGHT_GRAY);
		buttonDepto1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deptoSelected.setText("1");
			}
		});
		buttonDepto1.setBounds(10, 10, 144, 31);
		contentPane.add(buttonDepto1);
		
		JButton buttonDepto2 = new JButton("Departamento 2\r\n\r\n");
		buttonDepto2.setBackground(Color.LIGHT_GRAY);
		buttonDepto2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonDepto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deptoSelected.setText("2");
			}
		});
		buttonDepto2.setBounds(10, 65, 144, 31);
		contentPane.add(buttonDepto2);
		
		JButton buttonDepto3 = new JButton("Departamento 3\r\n");
		buttonDepto3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deptoSelected.setText("3");
			}
		});
		buttonDepto3.setBackground(Color.LIGHT_GRAY);
		buttonDepto3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonDepto3.setBounds(10, 120, 144, 31);
		contentPane.add(buttonDepto3);
		
		JLabel lblNewLabel = new JLabel("Departamento seleccionado:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(222, 14, 177, 23);
		contentPane.add(lblNewLabel);
		
		deptoSelected = new JLabel("---");
		deptoSelected.setFont(new Font("Tahoma", Font.BOLD, 22));
		deptoSelected.setBackground(Color.WHITE);
		deptoSelected.setHorizontalAlignment(SwingConstants.CENTER);
		deptoSelected.setBounds(282, 62, 62, 31);
		deptoSelected.setOpaque(true);
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		deptoSelected.setBorder(border1);
		contentPane.add(deptoSelected);
		
		JButton buttonInicializar = new JButton("Inicializar");
		buttonInicializar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deptoSelected.setText("---");
				correctIncorrect.setText("-----");
				lblCisterna.setText("0");
				auxBarraCis = 54;
				repaint();
				
				
			}
		});
		buttonInicializar.setForeground(Color.BLACK);
		buttonInicializar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonInicializar.setBackground(Color.YELLOW);
		buttonInicializar.setBounds(241, 120, 144, 31);
		contentPane.add(buttonInicializar);
		
		JButton buttonComenzar = new JButton("Comenzar");
		buttonComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int auxCisterna = Integer.parseInt(lblCisterna.getText());
				int auxDeptos = Integer.parseInt(deptoSelected.getText());
				if(auxCisterna != 0) {
					if(auxCisterna < 50 && auxDeptos == 1) {
						correctIncorrect.setText("Correcto");
					} else if (auxCisterna >= 50 && auxCisterna <= 70 && auxDeptos == 2) {
						correctIncorrect.setText("Correcto");
					} else if (auxCisterna > 70 && auxDeptos == 3) {
						correctIncorrect.setText("Correcto");
					} else {
						correctIncorrect.setText("Incorrecto");
					}
				} else {
					correctIncorrect.setText("Incorrecto");
				}
				
			}
		});
		buttonComenzar.setForeground(Color.BLACK);
		buttonComenzar.setBackground(Color.GREEN);
		buttonComenzar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonComenzar.setBounds(472, 14, 144, 31);
		contentPane.add(buttonComenzar);
		
		JButton buttonSalir = new JButton("Salir");
		buttonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		buttonSalir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonSalir.setForeground(Color.WHITE);
		buttonSalir.setBackground(Color.RED);
		buttonSalir.setBounds(472, 120, 144, 31);
		contentPane.add(buttonSalir);
		
		correctIncorrect = new JLabel("-----");
		correctIncorrect.setBackground(Color.WHITE);
		correctIncorrect.setHorizontalAlignment(SwingConstants.CENTER);
		correctIncorrect.setFont(new Font("Tahoma", Font.PLAIN, 14));
		correctIncorrect.setBounds(472, 65, 144, 31);
		correctIncorrect.setOpaque(true);
		correctIncorrect.setBorder(border1);
		
		contentPane.add(correctIncorrect);
		
		JLabel lblNivelDeLa = new JLabel("Nivel de la cisterna");
		lblNivelDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivelDeLa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNivelDeLa.setBounds(123, 196, 177, 23);
		contentPane.add(lblNivelDeLa);
		
		lblCisterna = new JLabel("0");
		lblCisterna.setOpaque(true);
		lblCisterna.setHorizontalAlignment(SwingConstants.CENTER);
		lblCisterna.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCisterna.setBackground(Color.WHITE);
		lblCisterna.setBounds(526, 196, 56, 36);
		lblCisterna.setBorder(border1);
		contentPane.add(lblCisterna);
		
		JButton buttonMenos = new JButton("<<");
		buttonMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int auxCisterna = Integer.parseInt(lblCisterna.getText());
				if(auxCisterna >= 10) {
					lblCisterna.setText(String.valueOf(auxCisterna-10));
				}
				if(auxBarraCis >= 86) {
					auxBarraCis -= 32;
					repaint();
				}
			}
		});
		buttonMenos.setBackground(new Color(211, 211, 211));
		buttonMenos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonMenos.setBounds(493, 241, 62, 31);
		contentPane.add(buttonMenos);
		
		JButton buttonMas = new JButton(">>");
		buttonMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int auxCisterna = Integer.parseInt(lblCisterna.getText());
				if(auxCisterna <= 90) {
					lblCisterna.setText(String.valueOf(auxCisterna+10));
				}
				if(auxBarraCis <= 342) {
				auxBarraCis += 32;
				repaint();
				}
			}
		});
		buttonMas.setBackground(new Color(211, 211, 211));
		buttonMas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonMas.setBounds(554, 241, 62, 31);
		contentPane.add(buttonMas);
		
		JLabel lblNewLabel_1 = new JLabel("0     10     20    30     40    50     60    70     80    90    100   %");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(44, 282, 403, 23);
		contentPane.add(lblNewLabel_1);
	}
	/* Graphics */
	public void paint (Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		g.drawRect(54,260,320,50);
		g.drawLine(86,310, 86,300);
		g.drawLine(118,310, 118,300);
		g.drawLine(150,310, 150,300);
		g.drawLine(182,310, 182,300);
		g.drawLine(214,310, 214,300);
		g.drawLine(246,310, 246,300);
		g.drawLine(278,310, 278,300);
		g.drawLine(310,310, 310,300);
		g.drawLine(342,310, 342,300);
		
		
		g.setColor(Color.RED);
		g.fillRect(auxBarraCis,260,5,50);
		
	}
}
