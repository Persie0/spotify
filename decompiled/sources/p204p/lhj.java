package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lhj {

    /* JADX INFO: renamed from: a */
    public final String f133579a;

    /* JADX INFO: renamed from: b */
    public final un20 f133580b;

    /* JADX INFO: renamed from: c */
    public final qf40 f133581c;

    public lhj(String str, un20 un20Var, qf40 qf40Var) {
        this.f133579a = str;
        this.f133580b = un20Var;
        this.f133581c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhj)) {
            return false;
        }
        lhj lhjVar = (lhj) obj;
        return wj50.m88271j(this.f133579a, lhjVar.f133579a) && wj50.m88271j(this.f133580b, lhjVar.f133580b) && wj50.m88271j(this.f133581c, lhjVar.f133581c);
    }

    public final int hashCode() {
        int iHashCode = this.f133579a.hashCode() * 31;
        un20 un20Var = this.f133580b;
        return this.f133581c.hashCode() + ((iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31);
    }
}
