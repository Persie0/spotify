package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lg61 {

    /* JADX INFO: renamed from: a */
    public final kg61 f133102a;

    /* JADX INFO: renamed from: b */
    public final v140 f133103b;

    /* JADX INFO: renamed from: c */
    public final erc1 f133104c;

    /* JADX INFO: renamed from: d */
    public final Float f133105d;

    public lg61(kg61 kg61Var, v140 v140Var, erc1 erc1Var, Float f) {
        this.f133102a = kg61Var;
        this.f133103b = v140Var;
        this.f133104c = erc1Var;
        this.f133105d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg61)) {
            return false;
        }
        lg61 lg61Var = (lg61) obj;
        return wj50.m88271j(this.f133102a, lg61Var.f133102a) && wj50.m88271j(this.f133103b, lg61Var.f133103b) && wj50.m88271j(this.f133104c, lg61Var.f133104c) && wj50.m88271j(this.f133105d, lg61Var.f133105d);
    }

    public final int hashCode() {
        int iHashCode = this.f133102a.hashCode() * 31;
        v140 v140Var = this.f133103b;
        int iHashCode2 = (iHashCode + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        erc1 erc1Var = this.f133104c;
        int iHashCode3 = (iHashCode2 + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        Float f = this.f133105d;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }
}
