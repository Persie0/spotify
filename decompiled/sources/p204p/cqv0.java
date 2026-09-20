package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cqv0 {

    /* JADX INFO: renamed from: a */
    public final erc1 f41012a;

    /* JADX INFO: renamed from: b */
    public final v140 f41013b;

    public cqv0(v140 v140Var, erc1 erc1Var) {
        this.f41012a = erc1Var;
        this.f41013b = v140Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqv0)) {
            return false;
        }
        cqv0 cqv0Var = (cqv0) obj;
        return wj50.m88271j(this.f41012a, cqv0Var.f41012a) && wj50.m88271j(this.f41013b, cqv0Var.f41013b);
    }

    public final int hashCode() {
        return this.f41013b.hashCode() + (this.f41012a.hashCode() * 31);
    }
}
