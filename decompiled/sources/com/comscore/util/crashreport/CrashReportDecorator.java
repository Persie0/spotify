package com.comscore.util.crashreport;

import com.comscore.Analytics;
import com.comscore.PublisherConfiguration;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.setup.PlatformSetup;
import com.comscore.util.setup.Setup;
import com.spotify.player.model.ContextTrack;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p204p.rbz;

/* JADX INFO: loaded from: classes.dex */
public class CrashReportDecorator {

    /* JADX INFO: renamed from: d */
    private static final String f1616d = "21193409";

    /* JADX INFO: renamed from: e */
    private static final String f1617e = "9bfbb83ee80ccdee95e73bc93dacd62f";

    /* JADX INFO: renamed from: a */
    private JniComScoreHelper f1618a;

    /* JADX INFO: renamed from: c */
    private String f1620c = null;

    /* JADX INFO: renamed from: b */
    private long f1619b = System.currentTimeMillis();

    /* JADX INFO: renamed from: com.comscore.util.crashreport.CrashReportDecorator$a */
    /* JADX INFO: loaded from: classes3.dex */
    public class C0126a {

        /* JADX INFO: renamed from: a */
        String f1621a;

        /* JADX INFO: renamed from: b */
        boolean f1622b;

        /* JADX INFO: renamed from: c */
        int f1623c;

        /* JADX INFO: renamed from: d */
        int f1624d;

        /* JADX INFO: renamed from: e */
        int f1625e;

        public C0126a() {
        }

        public C0126a(String str) {
            String strTrim = str.trim();
            int iIndexOf = strTrim.indexOf(32);
            if (iIndexOf < 0) {
                this.f1622b = false;
                return;
            }
            String strSubstring = strTrim.substring(0, iIndexOf);
            this.f1621a = strSubstring;
            String strReplace = strSubstring.replace(" ", "");
            this.f1621a = strReplace;
            if (strReplace.length() == 0) {
                this.f1622b = false;
                return;
            }
            String strTrim2 = strTrim.substring(iIndexOf + 1, strTrim.length()).trim();
            int iIndexOf2 = strTrim2.indexOf(32);
            if (iIndexOf2 < 0) {
                this.f1622b = false;
                return;
            }
            String strSubstring2 = strTrim2.substring(0, iIndexOf2);
            if (strSubstring2.length() != 2) {
                this.f1622b = false;
                return;
            }
            String strSubstring3 = strSubstring2.substring(0, 1);
            String strSubstring4 = strSubstring2.substring(1, 2);
            this.f1623c = Integer.valueOf(strSubstring3).intValue();
            this.f1624d = Integer.valueOf(strSubstring4).intValue();
            String strTrim3 = strTrim2.substring(2, strTrim2.length()).trim();
            int iIndexOf3 = strTrim3.indexOf(32);
            if (iIndexOf3 < 0) {
                return;
            }
            this.f1622b = "true".equals(strTrim3.substring(0, iIndexOf3));
            this.f1625e = Integer.valueOf(strTrim3.substring(iIndexOf3 + 1, strTrim3.length()).trim()).intValue();
        }
    }

    public CrashReportDecorator(JniComScoreHelper jniComScoreHelper) {
        this.f1618a = jniComScoreHelper;
    }

    /* JADX INFO: renamed from: a */
    private String m1398a() {
        C0126a c0126aM1401c;
        List<PublisherConfiguration> publisherConfigurations = Analytics.getConfiguration().getPublisherConfigurations();
        if (publisherConfigurations == null || publisherConfigurations.size() == 0) {
            return f1617e;
        }
        int i = 0;
        PublisherConfiguration publisherConfiguration = publisherConfigurations.get(0);
        String[] deviceIds = this.f1618a.getDeviceIds();
        if (deviceIds == null) {
            c0126aM1401c = null;
            break;
        }
        int length = deviceIds.length;
        while (true) {
            if (i >= length) {
                c0126aM1401c = null;
                break;
            }
            c0126aM1401c = new C0126a(deviceIds[i]);
            if (c0126aM1401c.f1622b) {
                break;
            }
            i++;
        }
        if (c0126aM1401c == null) {
            c0126aM1401c = m1401c();
        }
        StringBuilder sbM75191i = rbz.m75191i(md5(c0126aM1401c.f1621a + md5("zutphen2011comScore@" + publisherConfiguration.getPublisherId())), "-cs");
        sbM75191i.append(c0126aM1401c.f1623c);
        sbM75191i.append(c0126aM1401c.f1624d);
        return sbM75191i.toString();
    }

    /* JADX INFO: renamed from: b */
    private String m1400b() {
        List<PublisherConfiguration> publisherConfigurations = Analytics.getConfiguration().getPublisherConfigurations();
        return (publisherConfigurations == null || publisherConfigurations.size() == 0) ? f1616d : publisherConfigurations.get(0).getPublisherId();
    }

    /* JADX INFO: renamed from: c */
    private C0126a m1401c() {
        if (this.f1620c == null) {
            this.f1620c = UUID.randomUUID().toString();
        }
        C0126a c0126a = new C0126a();
        c0126a.f1621a = this.f1620c;
        c0126a.f1623c = 2;
        return c0126a;
    }

    public void fillCrashReport(CrashReport crashReport) {
        Map<String, String> extras = crashReport.getExtras();
        extras.put("c1", "22");
        extras.put("c2", m1400b());
        String applicationName = this.f1618a.getApplicationName();
        if (applicationName == null) {
            applicationName = "";
        }
        extras.put("ns_ap_an", applicationName);
        String osName = this.f1618a.getOsName();
        if (osName == null) {
            osName = "";
        }
        extras.put("ns_ap_pn", osName);
        String runtimeVersion = this.f1618a.getRuntimeVersion();
        if (runtimeVersion == null) {
            runtimeVersion = "";
        }
        extras.put("ns_ap_pv", runtimeVersion);
        extras.put("c12", m1398a());
        extras.put("name", "Application");
        extras.put("ns_ap_ev", "log");
        String deviceModel = this.f1618a.getDeviceModel();
        if (deviceModel == null) {
            deviceModel = "";
        }
        extras.put("ns_ap_device", deviceModel);
        extras.put("ns_ap_id", String.valueOf(this.f1619b));
        String applicationId = this.f1618a.getApplicationId();
        if (applicationId == null) {
            applicationId = "";
        }
        extras.put("ns_ap_bi", applicationId);
        String runtimeName = this.f1618a.getRuntimeName();
        if (runtimeName == null) {
            runtimeName = "";
        }
        extras.put("ns_ap_pfm", runtimeName);
        String osVersion = this.f1618a.getOsVersion();
        if (osVersion == null) {
            osVersion = "";
        }
        extras.put("ns_ap_pfv", osVersion);
        String applicationVersion = this.f1618a.getApplicationVersion();
        if (applicationVersion == null) {
            applicationVersion = "";
        }
        extras.put("ns_ap_ver", applicationVersion);
        PlatformSetup platformSetup = Setup.getPlatformSetup();
        String javaCodeVersion = platformSetup == null ? "" : platformSetup.getJavaCodeVersion();
        if (javaCodeVersion == null) {
            javaCodeVersion = "";
        }
        extras.put("ns_ap_sv", javaCodeVersion);
        extras.put("ns_ap_bv", "");
        extras.put("ns_ap_smv", "");
        extras.put("ns_type", ContextTrack.Metadata.KEY_HIDDEN);
        extras.put("ns_nc", "1");
        extras.put("ns_ap_ar", this.f1618a.getArchitecture());
        extras.put("ns_ap_cfg", "");
        extras.put("ns_ap_env", "");
        extras.put("ns_ap_ais", "");
        extras.put("ns_ap_i7", "");
    }

    public String md5(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return ((Object) sb) + "";
        } catch (Exception unused) {
            return null;
        }
    }

    public String sha1(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return m1399a(messageDigest.digest());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private String m1399a(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte b : bArr) {
            formatter.format("%02x", Byte.valueOf(b));
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
