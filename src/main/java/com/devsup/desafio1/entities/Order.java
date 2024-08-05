package com.devsup.desafio1.entities;

public class Order {

    private String code;
    private Double basic;
    private Double discout;

    public Order() {
    }

    public Order(String code, Double basic, Double discout) {
        this.code = code;
        this.basic = basic;
        this.discout = discout;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscout() {
        return discout;
    }

    public void setDiscout(Double discout) {
        this.discout = discout;
    }

    public Double valorDescontoAplicado(){
        Double retorno = 0d;
        retorno =  basic - (basic * (discout/100));
        return retorno;
    }

    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                ", basic=" + basic +
                ", discout=" + discout +
                '}';
    }
}
