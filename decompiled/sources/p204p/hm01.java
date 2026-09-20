package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hm01 {

    /* JADX INFO: renamed from: a */
    public final uvf0 f92790a;

    /* JADX INFO: renamed from: b */
    public final boolean f92791b;

    public hm01(uvf0 uvf0Var, boolean z) {
        this.f92790a = uvf0Var;
        this.f92791b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm01)) {
            return false;
        }
        hm01 hm01Var = (hm01) obj;
        return wj50.m88271j(this.f92790a, hm01Var.f92790a) && this.f92791b == hm01Var.f92791b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92791b) + (this.f92790a.hashCode() * 31);
    }
}
