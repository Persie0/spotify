package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n210 {

    /* JADX INFO: renamed from: a */
    public final String f149601a;

    /* JADX INFO: renamed from: b */
    public final l6s0 f149602b;

    /* JADX INFO: renamed from: c */
    public final xv41 f149603c;

    public n210(String str, l6s0 l6s0Var, lqi0 lqi0Var) {
        this.f149601a = str;
        this.f149602b = l6s0Var;
        this.f149603c = lqi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n210)) {
            return false;
        }
        n210 n210Var = (n210) obj;
        return wj50.m88271j(this.f149601a, n210Var.f149601a) && wj50.m88271j(this.f149602b, n210Var.f149602b) && wj50.m88271j(this.f149603c, n210Var.f149603c);
    }

    public final int hashCode() {
        int iHashCode = this.f149601a.hashCode() * 31;
        l6s0 l6s0Var = this.f149602b;
        return this.f149603c.hashCode() + ((iHashCode + (l6s0Var == null ? 0 : l6s0Var.hashCode())) * 31);
    }
}
