package com.sio.glpi_app;

import java.util.Date;

public class Reception {

    private int id;
    private Date dateR;
    private String num_serie;
    private String num_inventaire;
    Operateur unOperateur;
    Gabarit leGabarit;

    public Reception(int id, Date d, String ns, String ni){
        this.id = id;
        this.dateR = d;
        this.num_inventaire = ni;
        this.num_serie = ns;
    }
}
