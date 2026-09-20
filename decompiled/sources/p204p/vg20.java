package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vg20 {

    /* JADX INFO: renamed from: a */
    public final yh20 f241097a;

    /* JADX INFO: renamed from: b */
    public final th00 f241098b;

    public vg20(yh20 yh20Var, nph nphVar) {
        this.f241097a = yh20Var;
        this.f241098b = nphVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg20)) {
            return false;
        }
        vg20 vg20Var = (vg20) obj;
        return wj50.m88271j(this.f241097a, vg20Var.f241097a) && wj50.m88271j(this.f241098b, vg20Var.f241098b);
    }

    public final int hashCode() {
        int iHashCode = this.f241097a.hashCode() * 31;
        th00 th00Var = this.f241098b;
        return iHashCode + (th00Var == null ? 0 : th00Var.hashCode());
    }
}
