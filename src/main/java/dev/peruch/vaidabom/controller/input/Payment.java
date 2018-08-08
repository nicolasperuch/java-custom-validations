package dev.peruch.vaidabom.controller.input;

import dev.peruch.vaidabom.validator.annotation.Evaluate;

public class Payment {

    @Evaluate(message = "Nsu Invalido", codigo = 1)
    private String nsuOrigem;

    @Evaluate(message = "Valor Invalido", codigo = 2)
    private String valor;

    @Evaluate(message = "Data Invalida", codigo = 3)
    private String data;

    @Evaluate(message = "Id Conta Invalido", codigo = 4)
    private String idConta;

    public String getNsuOrigem() {
        return nsuOrigem;
    }

    public void setNsuOrigem(String nsuOrigem) {
        this.nsuOrigem = nsuOrigem;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "nsuOrigem='" + nsuOrigem + '\'' +
                ", valor='" + valor + '\'' +
                ", data='" + data + '\'' +
                ", idConta='" + idConta + '\'' +
                '}';
    }
}
