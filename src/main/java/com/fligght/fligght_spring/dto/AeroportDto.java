package com.fligght.fligght_spring.dto;

public class AeroportDto {
    private String nom;
    private String ville;

    public AeroportDto() {
    }

    public String getAeroportName() {
        return nom;
    }

    public void setAeroportName(String aeroportName) {
        this.nom = aeroportName;
    }

    public String getAeroportVille() {
        return ville;
    }

    public void setAeroportVille(String aeroportVille) {
        this.ville = aeroportVille;
    }
}
