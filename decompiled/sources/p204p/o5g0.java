package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o5g0 {

    /* JADX INFO: renamed from: a */
    public final v140 f161966a;

    /* JADX INFO: renamed from: b */
    public final erc1 f161967b;

    public o5g0(v140 v140Var, erc1 erc1Var) {
        this.f161966a = v140Var;
        this.f161967b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5g0)) {
            return false;
        }
        o5g0 o5g0Var = (o5g0) obj;
        return wj50.m88271j(this.f161966a, o5g0Var.f161966a) && wj50.m88271j(this.f161967b, o5g0Var.f161967b);
    }

    public final int hashCode() {
        return this.f161967b.hashCode() + (this.f161966a.hashCode() * 31);
    }
}
