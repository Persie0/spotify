package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class SplitInstallHelper {
    private static final com.google.android.play.core.splitinstall.internal.zzu zza = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallHelper");

    private SplitInstallHelper() {
    }

    public static void loadLibrary(Context context, String str) {
        synchronized (zzn.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e) {
                String str2 = context.getApplicationInfo().nativeLibraryDir + "/" + System.mapLibraryName(str);
                if (!new File(str2).exists()) {
                    throw e;
                }
                System.load(str2);
            }
        }
    }

    public static void updateAppInfo(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 25 || i >= 28) {
            return;
        }
        com.google.android.play.core.splitinstall.internal.zzu zzuVar = zza;
        zzuVar.zzd("Calling dispatchPackageBroadcast", new Object[0]);
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method method = cls.getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mAppThread");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{context.getPackageName()});
            zzuVar.zzd("Called dispatchPackageBroadcast", new Object[0]);
        } catch (Exception e) {
            zza.zzc(e, "Update app info with dispatchPackageBroadcast failed!", new Object[0]);
        }
    }
}
