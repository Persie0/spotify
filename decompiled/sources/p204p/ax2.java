package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ax2 {

    /* JADX INFO: renamed from: a */
    public final v140 f20748a;

    /* JADX INFO: renamed from: b */
    public final erc1 f20749b;

    public ax2(v140 v140Var, erc1 erc1Var) {
        this.f20748a = v140Var;
        this.f20749b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax2)) {
            return false;
        }
        ax2 ax2Var = (ax2) obj;
        return wj50.m88271j(this.f20748a, ax2Var.f20748a) && wj50.m88271j(this.f20749b, ax2Var.f20749b);
    }

    public final int hashCode() {
        return this.f20749b.hashCode() + (this.f20748a.hashCode() * 31);
    }
}
