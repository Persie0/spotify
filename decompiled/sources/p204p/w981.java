package p204p;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class w981 implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final Object f249115f = new Object();

    /* JADX INFO: renamed from: g */
    public static Boolean f249116g;

    /* JADX INFO: renamed from: h */
    public static Boolean f249117h;

    /* JADX INFO: renamed from: a */
    public final Context f249118a;

    /* JADX INFO: renamed from: b */
    public final i6f0 f249119b;

    /* JADX INFO: renamed from: c */
    public final PowerManager.WakeLock f249120c;

    /* JADX INFO: renamed from: d */
    public final u981 f249121d;

    /* JADX INFO: renamed from: e */
    public final long f249122e;

    public w981(u981 u981Var, Context context, i6f0 i6f0Var, long j) {
        this.f249121d = u981Var;
        this.f249118a = context;
        this.f249122e = j;
        this.f249119b = i6f0Var;
        this.f249120c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87485a(Context context) {
        boolean zBooleanValue;
        synchronized (f249115f) {
            try {
                Boolean bool = f249117h;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                f249117h = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m87486b(Context context) {
        boolean zBooleanValue;
        synchronized (f249115f) {
            try {
                Boolean bool = f249116g;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                f249116g = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m87487c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f249118a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        u981 u981Var = this.f249121d;
        Context context = this.f249118a;
        boolean zM87486b = m87486b(context);
        PowerManager.WakeLock wakeLock = this.f249120c;
        if (zM87486b) {
            wakeLock.acquire(j5j.f108986a);
        }
        try {
            try {
                try {
                    u981Var.m82599b(true);
                    if (!this.f249119b.m49808c()) {
                        u981Var.m82599b(false);
                        if (m87486b(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (!m87485a(context) || m87487c()) {
                        if (u981Var.m82600c()) {
                            u981Var.m82599b(false);
                        } else {
                            u981Var.m82601d(this.f249122e);
                        }
                        if (m87486b(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    v981 v981Var = new v981();
                    v981Var.f238885a = this;
                    Log.isLoggable("FirebaseMessaging", 3);
                    context.registerReceiver(v981Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (m87486b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                } catch (RuntimeException unused3) {
                }
            } catch (IOException e) {
                e.getMessage();
                u981Var.m82599b(false);
                if (m87486b(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (m87486b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th;
        }
    }
}
