package com.k3519046.juniar_uts.service;

import com.k3519046.juniar_uts.dto.inputDto;
import com.k3519046.juniar_uts.dto.outputDto;
import org.springframework.stereotype.Service;

@Service
public class KaryawanService {

    private final int gajiDasar = 4500;

    public outputDto gajiCEO(inputDto input){
        outputDto output = new outputDto();
        output.setInputData(input);
        output.setBasicsalary(gajiDasar * 8);
        inputDto inputData = new inputDto();
        inputData.setFamily(input.getFamily()*30);
        inputData.setOvertime(input.getOvertime()*20);
        output.setAllowance(inputData);
        return output;
    }

    public outputDto gajiManager(inputDto input){
        outputDto output = new outputDto();
        output.setInputData(input);
        output.setBasicsalary(gajiDasar * 3);
        inputDto inputData = new inputDto();
        inputData.setFamily(input.getFamily()*30);
        inputData.setOvertime(input.getOvertime()*10);
        output.setAllowance(inputData);
        return output;
    }


    public outputDto gajiSeniorEmp(int family, int overtime){
        outputDto output = new outputDto();
        output.setBasicsalary(gajiDasar * 2);
        inputDto inputData = new inputDto();
        inputData.setOvertime(overtime);
        inputData.setFamily(family);
        output.setInputData(inputData);
        inputDto inputData2 = new inputDto();
        inputData2.setFamily(family*30);
        inputData2.setOvertime(overtime*5);
        output.setAllowance(inputData2);
        return output;
    }

    public outputDto gajiEmp(int family, int overtime){
        outputDto output = new outputDto();
        output.setBasicsalary(gajiDasar);
        inputDto inputData = new inputDto();
        inputData.setOvertime(overtime);
        inputData.setFamily(family);
        output.setInputData(inputData);
        inputDto inputData2 = new inputDto();
        inputData2.setFamily(family*30);
        inputData2.setOvertime(overtime*4);
        output.setAllowance(inputData2);
        return output;
    }
}
