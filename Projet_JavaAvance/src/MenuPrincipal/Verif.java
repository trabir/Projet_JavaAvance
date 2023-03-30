package MenuPrincipal;

import javax.swing.JOptionPane;


public class Verif {
	public static String msg="";
	
	public static boolean alpha(String s) {//cette methode v�rifie si la chaine donn�e ne contient uniquement que des lettres
		  if (s.length()==0) //v�rifie si la chaine est vide ou pas
		       return false;
	      int len = s.length();
	      for (int i = 0; i < len; i++) {
	         if ((Character.isLetter(s.charAt(i)) == false) && s.charAt(i)!=' ') //si le caract�re courant n'est pas une lettre ni une espace alors return false	        	
	            return false;			}
	      return true;
	   }
	 public static void alphaMessage(String s, String champ) {//cette methode v�rifie si la chaine donn�e ne contient uniquement que des lettres
		  msg="";
		  if(alpha(s)==false) {
			  msg=champ+" ne peut contenir que des lettres !";
			JOptionPane.showMessageDialog(null,champ+" ne peut contenir que des lettres !");
		
	   }}

	  public static boolean digit (String s) {//cette methode v�rifie si la chaine donn�e ne contient uniquement que des chiffres
	      if (s.length()==0) //v�rifie si la chaine est vide ou pas
	         return false;
	      
	      int len = s.length();
	      for (int i = 0; i < len; i++) {
	         if ((Character.isDigit(s.charAt(i)) == false))//si le caract�re courant est n'est pas num�rique(un chiffre) alors return false  {
	            return false;			}
	      return true;
	   }
	  
	  public static void digitMessage(String s, String champ) {//cette methode v�rifie si la chaine donn�e ne contient uniquement que des chiffres
		  msg="";
		  if(digit(s)==false) {
			  msg=champ+" ne peut contenir que des chiffres !";
			JOptionPane.showMessageDialog(null,champ+" ne peut contenir que des chiffres !");
		
	   }}
	
	  public static boolean Aldig (String s) {//cette methode v�rifie si la chaine donn�e ne contient uniquement que des lettres et des chiffres
	      if (s.length()==0) //v�rifie si la chaine est vide ou pas
	         return false;
	      
	      int len = s.length();
	      for (int i = 0; i < len; i++) {
	         if ((Character.isDigit(s.charAt(i)) == false) && (Character.isLetter(s.charAt(i)) == false) && s.charAt(i)!=' ') {//si le caract�re courant n'est ni une lettre ni un chiffre ni un espace alors return false
	            return false;
	         }
	      }
	      return true;
	   }
	  
	  public static void Al_digitMessage(String s, String champ) {//cette methode v�rifie si la chaine donn�e ne contient uniquement que des chiffres et des lettres
		  msg="";
		  if(Aldig(s)==false) {
			  msg=champ+" ne peut contenir que des lettres et des chiffres !";
			JOptionPane.showMessageDialog(null,champ+" ne peut contenir que des lettres et des chiffres !");
		
	   }}
	  
	  public static void ComboBoxMessage(int val, String champ) {
		  msg="";
		  if(val==0) {//tester la selection d'une region
				msg="Sélectionner "+champ+" !";
				JOptionPane.showMessageDialog(null,"Sélectionner une région !");
		}
	  }
	  
	  public static void RadioButton_oneSelected(boolean b1, boolean b2, String champ) {
		  msg="";
		  if(!b1 && !b2) {//tester la selection d'une region
				msg="Sélectionner "+champ+" !";
				JOptionPane.showMessageDialog(null,"Sélectionner la situation !");
		}
	  }
	  
	  
		public static boolean verifcin(String ch)//cette m�thode v�rifie la validit� d'une CIN donn�e 
		{int i=0; boolean test=true;
		if (ch.length()!=8)//la longueur est # 8
			test=false;
		else //la longueur=8
		{while(i<ch.length() && test)
			{if (ch.charAt(i)<'0' && ch.charAt(i)>'9' ) //elle ne doit contenir que des chiffres
				test=false;
			else i++;		
			}
		}
		return test; 

		}
		
		
		 public static boolean verifdate(String ch)//cette m�thode v�rifie le format de la date donn�e ainsi que sa validit� 
		 {boolean res=true;;
			 if (ch.length()!=10 || ch.charAt(2)!='/' || ch.charAt(5)!='/')
			 res=false;
		 else
		 {String chj=ch.substring(0,2);
		  String chm=ch.substring(3,5);
		  String cha=ch.substring(6,10);
		  int jj=Integer.parseInt(chj);
		  int mm=Integer.parseInt(chm);
		  int aa=Integer.parseInt(cha);
		  switch(mm)//v�rification du mois
		  {case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			  if(jj>31)//v�rification du jour
				  {System.out.println("Selon le mois que vous avez donn�, le jour doit être <= 31 !");
				  res=false;}
			  break;
		  case 4: case 6: case 9: case 11:
			  if (jj>30)
			  {System.out.println("Selon le mois que vous avez donné, le jour doit être <= 30 !");
			  res=false;}
		  break;
		  case 2:
			  if ( (aa % 4==0 && aa % 100!=0) || (aa % 400==0) )//ann�e bissextile
			  {if (jj>29)//v�rification du jour
			  {System.out.println("L'ann�e est bissextile\nSelon le mois que vous avez donné, le jour doit être <= 29 !");
			  res=false;}}
			  else {//ann�e non bissextile
				  if (jj>28)
				  {System.out.println("L'année n'est pas bissextile\nSelon le mois que vous avez donné, le jour doit être <= 28 !");
				  res=false;}
			  }
				  break;
				  default: System.out.println("Le mois n'existe pas !\nVérifier le mois saisi !");//mois non valide
				  res=false;
			  }
		  
		  }
			 return res;
			 		 
		 }
		 
		 

}
