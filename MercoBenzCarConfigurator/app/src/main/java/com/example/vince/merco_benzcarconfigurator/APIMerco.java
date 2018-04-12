package com.example.vince.merco_benzcarconfigurator;

import android.content.Context;

public class APIMerco {

    private Context context;
    private static final String API_KEY = "97a04e20-363e-47ac-9e9f-486d333c4c7c";


    public String SmartFortwoTurbo(boolean a) {
        String url = "https://api.mercedes-benz.com/image/v1/vehicles/WME4533441K012345/vehicle?perspectives=EXT020%2CINT1&roofOpen=false&night=false&apikey=" + API_KEY;

        String urlEXT="https://europe.starconnect-ce.i.daimler.com/iris/iris?COSY-EU-100-1713d0VXqXhBqtyO35PobzIExXrItvsTQKkojUfGoo7GE11YFm9zNl9Q66pcBXliqXGHcr4Wgx3Cg9Q1srPDk2DYeWmpxcsdhuUhUf%25VRUGEyFL20lY9P0B2rN8iACBUXOcdv4FIk3Hg9Qm7BPDkBzAeWmAW6sdh5dEUf%25CfmGEyAZO0lYf5HB2rE48Apnlsn5uo2UbC3Mk4MzNTmDo7j6zUkKVSmd4vqth2gLRl%25d6ziQOha%255Xh3JdcUaXtTwwbYirJ5XrHAnYh3hUtU9SE2FTDS1IwwZC&&IMGT=P27&POV=BE350,PZM";
        String urlINT="https://europe.starconnect-ce.i.daimler.com/iris/iris?COSY-EU-100-1713d0VXqXhBqtyO35PobzIExXrItvsTQKkojUfGoo7GE11YFm9zNl9Q66pcBXliqXGHcr4Wgx3Cg9Q1srPDk2DYeWmpxcsdhuUhUf%25VRUGEyFL20lY9P0B2rN8iACBUXOcdv4FIk3Hg9Qm7BPDkBzAeWmAW6sdh5dEUf%25CfmGEyAZO0lYf5HB2rE48Apnlsn5uo2UbC3Mk4MzNTmDo7j6zUkKVSmd4vqth2gLRl%25d6ziQOha%255Xh3JdcUaXtTwwbYirJ5XrHAnYh3hUtU9SE2FTDS1IwwZC&&IMGT=P27&POV=BI4,PZM";

        if(a == true){
            return urlEXT;
        }
        else {
            return urlINT;
        }
    }

    public String S_500_Cabrio(boolean a){
        String url = "https://api.mercedes-benz.com/image/v1/vehicles/WDD2174821A123456/vehicle?perspectives=EXT350%2CINT4&roofOpen=false&night=false&apikey=" + API_KEY;

        String urlEXT="https://europe.starconnect-ce.i.daimler.com/iris/iris?COSY-EU-100-1713d0VXqbEFqtyO35PobzIExXrItvsTQKkojUfGoo7GE11KFm9tha9Q6FjcBXwUuXGEuimJ0l34JOB2Ng1bApjP9I5uVe2QC3qE1kzNRJnm7jxODhKV1%25N%25vq9vqyLRD32Yax7XSrH1KJrn8wvAcoiZL7YM4FaSwTg9HxT6PD8rNSeWAmu89QCY32DkzrcpWm7nXUdhKof3f%25vW1iEyLtbjlYacua2rHk15pn8mnUuoihfz3M4HF2NTg89Sj6PXWdVRjuC75nZf%25vt%25NEyLhXPlYa%25Ia2rHy7Lpn85NRuoiMZi3M4TQ5NTmCI82R0s5jCSukxgHg9jP4HttU7RKeEPKVfv75Y5949JikhXHOiSGttcl&&IMGT=P27&POV=BE350,PZM";
        String urlINT="https://europe.starconnect-ce.i.daimler.com/iris/iris?COSY-EU-100-1713d0VXqbEFqtyO35PobzIExXrItvsTQKkojUfGoo7GE11KFm9tha9Q6FjcBXwUuXGEuimJ0l34JOB2Ng1bApjP9I5uVe2QC3qE1kzNRJnm7jxODhKV1%25N%25vq9vqyLRD32Yax7XSrH1KJrn8wvAcoiZL7YM4FaSwTg9HxT6PD8rNSeWAmu89QCY32DkzrcpWm7nXUdhKof3f%25vW1iEyLtbjlYacua2rHk15pn8mnUuoihfz3M4HF2NTg89Sj6PXWdVRjuC75nZf%25vt%25NEyLhXPlYa%25Ia2rHy7Lpn85NRuoiMZi3M4TQ5NTmCI82R0s5jCSukxgHg9jP4HttU7RKeEPKVfv75Y5949JikhXHOiSGttcl&&IMGT=P27&POV=BI4,PZM";

        if(a == true){
            return urlEXT;
        }
        else {
            return urlINT;
        }
    }

    public String classeGLA(boolean a){
        String url = "https://api.mercedes-benz.com/image/v1/vehicles/WDC1569431J123456/vehicle?perspectives=EXT020%2CINT1&roofOpen=false&night=false&apikey=" + API_KEY;

        String urlEXT="https://archive.starconnect-ce.i.daimler.com/iris/iris?COSY-EU-100-1713d0VXq58FqtyO35PobzIExXrItvsTQKkojUfGoo7GE11KFm9wja9Q6FjcBXB%25kXGEZG3J0l30fOB2Ng1bApjTlI5uVQxQC3qv1kzNRLNm7jZcfhKVFpF%25vq9u95j6PAHvVSeox5qtsM1NRcUT3vxXGkXC1J0mrqwOBhTGZbA%25FLFI5wua9QCZQCDkzM6gWm7JjUdhKOhzf%25vb2gEyLIwBlYaQDl2rHkT2pn86wpuoiSF93julB50yxDkzcq8Wm76mudhKkxqf%25vGONEyLYwxlYOGcKW3PiU2GOHl68Lax2HL7oo4B3A89HApF5BUkUxLx6vJbT7SvngooMD&&IMGT=P27&POV=BE350,PZM";
        String urlINT="https://archive.starconnect-ce.i.daimler.com/iris/iris?COSY-EU-100-1713d0VXq58FqtyO35PobzIExXrItvsTQKkojUfGoo7GE11KFm9wja9Q6FjcBXB%25kXGEZG3J0l30fOB2Ng1bApjTlI5uVQxQC3qv1kzNRLNm7jZcfhKVFpF%25vq9u95j6PAHvVSeox5qtsM1NRcUT3vxXGkXC1J0mrqwOBhTGZbA%25FLFI5wua9QCZQCDkzM6gWm7JjUdhKOhzf%25vb2gEyLIwBlYaQDl2rHkT2pn86wpuoiSF93julB50yxDkzcq8Wm76mudhKkxqf%25vGONEyLYwxlYOGcKW3PiU2GOHl68Lax2HL7oo4B3A89HApF5BUkUxLx6vJbT7SvngooMD&&IMGT=P27&POV=BI4,PZM";

        if(a == true){
            return urlEXT;
        }
        else {
            return urlINT;
        }

    }

    public String classeE(boolean a){
        String url = "https://api.mercedes-benz.com/image/v1/vehicles/WDD2130331A123456/vehicle?perspectives=EXT020%2CINT1&roofOpen=false&night=false&apikey=" + API_KEY;

        String urlEXT="https://europe.starconnect-ce.i.daimler.com/iris/iris?COSY-EU-100-1713d0VXq0SeqtyO35PobzIExXrItvsTQKkojUfGoo7GE11KFm9ehP9Q6FjcBXBUfXGEAGYJ0l5HVOB2NrqeEyLiyKlYa4un2rHgFLpn8P6puoiGZF3M40FPNTgBdwj6PAfzVSe5ELqtsCiaRcUTyDxXG6NG1J0SjawOBtZHZbA%25pLFI5yIB9QCYdHDkzrfDWm7nRHdhKof3f%25vWODEyLtXLlYacIV2rHk15pn8mdEuoihfu3M4%25E7NTgyZij6PXfWVSeJdfqxV3zKCoFEyLJbGlYa%25x12rHyrHpn8YbpuoirmT3M4nV9NTg7dgj6PSDZVSetS5qtsctNRcUX4zxXrL%25ejFzAv1LOqv2wUGE10UPbb5HF8B308wuiHvTvEUEksYnQPmsOCbbIN&&IMGT=P27&POV=BE350,PZM";
        String urlINT="https://europe.starconnect-ce.i.daimler.com/iris/iris?COSY-EU-100-1713d0VXq0SeqtyO35PobzIExXrItvsTQKkojUfGoo7GE11KFm9ehP9Q6FjcBXBUfXGEAGYJ0l5HVOB2NrqeEyLiyKlYa4un2rHgFLpn8P6puoiGZF3M40FPNTgBdwj6PAfzVSe5ELqtsCiaRcUTyDxXG6NG1J0SjawOBtZHZbA%25pLFI5yIB9QCYdHDkzrfDWm7nRHdhKof3f%25vWODEyLtXLlYacIV2rHk15pn8mdEuoihfu3M4%25E7NTgyZij6PXfWVSeJdfqxV3zKCoFEyLJbGlYa%25x12rHyrHpn8YbpuoirmT3M4nV9NTg7dgj6PSDZVSetS5qtsctNRcUX4zxXrL%25ejFzAv1LOqv2wUGE10UPbb5HF8B308wuiHvTvEUEksYnQPmsOCbbIN&&IMGT=P27&POV=BI4,PZM";

        if(a == true){
            return urlEXT;
        }
        else {
            return urlINT;
        }
    }
}