package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class slq implements h4t0 {

    /* JADX INFO: renamed from: a */
    public h4t0 f210463a;

    /* JADX INFO: renamed from: a */
    public static void m78504a(h4t0 h4t0Var, h4t0 h4t0Var2) {
        slq slqVar = (slq) h4t0Var;
        if (slqVar.f210463a != null) {
            throw new IllegalStateException();
        }
        slqVar.f210463a = h4t0Var2;
    }

    @Override // p204p.i4t0
    public final Object get() {
        h4t0 h4t0Var = this.f210463a;
        if (h4t0Var != null) {
            return h4t0Var.get();
        }
        throw new IllegalStateException();
    }
}
