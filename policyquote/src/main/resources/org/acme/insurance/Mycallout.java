package org.acme.insurance;

import org.kie.api.runtime.Channel;


public class Mycallout implements Channel  {
	
	@Override
    public void send(Object object) {
        System.out.println("=============================>kavithatestfromcallout" + object);
    }

}
