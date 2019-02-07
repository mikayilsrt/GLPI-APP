package com.sio.glpi_app;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import de.siegmar.fastcsv.reader.CsvContainer;
import de.siegmar.fastcsv.reader.CsvReader;
import de.siegmar.fastcsv.reader.CsvRow;

public class Installation {
    private int id;
    private Date dateR;
    private String heure;
    private String num_inventaire;
    private Operateur unOperateur;
    private Gabarit leGabarit;

    public Installation(int id, Date dr, String h, String ni) {
        this.id = id;
        this.dateR = dr;
        this.heure = h;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void creerCSV ()
    {
        File file = new File("foo.csv");
        CsvReader csvReader = new CsvReader();

        CsvContainer csv = null;
        try {
            csv = csvReader.read(file, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (CsvRow row : csv.getRows()) {
            System.out.println("Read line: " + row);
            System.out.println("First column of line: " + row.getField(0));
        }

    }
}
