package com.comscore.util.crashreport;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import p204p.s571;

/* JADX INFO: loaded from: classes.dex */
public class CrashReportHttpFlusher implements CrashReportFlusher {

    /* JADX INFO: renamed from: a */
    private static final int f1627a = 4088;

    /* JADX INFO: renamed from: a */
    private HttpURLConnection m1402a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("Connection", "Close");
        return httpURLConnection;
    }

    public URL createURL(String str) {
        if (str.length() > f1627a) {
            String strSubstring = str.substring(0, f1627a);
            int iLastIndexOf = strSubstring.lastIndexOf(37);
            if (iLastIndexOf >= 4086) {
                strSubstring = strSubstring.substring(0, iLastIndexOf);
            }
            str = s571.m77250i(strSubstring, "&ns_cut=");
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.comscore.util.crashreport.CrashReportFlusher
    public boolean flush(String str, CrashReportParser crashReportParser, CrashReport crashReport) {
        boolean z = false;
        HttpURLConnection httpURLConnectionM1402a = null;
        try {
            httpURLConnectionM1402a = m1402a(createURL(str + "?" + crashReportParser.reportToString(crashReport)));
            int responseCode = httpURLConnectionM1402a.getResponseCode();
            if (responseCode == 200 || responseCode == 204) {
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpURLConnectionM1402a != null) {
            httpURLConnectionM1402a.disconnect();
        }
        return z;
    }
}
