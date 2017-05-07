/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.rodizio.entities;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando Bontorin, 31568343 <fernandorbontorin@gmail.com>
 */
public class DiaFactory {

    public static Dia getDia(String dia) {
        Dia diaObject = null;
        try {
            dia = formatarDia(dia);
            diaObject = (Dia) Class.forName("tdd.rodizio.entities.impl." + dia).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println(ex.getMessage());
            return diaObject;
        }
        return diaObject;
    }

    private static String formatarDia(String dia) {
        dia = dia.toLowerCase();
        dia = dia.replace("ç".charAt(0), "c".charAt(0));
        dia = dia.replace("-", "");
        dia = dia.replace(" ", "");
        dia = dia.replace("feira", "");
        dia = dia.replace("á", "a");
        dia = dia.substring(0, 1).toUpperCase() + dia.substring(1);
        return dia;
    }

}
