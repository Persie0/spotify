package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eqq0 {

    /* JADX INFO: renamed from: a */
    public final cqq0 f61940a;

    /* JADX INFO: renamed from: b */
    public final int f61941b;

    public eqq0(cqq0 cqq0Var, int i) {
        this.f61940a = cqq0Var;
        this.f61941b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqq0)) {
            return false;
        }
        eqq0 eqq0Var = (eqq0) obj;
        return wj50.m88271j(this.f61940a, eqq0Var.f61940a) && this.f61941b == eqq0Var.f61941b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61941b) + (this.f61940a.hashCode() * 31);
    }
}
