package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vfm0 {

    /* JADX INFO: renamed from: a */
    public final ufm0 f241001a;

    /* JADX INFO: renamed from: b */
    public final wfm0 f241002b;

    public vfm0(ufm0 ufm0Var, wfm0 wfm0Var) {
        this.f241001a = ufm0Var;
        this.f241002b = wfm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfm0)) {
            return false;
        }
        vfm0 vfm0Var = (vfm0) obj;
        return wj50.m88271j(this.f241001a, vfm0Var.f241001a) && wj50.m88271j(this.f241002b, vfm0Var.f241002b);
    }

    public final int hashCode() {
        return this.f241002b.hashCode() + (this.f241001a.hashCode() * 31);
    }
}
