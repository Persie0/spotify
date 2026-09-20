package p204p;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class o2f1 implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final h4t0 f161042a;

    /* JADX INFO: renamed from: b */
    public final h4t0 f161043b;

    /* JADX INFO: renamed from: c */
    public final h4t0 f161044c;

    public o2f1(j7n0 j7n0Var, w050 w050Var, w050 w050Var2, h4t0 h4t0Var) {
        this.f161042a = w050Var;
        this.f161043b = w050Var2;
        this.f161044c = h4t0Var;
    }

    @Override // p204p.i4t0
    public final Object get() {
        return new nab0((Application) this.f161042a.get(), (String) this.f161043b.get(), (h2f1) this.f161044c.get(), 0);
    }
}
