import java.util.Scanner;


public class Principal {
	public static void copieGrille (char[] grille){
	String builder = "┌───┬───┬───┐";
	String builder2 ="└───┴───┴───┘";
	String builder3	="├───┼───┼───┤";
	System.out.println(builder);
	System.out.println("│ " + grille[0] + " │ " + grille[1]+ " │ " + grille[2] + " │");
	System.out.println(builder3);
	System.out.println("│ " + grille[3] + " │ " + grille[4]+ " │ " + grille[5] + " │");
	System.out.println(builder3);
	System.out.println("│ " + grille[6] + " │ " + grille[7]+ " │ " + grille[8] + " │");
	System.out.println(builder2);
	}
	public static void check(){ // Utilisation de check pour la fonction boucle sur elle mÃƒÂªme
		
		char [] grille = 
			{
				'1','2','3',
				'4','5','6',
				'7','8','9'
			};
		@SuppressWarnings("resource")
		Scanner clavier = new Scanner(System.in);		
		
		String donnee; //String = chaine de charactÃƒÂ¨res
		String builder = "┌───┬───┬───┐";
		String builder2 ="└───┴───┴───┘";
		String builder3	="├───┼───┼───┤";
		char p1 = 'X';
		char p2 = 'O';
		int n=0;
		char joueura = p1;
		//boucle de jeu
		
		while (true){
		n=n+1;
		if ( n!=10 ){
		
		// affichage de la grille
		copieGrille(grille);
			}
		
		else{

			System.out.println("Personne n'a gagné, voulez vous recommencer ? oui=1 non=0 " );
		int p;
		p= clavier.nextInt();
		if (p==1){
			check();} // la fonction boucle sur elle mÃƒÂªme
		if (p==0){ System.out.println("Merci d'avoir jouer a Morp.io");	
		break;}
		}
		
		//Demande de la case au joueur 
		int c; // c = case que le joueur veut
		while (true){
		if (joueura == p1)
		System.out.print("Joueur 1 ,Entrer le numéro de la case dans la grille: ");
		if (joueura == p2)
		System.out.print("Joueur 2 ,Entrer le numéro de la case dans la grille: ");
		donnee = clavier.nextLine();
			
		try{
		c = Integer.parseInt(donnee);  /*Integer.parseInt: Fonction qui permet de redemander
										 un entier ( ici entre 1 et 9 ) en cas d'erreur de saisi*/ 
		if (1<= c && c<=9 && grille[c-1]!= p1 && grille[c-1]!= p2)
		break;
		}catch (Exception e){
				}
			}	
		
		
		// placer le jetton du joueur dans la case 
		grille[c-1] = joueura;
		
		
		
		// vérifier que le joueur a gagné		
			if (grille [0]== joueura
			&& grille [1]== joueura
			&& grille [2]== joueura){
			copieGrille(grille);
			System.out.println("Féllicitation! Vous avez gagné la partie, voulez vous recommencer ? oui=1 non=0 ");
			int p;
			p= clavier.nextInt();
			if (p==1){
			check();} // la fonction boucle sur elle meme
			if (p==0){	

			System.out.println("Merci d'avoir jouer a Morp.io");	
			}
			break;
		}
		if (grille [3]== joueura
			&& grille [4]== joueura
			&& grille [5]== joueura){
			copieGrille(grille);
			System.out.println("Féllicitation! Vous avez gagné la partie, voulez vous recommencer ? oui=1 non=0 ");
			int p;
			p= clavier.nextInt();
			if (p==1){
			check();} // la fonction boucle sur elle meme
			if (p==0){		
			System.out.println("Merci d'avoir jouer a Morp.io");	
			}
			break;
		}
		if (grille [6]== joueura
			&& grille [7]== joueura
			&& grille [8]== joueura){
			copieGrille(grille);
			System.out.println("Féllicitation! Vous avez gagné la partie, voulez vous recommencer ? oui=1 non=0 ");
			int p;
			p= clavier.nextInt();
			if (p==1){
			check();} // la fonction boucle sur elle meme
			if (p==0){		
			System.out.println("Merci d'avoir jouer a Morp.io");	
			}
			break;
		}
		if (grille [0]== joueura
			&& grille [3]== joueura
			&& grille [6]== joueura){
			copieGrille(grille);
			System.out.println("Féllicitation! Vous avez gagné la partie, voulez vous recommencer ? oui=1 non=0 ");
			int p;
			p= clavier.nextInt();
			if (p==1){
			check();} // la fonction boucle sur elle meme
			if (p==0){		
			System.out.println("Merci d'avoir jouer a Morp.io");	
			}
			break;
			}
		if (grille [1]== joueura
			&& grille [4]== joueura
			&& grille [7]== joueura){
			copieGrille(grille);
			System.out.println("Féllicitation! Vous avez gagné la partie, voulez vous recommencer ? oui=1 non=0 ");
			int p;
			p= clavier.nextInt();
			if (p==1){
			check();} // la fonction boucle sur elle meme
			if (p==0){	
			System.out.println("Merci d'avoir jouer a Morp.io");	
			}
			break;
		}
		if (grille [2]== joueura
			&& grille [5]== joueura
			&& grille [8]== joueura){
			copieGrille(grille);
			System.out.println("Féllicitation! Vous avez gagné la partie, voulez vous recommencer ? oui=1 non=0 ");
			int p;
			p= clavier.nextInt();
			if (p==1){
			check();} // la fonction boucle sur elle meme
			if (p==0){		
			System.out.println("Merci d'avoir jouer a Morp.io");	
			}
			break;
			}
		if (grille [0]== joueura
			&& grille [4]== joueura
			&& grille [8]== joueura){
			copieGrille(grille);
			System.out.println("Féllicitation! Vous avez gagné la partie, voulez vous recommencer ? oui=1 non=0 ");
			int p;
			p= clavier.nextInt();
			if (p==1){
			check();} // la fonction boucle sur elle meme
			if (p==0){		
			System.out.println("Merci d'avoir jouer a Morp.io");	
			}
			break;
			}
		if (grille [2]== joueura
			&& grille [4]== joueura
			&& grille [6]== joueura){
			copieGrille(grille);
			System.out.println("Féllicitation! Vous avez gagné la partie, voulez vous recommencer ? oui=1 non=0 ");
			int p;
			p= clavier.nextInt();
			if (p==1){
			check();} // la fonction boucle sur elle meme
			if (p==0){	
			System.out.println("Merci d'avoir jouer a Morp.io");	
			}
			break;
			}
		
		
		// changer le joueur 
		if (joueura == p1)
			joueura = p2;
		else 
			joueura = p1;
		
}
}
	
public static void main(String args[]){
	check();

}}

