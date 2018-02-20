/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author fatima
 */
@Entity
public class Developpeur implements Serializable {

    

    
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nom;
    private String prenom;
    private double motPasse;
    private double tel;
    @ManyToOne
    private Diplome diplome;
    @ManyToOne
    private Pays pays;
    @OneToMany(mappedBy = "developpeur")
    private List<Compte> comptes;
    @OneToMany(mappedBy = "developpeur")
    private List<TechnologieSkill> technologieSkills;

    @OneToMany(mappedBy = "developpeur")
    private List<Review> reviews;

    @OneToMany(mappedBy = "developpeur")
    private List<Notification> notifications;

    @OneToMany(mappedBy = "developpeur")
    private List<LangueSkill> langueSkills;

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

    public double getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(double motPasse) {
        this.motPasse = motPasse;
    }

    public double getTel() {
        return tel;
    }

    public void setTel(double tel) {
        this.tel = tel;
    }

    public Diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public List<TechnologieSkill> getTechnologieSkills() {
        return technologieSkills;
    }

    public void setTechnologieSkills(List<TechnologieSkill> technologieSkills) {
        this.technologieSkills = technologieSkills;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public List<LangueSkill> getLangueSkills() {
        return langueSkills;
    }

    public void setLangueSkills(List<LangueSkill> langueSkills) {
        this.langueSkills = langueSkills;
    }
    
    

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Developpeur)) {
            return false;
        }
        Developpeur other = (Developpeur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Developpeur[ id=" + id + " ]";
    }
    
}
