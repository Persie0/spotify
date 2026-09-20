package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dqg1 {

    /* JADX INFO: renamed from: a */
    public final String f51992a;

    /* JADX INFO: renamed from: b */
    public final String f51993b;

    /* JADX INFO: renamed from: c */
    public final boolean f51994c;

    public dqg1(String str, String str2, boolean z) {
        ig31.m50502t(str);
        this.f51992a = str;
        ig31.m50502t(str2);
        this.f51993b = str2;
        this.f51994c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqg1)) {
            return false;
        }
        dqg1 dqg1Var = (dqg1) obj;
        return mvl0.m62956s(this.f51992a, dqg1Var.f51992a) && mvl0.m62956s(this.f51993b, dqg1Var.f51993b) && mvl0.m62956s(null, null) && this.f51994c == dqg1Var.f51994c;
    }

    public final int hashCode() {
        return mvl0.m62961x(this.f51992a, this.f51993b, null, 4225, Boolean.valueOf(this.f51994c));
    }

    public final String toString() {
        String str = this.f51992a;
        if (str != null) {
            return str;
        }
        ig31.m50506x(null);
        throw null;
    }
}
