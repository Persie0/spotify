package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rvo {

    /* JADX INFO: renamed from: a */
    public final elo0 f203108a;

    /* JADX INFO: renamed from: b */
    public final sck0 f203109b;

    public rvo(elo0 elo0Var, sck0 sck0Var) {
        this.f203108a = elo0Var;
        this.f203109b = sck0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvo)) {
            return false;
        }
        rvo rvoVar = (rvo) obj;
        return wj50.m88271j(this.f203108a, rvoVar.f203108a) && wj50.m88271j(this.f203109b, rvoVar.f203109b);
    }

    public final int hashCode() {
        int iHashCode = this.f203108a.hashCode() * 31;
        sck0 sck0Var = this.f203109b;
        return iHashCode + (sck0Var == null ? 0 : sck0Var.hashCode());
    }
}
