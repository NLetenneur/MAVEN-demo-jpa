package fr.diginamic.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="livre")
public class Livre {
	@Id
	int id;
	String titre;
	String auteur;

	/** Constructor
	 * 
	 */
	public Livre() {
		super();
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

	/** Getter pour titre
	 * @return titre
	 */
	public String gettitre() {
		return titre;
	}

	/**Setter pour titre
	 * @param titre  
	 */
	public void settitre(String titre) {
		this.titre = titre;
	}
	
	
	/** Getter pour auteur
	 * @return auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**Setter pour auteur
	 * @param auteur auteur 
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return id+": "+titre+", "+auteur;
		
	}

}
