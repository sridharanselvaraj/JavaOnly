package Enum;

//Instance field

public enum WhoisRIP {
    ARIN("whois.arin.net"),
    RIPE("whois.ripe.net"),
    APNIC("whois.apnic.net"),
    AFRINIC("whois.afrinic.net"),
    UNKNOWN("");

    private String url;

    WhoisRIP(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
