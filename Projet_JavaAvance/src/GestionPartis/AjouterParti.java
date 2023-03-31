package GestionPartis;

import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.*;

import MenuPrincipal.Verif;

import java.awt.Font;
import java.awt.event.*;


public class AjouterParti extends JFrame {

	private JPanel contentPane;
	
	private JLabel nparti;
	private JLabel symbole;
	private JLabel npres;
	private JLabel nbradh;
	private JLabel datedeb;
	private JLabel ideologie;
	private JLabel title;
	private JLabel label;
	private JButton button;

	private JTextField nom;
	private JTextField symbol;
	private JTextField president;
	private JTextField nbr_adh;
	private JTextField datedebb;
	private JTextField ideo;
	private ImageIcon image;
	private JButton retourlbl;
	private ImageIcon imager;

	

	

	public JTextField getNom() {
		return nom;
	}



	public void setNom(JTextField nom) {
		this.nom = nom;
	}



	public JTextField getSymbol() {
		return symbol;
	}



	public void setSymbol(JTextField symbol) {
		this.symbol = symbol;
	}



	public JTextField getPresident() {
		return president;
	}



	public void setPresident(JTextField president) {
		this.president = president;
	}

	


	public JTextField getNbr_adh() {
		return nbr_adh;
	}



	public void setNbr_adh(JTextField nbr_adh) {
		this.nbr_adh = nbr_adh;
	}
	



	public JTextField getDatedebb() {
		return datedebb;
	}



	public void setDatedebb(JTextField datedebb) {
		this.datedebb = datedebb;
	}
	



	public JTextField getIdeo() {
		return ideo;
	}



	public void setIdeo(JTextField ideo) {
		this.ideo = ideo;
	}



	/**
	 * Create the frame.
	 */
	public AjouterParti() {
		setBackground(Color.WHITE);
		 setResizable(false);//Emp�cher le redimensionnement de la fen�tre
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("AJOUT D'UN NOUVEAU PARTI");//titre de la fen�tre	
		setBounds(100, 200, 759, 636);
		setSize(750,680);//dimensions de l'interface
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setLocationRelativeTo(null);//l'interface est centr�e � l'�cran 
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// travail de base 
		title = new JLabel("L'Ajout d'un Nouveau Parti");
		title.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,40));//changement de police
		title.setForeground(Color.RED);//changement de couleur
		title.setBounds(120,30,550,50);//changement de dimension
		contentPane.add(title);
		
		button = new JButton("S'INSCRIRE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x1=nom.getText();
				String x2=symbol.getText();
				String x3=president.getText();
				String x4=nbr_adh.getText();
				String x5=datedebb.getText();
				String x6=ideo.getText();
				
	
				Verif.alphaMessage(x1, "Le nom d'un Parti");
				if (Verif.msg.equals("")) {
					Verif.alphaMessage(x2, "Le symbole d'un Parti");
					if (Verif.msg.equals("")) {
						Verif.alphaMessage(x3, "Le nom du Président");
						if (Verif.msg.equals("")) {
							Verif.digitMessage(x4, "Le nombre d'Adhérents");
							if (Verif.msg.equals("")) {
								Verif.dateMessage(x5,"La date de légalisation");
								if (Verif.msg.equals("")) {
									Verif.alphaMessage(x6, "L'idéologie");
									if (Verif.msg.equals("")) {
							Parti partis=new Parti(nom.getText(),symbol.getText(),president.getText(),Integer.parseInt(nbr_adh.getText()),datedebb.getText(),ideo.getText()) ;
							JOptionPane.showMessageDialog(null,"Félicitations !\nL'Ajout s'est effectué avec succès !");					
						
						}}
						
				}}}}
				
		}});
				
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(225, 13, 25));
		button.setBounds(365, 590, 283, 36);
		contentPane.add(button);
		
				
		nparti = new JLabel("NOM DU PARTI:");
		nparti.setBounds(365, 110, 114, 14);
		contentPane.add(nparti);
		
		nom = new JTextField();
		nom.setBounds(365, 130, 283, 36);
		contentPane.add(nom);
		nom.setColumns(10);
		
		symbole = new JLabel("SYMBOLE DU PARTI:");
		symbole.setBounds(365, 190, 150, 14);
		contentPane.add(symbole);
		
		symbol = new JTextField();
		symbol.setColumns(10);
		symbol.setBounds(365, 210, 283, 36);
		contentPane.add(symbol);
		
		npres = new JLabel("NOM DU PRÉSIDENT:");
		npres.setBounds(365, 270, 151, 14);
		contentPane.add(npres);
		
		president = new JTextField();
		president.setColumns(10);
		president.setBounds(365, 290, 283, 36);
		contentPane.add(president);
		
		
		nbradh = new JLabel("NOMBRE D'ADHÉRANTS:");
		nbradh.setBounds(365, 350, 163, 14);
		contentPane.add(nbradh);
		
		nbr_adh = new JTextField();
		nbr_adh.setColumns(10);
		nbr_adh.setBounds(365, 370, 283, 36);
		contentPane.add(nbr_adh);
		
		datedeb = new JLabel("DATE DE LÉGALISATION:");
		datedeb.setBounds(365, 430, 163, 14);
		contentPane.add(datedeb);
		
		datedebb = new JTextField();
		datedebb.setColumns(10);
		datedebb.setBounds(365, 450, 283, 36);
		contentPane.add(datedebb);
		
		ideologie = new JLabel("IDÉOLOGIE:");
		ideologie.setBounds(365, 510, 163, 14);
		contentPane.add(ideologie);
		
		ideo = new JTextField();
		ideo.setColumns(10);
		ideo.setBounds(365, 530, 283, 36);
		contentPane.add(ideo);
		
		label = new JLabel("");
		label.setBounds(47, 130, 303, 273);
		contentPane.add(label);
		
		image = new ImageIcon("image/isie.png");		
		label.setIcon(image);
			
		
		retourlbl = new JButton("");
		 retourlbl.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
					//Frame2.frame_2.setVisible(true);
					
				}

      });
		retourlbl.setBounds(36, 526, 100, 100);
		contentPane.add(retourlbl);

		imager = new ImageIcon("image/bouton_retour.png");		
		retourlbl.setIcon(imager);

	}
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterParti frame = new AjouterParti();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
	
