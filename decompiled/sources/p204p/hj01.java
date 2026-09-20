package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hj01 {

    /* JADX INFO: renamed from: a */
    public final String f91931a;

    /* JADX INFO: renamed from: b */
    public final boolean f91932b;

    public hj01(String str, boolean z) {
        this.f91931a = str;
        this.f91932b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj01)) {
            return false;
        }
        hj01 hj01Var = (hj01) obj;
        return wj50.m88271j(this.f91931a, hj01Var.f91931a) && this.f91932b == hj01Var.f91932b;
    }

    public final int hashCode() {
        String str = this.f91931a;
        return Boolean.hashCode(this.f91932b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
