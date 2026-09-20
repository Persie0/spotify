package p204p;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class o0b implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160325a = 1;

    /* JADX INFO: renamed from: b */
    public final h4t0 f160326b;

    /* JADX INFO: renamed from: c */
    public final h4t0 f160327c;

    /* JADX INFO: renamed from: d */
    public final Object f160328d;

    /* JADX INFO: renamed from: e */
    public final h4t0 f160329e;

    public o0b(j7n0 j7n0Var, w050 w050Var, w050 w050Var2, o0b o0bVar, o2f1 o2f1Var) {
        this.f160326b = w050Var;
        this.f160327c = w050Var2;
        this.f160328d = o0bVar;
        this.f160329e = o2f1Var;
    }

    @Override // p204p.i4t0
    public final Object get() {
        switch (this.f160325a) {
            case 0:
                String str = (String) this.f160326b.get();
                Application application = (Application) this.f160327c.get();
                ((o0b) this.f160328d).get();
                return new z2f1(str, application, (p2f1) ((o2f1) this.f160329e).get());
            default:
                j7n0 j7n0Var = (j7n0) this.f160328d;
                Application application2 = (Application) this.f160326b.get();
                String str2 = (String) this.f160327c.get();
                h2f1 h2f1Var = (h2f1) this.f160329e.get();
                j7n0Var.getClass();
                return new n1f1(application2, str2, h2f1Var);
        }
    }

    public o0b(j7n0 j7n0Var, w050 w050Var, w050 w050Var2, h4t0 h4t0Var) {
        this.f160328d = j7n0Var;
        this.f160326b = w050Var;
        this.f160327c = w050Var2;
        this.f160329e = h4t0Var;
    }
}
