package org.acme.insurance;

import org.kie.api.runtime.Channel;


public class Mycallout implements Channel  {
    public static final String CHANNEL_ID = "outcomes"; 
	
	@Override
    public void send(Object object) {
        System.out.println("=============================>kavithatestfromcallout" );
        System.out.println(object.toString());
    }

}
