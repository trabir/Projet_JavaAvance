package TestGestionElecteurs;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import org.junit.Test;

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

}
