/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.engineparametersservice;

import com.jmamoon.socialhousingcreditsystem.entity.EngineParameter;
import com.jmamoon.socialhousingcreditsystem.model.EngineParameters;
import com.jmamoon.socialhousingcreditsystem.repository.engineparameterdao.EngineParameterDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Service
public class EngineParametersServiceImpl implements EngineParametersService {

    @Autowired
    private EngineParameterDao engineParameterDao;

    @Override
    public EngineParameters getEngineParameters() {

        EngineParameters engineParameters = new EngineParameters();
        List<EngineParameter> engineParameterList = engineParameterDao.findAll();

        engineParameterList.stream().forEach((engineParameter) -> {
            engineParameters.setParameter(engineParameter.getName(), engineParameter.getValue());
        });

        return engineParameters;
    }

}
