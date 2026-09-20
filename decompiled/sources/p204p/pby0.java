package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pby0 {

    /* JADX INFO: renamed from: a */
    public final y6s0 f175918a;

    public pby0(y6s0 y6s0Var) {
        this.f175918a = y6s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pby0) && wj50.m88271j(this.f175918a, ((pby0) obj).f175918a);
    }

    public final int hashCode() {
        y6s0 y6s0Var = this.f175918a;
        if (y6s0Var == null) {
            return 0;
        }
        return y6s0Var.hashCode();
    }
}
