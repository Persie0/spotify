package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mbi0 implements obi0, bn41 {

    /* JADX INFO: renamed from: a */
    public final qe70 f141934a;

    /* JADX INFO: renamed from: b */
    public final qe70 f141935b;

    /* JADX WARN: Multi-variable type inference failed */
    public mbi0(gh00 gh00Var, th00 th00Var) {
        this.f141934a = (qe70) gh00Var;
        this.f141935b = (qe70) th00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    @Override // p204p.bn41
    /* JADX INFO: renamed from: a */
    public final gh00 mo29925a() {
        return this.f141934a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbi0)) {
            return false;
        }
        mbi0 mbi0Var = (mbi0) obj;
        return this.f141934a.equals(mbi0Var.f141934a) && this.f141935b.equals(mbi0Var.f141935b);
    }

    public final int hashCode() {
        return this.f141935b.hashCode() + (this.f141934a.hashCode() * 31);
    }
}
