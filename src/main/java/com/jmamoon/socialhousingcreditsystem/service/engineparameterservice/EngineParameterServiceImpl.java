/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.engineparameterservice;

import com.jmamoon.socialhousingcreditsystem.entity.EngineParameter;
import com.jmamoon.socialhousingcreditsystem.repository.engineparameterdao.EngineParameterDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Service
public class EngineParameterServiceImpl implements EngineParameterService {

    @Autowired
    private EngineParameterDao engineParameterDao;

    @Override
    public List<EngineParameter> findAll() {
        return engineParameterDao.findAll();
    }

    @Override
    public EngineParameter update(EngineParameter engineParameter) {
        return engineParameterDao.save(engineParameter);
    }

}
