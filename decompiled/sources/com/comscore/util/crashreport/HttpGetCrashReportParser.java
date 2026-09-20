package com.comscore.util.crashreport;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import p196j$.net.URLDecoder;
import p196j$.net.URLEncoder;
import p204p.rbz;

/* JADX INFO: loaded from: classes.dex */
public class HttpGetCrashReportParser implements CrashReportParser {

    /* JADX INFO: renamed from: a */
    private final String f1639a = " | ";

    /* JADX INFO: renamed from: b */
    private final String f1640b = "ns_ap_uxc";

    /* JADX INFO: renamed from: a */
    private String m1409a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private String m1410b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.comscore.util.crashreport.CrashReportParser
    public String reportToString(CrashReport crashReport) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : crashReport.getExtras().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                if (value == null) {
                    value = "";
                }
                sb.append("&");
                sb.append(key);
                sb.append("=");
                sb.append(m1410b(value));
            }
        }
        String message = crashReport.getMessage();
        if (crashReport.getStackTrace() != null) {
            StringBuilder sbM75191i = rbz.m75191i(message, " | ");
            sbM75191i.append(crashReport.getStackTrace());
            message = sbM75191i.toString();
        }
        sb.append("&ns_ap_uxc=");
        sb.append(m1410b(message));
        return (sb.length() <= 0 || sb.charAt(0) != '&') ? sb.toString() : sb.substring(1);
    }

    @Override // com.comscore.util.crashreport.CrashReportParser
    public CrashReport stringToReport(String str) {
        String str2;
        HashMap map = new HashMap();
        for (String str3 : str.split("\\&", -1)) {
            int iIndexOf = str3.indexOf("=");
            map.put(str3.substring(0, iIndexOf), m1409a(str3.substring(iIndexOf + 1, str3.length())));
        }
        String str4 = (String) map.get("ns_ap_uxc");
        map.remove("ns_ap_uxc");
        String str5 = "";
        if (str4 != null) {
            int iIndexOf2 = str4.indexOf(" | ");
            if (iIndexOf2 >= 0) {
                String strSubstring = str4.substring(0, iIndexOf2);
                String strSubstring2 = str4.substring(iIndexOf2 + 3, str4.length());
                str4 = strSubstring;
                str5 = strSubstring2;
            }
            String str6 = str4;
            str2 = str5;
            str5 = str6;
        } else {
            str2 = "";
        }
        return new CrashReport(str5, str2, map);
    }
}
