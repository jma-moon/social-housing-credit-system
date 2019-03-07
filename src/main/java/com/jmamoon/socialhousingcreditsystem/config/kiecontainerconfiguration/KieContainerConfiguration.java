/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.kiecontainerconfiguration;

import java.io.IOException;
import org.kie.api.runtime.KieContainer;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface KieContainerConfiguration {

    public KieContainer kieContainer() throws IOException;

}
