package p204p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class lf0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132771a;

    public /* synthetic */ lf0(int i) {
        this.f132771a = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f132771a) {
            case 0:
                iq3 iq3Var = tra0.f223025b;
                ScheduledExecutorService scheduledExecutorService = mf0.f142895a;
                synchronized (p8y.f175081b) {
                }
                mf0.f142895a.execute(new RunnableC2034k(2));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f132771a) {
            case 0:
                iq3 iq3Var = tra0.f223025b;
                ScheduledExecutorService scheduledExecutorService = mf0.f142895a;
                synchronized (p8y.f175081b) {
                }
                zwe zweVar = zwe.f286964a;
                Set set = p2l.f173365a;
                if (!set.contains(zwe.class)) {
                    try {
                        cxe cxeVarM78855q = cxe.f43008f.m78855q();
                        if (!set.contains(cxeVarM78855q)) {
                            try {
                                ((HashMap) cxeVarM78855q.f43015e).remove(Integer.valueOf(activity.hashCode()));
                            } catch (Throwable th) {
                                p2l.m68953a(cxeVarM78855q, th);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        p2l.m68953a(zwe.class, th2);
                        return;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006b A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:14:0x0032, B:17:0x003b, B:19:0x0048, B:32:0x0068, B:33:0x006b, B:35:0x006f, B:22:0x004f, B:25:0x005a, B:27:0x005e, B:30:0x0064), top: B:45:0x0032, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #2 {all -> 0x0075, blocks: (B:14:0x0032, B:17:0x003b, B:19:0x0048, B:32:0x0068, B:33:0x006b, B:35:0x006f, B:22:0x004f, B:25:0x005a, B:27:0x005e, B:30:0x0064), top: B:45:0x0032, inners: #0 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        SensorManager sensorManager;
        switch (this.f132771a) {
            case 0:
                iq3 iq3Var = tra0.f223025b;
                ScheduledExecutorService scheduledExecutorService = mf0.f142895a;
                synchronized (p8y.f175081b) {
                }
                AtomicInteger atomicInteger = mf0.f142899e;
                if (atomicInteger.decrementAndGet() < 0) {
                    atomicInteger.set(0);
                }
                mf0.m61599a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strM63371k = n0b1.m63371k(activity);
                zwe zweVar = zwe.f286964a;
                Set set = p2l.f173365a;
                if (!set.contains(zwe.class)) {
                    try {
                        if (zwe.f286969f.get()) {
                            cxe.f43008f.m78855q().m34282P(activity);
                            yhc1 yhc1Var = zwe.f286967d;
                            if (yhc1Var == null || set.contains(yhc1Var)) {
                                sensorManager = zwe.f286966c;
                                if (sensorManager != null) {
                                    sensorManager.unregisterListener(zwe.f286965b);
                                }
                            } else {
                                try {
                                    if (((Activity) yhc1Var.f272816b.get()) != null) {
                                        try {
                                            Timer timer = yhc1Var.f272817c;
                                            if (timer != null) {
                                                timer.cancel();
                                            }
                                            yhc1Var.f272817c = null;
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        sensorManager = zwe.f286966c;
                                        if (sensorManager != null) {
                                            sensorManager.unregisterListener(zwe.f286965b);
                                        }
                                    } else {
                                        sensorManager = zwe.f286966c;
                                        if (sensorManager != null) {
                                            sensorManager.unregisterListener(zwe.f286965b);
                                        }
                                    }
                                } catch (Throwable th) {
                                    p2l.m68953a(yhc1Var, th);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        p2l.m68953a(zwe.class, th2);
                    }
                }
                mf0.f142895a.execute(new kf0(jCurrentTimeMillis, 1, strM63371k));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f132771a) {
            case 0:
                iq3 iq3Var = tra0.f223025b;
                ScheduledExecutorService scheduledExecutorService = mf0.f142895a;
                synchronized (p8y.f175081b) {
                }
                mf0.f142905k = new WeakReference(activity);
                mf0.f142899e.incrementAndGet();
                mf0.m61599a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                mf0.f142903i = jCurrentTimeMillis;
                String strM63371k = n0b1.m63371k(activity);
                zhc1 zhc1Var = zwe.f286965b;
                zwe zweVar = zwe.f286964a;
                Set set = p2l.f173365a;
                if (!set.contains(zwe.class)) {
                    try {
                        if (zwe.f286969f.get()) {
                            cxe.f43008f.m78855q().m34294f(activity);
                            Context applicationContext = activity.getApplicationContext();
                            String strM69344b = p8y.m69344b();
                            lty ltyVarM71023b = pty.m71023b(strM69344b);
                            if (ltyVarM71023b == null || !ltyVarM71023b.f136911g) {
                                set.contains(zweVar);
                            } else {
                                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                                if (sensorManager != null) {
                                    zwe.f286966c = sensorManager;
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                    yhc1 yhc1Var = new yhc1(activity);
                                    zwe.f286967d = yhc1Var;
                                    m94 m94Var = new m94(8, ltyVarM71023b, strM69344b);
                                    if (!set.contains(zhc1Var)) {
                                        try {
                                            zhc1Var.f282875a = m94Var;
                                        } catch (Throwable th) {
                                            p2l.m68953a(zhc1Var, th);
                                        }
                                    }
                                    sensorManager.registerListener(zhc1Var, defaultSensor, 2);
                                    if (ltyVarM71023b.f136911g) {
                                        yhc1Var.m93637c();
                                    }
                                    break;
                                }
                            }
                            p2l.f173365a.contains(zweVar);
                            break;
                        }
                    } catch (Throwable th2) {
                        p2l.m68953a(zwe.class, th2);
                    }
                }
                d7f0 d7f0Var = d7f0.f46160b;
                if (!p2l.f173365a.contains(d7f0.class)) {
                    try {
                        if (d7f0.f46162c) {
                            CopyOnWriteArraySet copyOnWriteArraySet = o9f0.f163023d;
                            if (!fm8.m42079v().isEmpty()) {
                                HashMap map = gbf0.f78293e;
                                tc5.m80431s(activity);
                                break;
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th3) {
                        p2l.m68953a(d7f0.class, th3);
                    }
                }
                wy51.m89336d(activity);
                String str = mf0.f142906l;
                if (str != null) {
                    int i = 1;
                    if (wl51.m88496t0(str, "ProxyBillingActivity", false) && !strM63371k.equals("ProxyBillingActivity")) {
                        mf0.f142896b.execute(new RunnableC2034k(i));
                    }
                }
                mf0.f142895a.execute(new kf0(activity.getApplicationContext(), strM63371k, jCurrentTimeMillis));
                mf0.f142906l = strM63371k;
                break;
            default:
                try {
                    p8y.m69345c().execute(new RunnableC2034k(10));
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f132771a) {
            case 0:
                iq3 iq3Var = tra0.f223025b;
                ScheduledExecutorService scheduledExecutorService = mf0.f142895a;
                synchronized (p8y.f175081b) {
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f132771a) {
            case 0:
                mf0.f142904j++;
                iq3 iq3Var = tra0.f223025b;
                synchronized (p8y.f175081b) {
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f132771a) {
            case 0:
                iq3 iq3Var = tra0.f223025b;
                ScheduledExecutorService scheduledExecutorService = mf0.f142895a;
                synchronized (p8y.f175081b) {
                }
                w85 w85Var = b95.f24770a;
                if (!p2l.f173365a.contains(b95.class)) {
                    try {
                        b95.f24771b.execute(new RunnableC2034k(6));
                    } catch (Throwable th) {
                        p2l.m68953a(b95.class, th);
                    }
                }
                mf0.f142904j--;
                break;
            default:
                try {
                    if (wj50.m88271j(uj40.f230896c, Boolean.TRUE) && wj50.m88271j(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                        p8y.m69345c().execute(new RunnableC2034k(9));
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m58832b(Activity activity) {
    }

    /* JADX INFO: renamed from: c */
    private final void m58833c(Activity activity) {
    }

    /* JADX INFO: renamed from: e */
    private final void m58835e(Activity activity) {
    }

    /* JADX INFO: renamed from: a */
    private final void m58831a(Activity activity, Bundle bundle) {
    }

    /* JADX INFO: renamed from: d */
    private final void m58834d(Activity activity, Bundle bundle) {
    }
}
