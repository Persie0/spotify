package com.comscore.util.setup;

import com.comscore.util.ObfuscationChecker;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.Logger;
import p204p.dq60;

/* JADX INFO: loaded from: classes.dex */
public class Setup {

    /* JADX INFO: renamed from: a */
    static final String f1646a = "comScore";

    /* JADX INFO: renamed from: b */
    private static JniComScoreHelper f1647b = null;

    /* JADX INFO: renamed from: c */
    private static PlatformSetup f1648c = null;

    /* JADX INFO: renamed from: d */
    private static boolean f1649d = false;

    /* JADX INFO: renamed from: e */
    private static boolean f1650e;

    /* JADX INFO: renamed from: f */
    private static final Object f1651f = new Object();

    /* JADX INFO: renamed from: a */
    private static void m1423a() {
        String analyticsVersionNative = getAnalyticsVersionNative();
        String javaCodeVersion = f1648c.getJavaCodeVersion();
        if (analyticsVersionNative == null) {
            Logger.m1415e("Unable to retrieve the native version.");
        } else if (!analyticsVersionNative.equals(javaCodeVersion)) {
            throw new IllegalStateException(dq60.m36615o("The version of the comScore java code (", javaCodeVersion, ") and the native library (", analyticsVersionNative, ") are different. Check which version of the comScore SDK is being used."));
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m1424b() {
        if (!f1648c.shouldLoadCppLibrary()) {
            Logger.m1418e("Unsupported platform", new RuntimeException("This platform is not supported. The comScore native library will not be loaded."));
            return false;
        }
        PlatformSetup platformSetup = f1648c;
        String str = f1646a;
        String strBuildNativeLibraryName = platformSetup.buildNativeLibraryName(f1646a);
        if (strBuildNativeLibraryName != null) {
            str = strBuildNativeLibraryName;
        }
        String strBuildNativeLibraryPath = f1648c.buildNativeLibraryPath(str);
        if (strBuildNativeLibraryPath != null) {
            try {
                if (strBuildNativeLibraryPath.length() == 0) {
                    System.loadLibrary(str);
                } else {
                    System.load(strBuildNativeLibraryPath);
                }
            } catch (UnsatisfiedLinkError e) {
                if (strBuildNativeLibraryPath != null && strBuildNativeLibraryPath.length() != 0) {
                    str = strBuildNativeLibraryPath;
                }
                Logger.m1418e("Error loading the native library: ".concat(str), e);
                return false;
            }
        } else {
            System.loadLibrary(str);
        }
        configureNative(f1647b);
        return true;
    }

    private static native void configureNative(JniComScoreHelper jniComScoreHelper);

    private static native String getAnalyticsVersionNative();

    public static JniComScoreHelper getJniComScoreHelper() {
        return f1647b;
    }

    public static PlatformSetup getPlatformSetup() {
        return f1648c;
    }

    public static boolean isNativeLibrarySuccessfullyLoaded() {
        return f1650e;
    }

    public static boolean isSetUpFinished() {
        return f1649d;
    }

    public static void setUp() {
        if (f1649d) {
            return;
        }
        synchronized (f1651f) {
            try {
                if (!f1649d) {
                    if (new ObfuscationChecker().isCodeObfuscated()) {
                        throw new IllegalStateException("comScore SDK has been obfuscated. Did you add in your proguard-project.txt the following lines?\n-keep class com.comscore.** { *; }\n-dontwarn com.comscore.**");
                    }
                    CustomPlatformSetup customPlatformSetup = new CustomPlatformSetup();
                    f1648c = customPlatformSetup;
                    f1647b = customPlatformSetup.createApplicationInfoHelper();
                    Logger.log = f1648c.createLogger();
                    boolean zM1424b = m1424b();
                    f1650e = zM1424b;
                    f1649d = true;
                    if (zM1424b) {
                        m1423a();
                        Logger.syncrhonizeLogLevelWithNative();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
