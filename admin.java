package testProject;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays; 


public class admin {
	
	private int id;
	private String nom;
	private String prenom;
	
	public int getId() {
		return id;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getNom() {
		return nom;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
  public admin(int id, String nom,String prenom,int tel) {
	this.id=id;
	this.nom=nom;
	this.prenom=prenom;
	
	
}
	
	 public static void main(String[] args) { 
		  
		    ArrayList<String> student = new ArrayList<String>();
		    ArrayList<String> employer = new ArrayList<String>();
		    ArrayList<String> lives = new ArrayList<String>();
		  
		    menu();
		    Scanner typs = new Scanner(System.in);
		    int choix = typs.nextInt();
		    System.out.println("votre choix est :" + choix);
		   
		    int number;
		    String nom;
		    String prenom;
		    int tele = 0;
		    
		    int salair = 0;
		    int num;
		    
		    String title;
		    String autor;
		    int page;
		    
		    switch (choix) {
			case 1: {
				
				System.out.println("entrez id :");
				Scanner id = new Scanner(System.in);
				Integer etudId = id.nextInt();
				number = etudId;
				student.add(etudId.toString());
				
				System.out.println("entrez le nom :");
				Scanner name = new Scanner(System.in);
				String etudName = name.nextLine();
				nom = etudName;
				student.add(etudName);
				
				System.out.println("entrez le prenom :");
				Scanner lname = new Scanner(System.in);
				String etudLName = lname.nextLine();
				prenom = etudLName;
				student.add(etudLName);
				
				System.out.println("entrez tele :");
				Scanner tel = new Scanner(System.in);
				Integer etudTele = tel.nextInt();
				number = etudTele;
				student.add(etudTele.toString());
				
				etudient std = new etudient(number, nom, prenom, tele);
			
				
				for (String string : student) {
					System.out.println("student " + string);

				}
				
				break;
			}
				
			
			case 2: {
				System.out.println("entrez id :");
				Scanner idm = new Scanner(System.in);
				Integer emptId = idm.nextInt();
				number = emptId;
				employer.add(emptId.toString());
				
				System.out.println("entrez le nom :");
				Scanner namempt = new Scanner(System.in);
				String emptName = namempt.nextLine();
				nom = emptName;
				employer.add(emptName);
				
				System.out.println("entrez le prenom :");
				Scanner emptlname = new Scanner(System.in);
				String emptLName = emptlname.nextLine();
				prenom = emptLName;
				employer.add(emptLName);
				
				System.out.println("entrez tele :");
				Scanner emptel = new Scanner(System.in);
				Integer emptTele = emptel.nextInt();
				number = emptTele;
				employer.add(emptTele.toString());
				
				System.out.println("entrez Salair :");
				Scanner salr = new Scanner(System.in);
				Integer emptslr = salr.nextInt();
				number = emptslr;
				employer.add(emptslr.toString());


				employuer emp = new employuer(number, nom, prenom, tele, salair);
			
				
				for (String string : employer) {
					System.out.println("employuer " + string);

				}
				
				break;
			}
			
			case 3: {
				
				System.out.println("entrez id :");
				Scanner idl = new Scanner(System.in);
				Integer livrId = idl.nextInt();
				number = livrId;
				lives.add(livrId.toString());
				
				System.out.println("entrez le title :");
				Scanner titre = new Scanner(System.in);
				String titl = titre.nextLine();
				nom = titl;
				lives.add(titl);
				
				System.out.println("entrez le Author :");
				Scanner author = new Scanner(System.in);
				String auth = author.nextLine();
				prenom = auth;
				lives.add(auth);
				
				System.out.println("entrez Page :");
				Scanner pg = new Scanner(System.in);
				Integer pag = pg.nextInt();
				number = pag;
				lives.add(pag.toString());
				
				for (String string : lives) {
					System.out.println("lives " + string);

				}
				
			}
				break;
			}
			default:
				
				break;
			}  
		  } 
	 

	 public static void menu() {
		 System.out.println(" 1 Etudient");
		 System.out.println(" 2 Employuer");
		 System.out.println(" 3 Livres");

	 }
}