package p204p;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class x9f1 implements kdl0, oal0, k7l0 {

    /* JADX INFO: renamed from: a */
    public final Object f259354a = new Object();

    /* JADX INFO: renamed from: b */
    public final int f259355b;

    /* JADX INFO: renamed from: c */
    public final y7h1 f259356c;

    /* JADX INFO: renamed from: d */
    public int f259357d;

    /* JADX INFO: renamed from: e */
    public int f259358e;

    /* JADX INFO: renamed from: f */
    public int f259359f;

    /* JADX INFO: renamed from: g */
    public Exception f259360g;

    /* JADX INFO: renamed from: h */
    public boolean f259361h;

    public x9f1(int i, y7h1 y7h1Var) {
        this.f259355b = i;
        this.f259356c = y7h1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m90245a() {
        int i = this.f259357d + this.f259358e + this.f259359f;
        int i2 = this.f259355b;
        if (i == i2) {
            Exception exc = this.f259360g;
            y7h1 y7h1Var = this.f259356c;
            if (exc == null) {
                if (this.f259361h) {
                    y7h1Var.m92997r();
                    return;
                } else {
                    y7h1Var.m92996q(null);
                    return;
                }
            }
            y7h1Var.m92995p(new ExecutionException(this.f259358e + " out of " + i2 + " underlying tasks failed", this.f259360g));
        }
    }

    @Override // p204p.k7l0
    /* JADX INFO: renamed from: b */
    public final void mo31435b() {
        synchronized (this.f259354a) {
            this.f259359f++;
            this.f259361h = true;
            m90245a();
        }
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public final void mo27479o(Exception exc) {
        synchronized (this.f259354a) {
            this.f259358e++;
            this.f259360g = exc;
            m90245a();
        }
    }

    @Override // p204p.kdl0
    public final void onSuccess(Object obj) {
        synchronized (this.f259354a) {
            this.f259357d++;
            m90245a();
        }
    }
}
