package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p204p.a09;
import p204p.clg1;
import p204p.d7x0;
import p204p.ig31;
import p204p.ikc0;
import p204p.njn0;
import p204p.q0f1;
import p204p.q32;
import p204p.r3f1;
import p204p.sdv;
import p204p.x4f1;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends d7x0> extends q0f1 {

    /* JADX INFO: renamed from: W0 */
    public static final q32 f1847W0 = new q32(18);

    /* JADX INFO: renamed from: L0 */
    public final a09 f1848L0;

    /* JADX INFO: renamed from: O0 */
    public clg1 f1851O0;

    /* JADX INFO: renamed from: Q0 */
    public d7x0 f1853Q0;

    /* JADX INFO: renamed from: R0 */
    public Status f1854R0;

    /* JADX INFO: renamed from: S0 */
    public volatile boolean f1855S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f1856T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f1857U0;

    @KeepName
    private x4f1 resultGuardian;

    /* JADX INFO: renamed from: Z */
    public final Object f1859Z = new Object();

    /* JADX INFO: renamed from: M0 */
    public final CountDownLatch f1849M0 = new CountDownLatch(1);

    /* JADX INFO: renamed from: N0 */
    public final ArrayList f1850N0 = new ArrayList();

    /* JADX INFO: renamed from: P0 */
    public final AtomicReference f1852P0 = new AtomicReference();

    /* JADX INFO: renamed from: V0 */
    public boolean f1858V0 = false;

    public BasePendingResult(Looper looper) {
        this.f1848L0 = new a09(looper, 2);
        new WeakReference(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public static void m1490j0(d7x0 d7x0Var) {
        if (d7x0Var instanceof sdv) {
            try {
                ((sdv) d7x0Var).m77878e();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(d7x0Var));
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m1491W() {
        synchronized (this.f1859Z) {
            try {
                if (!this.f1856T0 && !this.f1855S0) {
                    m1490j0(this.f1853Q0);
                    this.f1856T0 = true;
                    m1499i0(mo1492Z(Status.f1841i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public abstract d7x0 mo1492Z(Status status);

    /* JADX INFO: renamed from: d0 */
    public final void m1494d0(Status status) {
        synchronized (this.f1859Z) {
            try {
                if (!m1495e0()) {
                    m1493a(mo1492Z(status));
                    this.f1857U0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m1495e0() {
        return this.f1849M0.getCount() == 0;
    }

    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final void m1493a(d7x0 d7x0Var) {
        synchronized (this.f1859Z) {
            try {
                if (this.f1857U0 || this.f1856T0) {
                    m1490j0(d7x0Var);
                    return;
                }
                m1495e0();
                ig31.m50508z("Results have already been set", !m1495e0());
                ig31.m50508z("Result has already been consumed", !this.f1855S0);
                m1499i0(d7x0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m1497g0(clg1 clg1Var) {
        boolean z;
        synchronized (this.f1859Z) {
            try {
                ig31.m50508z("Result has already been consumed.", !this.f1855S0);
                synchronized (this.f1859Z) {
                    z = this.f1856T0;
                }
                if (z) {
                    return;
                }
                if (m1495e0()) {
                    a09 a09Var = this.f1848L0;
                    d7x0 d7x0VarM1498h0 = m1498h0();
                    a09Var.getClass();
                    a09Var.sendMessage(a09Var.obtainMessage(1, new Pair(clg1Var, d7x0VarM1498h0)));
                } else {
                    this.f1851O0 = clg1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final d7x0 m1498h0() {
        d7x0 d7x0Var;
        synchronized (this.f1859Z) {
            ig31.m50508z("Result has already been consumed.", !this.f1855S0);
            ig31.m50508z("Result is not ready.", m1495e0());
            d7x0Var = this.f1853Q0;
            this.f1853Q0 = null;
            this.f1851O0 = null;
            this.f1855S0 = true;
        }
        ikc0.m50942n(this.f1852P0.getAndSet(null));
        ig31.m50506x(d7x0Var);
        return d7x0Var;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m1499i0(d7x0 d7x0Var) {
        this.f1853Q0 = d7x0Var;
        this.f1854R0 = d7x0Var.getStatus();
        this.f1849M0.countDown();
        if (this.f1856T0) {
            this.f1851O0 = null;
        } else {
            clg1 clg1Var = this.f1851O0;
            if (clg1Var != null) {
                a09 a09Var = this.f1848L0;
                a09Var.removeMessages(2);
                a09Var.sendMessage(a09Var.obtainMessage(1, new Pair(clg1Var, m1498h0())));
            } else if (this.f1853Q0 instanceof sdv) {
                this.resultGuardian = new x4f1(this);
            }
        }
        ArrayList arrayList = this.f1850N0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((njn0) arrayList.get(i)).mo37812a(this.f1854R0);
        }
        arrayList.clear();
    }

    @Override // p204p.q0f1
    /* JADX INFO: renamed from: l */
    public final void mo1500l(njn0 njn0Var) {
        synchronized (this.f1859Z) {
            try {
                if (m1495e0()) {
                    njn0Var.mo37812a(this.f1854R0);
                } else {
                    this.f1850N0.add(njn0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public BasePendingResult(r3f1 r3f1Var) {
        Looper mainLooper;
        if (r3f1Var != null) {
            mainLooper = r3f1Var.f195505a.f220801g;
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.f1848L0 = new a09(mainLooper, 2);
        new WeakReference(r3f1Var);
    }
}
