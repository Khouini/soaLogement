package esprit.tn.entities;

import java.util.Objects;

public class Logement {
    private int reference;
    private String adresse;
    private String gouvernorat;
    private String type;
    private String description;
    private double prix;
    private String delegation;

    public Logement(int reference, String adresse, String gouvernorat, String type, String description, double prix, String delegation) {
        this.reference = reference;
        this.adresse = adresse;
        this.gouvernorat = gouvernorat;
        this.type = type;
        this.description = description;
        this.prix = prix;
        this.delegation = delegation;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(String gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDelegation() {
        return delegation;
    }

    public void setDelegation(String delegation) {
        this.delegation = delegation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Logement logement = (Logement) o;
        return reference == logement.reference && Double.compare(prix, logement.prix) == 0 && Objects.equals(adresse, logement.adresse) && Objects.equals(gouvernorat, logement.gouvernorat) && Objects.equals(type, logement.type) && Objects.equals(description, logement.description) && Objects.equals(delegation, logement.delegation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, adresse, gouvernorat, type, description, prix, delegation);
    }

    @Override
    public String toString() {
        return "Logement{" +
                "reference=" + reference +
                ", adresse='" + adresse + '\'' +
                ", gouvernorat='" + gouvernorat + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", delegation='" + delegation + '\'' +
                '}';
    }
}
