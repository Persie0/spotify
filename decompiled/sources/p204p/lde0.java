package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lde0 {

    /* JADX INFO: renamed from: a */
    public final kde0 f132151a;

    /* JADX INFO: renamed from: b */
    public final boolean f132152b;

    public lde0(kde0 kde0Var, boolean z) {
        this.f132151a = kde0Var;
        this.f132152b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lde0)) {
            return false;
        }
        lde0 lde0Var = (lde0) obj;
        return wj50.m88271j(this.f132151a, lde0Var.f132151a) && this.f132152b == lde0Var.f132152b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f132152b) + (this.f132151a.f121672a.hashCode() * 31);
    }
}
