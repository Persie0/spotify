package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.window.OnBackInvokedDispatcher;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class z35 {
    /* JADX INFO: renamed from: a */
    public static PackageInfo m95260a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m95261b(Intent intent, String str, Class cls) {
        return intent.getParcelableArrayListExtra(str, cls);
    }

    /* JADX INFO: renamed from: c */
    public static Object m95262c(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    /* JADX INFO: renamed from: d */
    public static Serializable m95263d(Intent intent, String str, Class cls) {
        return intent.getSerializableExtra(str, cls);
    }

    /* JADX INFO: renamed from: e */
    public static final void m95264e(maq0 maq0Var, x35 x35Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (x35Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = maq0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, x35Var);
    }

    /* JADX INFO: renamed from: f */
    public static final void m95265f(maq0 maq0Var, x35 x35Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (x35Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = maq0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(x35Var);
    }
}
