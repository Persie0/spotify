package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class yj10 implements Handler.Callback {

    /* JADX INFO: renamed from: N0 */
    public static final Status f273246N0 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: O0 */
    public static final Status f273247O0 = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: P0 */
    public static final Object f273248P0 = new Object();

    /* JADX INFO: renamed from: Q0 */
    public static yj10 f273249Q0;

    /* JADX INFO: renamed from: L0 */
    public final ywh0 f273250L0;

    /* JADX INFO: renamed from: M0 */
    public volatile boolean f273251M0;

    /* JADX INFO: renamed from: X */
    public l3f1 f273252X;

    /* JADX INFO: renamed from: Y */
    public final zj5 f273253Y;

    /* JADX INFO: renamed from: Z */
    public final zj5 f273254Z;

    /* JADX INFO: renamed from: a */
    public long f273255a;

    /* JADX INFO: renamed from: b */
    public boolean f273256b;

    /* JADX INFO: renamed from: c */
    public hy61 f273257c;

    /* JADX INFO: renamed from: d */
    public w4f1 f273258d;

    /* JADX INFO: renamed from: e */
    public final Context f273259e;

    /* JADX INFO: renamed from: f */
    public final uj10 f273260f;

    /* JADX INFO: renamed from: g */
    public final red1 f273261g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f273262h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f273263i;

    /* JADX INFO: renamed from: t */
    public final ConcurrentHashMap f273264t;

    public yj10(Context context, Looper looper) {
        uj10 uj10Var = uj10.f230858e;
        this.f273255a = 10000L;
        this.f273256b = false;
        this.f273262h = new AtomicInteger(1);
        this.f273263i = new AtomicInteger(0);
        this.f273264t = new ConcurrentHashMap(5, 0.75f, 1);
        this.f273252X = null;
        this.f273253Y = new zj5(0);
        this.f273254Z = new zj5(0);
        this.f273251M0 = true;
        this.f273259e = context;
        ywh0 ywh0Var = new ywh0(looper, this);
        this.f273250L0 = ywh0Var;
        this.f273260f = uj10Var;
        this.f273261g = new red1(11);
        if (lqg1.m59755w(context)) {
            this.f273251M0 = false;
        }
        ywh0Var.sendMessage(ywh0Var.obtainMessage(6));
    }

    /* JADX INFO: renamed from: c */
    public static Status m93834c(i45 i45Var, lzi lziVar) {
        String strM58957r = i45Var.f98431b.m58957r();
        String strValueOf = String.valueOf(lziVar);
        return new Status(17, klh.m56837i(new StringBuilder(String.valueOf(strM58957r).length() + 63 + strValueOf.length()), "API: ", strM58957r, " is not available on this device. Connection failed with: ", strValueOf), lziVar.f138372c, lziVar);
    }

    /* JADX INFO: renamed from: d */
    public static yj10 m93835d(Context context) {
        yj10 yj10Var;
        HandlerThread handlerThread;
        synchronized (f273248P0) {
            if (f273249Q0 == null) {
                synchronized (nvg1.f158892g) {
                    try {
                        handlerThread = nvg1.f158894i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            nvg1.f158894i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = nvg1.f158894i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = uj10.f230857d;
                f273249Q0 = new yj10(applicationContext, looper);
            }
            yj10Var = f273249Q0;
        }
        return yj10Var;
    }

    /* JADX INFO: renamed from: a */
    public final p3f1 m93836a(tj10 tj10Var) {
        i45 i45Var = tj10Var.f220800f;
        ConcurrentHashMap concurrentHashMap = this.f273264t;
        p3f1 p3f1Var = (p3f1) concurrentHashMap.get(i45Var);
        if (p3f1Var == null) {
            p3f1Var = new p3f1(this, tj10Var);
            concurrentHashMap.put(i45Var, p3f1Var);
        }
        if (p3f1Var.f173637l.mo27713b()) {
            this.f273254Z.add(i45Var);
        }
        p3f1Var.m69016o();
        return p3f1Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX INFO: renamed from: b */
    public final void m93837b(ev61 ev61Var, int i, tj10 tj10Var) {
        t3f1 t3f1Var;
        yj10 yj10Var;
        if (i != 0) {
            i45 i45Var = tj10Var.f220800f;
            if (m93839f()) {
                dkx0 dkx0VarM33211i = ckx0.m33205j().m33211i();
                boolean zM31177r0 = true;
                if (dkx0VarM33211i != null) {
                    if (dkx0VarM33211i.f50061b) {
                        boolean z = dkx0VarM33211i.f50062c;
                        p3f1 p3f1Var = (p3f1) this.f273264t.get(i45Var);
                        if (p3f1Var != null) {
                            Object obj = p3f1Var.f173637l;
                            if (obj instanceof dz8) {
                                dz8 dz8Var = (dz8) obj;
                                if (!dz8Var.m37441w() || dz8Var.m37443y()) {
                                    zM31177r0 = z;
                                } else {
                                    c0j c0jVarM80013a = t3f1.m80013a(p3f1Var, dz8Var, i);
                                    if (c0jVarM80013a != null) {
                                        p3f1Var.f173647v++;
                                        zM31177r0 = c0jVarM80013a.m31177r0();
                                    }
                                }
                            }
                        } else {
                            zM31177r0 = z;
                        }
                    }
                    t3f1Var = null;
                    yj10Var = this;
                }
                yj10Var = this;
                t3f1Var = new t3f1(yj10Var, i, i45Var, zM31177r0 ? System.currentTimeMillis() : 0L, zM31177r0 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                t3f1Var = null;
                yj10Var = this;
            }
            if (t3f1Var != null) {
                y7h1 y7h1Var = ev61Var.f63172a;
                ywh0 ywh0Var = yj10Var.f273250L0;
                Objects.requireNonNull(ywh0Var);
                y7h1Var.m92991l(new bn6(ywh0Var, 3), t3f1Var);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m93838e(l3f1 l3f1Var) {
        synchronized (f273248P0) {
            try {
                if (this.f273252X != l3f1Var) {
                    this.f273252X = l3f1Var;
                    this.f273253Y.clear();
                }
                this.f273253Y.addAll(l3f1Var.f129327f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m93839f() {
        if (this.f273256b) {
            return false;
        }
        dkx0 dkx0VarM33211i = ckx0.m33205j().m33211i();
        if (dkx0VarM33211i != null && !dkx0VarM33211i.f50061b) {
            return false;
        }
        int iM75391h = this.f273261g.m75391h(203400000);
        return iM75391h == -1 || iM75391h == 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m93840g(lzi lziVar, int i) {
        uj10 uj10Var = this.f273260f;
        uj10Var.getClass();
        Context context = this.f273259e;
        if (!c150.m31208B(context)) {
            int i2 = lziVar.f138371b;
            PendingIntent pendingIntentM84014h = lziVar.f138372c;
            if (!((i2 == 0 || pendingIntentM84014h == null) ? false : true)) {
                pendingIntentM84014h = null;
                Intent intentM85678a = uj10Var.m85678a(i2, context, null);
                if (intentM85678a != null) {
                    pendingIntentM84014h = uug1.m84014h(context, intentM85678a);
                }
            }
            if (pendingIntentM84014h != null) {
                int i3 = GoogleApiActivity.f1833b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntentM84014h);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                uj10Var.m83219h(context, i2, s4f1.m77197a(context, intent, s4f1.f205580a | 134217728));
                uj10Var.m83220i(context, lziVar, false);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m93841h(lzi lziVar, int i) {
        if (m93840g(lziVar, i)) {
            return;
        }
        ywh0 ywh0Var = this.f273250L0;
        ywh0Var.sendMessage(ywh0Var.obtainMessage(5, i, 0, lziVar));
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:155:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:157:0x0332  */
    /* JADX WARN: Code duplicated, block: B:159:0x033c  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 p.p3f1, still in use, count: 2, list:
          (r2v10 p.p3f1) from 0x02f0: IGET (r2v10 p.p3f1) A[WRAPPED] (LINE:753) p.p3f1.q int
          (r2v10 p.p3f1) from 0x02f6: PHI (r2 I:??) = (r2v7 p.p3f1), (r2v10 p.p3f1) binds: [B:151:0x02f5, B:205:0x02f6] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r12) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.yj10.handleMessage(android.os.Message):boolean");
    }
}
