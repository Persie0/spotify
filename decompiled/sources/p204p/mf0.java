package p204p;

import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mf0 {

    /* JADX INFO: renamed from: c */
    public static volatile ScheduledFuture f142897c;

    /* JADX INFO: renamed from: f */
    public static volatile dy0 f142900f;

    /* JADX INFO: renamed from: h */
    public static String f142902h;

    /* JADX INFO: renamed from: i */
    public static long f142903i;

    /* JADX INFO: renamed from: j */
    public static int f142904j;

    /* JADX INFO: renamed from: k */
    public static WeakReference f142905k;

    /* JADX INFO: renamed from: l */
    public static String f142906l;

    /* JADX INFO: renamed from: a */
    public static final ScheduledExecutorService f142895a = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService f142896b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: d */
    public static final Object f142898d = new Object();

    /* JADX INFO: renamed from: e */
    public static final AtomicInteger f142899e = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    public static final AtomicBoolean f142901g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m61599a() {
        ScheduledFuture scheduledFuture;
        synchronized (f142898d) {
            try {
                if (f142897c != null && (scheduledFuture = f142897c) != null) {
                    scheduledFuture.cancel(false);
                }
                f142897c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final UUID m61600b() {
        dy0 dy0Var;
        if (f142900f == null || (dy0Var = f142900f) == null) {
            return null;
        }
        return (UUID) dy0Var.f54139d;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m61601c() {
        return f142904j == 0;
    }

    /* JADX INFO: renamed from: d */
    public static final void m61602d(Application application, String str) {
        if (f142901g.compareAndSet(false, true)) {
            hgy.m47480a(new wra(8), fgy.CodelessEvents);
            f142902h = str;
            application.registerActivityLifecycleCallbacks(new lf0(0));
        }
    }
}
