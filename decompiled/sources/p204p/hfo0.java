package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hfo0 {

    /* JADX INFO: renamed from: a */
    public final cwo0 f90765a;

    /* JADX INFO: renamed from: b */
    public final int f90766b;

    public hfo0(cwo0 cwo0Var, int i) {
        this.f90765a = cwo0Var;
        this.f90766b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfo0)) {
            return false;
        }
        hfo0 hfo0Var = (hfo0) obj;
        return wj50.m88271j(this.f90765a, hfo0Var.f90765a) && this.f90766b == hfo0Var.f90766b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f90766b) + (this.f90765a.hashCode() * 31);
    }
}
