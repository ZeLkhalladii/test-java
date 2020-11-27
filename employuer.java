package testProject;


public class employuer extends admin {
	int salair;

	public employuer(int id, String nom, String prenom, int tel,int salair) {
		super(id, nom, prenom, tel);
		this.salair=salair;
	}
}
