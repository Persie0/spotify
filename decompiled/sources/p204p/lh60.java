package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lh60 implements nh60 {

    /* JADX INFO: renamed from: a */
    public final vj60 f133401a;

    /* JADX INFO: renamed from: b */
    public final cx50 f133402b;

    public lh60(vj60 vj60Var, cx50 cx50Var) {
        this.f133401a = vj60Var;
        this.f133402b = cx50Var;
    }

    @Override // p204p.nh60
    /* JADX INFO: renamed from: b */
    public final vj60 mo58958b() {
        return this.f133401a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh60)) {
            return false;
        }
        lh60 lh60Var = (lh60) obj;
        return wj50.m88271j(this.f133401a, lh60Var.f133401a) && wj50.m88271j(this.f133402b, lh60Var.f133402b);
    }

    public final int hashCode() {
        return this.f133402b.hashCode() + (this.f133401a.hashCode() * 31);
    }
}
