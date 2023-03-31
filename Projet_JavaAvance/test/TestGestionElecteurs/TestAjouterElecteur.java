package TestGestionElecteurs;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import org.junit.jupiter.api.Test;

import GestionElecteurs.AjouterElecteur;

import MenuPrincipal.Verif;

public class TestAjouterElecteur {

	@Test
    public void testOpenJFrameAjouterElecteur() {
        AjouterElecteur frame = new AjouterElecteur();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setPreferredSize(new Dimension(200, 400));
        frame.setTitle("Test Ajouter Electeur");
        frame.setContentPane(new JPanel());
        frame.getContentPane().setBackground(Color.white);
        frame.pack();
        frame.setVisible(true);
        
        assertEquals(frame.getTitle(), "Test Ajouter Electeur"); 
        assertEquals(frame.getSize(), new Dimension(200, 400)); 
            }
	
	@Test
	public void situationNotSelected() {
		  AjouterElecteur frame = new AjouterElecteur();
		 frame.getVote().setSelected(false);
		 frame.getNonVote().setSelected(false);
		 Verif.RadioButton_oneSelected(frame.getVote().isSelected(),frame.getNonVote().isSelected(),"la situation");
         assertEquals("Sélectionner la situation !",Verif.msg);}
	
	@Test
	void testNomWithValidInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField nom = new JTextField();
		nom.setText("amin");
		AjouterElecteur.setNom(nom);
		Verif.alphaMessage(nom.getText(),"le nom d'un electeur");
		assertEquals("", Verif.msg);
		}
	
	@Test
	void testNomWithInvalidInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField nom = new JTextField();
		nom.setText("12547");
		AjouterElecteur.setNom(nom);
		Verif.alphaMessage(nom.getText(),"le nom d'un electeur");
	    assertEquals("le nom d'un electeur ne peut contenir que des lettres !", Verif.msg);
		}
	
	@Test
    public void testNomWithEmptyInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField nom = new JTextField();
		nom.setText("");
		AjouterElecteur.setNom(nom);
		Verif.alphaMessage(nom.getText(),"le nom d'un electeur");
	    assertEquals("le nom d'un electeur ne peut contenir que des lettres !", Verif.msg);
		}
	
	@Test
	public void testNomWithNULLInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField nom = new JTextField();
		nom.setText(null);
		AjouterElecteur.setNom(nom);
		Verif.alphaMessage(nom.getText(),"le nom d'un electeur");
	    assertEquals("le nom d'un electeur ne peut contenir que des lettres !", Verif.msg);
	}
	@Test
	void testPenomWithValidInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField prenom = new JTextField();
		prenom.setText("bencheikh");
		AjouterElecteur.setPrenom(prenom);
		Verif.alphaMessage(prenom.getText(),"le prenom d'un electeur");
		assertEquals("", Verif.msg);
		}
	@Test
	void testPenomWithInValidInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField prenom = new JTextField();
		prenom.setText("benchei8785");
		AjouterElecteur.setPrenom(prenom);
		Verif.alphaMessage(prenom.getText(),"le prenom d'un electeur");
	    assertEquals("le prenom d'un electeur ne peut contenir que des lettres !", Verif.msg);		
	    }
	@Test
	void testPenomWithEmptyInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField prenom = new JTextField();
		prenom.setText("");
		AjouterElecteur.setPrenom(prenom);
		Verif.alphaMessage(prenom.getText(),"le prenom d'un electeur");
	    assertEquals("le prenom d'un electeur ne peut contenir que des lettres !", Verif.msg);		
	    }

	@Test
	void testPenomWithNullInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField prenom = new JTextField();
		prenom.setText("");
		AjouterElecteur.setPrenom(prenom);
		Verif.alphaMessage(prenom.getText(),"le prenom d'un electeur");
	    assertEquals("le prenom d'un electeur ne peut contenir que des lettres !", Verif.msg);		
	    }
	
	@Test
	void testCinWithValidInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField cin = new JTextField();
		cin.setText("15014265");
		AjouterElecteur.setCin(cin);
		Verif.digitMessage(cin.getText(),"le cin d'un electeur ");
		assertEquals("", Verif.msg);
		}
	@Test
	void testCinWithInvalidInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField cin = new JTextField();
		cin.setText("hdhd");
		AjouterElecteur.setCin(cin);
		Verif.digitMessage(cin.getText(),"le cin d'un electeur");
	    assertEquals("le cin d'un electeur ne peut contenir que des chiffres !", Verif.msg);		
		}
	@Test
	void testCinWithEmptyInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField cin = new JTextField();
		cin.setText("");
		AjouterElecteur.setCin(cin);
		Verif.digitMessage(cin.getText(),"le cin d'un electeur");
	    assertEquals("le cin d'un electeur ne peut contenir que des chiffres !", Verif.msg);		
		}
	@Test
	void testCinWithNullInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField cin = new JTextField();
		cin.setText(null);
		AjouterElecteur.setCin(cin);
		Verif.digitMessage(cin.getText(),"le cin d'un electeur");
	    assertEquals("le cin d'un electeur ne peut contenir que des chiffres !", Verif.msg);		
		}
	@Test
	void testAgeWithValidInput() {
		AjouterElecteur AjouterElecteur = new AjouterElecteur();
		JTextField age = new JTextField();
		age.setText("20");
		AjouterElecteur.setAge(age);
		Verif.digitMessage(age.getText(),"le cin d'un electeur");
		assertEquals("", Verif.msg);
		}
	

}
