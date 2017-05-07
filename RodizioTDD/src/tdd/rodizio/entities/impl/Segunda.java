/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.rodizio.entities.impl;

import tdd.rodizio.entities.Dia;
import tdd.rodizio.entities.impl.Placa;

/**
 *
 * @author Fernando Bontorin, 31568343 <fernandorbontorin@gmail.com>
 */
public class Segunda extends Dia{

    @Override
    public boolean pode(Placa placa) {
        if (!placa.validar()) {
            return false;
        }
        return !(placa.getPlaca().endsWith("1") || placa.getPlaca().endsWith("2"));
    }
    
}
