package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j7d1 {

    /* JADX INFO: renamed from: a */
    public static final long f109570a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b */
    public static final Object f109571b = new Object();

    /* JADX INFO: renamed from: c */
    public static i7d1 f109572c;

    /* JADX INFO: renamed from: a */
    public static void m52615a(Context context) {
        if (f109572c == null) {
            i7d1 i7d1Var = new i7d1(context);
            f109572c = i7d1Var;
            synchronized (i7d1Var.f99497a) {
                i7d1Var.f99503g = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m52616b(Intent intent) {
        synchronized (f109571b) {
            try {
                if (f109572c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f109572c.m49864c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static ComponentName m52617c(Context context, Intent intent) {
        synchronized (f109571b) {
            try {
                m52615a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f109572c.m49862a(f109570a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
