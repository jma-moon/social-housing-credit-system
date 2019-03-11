/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.engineparameterservice;

import com.jmamoon.socialhousingcreditsystem.entity.EngineParameter;
import java.util.List;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface EngineParameterService {

    public List<EngineParameter> findAll();

    public EngineParameter update(Long id, EngineParameter engineParameter);

}
