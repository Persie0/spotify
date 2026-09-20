package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hpx0 {

    /* JADX INFO: renamed from: a */
    public final ipx0 f93853a;

    /* JADX INFO: renamed from: b */
    public final cg21 f93854b;

    public hpx0(ipx0 ipx0Var, cg21 cg21Var) {
        this.f93853a = ipx0Var;
        this.f93854b = cg21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpx0)) {
            return false;
        }
        hpx0 hpx0Var = (hpx0) obj;
        return wj50.m88271j(this.f93853a, hpx0Var.f93853a) && wj50.m88271j(this.f93854b, hpx0Var.f93854b);
    }

    public final int hashCode() {
        int iHashCode = this.f93853a.hashCode() * 31;
        cg21 cg21Var = this.f93854b;
        return iHashCode + (cg21Var == null ? 0 : cg21Var.hashCode());
    }
}
