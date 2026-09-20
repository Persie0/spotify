package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d8d1 implements moa {

    /* JADX INFO: renamed from: a */
    public final String f46428a;

    /* JADX INFO: renamed from: b */
    public final rq91 f46429b;

    /* JADX INFO: renamed from: c */
    public final tgd1 f46430c;

    public d8d1(String str, rq91 rq91Var, tgd1 tgd1Var) {
        this.f46428a = str;
        this.f46429b = rq91Var;
        this.f46430c = tgd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8d1)) {
            return false;
        }
        d8d1 d8d1Var = (d8d1) obj;
        return wj50.m88271j(this.f46428a, d8d1Var.f46428a) && this.f46429b.equals(d8d1Var.f46429b) && this.f46430c.equals(d8d1Var.f46430c);
    }

    @Override // p204p.moa
    public final String getId() {
        return this.f46428a;
    }

    public final int hashCode() {
        return this.f46430c.hashCode() + mt60.m62800g(this.f46429b.f201781b, this.f46428a.hashCode() * 31, 31);
    }
}
