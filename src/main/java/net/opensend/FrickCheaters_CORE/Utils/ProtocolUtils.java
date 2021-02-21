package net.opensend.FrickCheaters_CORE.Utils;

public class ProtocolUtils {
    public static String convertProtocolVersion (int v) {
        if (v >= 0 && v <= 5) return "1.7.x";
        if (v >= 6 && v <= 46) return "1.8";
        if (v == 47) return "1.8.x";
        if (v >= 48 && v <= 106) return "1.9";
        if (v >= 107 && v <= 110) return "1.9.x";
        if (v >= 201 && v <= 205) return "1.10";
        if (v == 210) return "1.10.x";
        if (v >= 301 && v <= 315) return "1.11";
        if (v == 316) return "1.11.x";
        if (v >= 317 && v <= 335) return "1.12";
        if (v >= 336 && v <= 338) return "1.12.1";
        if (v >= 339 && v <= 340) return "1.12.2";
        if (v >= 341 && v <= 393) return "1.13";
        if (v >= 394 && v <= 401) return "1.13.1";
        if (v >= 402 && v <= 404) return "1.13.2";
        if (v >= 441 && v <= 477) return "1.14";
        if (v >= 478 && v <= 480) return "1.14.1";
        if (v >= 481 && v <= 485) return "1.14.2";
        if ((v >= 486 && v <= 490) || v == 500) return "1.14.3";
        if (v >= 491 && v <= 498) return "1.14.4";
        if (v >= 550 && v <= 573) return "1.15";
        if (v >= 574 && v <= 575) return "1.15.1";
        if (v >= 576 && v <= 578) return "1.15.2";
        if (v >= 701 && v <= 735) return "1.16";
        if (v == 736) return "1.16.1";
        if (v >= 738 && v <= 751) return "1.16.2";
        if (v >= 752 && v <= 753) return "1.16.3";
        if (v == 754) return "1.16.x";
        return "x";
    }
}
