/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.KieServiceFactory;

import org.kie.api.KieServices;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class KieServicesFactory {

    public static KieServices create() {
        return KieServices.Factory.get();
    }

}
