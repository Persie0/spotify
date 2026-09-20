package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nuf0 {

    /* JADX INFO: renamed from: a */
    public final muf0 f158638a;

    /* JADX INFO: renamed from: b */
    public final int f158639b;

    /* JADX INFO: renamed from: c */
    public final o690 f158640c;

    /* JADX INFO: renamed from: d */
    public final gh71 f158641d;

    /* JADX INFO: renamed from: e */
    public final k69 f158642e;

    public nuf0(muf0 muf0Var, int i, o690 o690Var, gh71 gh71Var, k69 k69Var) {
        this.f158638a = muf0Var;
        this.f158639b = i;
        this.f158640c = o690Var;
        this.f158641d = gh71Var;
        this.f158642e = k69Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuf0)) {
            return false;
        }
        nuf0 nuf0Var = (nuf0) obj;
        return wj50.m88271j(this.f158638a, nuf0Var.f158638a) && this.f158639b == nuf0Var.f158639b && wj50.m88271j(this.f158640c, nuf0Var.f158640c) && wj50.m88271j(this.f158641d, nuf0Var.f158641d) && wj50.m88271j(this.f158642e, nuf0Var.f158642e);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f158639b, this.f158638a.hashCode() * 31, 31);
        o690 o690Var = this.f158640c;
        int iHashCode = (iM62800g + (o690Var == null ? 0 : o690Var.hashCode())) * 31;
        gh71 gh71Var = this.f158641d;
        int iHashCode2 = (iHashCode + (gh71Var == null ? 0 : gh71Var.hashCode())) * 31;
        k69 k69Var = this.f158642e;
        return iHashCode2 + (k69Var != null ? k69Var.hashCode() : 0);
    }
}
