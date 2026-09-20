package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v90 {

    /* JADX INFO: renamed from: a */
    public final String f238803a;

    /* JADX INFO: renamed from: b */
    public final xfr f238804b;

    /* JADX INFO: renamed from: c */
    public final boolean f238805c;

    /* JADX INFO: renamed from: d */
    public final boolean f238806d;

    /* JADX INFO: renamed from: e */
    public final boolean f238807e;

    /* JADX INFO: renamed from: f */
    public final boolean f238808f;

    public v90(String str, xfr xfrVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f238803a = str;
        this.f238804b = xfrVar;
        this.f238805c = z;
        this.f238806d = z2;
        this.f238807e = z3;
        this.f238808f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v90)) {
            return false;
        }
        v90 v90Var = (v90) obj;
        return wj50.m88271j(this.f238803a, v90Var.f238803a) && this.f238804b == v90Var.f238804b && this.f238805c == v90Var.f238805c && this.f238806d == v90Var.f238806d && this.f238807e == v90Var.f238807e && this.f238808f == v90Var.f238808f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f238808f) + s571.m77245d(s571.m77245d(s571.m77245d((this.f238804b.hashCode() + (this.f238803a.hashCode() * 31)) * 31, 31, this.f238805c), 31, this.f238806d), 31, this.f238807e);
    }
}
