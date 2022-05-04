package com.ihsanabd;

public class Phone implements Gadget {
    public String manufacturer;
    private String imei;

    @Override
    public void powerOn() {
        System.out.println("System On");
    }

    @Override
    public void powerOff() {
        System.out.println("System off");
    }
}
