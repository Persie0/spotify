package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class awf0 {

    /* JADX INFO: renamed from: a */
    public final String f20497a;

    /* JADX INFO: renamed from: b */
    public final String f20498b;

    /* JADX INFO: renamed from: c */
    public final yvf0 f20499c;

    /* JADX INFO: renamed from: d */
    public final boolean f20500d;

    /* JADX INFO: renamed from: e */
    public final boolean f20501e;

    public awf0(String str, String str2, yvf0 yvf0Var, boolean z, boolean z2) {
        this.f20497a = str;
        this.f20498b = str2;
        this.f20499c = yvf0Var;
        this.f20500d = z;
        this.f20501e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awf0)) {
            return false;
        }
        awf0 awf0Var = (awf0) obj;
        return wj50.m88271j(this.f20497a, awf0Var.f20497a) && wj50.m88271j(this.f20498b, awf0Var.f20498b) && this.f20499c == awf0Var.f20499c && this.f20500d == awf0Var.f20500d && this.f20501e == awf0Var.f20501e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20501e) + s571.m77245d((this.f20499c.hashCode() + s571.m77243b(this.f20497a.hashCode() * 31, 31, this.f20498b)) * 31, 31, this.f20500d);
    }
}
