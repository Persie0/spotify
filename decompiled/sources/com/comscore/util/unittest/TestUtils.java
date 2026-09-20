package com.comscore.util.unittest;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.comscore.util.cpp.CppJavaBinder;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public class TestUtils {
    public static int getExceptionCounter(CppJavaBinder cppJavaBinder) throws NoSuchMethodException {
        Method declaredMethod = CppJavaBinder.class.getDeclaredMethod("getExceptionCounter", null);
        declaredMethod.setAccessible(true);
        return ((Integer) declaredMethod.invoke(cppJavaBinder, null)).intValue();
    }

    public static int getExceptionCounterStatic(Class<?> cls) throws NoSuchMethodException {
        Method declaredMethod = cls.getDeclaredMethod("getExceptionCounter", null);
        declaredMethod.setAccessible(true);
        return ((Integer) declaredMethod.invoke(null, null)).intValue();
    }

    public static native boolean isAnalyticsInitialized();

    public static boolean isServerReachable(Context context, String str) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 29 && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3))) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != -1) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }
}
