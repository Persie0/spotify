package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h2l0 {

    /* JADX INFO: renamed from: a */
    public final String f87024a;

    /* JADX INFO: renamed from: b */
    public final boolean f87025b;

    public h2l0(String str, boolean z) {
        this.f87024a = str;
        this.f87025b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2l0)) {
            return false;
        }
        h2l0 h2l0Var = (h2l0) obj;
        return wj50.m88271j(this.f87024a, h2l0Var.f87024a) && this.f87025b == h2l0Var.f87025b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87025b) + mt60.m62800g(20, this.f87024a.hashCode() * 31, 31);
    }
}
