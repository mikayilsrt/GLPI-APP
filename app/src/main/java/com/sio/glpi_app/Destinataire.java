package com.sio.glpi_app;

public class Destinataire {
    private int id;
    private String nomPersonne;
    private String service;
    Destinataire leDestinataire;

    public Destinataire(int id, String np, String s){
        this.id = id;
        this.nomPersonne = np;
        this.service = s;
    }
}
