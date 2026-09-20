package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lhb1 implements moa {

    /* JADX INFO: renamed from: a */
    public final String f133466a;

    /* JADX INFO: renamed from: b */
    public final rq91 f133467b;

    /* JADX INFO: renamed from: c */
    public final ijb1 f133468c;

    public lhb1(String str, rq91 rq91Var, ijb1 ijb1Var) {
        this.f133466a = str;
        this.f133467b = rq91Var;
        this.f133468c = ijb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhb1)) {
            return false;
        }
        lhb1 lhb1Var = (lhb1) obj;
        return wj50.m88271j(this.f133466a, lhb1Var.f133466a) && this.f133467b.equals(lhb1Var.f133467b) && this.f133468c.equals(lhb1Var.f133468c);
    }

    @Override // p204p.moa
    public final String getId() {
        return this.f133466a;
    }

    public final int hashCode() {
        return this.f133468c.hashCode() + mt60.m62800g(this.f133467b.f201781b, this.f133466a.hashCode() * 31, 31);
    }
}
