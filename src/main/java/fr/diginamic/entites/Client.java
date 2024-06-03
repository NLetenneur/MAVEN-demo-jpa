package fr.diginamic.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nom;
	String prenom;

	
	/** Constructor
	 * @param id
	 * @param prenom
	 * @param nom
	 */
	public Client(int id, String prenom, String nom) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}
	
	/** Constructor jpa
	 */
	public Client() {
		
	}

	/** Getter pour id
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**Setter pour id
	 * @param id id 
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter pour prenom
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**Setter pour prenom
	 * @param prenom prenom 
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter pour nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter pour nom
	 * @param nom nom 
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return id+" - "+nom+" "+prenom;
	}

}
