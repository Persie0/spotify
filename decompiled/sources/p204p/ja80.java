package p204p;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ja80 {

    /* JADX INFO: renamed from: b */
    public static final vi10 f110402b = new vi10("LibraryVersion", "");

    /* JADX INFO: renamed from: c */
    public static final ja80 f110403c = new ja80();

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f110404a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final String m52806a(String str) throws Throwable {
        String str2;
        InputStream resourceAsStream;
        String str3;
        String str4;
        String str5;
        String str6;
        vi10 vi10Var = f110402b;
        ig31.m50503u(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f110404a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        property = null;
        property = null;
        String property = null;
        InputStream inputStream2 = null;
        try {
            try {
                resourceAsStream = ja80.class.getResourceAsStream("/" + str + ".properties");
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb.append(str);
                        sb.append(" version is ");
                        sb.append(property);
                        String string = sb.toString();
                        if (Log.isLoggable(vi10Var.f241586a, 2) && (str6 = vi10Var.f241587b) != null) {
                            str6.concat(string);
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb2.append("Failed to get app version for libraryName: ");
                        sb2.append(str);
                        String string2 = sb2.toString();
                        if (Log.isLoggable(vi10Var.f241586a, 5) && (str5 = vi10Var.f241587b) != null) {
                            str5.concat(string2);
                        }
                    }
                } catch (IOException unused) {
                    String str7 = property;
                    inputStream = resourceAsStream;
                    str2 = str7;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb3.append("Failed to get app version for libraryName: ");
                    sb3.append(str);
                    String string3 = sb3.toString();
                    if (Log.isLoggable(vi10Var.f241586a, 6) && (str3 = vi10Var.f241587b) != null) {
                        str3.concat(string3);
                    }
                    InputStream inputStream3 = inputStream;
                    property = str2;
                    resourceAsStream = inputStream3;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = resourceAsStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused3) {
            str2 = null;
        }
        if (resourceAsStream != null) {
            try {
                resourceAsStream.close();
            } catch (IOException unused4) {
            }
        }
        if (property == null) {
            if (Log.isLoggable(vi10Var.f241586a, 3) && (str4 = vi10Var.f241587b) != null) {
                str4.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            property = "UNKNOWN";
        }
        concurrentHashMap.put(str, property);
        return property;
    }
}
