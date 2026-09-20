package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f60 implements i60, bn41 {

    /* JADX INFO: renamed from: a */
    public final qe70 f66226a;

    /* JADX INFO: renamed from: b */
    public final qe70 f66227b;

    /* JADX WARN: Multi-variable type inference failed */
    public f60(gh00 gh00Var, gh00 gh00Var2) {
        this.f66226a = (qe70) gh00Var;
        this.f66227b = (qe70) gh00Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    @Override // p204p.bn41
    /* JADX INFO: renamed from: a */
    public final gh00 mo29925a() {
        return this.f66226a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f60)) {
            return false;
        }
        f60 f60Var = (f60) obj;
        return this.f66226a.equals(f60Var.f66226a) && this.f66227b.equals(f60Var.f66227b);
    }

    public final int hashCode() {
        return this.f66227b.hashCode() + (this.f66226a.hashCode() * 31);
    }
}
