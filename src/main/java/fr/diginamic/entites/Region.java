package fr.diginamic.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="REGION")
public class Region {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String nom;
	
	/** Constructor
	 * @param id
	 * @param nom
	 */
	public Region(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	
	/** Constructor vide pour connection jpa
	 */
	public Region() {
		
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
	
	

}
