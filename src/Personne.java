
public class Personne {

	private String nom;
	private String prenom;
	private boolean bachelier;
	private int age;

	public Personne(String nom, String prenom,boolean bachelier, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.bachelier=bachelier;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBachelier() {
		return bachelier;
	}

	public void setBachelier(boolean bachelier) {
		this.bachelier = bachelier;
	}

}
