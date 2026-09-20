package p204p;

/* JADX INFO: renamed from: p.p5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2244p5 extends xul0 {

    /* JADX INFO: renamed from: a */
    public static final C2244p5 f174033a = new C2244p5();

    private Object readResolve() {
        return f174033a;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: b */
    public final Object mo49278b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: c */
    public final boolean mo49279c() {
        return false;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: e */
    public final Object mo49280e(Object obj) {
        c95.m31848n(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }

    @Override // p204p.xul0
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: f */
    public final Object mo49281f(n5b n5bVar) {
        Object obj = n5bVar.get();
        c95.m31848n(obj, "use Optional.orNull() instead of a Supplier that returns null");
        return obj;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: g */
    public final xul0 mo49282g(xul0 xul0Var) {
        xul0Var.getClass();
        return xul0Var;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: h */
    public final Object mo49283h() {
        return null;
    }

    @Override // p204p.xul0
    public final int hashCode() {
        return 2040732332;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: i */
    public final xul0 mo49284i(qh00 qh00Var) {
        qh00Var.getClass();
        return f174033a;
    }

    @Override // p204p.xul0
    public final String toString() {
        return "Optional.absent()";
    }
}
