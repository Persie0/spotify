package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zm21 {

    /* JADX INFO: renamed from: a */
    public final bn21 f284140a;

    /* JADX INFO: renamed from: b */
    public final String f284141b;

    /* JADX INFO: renamed from: c */
    public final boolean f284142c;

    /* JADX INFO: renamed from: d */
    public final long f284143d;

    public zm21(bn21 bn21Var, String str, boolean z, long j) {
        this.f284140a = bn21Var;
        this.f284141b = str;
        this.f284142c = z;
        this.f284143d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm21)) {
            return false;
        }
        zm21 zm21Var = (zm21) obj;
        return wj50.m88271j(this.f284140a, zm21Var.f284140a) && wj50.m88271j(this.f284141b, zm21Var.f284141b) && this.f284142c == zm21Var.f284142c && this.f284143d == zm21Var.f284143d;
    }

    public final int hashCode() {
        bn21 bn21Var = this.f284140a;
        int iHashCode = (bn21Var == null ? 0 : bn21Var.hashCode()) * 31;
        String str = this.f284141b;
        return Long.hashCode(this.f284143d) + s571.m77245d((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f284142c);
    }
}
