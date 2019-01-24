package com.sio.glpi_app;

import java.util.Date;

public class Installation {
    private int id;
    private Date dateR;
    private String heure;
    private String num_inventaire;
    Operateur unOperateur;
    Gabarit leGabarit;

    public Installation(int id, Date dr, String h, String ni) {
        this.id = id;
        this.dateR = dr;
        this.heure = h;

    }
}
