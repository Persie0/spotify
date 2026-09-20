package p204p;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class jap0 {

    /* JADX INFO: renamed from: a */
    public final iap0 f110504a;

    /* JADX INFO: renamed from: b */
    public final hap0 f110505b;

    /* JADX INFO: renamed from: c */
    public final qp71 f110506c;

    /* JADX INFO: renamed from: d */
    public int f110507d;

    /* JADX INFO: renamed from: e */
    public Object f110508e;

    /* JADX INFO: renamed from: f */
    public Looper f110509f;

    /* JADX INFO: renamed from: g */
    public final int f110510g;

    /* JADX INFO: renamed from: h */
    public long f110511h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public boolean f110512i = true;

    /* JADX INFO: renamed from: j */
    public boolean f110513j;

    /* JADX INFO: renamed from: k */
    public boolean f110514k;

    public jap0(hap0 hap0Var, iap0 iap0Var, qp71 qp71Var, int i, Looper looper) {
        this.f110505b = hap0Var;
        this.f110504a = iap0Var;
        this.f110506c = qp71Var;
        this.f110509f = looper;
        this.f110510g = i;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m52847a(boolean z) {
        notifyAll();
    }

    /* JADX INFO: renamed from: b */
    public final void m52848b() {
        c95.m31855u(!this.f110513j);
        if (this.f110511h == -9223372036854775807L) {
            c95.m31843i(this.f110512i);
        }
        this.f110513j = true;
        qjx qjxVar = (qjx) this.f110505b;
        if (!qjxVar.f189358h1 && qjxVar.f189359i.getThread().isAlive()) {
            qjxVar.f189355g.m56387d(14, this).m53364b();
        } else {
            yif1.m93819w0("Ignoring messages sent after release.");
            m52847a(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m52849c(Object obj) {
        c95.m31855u(!this.f110513j);
        this.f110508e = obj;
    }

    /* JADX INFO: renamed from: d */
    public final void m52850d(int i) {
        c95.m31855u(!this.f110513j);
        this.f110507d = i;
    }
}
