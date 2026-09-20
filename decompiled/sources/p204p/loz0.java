package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class loz0 {

    /* JADX INFO: renamed from: a */
    public final ceu0 f135582a;

    public loz0(ceu0 ceu0Var) {
        this.f135582a = ceu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof loz0) && wj50.m88271j(this.f135582a, ((loz0) obj).f135582a);
    }

    public final int hashCode() {
        ceu0 ceu0Var = this.f135582a;
        if (ceu0Var == null) {
            return 0;
        }
        return ceu0Var.hashCode();
    }
}
