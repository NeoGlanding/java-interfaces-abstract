package com.ihsanabd;

public class Phone implements Gadget {
    private String manufacturer;
    private String imei;
    private String series;

    public Phone(String manufacturer, String imei, String series) {
        this.manufacturer = manufacturer;
        this.imei = imei;
        this.series = series;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getImei() {
        return imei;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public void powerOn() {
        System.out.println("Phone System On");
    }

    @Override
    public void powerOff() {
        System.out.println("Phone System off");
    }
}
