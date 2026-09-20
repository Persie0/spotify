package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bk41 {

    /* JADX INFO: renamed from: a */
    public final hz80 f27835a;

    /* JADX INFO: renamed from: b */
    public final boolean f27836b;

    public bk41(hz80 hz80Var, boolean z) {
        this.f27835a = hz80Var;
        this.f27836b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk41)) {
            return false;
        }
        bk41 bk41Var = (bk41) obj;
        return wj50.m88271j(this.f27835a, bk41Var.f27835a) && this.f27836b == bk41Var.f27836b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27836b) + (this.f27835a.hashCode() * 31);
    }
}
