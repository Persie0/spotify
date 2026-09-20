package com.comscore.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class CommonUtils {

    /* JADX INFO: renamed from: a */
    private static final String f1529a = "persist.sys.dalvik.vm.lib";

    /* JADX INFO: renamed from: b */
    private static final String f1530b = "libdvm.so";

    /* JADX INFO: renamed from: c */
    private static final String f1531c = "libart.so";

    /* JADX INFO: renamed from: d */
    private static final String f1532d = "libartd.so";

    private CommonUtils() {
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1209a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* JADX INFO: renamed from: b */
    private static boolean m1210b() {
        try {
            return new File("/system/app/Superuser.apk").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getApplicationName(Context context) {
        if (context == null) {
            return "unknown";
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0));
            return applicationLabel != null ? applicationLabel.toString() : "unknown";
        } catch (PackageManager.NameNotFoundException unused) {
            return "unknown";
        }
    }

    public static String getApplicationResolution(Context context) {
        Point applicationSize = getApplicationSize(context);
        return applicationSize.x + "x" + applicationSize.y;
    }

    public static Point getApplicationSize(Context context) {
        if (Build.VERSION.SDK_INT < 30) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            return new Point(point.x, point.y);
        }
        WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
        int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
        Rect bounds = currentWindowMetrics.getBounds();
        return new Point(bounds.width() - i, bounds.height() - i2);
    }

    public static String getApplicationVersion(Context context) {
        if (context == null) {
            return "unknown";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "unknown";
        }
    }

    public static int getConnectivityType(Context context) {
        if (context == null || !C0117a.m1211a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue()) {
            return ConnectivityType.UNKNOWN;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return ConnectivityType.DISCONNECTED;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return ConnectivityType.UNKNOWN;
            }
            if (networkCapabilities.hasTransport(0)) {
                return ConnectivityType.WWAN;
            }
            if (networkCapabilities.hasTransport(1)) {
                return ConnectivityType.WIFI;
            }
            if (networkCapabilities.hasTransport(3)) {
                return ConnectivityType.ETHERNET;
            }
            return networkCapabilities.hasTransport(2) ? ConnectivityType.BLUETOOTH : ConnectivityType.CONNECTED;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return ConnectivityType.DISCONNECTED;
        }
        if (activeNetworkInfo.getType() == 1) {
            return ConnectivityType.WIFI;
        }
        if (activeNetworkInfo.getType() == 0 || activeNetworkInfo.getType() == 4 || activeNetworkInfo.getType() == 5 || activeNetworkInfo.getType() == 2 || activeNetworkInfo.getType() == 3) {
            return ConnectivityType.WWAN;
        }
        if (activeNetworkInfo.getType() == 9) {
            return ConnectivityType.ETHERNET;
        }
        return activeNetworkInfo.getType() == 7 ? ConnectivityType.BLUETOOTH : ConnectivityType.CONNECTED;
    }

    public static String getDeviceArchitecture() {
        return System.getProperty("os.arch");
    }

    public static String getDeviceModel() {
        return Build.DEVICE;
    }

    public static String getDisplayResolution(Context context) {
        Point displaySize = getDisplaySize(context);
        return displaySize.x + "x" + displaySize.y;
    }

    public static Point getDisplaySize(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics();
            return new Point(currentWindowMetrics.getBounds().width(), currentWindowMetrics.getBounds().height());
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Point(point.x, point.y);
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getOsName() {
        return "android";
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getPackageName(Context context) {
        return context == null ? "unknown" : context.getPackageName();
    }

    public static String getRuntime() {
        String property = System.getProperty("java.vm.name");
        Locale locale = Locale.US;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, f1529a, "Dalvik");
            if (f1530b.equals(str)) {
                return "Dalvik".toLowerCase(locale);
            }
            if (f1531c.equals(str)) {
                return "ART".toLowerCase(locale);
            }
            return f1532d.equals(str) ? "ART_Debug".toLowerCase(locale) : str.toLowerCase(locale);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return property.toLowerCase(locale);
        }
    }

    public static boolean isDeviceRooted() {
        return m1209a() || m1210b();
    }
}
