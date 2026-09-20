package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class q0u0 {

    /* JADX INFO: renamed from: a */
    public final dlt0 f184101a;

    /* JADX INFO: renamed from: b */
    public final boolean f184102b;

    /* JADX INFO: renamed from: c */
    public final eh00 f184103c;

    public q0u0(dlt0 dlt0Var, boolean z, eh00 eh00Var) {
        this.f184101a = dlt0Var;
        this.f184102b = z;
        this.f184103c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0u0)) {
            return false;
        }
        q0u0 q0u0Var = (q0u0) obj;
        return wj50.m88271j(this.f184101a, q0u0Var.f184101a) && this.f184102b == q0u0Var.f184102b && wj50.m88271j(this.f184103c, q0u0Var.f184103c);
    }

    public final int hashCode() {
        return this.f184103c.hashCode() + s571.m77245d(this.f184101a.f50354a.hashCode() * 31, 31, this.f184102b);
    }
}
