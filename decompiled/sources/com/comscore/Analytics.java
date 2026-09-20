package com.comscore;

import android.content.Context;
import com.comscore.android.util.jni.AndroidJniHelper;
import com.comscore.android.vce.Vce;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Analytics {

    /* JADX INFO: renamed from: a */
    private static Configuration f1520a = new Configuration();

    /* JADX INFO: renamed from: b */
    private static int f1521b = 0;

    static {
        Setup.setUp();
    }

    private Analytics() {
    }

    /* JADX INFO: renamed from: a */
    private static void m1193a(Throwable th) {
        f1521b++;
        Logger.m1418e("Error using the native library: ", th);
    }

    public static void clearInternalData() {
        try {
            clearInternalDataNative();
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    private static native void clearInternalDataNative();

    public static void clearOfflineCache() {
        try {
            clearOfflineCacheNative();
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    private static native void clearOfflineCacheNative();

    public static void flushOfflineCache() {
        try {
            flushOfflineCacheNative();
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    private static native void flushOfflineCacheNative();

    public static void getActivationCategories(String str, String str2, String str3, String str4, Activation.ActivationListener activationListener) {
        Activation.m1191a(str, str2, str3, str4, activationListener);
    }

    public static Configuration getConfiguration() {
        return f1520a;
    }

    public static int getExceptionCounter() {
        return f1521b;
    }

    public static int getLogLevel() {
        return Logger.getLogLevel();
    }

    @Deprecated
    public static Vce getSharedVceInstance(Context context) {
        return Vce.getSharedInstance(context);
    }

    @Deprecated
    public static String getVceVersion() {
        return Vce.getSdkVersion();
    }

    public static String getVersion() {
        try {
            return getVersionNative();
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
            return null;
        }
    }

    private static native String getVersionNative();

    public static void notifyDistributedContentViewEvent(String str, String str2) {
        try {
            Setup.setUp();
            notifyDistributedContentViewEventNative(str, str2);
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    private static native void notifyDistributedContentViewEventNative(String str, String str2);

    public static void notifyEnterForeground() {
        try {
            Setup.setUp();
            notifyEnterForegroundNative();
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    private static native void notifyEnterForegroundNative();

    public static void notifyExitForeground() {
        try {
            Setup.setUp();
            notifyExitForegroundNative();
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    private static native void notifyExitForegroundNative();

    public static void notifyHiddenEvent() {
        try {
            Setup.setUp();
            notifyHiddenEventNative(null);
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    private static native void notifyHiddenEventEventInfoNative(long j);

    private static native void notifyHiddenEventNative(Map<String, String> map);

    public static void notifyUxActive() {
        try {
            Setup.setUp();
            notifyUxActiveNative();
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    private static native void notifyUxActiveNative();

    public static void notifyUxInactive() {
        try {
            Setup.setUp();
            notifyUxInactiveNative();
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    private static native void notifyUxInactiveNative();

    public static void notifyViewEvent() {
        try {
            Setup.setUp();
            notifyViewEventNative(null);
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    private static native void notifyViewEventEventInfoNative(long j);

    private static native void notifyViewEventNative(Map<String, String> map);

    public static void setLogLevel(int i) {
        Logger.setLogLevel(i);
    }

    public static void start(Context context) {
        try {
            Setup.setUp();
            JniComScoreHelper jniComScoreHelper = Setup.getJniComScoreHelper();
            if (jniComScoreHelper == null) {
                throw new NullPointerException("The class JniComScoreHelper has not been initialised.");
            }
            ((AndroidJniHelper) jniComScoreHelper).setContext(context);
            if (getConfiguration().m1204c().isEmpty()) {
                getConfiguration().setApplicationVersion(jniComScoreHelper.getApplicationVersion());
            }
            if (getConfiguration().m1202b().isEmpty()) {
                getConfiguration().setApplicationName(jniComScoreHelper.getApplicationName());
            }
            if (getConfiguration().m1199a().isEmpty()) {
                getConfiguration().setApplicationId(jniComScoreHelper.getApplicationId());
            }
            startNative();
            jniComScoreHelper.start();
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    private static native void startNative();

    public static void notifyHiddenEvent(EventInfo eventInfo) {
        try {
            Setup.setUp();
            notifyHiddenEventEventInfoNative(eventInfo.m1206a());
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    public static void notifyViewEvent(EventInfo eventInfo) {
        try {
            Setup.setUp();
            notifyViewEventEventInfoNative(eventInfo.m1206a());
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    public static void notifyHiddenEvent(Map<String, String> map) {
        try {
            Setup.setUp();
            notifyHiddenEventNative(map);
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }

    public static void notifyViewEvent(Map<String, String> map) {
        try {
            Setup.setUp();
            notifyViewEventNative(map);
        } catch (UnsatisfiedLinkError e) {
            m1193a(e);
        }
    }
}
