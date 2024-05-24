/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_bryanarita;

public class Transaccion {

    private String Emisor, TipoDeTransferencia;
    private Double DineroInvolucrado;

    public Transaccion() {
    }

    public Transaccion(String Emisor, String TipoDeTransferencia, Double DineroInvolucrado) {
        this.Emisor = Emisor;
        this.TipoDeTransferencia = TipoDeTransferencia;
        this.DineroInvolucrado = DineroInvolucrado;
    }

    public String getEmisor() {
        return Emisor;
    }

    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }

    public String getTipoDeTransferencia() {
        return TipoDeTransferencia;
    }

    public void setTipoDeTransferencia(String TipoDeTransferencia) {
        this.TipoDeTransferencia = TipoDeTransferencia;
    }

    public Double getDineroInvolucrado() {
        return DineroInvolucrado;
    }

    public void setDineroInvolucrado(Double DineroInvolucrado) {
        this.DineroInvolucrado = DineroInvolucrado;
    }

}
