package gestionBureauVote;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import MenuPrincipal.Verif;

public class AjoutBureauVote  extends JFrame  {
private JPanel contentPane;
	
	private JLabel num;
	private JLabel adr;
	private JLabel reg;
	private JLabel titre;
	private JLabel label;
	private  JButton btnAjouter;
	private JButton retourlbl;
	private ImageIcon imager;

	private JTextField numero;
	private JTextField adresse;
	private ImageIcon image;
	private JComboBox region;
	
	
		public JButton getBtnAjouter() {
		return btnAjouter;
	}



	public JButton getRetourlbl() {
		return retourlbl;
	}



	public ImageIcon getImager() {
		return imager;
	}


	public JTextField getNumero() {
		return numero;
	}



	public JTextField getAdresse() {
		return adresse;
	}


	public JComboBox getRegion() {
		return region;
	}


	public void setNumero(JTextField numero) {
		this.numero = numero;
	}



	public void setAdresse(JTextField adresse) {
		this.adresse = adresse;
	}



	public void setRegion(JComboBox region) {
		this.region = region;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutBureauVote frame = new AjoutBureauVote();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
		
	
	// going to borrow code from a gist to move frame.
	

	/**
	 * Create the frame.
	 */
	
	
	public AjoutBureauVote() {
		 setBounds(100, 100, 759, 476);
		 setSize(780,520);//dimensions de l'interface
		 setResizable(false);//Emp�cher le redimensionnement de la fen�tre
		 setTitle("AJOUT D'UN NOUVEAU BUREAU DE VOTE");//titre de la fen�tre
		 setLocationRelativeTo(null);//l'interface est centr�e � l'�cran 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //on exige que le programme se ferme seulement lorsqu'on ferme la fen�tre interface
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(Color.white);
		contentPane.setLayout(null);//pas de positionnement(absolute layout)
		
		titre = new JLabel("L'Ajout d'un Nouveau Bureau");
		titre.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,40));//changement de police
		titre.setForeground(Color.RED);//changement de couleur
		titre.setBounds(110,50,600,50);//changement de dimension
		contentPane.add(titre);
		
		btnAjouter = new JButton("AJOUTER");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					Verif.digitMessage(numero.getText(), "Le numéro d'un bureau");
					if (Verif.msg.equals("")) {
					Verif.Al_digitMessage(adresse.getText(), "Une adresse");
						if (Verif.msg.equals("")) {
						Verif.ComboBoxMessage(region.getSelectedIndex(),"une région");}
							if (Verif.msg.equals("")) {
							Bureau bur=new Bureau(Integer.parseInt(numero.getText()),adresse.getText(),region.getSelectedItem().toString());
							Verif.ComboBoxMessage(region.getSelectedIndex(),"une région");
						}}}
			}
		);
				
		btnAjouter.setForeground(Color.WHITE);
		btnAjouter.setBackground(new Color(225, 13, 25));
		btnAjouter.setBounds(360, 390, 283, 36);
		contentPane.add(btnAjouter);
		
				
		num = new JLabel("NUMÉRO :");
		num.setBounds(360, 150, 114, 14);
		contentPane.add(num);
		
		numero = new JTextField();
		numero.setBounds(360, 170, 283, 36);
		contentPane.add(numero);
		numero.setColumns(10);
		
		adr = new JLabel("ADRESSE :");
		adr.setBounds(360, 220, 114, 14);
		contentPane.add(adr);
		
		adresse = new JTextField();
		adresse.setColumns(10);
		adresse.setBounds(360, 240, 283, 36);
		contentPane.add(adresse);
		
		reg = new JLabel("RÉGION :");
		reg.setBounds(360, 290, 151, 14);
		contentPane.add(reg);
			
		
		label = new JLabel("");
		label.setBounds(20, 111, 293, 293);
		contentPane.add(label);
		
		image = new ImageIcon("image/isie.png");		
		label.setIcon(image);
		
		region = new JComboBox();
		region.setModel(new DefaultComboBoxModel(new String[] {"", "Ariana", "Béja", "Ben Arous", "Bizerte", "Gabès", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "Kébili", "Kef", "Mahdia", "Manouba", "Médenine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Tunis", "Zaghouan"}));
		region.setBounds(360, 310, 283, 22);
		contentPane.add(region);
		
		imager = new ImageIcon("image/bouton_retour.png");		
		retourlbl = new JButton("");
	
		retourlbl.setBounds(30, 381, 100, 100);
		contentPane.add(retourlbl);
		retourlbl.setIcon(imager);
	}

}
