package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cso0 {

    /* JADX INFO: renamed from: a */
    public final boolean f41663a;

    /* JADX INFO: renamed from: b */
    public final boolean f41664b;

    /* JADX INFO: renamed from: c */
    public final long f41665c;

    /* JADX INFO: renamed from: d */
    public final int f41666d;

    public cso0(int i, long j, boolean z, boolean z2) {
        this.f41663a = z;
        this.f41664b = z2;
        this.f41665c = j;
        this.f41666d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cso0)) {
            return false;
        }
        cso0 cso0Var = (cso0) obj;
        return this.f41663a == cso0Var.f41663a && this.f41664b == cso0Var.f41664b && this.f41665c == cso0Var.f41665c && this.f41666d == cso0Var.f41666d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f41666d) + dq60.m36605e(s571.m77245d(Boolean.hashCode(this.f41663a) * 31, 31, this.f41664b), this.f41665c, 31);
    }
}
