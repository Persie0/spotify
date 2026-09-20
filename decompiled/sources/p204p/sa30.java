package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sa30 implements ta30 {

    /* JADX INFO: renamed from: a */
    public final ua30 f207121a;

    /* JADX INFO: renamed from: b */
    public final ua30 f207122b;

    /* JADX INFO: renamed from: c */
    public final int f207123c;

    /* JADX INFO: renamed from: d */
    public final int f207124d;

    public sa30(ua30 ua30Var, ua30 ua30Var2, int i, int i2) {
        this.f207121a = ua30Var;
        this.f207122b = ua30Var2;
        this.f207123c = i;
        this.f207124d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa30)) {
            return false;
        }
        sa30 sa30Var = (sa30) obj;
        return this.f207121a.equals(sa30Var.f207121a) && this.f207122b.equals(sa30Var.f207122b) && this.f207123c == sa30Var.f207123c && this.f207124d == sa30Var.f207124d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f207124d) + mt60.m62800g(this.f207123c, (this.f207122b.hashCode() + (this.f207121a.hashCode() * 31)) * 31, 31);
    }
}
