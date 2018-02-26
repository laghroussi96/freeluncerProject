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
import javax.persistence.OneToMany;

/**
 *
 * @author fatima
 */
@Entity
public class Admin implements Serializable {

    @OneToMany(mappedBy = "admin")
    private List<Notification> notifications;

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "admin")
    private List<Mission> missions;

    @OneToMany(mappedBy = "admin")
    private List<Paiement> paiements;

    @OneToMany(mappedBy = "admin")
    private List<Operation> operations;

    @OneToMany(mappedBy = "admin")
    private List<Recruteur> users;

    @OneToMany(mappedBy = "admin")
    private List<Developpeur> developpeurs;

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public List<Recruteur> getUsers() {
        return users;
    }

    public void setUsers(List<Recruteur> users) {
        this.users = users;
    }

    public List<Developpeur> getDeveloppeurs() {
        return developpeurs;
    }

    public void setDeveloppeurs(List<Developpeur> developpeurs) {
        this.developpeurs = developpeurs;
    }
    

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Admin[ id=" + id + " ]";
    }
    
}
