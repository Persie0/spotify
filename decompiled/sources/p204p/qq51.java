package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qq51 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f191495a;

    /* JADX INFO: renamed from: b */
    public final pq51 f191496b;

    public qq51(String str, pq51 pq51Var) {
        this.f191495a = str;
        this.f191496b = pq51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq51)) {
            return false;
        }
        qq51 qq51Var = (qq51) obj;
        return wj50.m88271j(this.f191495a, qq51Var.f191495a) && wj50.m88271j(this.f191496b, qq51Var.f191496b);
    }

    public final int hashCode() {
        return this.f191496b.hashCode() + (this.f191495a.hashCode() * 31);
    }
}
