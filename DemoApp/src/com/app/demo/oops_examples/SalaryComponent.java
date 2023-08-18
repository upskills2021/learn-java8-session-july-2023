package com.app.demo.oops_examples;

import java.math.BigDecimal;

public class SalaryComponent {
    private BigDecimal basic;
    private BigDecimal da;
    private BigDecimal hra;
    private BigDecimal variableAllowance;

    public SalaryComponent(BigDecimal basic, BigDecimal da, BigDecimal hra, BigDecimal variableAllowance) {
        this.basic = basic;
        this.da = da;
        this.hra = hra;
        this.variableAllowance = variableAllowance;
    }

    public BigDecimal getBasic() {
        return basic;
    }

    public void setBasic(BigDecimal basic) {
        this.basic = basic;
    }

    public BigDecimal getDa() {
        return da;
    }

    public void setDa(BigDecimal da) {
        this.da = da;
    }

    public BigDecimal getHra() {
        return hra;
    }

    public void setHra(BigDecimal hra) {
        this.hra = hra;
    }

    public BigDecimal getVariableAllowance() {
        return variableAllowance;
    }

    public void setVariableAllowance(BigDecimal variableAllowance) {
        this.variableAllowance = variableAllowance;
    }

    @Override
    public String toString() {
        return "SalaryComponent{" +
                "basic=" + basic +
                ", da=" + da +
                ", hra=" + hra +
                ", variableAllowance=" + variableAllowance +
                '}';
    }
}
