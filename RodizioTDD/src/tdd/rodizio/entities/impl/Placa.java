/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.rodizio.entities.impl;

/**
 *
 * @author Fernando Bontorin, 31568343 <fernandorbontorin@gmail.com>
 */
public class Placa {

    String placa;

    public Placa() {
    }

    public Placa(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean validar() {
        if (this.placa.length() != 8) {
            if (this.placa.length() == 7 && !this.placa.contains("-")) {
                this.corrigirFaltaTraco();
            } else {
                return false;
            }
        }
        return true;
    }

    private void corrigirFaltaTraco() {
        this.placa = this.placa.substring(0, 3) + "-" + this.placa.substring(3, 7);
    }

}
