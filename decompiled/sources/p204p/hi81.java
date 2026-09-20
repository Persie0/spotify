package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hi81 extends ii81 {

    /* JADX INFO: renamed from: a */
    public final String f91740a;

    /* JADX INFO: renamed from: b */
    public final int f91741b;

    /* JADX INFO: renamed from: c */
    public final String f91742c;

    /* JADX INFO: renamed from: d */
    public final lh81 f91743d;

    public hi81(String str, int i, String str2, lh81 lh81Var) {
        this.f91740a = str;
        this.f91741b = i;
        this.f91742c = str2;
        this.f91743d = lh81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi81)) {
            return false;
        }
        hi81 hi81Var = (hi81) obj;
        return wj50.m88271j(this.f91740a, hi81Var.f91740a) && this.f91741b == hi81Var.f91741b && wj50.m88271j(this.f91742c, hi81Var.f91742c) && wj50.m88271j(this.f91743d, hi81Var.f91743d);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f91741b, this.f91740a.hashCode() * 31, 31);
        String str = this.f91742c;
        return this.f91743d.hashCode() + ((iM62800g + (str == null ? 0 : str.hashCode())) * 31);
    }
}
