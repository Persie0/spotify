package p204p;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class pwj0 {

    /* JADX INFO: renamed from: d */
    public static String f182063d;

    /* JADX INFO: renamed from: g */
    public static owj0 f182066g;

    /* JADX INFO: renamed from: a */
    public final Context f182067a;

    /* JADX INFO: renamed from: b */
    public final NotificationManager f182068b;

    /* JADX INFO: renamed from: c */
    public static final Object f182062c = new Object();

    /* JADX INFO: renamed from: e */
    public static HashSet f182064e = new HashSet();

    /* JADX INFO: renamed from: f */
    public static final Object f182065f = new Object();

    public pwj0(Context context) {
        this.f182067a = context;
        this.f182068b = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: a */
    public final void m71293a(int i, Notification notification) {
        NotificationManager notificationManager = this.f182068b;
        Bundle bundleM78915y = spg1.m78915y(notification);
        if (bundleM78915y == null || !bundleM78915y.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i, notification);
            return;
        }
        lwj0 lwj0Var = new lwj0(this.f182067a.getPackageName(), i, notification);
        synchronized (f182065f) {
            try {
                if (f182066g == null) {
                    f182066g = new owj0(this.f182067a.getApplicationContext());
                }
                f182066g.m68171b(lwj0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i);
    }
}
