package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i0a1 {

    /* JADX INFO: renamed from: a */
    public final p6x0 f97190a;

    /* JADX INFO: renamed from: b */
    public final boolean f97191b;

    public i0a1(p6x0 p6x0Var, boolean z) {
        this.f97190a = p6x0Var;
        this.f97191b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0a1)) {
            return false;
        }
        i0a1 i0a1Var = (i0a1) obj;
        return wj50.m88271j(this.f97190a, i0a1Var.f97190a) && this.f97191b == i0a1Var.f97191b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97191b) + (this.f97190a.hashCode() * 31);
    }
}
