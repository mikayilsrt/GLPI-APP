package com.sio.glpi_app;

public class Operateur {
    private String prenom;
    private String nom;

    public Operateur(String p, String n){ ;
        this.prenom = p;
        this.nom = n;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }


}
