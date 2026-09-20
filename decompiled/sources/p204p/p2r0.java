package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p2r0 {

    /* JADX INFO: renamed from: a */
    public final String f173418a;

    /* JADX INFO: renamed from: b */
    public final boolean f173419b;

    public p2r0(String str, boolean z) {
        this.f173418a = str;
        this.f173419b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2r0)) {
            return false;
        }
        p2r0 p2r0Var = (p2r0) obj;
        return wj50.m88271j(this.f173418a, p2r0Var.f173418a) && this.f173419b == p2r0Var.f173419b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f173419b) + (this.f173418a.hashCode() * 31);
    }
}
