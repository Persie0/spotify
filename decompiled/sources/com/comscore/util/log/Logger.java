package com.comscore.util.log;

import com.comscore.util.setup.Setup;

/* JADX INFO: loaded from: classes.dex */
public class Logger {

    /* JADX INFO: renamed from: a */
    private static final int f1642a = 30000;

    /* JADX INFO: renamed from: b */
    private static int f1643b = 30000;

    /* JADX INFO: renamed from: c */
    private static OnErrorLogListener f1644c;
    public static LogHelper log;

    public interface OnErrorLogListener {
        void onLogError(String str, Throwable th);
    }

    /* JADX INFO: renamed from: a */
    private static void m1412a(String str, Throwable th) {
        OnErrorLogListener onErrorLogListener = f1644c;
        if (onErrorLogListener == null) {
            return;
        }
        onErrorLogListener.onLogError(str, th);
    }

    /* JADX INFO: renamed from: d */
    public static void m1413d(String str) {
        LogHelper logHelper;
        if (f1643b >= 30003 && (logHelper = log) != null) {
            logHelper.mo1249d(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1415e(String str) {
        LogHelper logHelper;
        m1412a(str, null);
        if (f1643b >= 30001 && (logHelper = log) != null) {
            logHelper.mo1251e(str);
        }
    }

    public static int getLogLevel() {
        if (Setup.isSetUpFinished()) {
            try {
                return getLogLevelNative();
            } catch (UnsatisfiedLinkError e) {
                m1418e("Error using the native library: ", e);
            }
        }
        return f1643b;
    }

    private static native int getLogLevelNative();

    /* JADX INFO: renamed from: i */
    public static void m1419i(String str) {
        LogHelper logHelper;
        if (f1643b >= 30004 && (logHelper = log) != null) {
            logHelper.mo1255i(str);
        }
    }

    public static void setLogLevel(int i) {
        if (i < 30000 || i > 30004) {
            return;
        }
        if (Setup.isSetUpFinished()) {
            try {
                setLogLevelNative(i);
            } catch (UnsatisfiedLinkError e) {
                m1418e("Error using the native library: ", e);
            }
        }
        f1643b = i;
    }

    private static native void setLogLevelNative(int i);

    public static void setOnErrorLogListener(OnErrorLogListener onErrorLogListener) {
        f1644c = onErrorLogListener;
    }

    public static void syncrhonizeLogLevelWithNative() {
        try {
            int i = f1643b;
            if (30000 != i) {
                setLogLevelNative(i);
            } else {
                f1643b = getLogLevelNative();
            }
        } catch (UnsatisfiedLinkError e) {
            m1418e("Error using the native library: ", e);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m1421w(String str) {
        LogHelper logHelper;
        if (f1643b >= 30002 && (logHelper = log) != null) {
            logHelper.mo1257w(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1414d(String str, String str2) {
        LogHelper logHelper;
        if (f1643b >= 30003 && (logHelper = log) != null) {
            logHelper.mo1250d(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1420i(String str, String str2) {
        LogHelper logHelper;
        if (f1643b >= 30004 && (logHelper = log) != null) {
            logHelper.mo1256i(str, str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m1422w(String str, String str2) {
        LogHelper logHelper;
        if (f1643b >= 30002 && (logHelper = log) != null) {
            logHelper.mo1258w(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1416e(String str, String str2) {
        LogHelper logHelper;
        m1412a(str2, null);
        if (f1643b >= 30001 && (logHelper = log) != null) {
            logHelper.mo1252e(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1418e(String str, Throwable th) {
        LogHelper logHelper;
        m1412a(str, th);
        if (f1643b >= 30001 && (logHelper = log) != null) {
            logHelper.mo1254e(str, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1417e(String str, String str2, Throwable th) {
        LogHelper logHelper;
        m1412a(str2, th);
        if (f1643b >= 30001 && (logHelper = log) != null) {
            logHelper.mo1253e(str, str2, th);
        }
    }
}
