package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ubf0 {

    /* JADX INFO: renamed from: a */
    public final long f228737a;

    /* JADX INFO: renamed from: b */
    public final long f228738b;

    /* JADX INFO: renamed from: c */
    public final ybf0 f228739c;

    /* JADX INFO: renamed from: d */
    public final String f228740d;

    public ubf0(long j, long j2, ybf0 ybf0Var, String str) {
        this.f228737a = j;
        this.f228738b = j2;
        this.f228739c = ybf0Var;
        this.f228740d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubf0)) {
            return false;
        }
        ubf0 ubf0Var = (ubf0) obj;
        return this.f228737a == ubf0Var.f228737a && this.f228738b == ubf0Var.f228738b && wj50.m88271j(this.f228739c, ubf0Var.f228739c) && wj50.m88271j(this.f228740d, ubf0Var.f228740d);
    }

    public final int hashCode() {
        int iHashCode = (this.f228739c.hashCode() + dq60.m36605e(Long.hashCode(this.f228737a) * 31, this.f228738b, 31)) * 31;
        String str = this.f228740d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
