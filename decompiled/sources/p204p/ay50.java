package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ay50 {

    /* JADX INFO: renamed from: a */
    public final boolean f21105a;

    /* JADX INFO: renamed from: b */
    public final boolean f21106b;

    /* JADX INFO: renamed from: c */
    public final boolean f21107c;

    /* JADX INFO: renamed from: d */
    public final boolean f21108d;

    public ay50(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f21105a = z;
        this.f21106b = z2;
        this.f21107c = z3;
        this.f21108d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay50)) {
            return false;
        }
        ay50 ay50Var = (ay50) obj;
        return this.f21105a == ay50Var.f21105a && this.f21106b == ay50Var.f21106b && this.f21107c == ay50Var.f21107c && this.f21108d == ay50Var.f21108d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21108d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f21105a) * 31, 31, this.f21106b), 31, this.f21107c);
    }
}
