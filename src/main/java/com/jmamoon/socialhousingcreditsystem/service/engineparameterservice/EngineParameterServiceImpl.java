/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.engineparameterservice;

import com.jmamoon.socialhousingcreditsystem.entity.EngineParameter;
import com.jmamoon.socialhousingcreditsystem.repository.engineparameterdao.EngineParameterDao;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Service
public class EngineParameterServiceImpl implements EngineParameterService {

    @Autowired
    private EngineParameterDao engineParameterDao;

    @Autowired
    private MessageSource messageSource;

    @Override
    public List<EngineParameter> findAll() {
        final List<EngineParameter> engineParameters = engineParameterDao.findAll();

        mapMessages(engineParameters);

        return engineParameterDao.findAll();
    }

    @Override
    public EngineParameter update(Long id, EngineParameter engineParameter) {
        EngineParameter currentEngineParameter = engineParameterDao.findById(id).orElse(null);

        if (currentEngineParameter != null) {

            currentEngineParameter.setValue(engineParameter.getValue());
            engineParameterDao.save(currentEngineParameter);

            mapMessage(currentEngineParameter);
        }

        return currentEngineParameter;
    }

    private void mapMessages(final List<EngineParameter> engineParameters) {
        engineParameters.stream()
                .map((engineParameter) -> {
                    mapMessage(engineParameter);
                    return engineParameter;
                })
                .collect(Collectors.toList());
    }

    private void mapMessage(EngineParameter engineParameter) throws NoSuchMessageException {
        engineParameter.setName(messageSource.getMessage(engineParameter.getName(), null, LocaleContextHolder.getLocale()));
    }

}
