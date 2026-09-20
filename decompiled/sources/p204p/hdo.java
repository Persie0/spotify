package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hdo {

    /* JADX INFO: renamed from: a */
    public final uu41 f90169a;

    public hdo(uu41 uu41Var) {
        this.f90169a = uu41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdo) && wj50.m88271j(this.f90169a, ((hdo) obj).f90169a);
    }

    public final int hashCode() {
        uu41 uu41Var = this.f90169a;
        if (uu41Var == null) {
            return 0;
        }
        return uu41Var.hashCode();
    }
}
