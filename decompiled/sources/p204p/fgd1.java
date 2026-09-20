package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fgd1 {

    /* JADX INFO: renamed from: a */
    public final vwf f69302a;

    /* JADX INFO: renamed from: b */
    public final boolean f69303b;

    public fgd1(vwf vwfVar, boolean z) {
        this.f69302a = vwfVar;
        this.f69303b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgd1)) {
            return false;
        }
        fgd1 fgd1Var = (fgd1) obj;
        return wj50.m88271j(this.f69302a, fgd1Var.f69302a) && this.f69303b == fgd1Var.f69303b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69303b) + (this.f69302a.hashCode() * 31);
    }
}
