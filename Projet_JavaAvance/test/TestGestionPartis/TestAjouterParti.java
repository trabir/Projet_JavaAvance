package TestGestionPartis;





import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import GestionPartis.AjouterParti;
import MenuPrincipal.Verif;

public class TestAjouterParti {

	@Test
    public void testOpenJFrameAjouterParti() {
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
		 @Test 
		  public void testNbAdgWithValidInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField nb = new JTextField();
			    nb.setText("5");
			    ajoutP.setNbr_adh(nb);
			    Verif.digitMessage(ajoutP.getNbr_adh().getText(),"Le nombre d'Adhérents");
			    assertEquals("", Verif.msg);
			}
		
		@Test 
		  public void testNbAdhWithNULLInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField nb = new JTextField();
			    nb.setText("");
			    ajoutP.setNbr_adh(nb);
			    Verif.digitMessage(ajoutP.getNbr_adh().getText(), "Le nombre d'Adhérents");
			    assertEquals("Le nombre d'Adhérents ne peut contenir que des chiffres !", Verif.msg);
			}
		@Test 
		  public void testNbAdhWithInvalidInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField nb = new JTextField();
			    nb.setText("A6");
			    ajoutP.setNbr_adh(nb);
			    Verif.digitMessage(ajoutP.getNbr_adh().getText(), "Le nombre d'Adhérents");
			    assertEquals("Le nombre d'Adhérents ne peut contenir que des chiffres !", Verif.msg);
			}
		@Test 
		  public void testDateWithValidInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField date = new JTextField();
			    date.setText("12/03/2023");
			    ajoutP.setDatedebb(date);
			    Verif.dateMessage(ajoutP.getDatedebb().getText(),"La date de légalisation");
			    assertEquals("", Verif.msg);
			}
		@Test 
		  public void testDateWithNULLInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField date = new JTextField();
			    date.setText("");
			    ajoutP.setDatedebb(date);
			    Verif.dateMessage(ajoutP.getDatedebb().getText(),"La date de légalisation");
			    assertEquals("La date de légalisation est incorrecte !\\nVérifier cette date !", Verif.msg);
			}
		@Test 
		  public void testDateWithInvalidInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField date = new JTextField();
			    date.setText("55/02/2023");
			    ajoutP.setDatedebb(date);
			    Verif.dateMessage(ajoutP.getDatedebb().getText(),"La date de légalisation");
			    assertEquals("La date de légalisation est incorrecte !\\nVérifier cette date !", Verif.msg);
			}
		@Test 
		  public void testIdeoWithValidInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField ideo = new JTextField();
			    ideo.setText("ideologie");
			    ajoutP.setIdeo(ideo);
			    Verif.alphaMessage(ajoutP.getIdeo().getText(),"L'idéologie");
			    assertEquals("", Verif.msg);
			}
		@Test 
		  public void testIdeoWithInValidInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField ideo = new JTextField();
			    ideo.setText("ideologie2");
			    ajoutP.setIdeo(ideo);
			    Verif.alphaMessage(ajoutP.getIdeo().getText(),"L'idéologie");
			    assertEquals("L'idéologie ne peut contenir que des lettres !", Verif.msg);
			}
		@Test 
		  public void testIdeoWithNullInput() {
			  AjouterParti ajoutP = new AjouterParti();
			    JTextField ideo = new JTextField();
			    ideo.setText("");
			    ajoutP.setIdeo(ideo);
			    Verif.alphaMessage(ajoutP.getIdeo().getText(),"L'idéologie");
			    assertEquals("L'idéologie ne peut contenir que des lettres !", Verif.msg);
			}
		
	 	
}