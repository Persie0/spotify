package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zvr implements wvh0 {

    /* JADX INFO: renamed from: a */
    public final long f286755a;

    /* JADX INFO: renamed from: b */
    public final long f286756b;

    /* JADX INFO: renamed from: c */
    public final boolean f286757c;

    /* JADX INFO: renamed from: d */
    public final boolean f286758d;

    /* JADX INFO: renamed from: e */
    public final srq0 f286759e;

    /* JADX INFO: renamed from: f */
    public final boolean f286760f;

    /* JADX INFO: renamed from: g */
    public final boolean f286761g;

    public zvr(long j, long j2, boolean z, boolean z2, srq0 srq0Var, boolean z3, boolean z4) {
        this.f286755a = j;
        this.f286756b = j2;
        this.f286757c = z;
        this.f286758d = z2;
        this.f286759e = srq0Var;
        this.f286760f = z3;
        this.f286761g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvr)) {
            return false;
        }
        zvr zvrVar = (zvr) obj;
        return this.f286755a == zvrVar.f286755a && this.f286756b == zvrVar.f286756b && this.f286757c == zvrVar.f286757c && this.f286758d == zvrVar.f286758d && wj50.m88271j(this.f286759e, zvrVar.f286759e) && this.f286760f == zvrVar.f286760f && this.f286761g == zvrVar.f286761g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f286761g) + s571.m77245d(dq60.m36604d(s571.m77245d(s571.m77245d(dq60.m36605e(Long.hashCode(this.f286755a) * 31, this.f286756b, 31), 31, this.f286757c), 31, this.f286758d), 31, this.f286759e.f213371a), 31, this.f286760f);
    }
}
