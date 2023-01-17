package com.k3519046.juniar_uts.dto;

public class outputDto {
    private inputDto inputData, allowance;

    private int basicsalary;

    public inputDto getInputData() {
        return inputData;
    }

    public void setInputData(inputDto inputData) {
        this.inputData = inputData;
    }

    public inputDto getAllowance() {
        return allowance;
    }

    public void setAllowance(inputDto allowance) {
        this.allowance = allowance;
    }

    public int getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(int basicsalary) {
        this.basicsalary = basicsalary;
    }
}
