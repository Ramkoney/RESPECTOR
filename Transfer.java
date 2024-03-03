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
public class Transfer {
    
    private Double  transferedAmount;
    private String receipientID;

    public Transfer(Double transferedAmount, String receipientID) {
        this.transferedAmount = transferedAmnt;
        this.receipientID =receipientID ;
    }
    

    public Double getTransferedAmount() {
        return transferedAmnt;
    }

    public void setTransferedAmount(Double transferedAmount) {
        this.transferedAmount = transferedAmount;
    }
    
    
}
