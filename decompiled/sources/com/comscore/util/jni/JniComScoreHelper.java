package com.comscore.util.jni;

import android.net.TrafficStats;
import com.comscore.util.Base64Coder;
import com.comscore.util.TcfDataLoader;
import com.comscore.util.crashreport.CrashReport;
import com.comscore.util.crashreport.CrashReportDecorator;
import com.comscore.util.crashreport.CrashReportManager;
import com.comscore.util.log.Logger;
import com.spotify.cosmos.cosmos.Request;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public abstract class JniComScoreHelper implements Logger.OnErrorLogListener {

    /* JADX INFO: renamed from: a */
    private static final int f1641a = 2730;
    protected CrashReportManager crashReporter = new CrashReportManager(createCrashReportDecorator());

    public static class HTTPResponse {
        public final String responseHeaders;
        public final String responseMessage;
        public final int statusCode;

        public HTTPResponse(int i, String str, String str2) {
            this.statusCode = i;
            this.responseMessage = str;
            this.responseHeaders = str2;
        }
    }

    public JniComScoreHelper() {
        Logger.setOnErrorLogListener(this);
    }

    /* JADX INFO: renamed from: a */
    private String m1411a(CharSequence charSequence, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : iterable) {
            if (z) {
                z = false;
            } else {
                sb.append(charSequence);
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    public static String getLocaleValue(boolean z) {
        Locale locale = Locale.getDefault();
        return z ? locale.getDisplayCountry(Locale.US) : locale.getDisplayLanguage(Locale.US);
    }

    private static native void shutdownSdkNative();

    public CrashReportDecorator createCrashReportDecorator() {
        return new CrashReportDecorator(this);
    }

    public String decryptRSA(String str, String str2) {
        try {
            PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64Coder.decode(str2.replace("\n", "").replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", ""))));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            cipher.init(2, privateKeyGeneratePrivate);
            return new String(cipher.doFinal(Base64Coder.decode(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public String encryptRSA(String str, String str2) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64Coder.decode(str2.replace("\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""))));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            cipher.init(1, publicKeyGeneratePublic);
            return new String(Base64Coder.encode(cipher.doFinal(str.getBytes())));
        } catch (Exception unused) {
            return null;
        }
    }

    public abstract String getAppDataDir();

    public abstract String getApplicationId();

    public abstract String getApplicationName();

    public abstract String getApplicationVersion();

    public abstract String getArchitecture();

    public abstract int getConnectivityType();

    public String getCrossPublisherUniqueDeviceId() {
        return null;
    }

    public abstract int getCurrentHostApplicationState();

    public abstract String[] getDeviceIds();

    public abstract String getDeviceModel();

    public String[] getInvalidIds() {
        return null;
    }

    public abstract String getLanguage();

    public abstract String getOsName();

    public abstract String getOsVersion();

    public abstract String getPlatformEnvironmentProperties(String str);

    public abstract Map<String, String> getPlatformLabels(Map<String, String> map);

    public abstract String getRuntimeName();

    public abstract String getRuntimeVersion();

    public abstract int getScreenHeight();

    public abstract int getScreenWidth();

    public TcfDataLoader getTcfDataLoader() {
        return null;
    }

    public abstract boolean isJailBroken();

    public boolean libraryPostUpdate(String str, String str2, Map<String, String> map, ArrayList<String> arrayList) {
        return false;
    }

    public boolean libraryUpdate(String str, String str2, Map<String, String> map) {
        return false;
    }

    public void onCoreCreated() {
    }

    public void onCoreDestroyed() {
    }

    public void onCoreInitializationFinished() {
    }

    public void onCoreStarted() {
    }

    @Override // com.comscore.util.log.Logger.OnErrorLogListener
    public void onLogError(String str, Throwable th) {
        this.crashReporter.addReport(new CrashReport(str, th, (Map<String, String>) null));
    }

    public HTTPResponse sendHttpRequest(boolean z, String str, byte[] bArr, String str2, int i, int i2) {
        int iIndexOf;
        int iIndexOf2;
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArrSplit = str2.split("\\n");
        String str3 = str;
        int i3 = i2;
        while (true) {
            try {
                TrafficStats.setThreadStatsTag(f1641a);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setConnectTimeout(i);
                        httpURLConnection.setReadTimeout(i);
                        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                            int iIndexOf3 = strArrSplit[i4].indexOf(":");
                            if (iIndexOf3 > 0 && iIndexOf3 < strArrSplit[i4].length()) {
                                String strSubstring = strArrSplit[i4].substring(0, iIndexOf3);
                                String strSubstring2 = strArrSplit[i4].substring(iIndexOf3 + 1);
                                if (strSubstring2.length() > 0) {
                                    httpURLConnection.setRequestProperty(strSubstring, strSubstring2);
                                }
                            }
                        }
                        httpURLConnection.setRequestMethod(z ? Request.POST : Request.GET);
                        if (z) {
                            httpURLConnection.setDoOutput(true);
                            if (bArr != null) {
                                OutputStream outputStream = httpURLConnection.getOutputStream();
                                outputStream.write(bArr);
                                outputStream.flush();
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        String responseMessage = httpURLConnection.getResponseMessage();
                        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                            if (entry.getKey() != null && entry.getValue() != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(entry.getKey());
                                sb.append(": ");
                                try {
                                    sb.append(m1411a(",", entry.getValue()));
                                    sb.append("\n");
                                    stringBuffer.append(sb.toString());
                                } catch (Throwable unused) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Throwable unused2) {
                                    }
                                    TrafficStats.clearThreadStatsTag();
                                    return null;
                                }
                            }
                        }
                        i3--;
                        if (i3 >= 0 && ((responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307) && (iIndexOf2 = stringBuffer.indexOf("\n", (iIndexOf = stringBuffer.indexOf("Location:") + 10))) > iIndexOf)) {
                            String string = new URL(new URL(str3), stringBuffer.substring(iIndexOf, iIndexOf2)).toString();
                            if (string != str3) {
                                stringBuffer.delete(0, stringBuffer.length());
                                TrafficStats.clearThreadStatsTag();
                                str3 = string;
                            }
                        }
                        HTTPResponse hTTPResponse = new HTTPResponse(responseCode, responseMessage, stringBuffer.toString());
                        TrafficStats.clearThreadStatsTag();
                        return hTTPResponse;
                    } catch (Throwable unused3) {
                    }
                }
            } catch (Throwable unused4) {
            }
            TrafficStats.clearThreadStatsTag();
            return null;
        }
    }

    public void shutdownSdk() {
        try {
            shutdownSdkNative();
        } catch (UnsatisfiedLinkError e) {
            Logger.m1418e("Error using the native library: ", e);
        }
    }

    public void start() {
        this.crashReporter.start();
    }

    public abstract boolean subscribeToForegroundNotification();

    public abstract boolean unsubscribeFromForegroundNotification();
}
