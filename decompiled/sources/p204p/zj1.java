package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zj1 {

    /* JADX INFO: renamed from: a */
    public final String f283326a;

    /* JADX INFO: renamed from: b */
    public final boolean f283327b;

    public zj1(String str, boolean z) {
        this.f283326a = str;
        this.f283327b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj1)) {
            return false;
        }
        zj1 zj1Var = (zj1) obj;
        return wj50.m88271j(this.f283326a, zj1Var.f283326a) && this.f283327b == zj1Var.f283327b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283327b) + (this.f283326a.hashCode() * 31);
    }
}
