package atm.pkginterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MJ Mokgosana
 */
public class Deposit {
    
    private Double depositAmount;

    public Deposit(Double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Double getDepositAmount() {
        return depositAmount;
    }

}
