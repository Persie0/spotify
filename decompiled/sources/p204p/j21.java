package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j21 extends k21 {

    /* JADX INFO: renamed from: a */
    public final a421 f107898a;

    /* JADX INFO: renamed from: b */
    public final b3j0 f107899b;

    public j21(a421 a421Var, z2j0 z2j0Var) {
        this.f107898a = a421Var;
        this.f107899b = z2j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j21)) {
            return false;
        }
        j21 j21Var = (j21) obj;
        return wj50.m88271j(this.f107898a, j21Var.f107898a) && wj50.m88271j(this.f107899b, j21Var.f107899b);
    }

    public final int hashCode() {
        int iHashCode = this.f107898a.hashCode() * 31;
        b3j0 b3j0Var = this.f107899b;
        return iHashCode + (b3j0Var == null ? 0 : b3j0Var.hashCode());
    }
}
