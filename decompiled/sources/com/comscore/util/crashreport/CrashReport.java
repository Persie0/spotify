package com.comscore.util.crashreport;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class CrashReport {

    /* JADX INFO: renamed from: a */
    private String f1613a;

    /* JADX INFO: renamed from: b */
    private String f1614b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f1615c;

    public CrashReport(String str, Throwable th) {
        this(str, th, (Map<String, String>) null);
    }

    /* JADX INFO: renamed from: a */
    private void m1397a(Map<String, String> map) {
        this.f1615c = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                this.f1615c.put(key, value);
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CrashReport)) {
            return false;
        }
        CrashReport crashReport = (CrashReport) obj;
        return crashReport.getMessage().equals(getMessage()) && crashReport.getStackTrace().equals(getStackTrace()) && crashReport.getExtras().equals(getExtras());
    }

    public Map<String, String> getExtras() {
        return this.f1615c;
    }

    public String getMessage() {
        return this.f1613a;
    }

    public String getStackTrace() {
        return this.f1614b;
    }

    public CrashReport(String str, Throwable th, Map<String, String> map) {
        String string;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        } else {
            string = "";
        }
        this.f1614b = string;
        this.f1613a = str == null ? "" : str;
        m1397a(map);
    }

    public CrashReport(String str, String str2, Map<String, String> map) {
        this.f1614b = str2 == null ? "" : str2;
        this.f1613a = str == null ? "" : str;
        m1397a(map);
    }
}
