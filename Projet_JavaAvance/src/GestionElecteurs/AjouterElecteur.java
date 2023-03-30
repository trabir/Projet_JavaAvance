package GestionElecteurs;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import MenuPrincipal.Verif;

public class AjouterElecteur extends JFrame{
	
	private JPanel contentPane;
	private JLabel title;
	private JLabel nom;
	private JLabel prenom;
	private JLabel cin;
	private JLabel age;
	private JLabel burvote;
	private JLabel choix;
	private JLabel situation;
	private JLabel imageLbl;
	private JTextField Nom;
	private JTextField Prenom;
	private JTextField Cin;
	private JTextField Age;
	private JTextField Burvote;
	private JTextField Choix;
	private JRadioButton vote = new JRadioButton("Voté");	
	private JRadioButton nonVote = new JRadioButton("Non Voté");
	private ImageIcon image;
	private JButton retourlbl;
	private ImageIcon imager;
	private JButton button;

	
	public JRadioButton getVote() {
		return vote;
	}

	public JRadioButton getNonVote() {
		return nonVote;
	}

	public void close() //appeler cette methode pour fermer le frame en cas de besoin
	{WindowEvent winClosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
	Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);		
	}

	/**
	 * Create the frame.
	 */
	public AjouterElecteur() {
		setBounds(100, 100, 759, 476);
		setSize(800,700);//dimensions de l'interface
		 setResizable(false);//Emp�cher le redimensionnement de la fen�tre
		 setTitle("INSCRIPTION D'UN NOUVEL ÉLECTEUR");//titre de la fen�tre
		 setLocationRelativeTo(null);//l'interface est centr�e � l'�cran 
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(Color.white);
		contentPane.setLayout(null);//pas de positionnement(absolute layout)
		
		title = new JLabel("L'Ajout d'un Nouvel électeur");
		title.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,40));//changement de police
		title.setForeground(Color.RED);//changement de couleur
		title.setBounds(120,30,600,50);//changement de dimension
		contentPane.add(title);
		button = new JButton("S'INSCRIRE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x1=Nom.getText();
				String x2=Prenom.getText();
				String x3=Cin.getText();
				String x4=Age.getText();
				String x5=Burvote.getText();
				String x6=Choix.getText();
				
				Verif.RadioButton_oneSelected(vote.isSelected(),nonVote.isSelected(),"la situation");
				if (Verif.msg.equals("")){	//il n'a pas trouv� la CIN donn�e (il s'agit r�ellement d'in nouvel �lecteur)				
					Calendar cal = Calendar.getInstance();
				String ch=(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
				String situation ;//va contenir la situation s�l�ction�e
				if(vote.isSelected()) {
					situation=vote.getText() ;
				}else {
					situation=nonVote.getText() ;
				}
					Electeur electeur=new Electeur(x1,x2,x3,Integer.parseInt(x4),Integer.parseInt(x5),x6,situation,ch) ;
					JOptionPane.showMessageDialog(null,"L'Ajout s'est effectué avec succès !");
				
				
			}
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(225, 13, 25));
		button.setBounds(395, 585, 283, 36);
		contentPane.add(button);
		
		nom = new JLabel("NOM:");
		nom.setBounds(395, 95, 114, 14);
		contentPane.add(nom);
		
		Nom= new JTextField();
	   	Nom.setBounds(395, 115, 283, 30);
		contentPane.add(Nom);
		Nom.setColumns(10);
			
		prenom = new JLabel("PRÉNOM:");
		prenom.setBounds(395, 165, 100, 14);
		contentPane.add(prenom);
		
		Prenom= new JTextField();
	   	Prenom.setBounds(395, 185, 283, 30);
		contentPane.add(Prenom);
		Prenom.setColumns(10);
				
		cin = new JLabel("CIN:");
		cin.setBounds(395, 235, 100, 14);
		contentPane.add(cin);
		
		Cin= new JTextField();
	   	Cin.setBounds(395, 255, 283, 30);
		contentPane.add(Cin);
		Cin.setColumns(10);
			
		age = new JLabel("AGE:");
		age.setBounds(395, 305, 100, 14);
		contentPane.add(age);
		
		Age= new JTextField();
	   	Age.setBounds(395, 325, 50, 30);
		contentPane.add(Age);
		Age.setColumns(10);
		
		
		burvote = new JLabel("NUMÉRO DU BUREAU DE VOTE:");
		burvote.setBounds(395, 375, 200, 14);
		contentPane.add(burvote);
		
		Burvote= new JTextField();
	   	Burvote.setBounds(395, 395, 50, 30);
		contentPane.add(Burvote);
		Burvote.setColumns(10);
		
		choix = new JLabel("CHOIX: (Symbole du parti choisi)");
		choix.setBounds(395, 445, 250, 14);
		contentPane.add(choix);
		
		Choix= new JTextField();
	   	Choix.setBounds(395, 465, 283, 30);
		contentPane.add(Choix);
		Choix.setColumns(10);
		
		situation = new JLabel("SITUATION:");
		situation.setBounds(395, 515, 100, 14);
		contentPane.add(situation);
		
		vote.setBounds(395, 536, 109, 23);
		contentPane.add(vote);
		nonVote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nonVote.isSelected()) {
					vote.setSelected(false);
				}
			}
		});
		
		nonVote.setBounds(536, 540, 109, 23);
		contentPane.add(nonVote);
		
		imageLbl = new JLabel("");
		imageLbl.setBounds(27, 99, 350, 350);
		contentPane.add(imageLbl);

		image = new ImageIcon("image/isie.png");		
		imageLbl.setIcon(image);
		
		retourlbl = new JButton("");
		 retourlbl.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
					//Frame1.frame_1.setVisible(true);
					
				}

         });
		retourlbl.setBounds(10, 465, 100, 100);
		contentPane.add(retourlbl);

		imager = new ImageIcon("image/bouton_retour.png");		
		retourlbl.setIcon(imager);
		
		
	}
	

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						AjouterElecteur frame = new AjouterElecteur();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	


}
