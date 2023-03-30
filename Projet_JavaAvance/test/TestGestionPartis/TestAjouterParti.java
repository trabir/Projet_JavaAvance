package TestGestionPartis;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import org.junit.Test;

import GestionPartis.AjouterParti;
import MenuPrincipal.Verif;

public class TestAjouterParti {

	@Test
    public void testOpenJFrameAjouterElecteur() {
        AjouterParti frame = new AjouterParti();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setPreferredSize(new Dimension(200, 400));
        frame.setTitle("Test Ajouter Parti");
        frame.setContentPane(new JPanel());
        frame.getContentPane().setBackground(Color.white);
        frame.pack();
        frame.setVisible(true);
        
        assertEquals(frame.getTitle(), "Test Ajouter Parti"); 
        assertEquals(frame.getSize(), new Dimension(200, 400)); 
            }
	
	
	 	
	 	  @Test 
		  public void testNomWithValidInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField nomP = new JTextField();
			    nomP.setText("AAAAAAA");
			    ajoutP.setNom(nomP);
			    Verif.alphaMessage(ajoutP.getNom().getText(), "Le nom d'un Parti");
			    assertEquals("", Verif.msg);
			}
		 
		@Test
		public void testNomWithInvalidInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField nomP = new JTextField();
			    nomP.setText("AAX7_9");
			    ajoutP.setNom(nomP);
			    Verif.alphaMessage(ajoutP.getNom().getText(), "Le nom d'un Parti");
			    assertEquals("Le nom d'un Parti ne peut contenir que des lettres !", Verif.msg);
		}
		@Test
	    public void testNomWithEmptyInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField nomP = new JTextField();
			    nomP.setText("");
			    ajoutP.setNom(nomP);
			    Verif.alphaMessage(ajoutP.getNom().getText(), "Le nom d'un Parti");
			    assertEquals("Le nom d'un Parti ne peut contenir que des lettres !", Verif.msg);
			}
		@Test
	    public void testNomWithNULLInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField nomP = new JTextField();
			    nomP.setText(null);
			    ajoutP.setNom(nomP);
			    Verif.alphaMessage(ajoutP.getNom().getText(), "Le nom d'un Parti");
			    assertEquals("Le nom d'un Parti ne peut contenir que des lettres !", Verif.msg);
			}
		
		
		  @Test 
		  public void testSymbolWithValidInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField symbP = new JTextField();
			    symbP.setText("ABCDXYZ");
			    ajoutP.setSymbol(symbP);
			    Verif.alphaMessage(ajoutP.getSymbol().getText(), "Le symbole d'un Parti");
			    assertEquals("", Verif.msg);
			}
		 
		@Test
		public void testSymbolWithInvalidInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField symbP = new JTextField();
			    symbP.setText("_76$hh");
			    ajoutP.setSymbol(symbP);
			    Verif.alphaMessage(ajoutP.getSymbol().getText(), "Le symbole d'un Parti");
			    assertEquals("Le symbole d'un Parti ne peut contenir que des lettres !", Verif.msg);
			}
		@Test
	    public void testSymbolWithEmptyInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField symbP = new JTextField();
			    symbP.setText("");
			    ajoutP.setSymbol(symbP);
			    Verif.alphaMessage(ajoutP.getSymbol().getText(), "Le symbole d'un Parti");
			    assertEquals("Le symbole d'un Parti ne peut contenir que des lettres !", Verif.msg);
				}
		@Test
	    public void testSymbolWithNULLInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField symbP = new JTextField();
			    symbP.setText(null);
			    ajoutP.setSymbol(symbP);
			    Verif.alphaMessage(ajoutP.getSymbol().getText(), "Le symbole d'un Parti");
			    assertEquals("Le symbole d'un Parti ne peut contenir que des lettres !", Verif.msg);
				}


		  @Test 
		  public void testPresWithValidInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField pres = new JTextField();
			    pres.setText("president");
			    ajoutP.setPresident(pres);
			    Verif.alphaMessage(ajoutP.getPresident().getText(), "Le nom du Président");
			    assertEquals("", Verif.msg);
			}
		 
		@Test
		public void testPresWithInvalidInput() {
			 AjouterParti ajoutP = new AjouterParti();
			    JTextField pres = new JTextField();
			    pres.setText("pre_77");
			    ajoutP.setPresident(pres);
			    Verif.alphaMessage(ajoutP.getPresident().getText(), "Le nom du Président");
			    assertEquals("Le nom du Président ne peut contenir que des lettres !", Verif.msg);
				}
		@Test
	    public void testPresWithEmptyInput() {
			 AjouterParti ajoutP = new AjouterParti();
			    JTextField pres = new JTextField();
			    pres.setText("");
			    ajoutP.setPresident(pres);
			    Verif.alphaMessage(ajoutP.getPresident().getText(), "Le nom du Président");
			    assertEquals("Le nom du Président ne peut contenir que des lettres !", Verif.msg);
						}
		@Test
	    public void testPresWithNULLInput() {
			 AjouterParti ajoutP = new AjouterParti();
			    JTextField pres = new JTextField();
			    pres.setText(null);
			    ajoutP.setPresident(pres);
			    Verif.alphaMessage(ajoutP.getPresident().getText(), "Le nom du Président");
			    assertEquals("Le nom du Président ne peut contenir que des lettres !", Verif.msg);
		
		}
		
		
	 	
}
