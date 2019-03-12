/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.drools.kiefilesystemconfiguration;

import java.io.IOException;
import org.kie.api.builder.KieFileSystem;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface KieFileSystemConfiguration {
    
    public KieFileSystem kieFileSystem() throws IOException;
    
}
