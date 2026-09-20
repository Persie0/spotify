package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ldj0 {

    /* JADX INFO: renamed from: a */
    public final int f132184a;

    /* JADX INFO: renamed from: b */
    public final String f132185b;

    /* JADX INFO: renamed from: c */
    public final qf40 f132186c;

    /* JADX INFO: renamed from: d */
    public final boolean f132187d;

    /* JADX INFO: renamed from: e */
    public final taj0 f132188e;

    /* JADX INFO: renamed from: f */
    public final boolean f132189f;

    public ldj0(int i, String str, qf40 qf40Var, boolean z, taj0 taj0Var, boolean z2) {
        this.f132184a = i;
        this.f132185b = str;
        this.f132186c = qf40Var;
        this.f132187d = z;
        this.f132188e = taj0Var;
        this.f132189f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldj0)) {
            return false;
        }
        ldj0 ldj0Var = (ldj0) obj;
        return this.f132184a == ldj0Var.f132184a && wj50.m88271j(this.f132185b, ldj0Var.f132185b) && wj50.m88271j(this.f132186c, ldj0Var.f132186c) && this.f132187d == ldj0Var.f132187d && wj50.m88271j(this.f132188e, ldj0Var.f132188e) && this.f132189f == ldj0Var.f132189f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f132189f) + ((this.f132188e.hashCode() + s571.m77245d(fr0.m42461e(this.f132186c, s571.m77243b(Integer.hashCode(this.f132184a) * 31, 31, this.f132185b), 31), 31, this.f132187d)) * 31);
    }
}
