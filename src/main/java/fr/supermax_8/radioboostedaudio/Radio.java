package fr.supermax_8.radioboostedaudio;

public class Radio {

    private String itemname;
    private String permission;
    private double[] frequencies;

    public Radio(String itemname, String permission, double[] frequencies) {
        this.itemname = itemname;
        this.permission = permission;
        this.frequencies = frequencies;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public double[] getFrequencies() {
        return frequencies;
    }

    public void setFrequencies(double[] frequencies) {
        this.frequencies = frequencies;
    }

}