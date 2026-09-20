package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rtg1 {

    /* JADX INFO: renamed from: a */
    public Object f202582a;

    /* JADX INFO: renamed from: b */
    public r2h1 f202583b;

    /* JADX INFO: renamed from: c */
    public k6h1 f202584c;

    /* JADX INFO: renamed from: d */
    public boolean f202585d;

    /* JADX INFO: renamed from: a */
    public final void m76378a(Object obj) {
        this.f202585d = true;
        r2h1 r2h1Var = this.f202583b;
        if (r2h1Var != null) {
            n0h1 n0h1Var = r2h1Var.f195147b;
            n0h1Var.getClass();
            if (obj == null) {
                obj = prg1.f180603g;
            }
            if (prg1.f180602f.mo82903t(n0h1Var, null, obj)) {
                prg1.m70713d(n0h1Var);
                this.f202582a = null;
                this.f202583b = null;
                this.f202584c = null;
            }
        }
    }

    public final void finalize() {
        k6h1 k6h1Var;
        r2h1 r2h1Var = this.f202583b;
        if (r2h1Var != null) {
            n0h1 n0h1Var = r2h1Var.f195147b;
            if (!n0h1Var.isDone()) {
                if (prg1.f180602f.mo82903t(n0h1Var, null, new p4g1(new C1889g9("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f202582a)), 8)))) {
                    prg1.m70713d(n0h1Var);
                }
            }
        }
        if (this.f202585d || (k6h1Var = this.f202584c) == null) {
            return;
        }
        k6h1Var.m55597i(null);
    }
}
