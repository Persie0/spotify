package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class puf0 {

    /* JADX INFO: renamed from: a */
    public final ouf0 f181440a;

    /* JADX INFO: renamed from: b */
    public final gh71 f181441b;

    public puf0(ouf0 ouf0Var, gh71 gh71Var) {
        this.f181440a = ouf0Var;
        this.f181441b = gh71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puf0)) {
            return false;
        }
        puf0 puf0Var = (puf0) obj;
        return wj50.m88271j(this.f181440a, puf0Var.f181440a) && wj50.m88271j(this.f181441b, puf0Var.f181441b);
    }

    public final int hashCode() {
        int iHashCode = this.f181440a.hashCode() * 31;
        gh71 gh71Var = this.f181441b;
        return iHashCode + (gh71Var == null ? 0 : gh71Var.hashCode());
    }
}
