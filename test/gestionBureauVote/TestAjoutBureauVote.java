package gestionBureauVote;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JTextField;

import org.junit.jupiter.api.Test;

import MenuPrincipal.Verif;

class TestAjoutBureauVote {

	  @Test 
	  public void testNumeroWithValidInput() {
		  AjoutBureauVote ajoutBur = new AjoutBureauVote();
		    JTextField numero = new JTextField();
		    numero.setText("1235");
		    ajoutBur.setNumero(numero);
		    Verif.digitMessage(ajoutBur.getNumero().getText(), "Le numéro d'un bureau");
		    assertEquals("", Verif.msg);
		}
	 
	@Test
	public void testNumeroWithInvalidInput() {
	    AjoutBureauVote ajoutBur = new AjoutBureauVote();
	    JTextField numero = new JTextField();
	    numero.setText("1235zyyy");
	    ajoutBur.setNumero(numero);
	    Verif.digitMessage(ajoutBur.getNumero().getText(), "Le numéro d'un bureau");
	    assertEquals("Le numéro d'un bureau ne peut contenir que des chiffres !", Verif.msg);
	}
	@Test
    public void testNumeroWithEmptyInput() {
		  AjoutBureauVote ajoutBur = new AjoutBureauVote();
		    JTextField numero = new JTextField();
		    numero.setText("");
		    ajoutBur.setNumero(numero);
		    Verif.digitMessage(ajoutBur.getNumero().getText(), "Le numéro d'un bureau");
		    assertEquals("Le numéro d'un bureau ne peut contenir que des chiffres !", Verif.msg);
			}
	@Test
    public void testNumeroWithNULLInput() {
		  AjoutBureauVote ajoutBur = new AjoutBureauVote();
		    JTextField numero = new JTextField();
		    numero.setText(null);
		    ajoutBur.setNumero(numero);
		    Verif.digitMessage(ajoutBur.getNumero().getText(), "Le numéro d'un bureau");
		    assertEquals("Le numéro d'un bureau ne peut contenir que des chiffres !", Verif.msg);
		}

		
		  @Test public void testAdresseWithValidInput() { 
			  AjoutBureauVote ajoutBur = new AjoutBureauVote();
			    JTextField adr = new JTextField();
			    adr.setText("Manouba");
			    ajoutBur.setAdresse(adr);
			    Verif.Al_digitMessage(ajoutBur.getAdresse().getText(), "Une adresse");
			    assertEquals("", Verif.msg);
		}
		 
	@Test
	public void testAdresseWithInvalidInput() {
		  AjoutBureauVote ajoutBur = new AjoutBureauVote();
		    JTextField adr = new JTextField();
		    adr.setText("1235£");
		    ajoutBur.setAdresse(adr);
		    Verif.Al_digitMessage(ajoutBur.getAdresse().getText(), "Une adresse");
		    assertEquals("Une adresse ne peut contenir que des lettres et des chiffres !", Verif.msg);
		}
	@Test
    public void testAdresseWithEmptyInput() {
		  AjoutBureauVote ajoutBur = new AjoutBureauVote();
		    JTextField adr = new JTextField();
		    adr.setText("");
		    ajoutBur.setAdresse(adr);
		    Verif.Al_digitMessage(ajoutBur.getAdresse().getText(), "Une adresse");
		    assertEquals("Une adresse ne peut contenir que des lettres et des chiffres !", Verif.msg);
	}
	@Test
    public void testAdresseWithNULLInput() {
		  AjoutBureauVote ajoutBur = new AjoutBureauVote();
		    JTextField adr = new JTextField();
		    adr.setText(null);
		    ajoutBur.setAdresse(adr);
		    Verif.Al_digitMessage(ajoutBur.getAdresse().getText(), "Une adresse");
		    assertEquals("Une adresse ne peut contenir que des lettres et des chiffres !", Verif.msg);
	}

	@Test
	public void regionNoSelected() {
		 AjoutBureauVote ajoutBur = new AjoutBureauVote();
		 ajoutBur.getRegion().setSelectedIndex(0);
         Verif.ComboBoxMessage(ajoutBur.getRegion().getSelectedIndex(), "une région");
         assertEquals("Sélectionner une région !",Verif.msg);}
	



}
