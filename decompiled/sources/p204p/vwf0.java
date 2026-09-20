package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vwf0 implements cxf0 {

    /* JADX INFO: renamed from: a */
    public final v1r0 f245488a;

    /* JADX INFO: renamed from: b */
    public final int f245489b;

    public vwf0(v1r0 v1r0Var, int i) {
        this.f245488a = v1r0Var;
        this.f245489b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwf0)) {
            return false;
        }
        vwf0 vwf0Var = (vwf0) obj;
        return this.f245488a == vwf0Var.f245488a && this.f245489b == vwf0Var.f245489b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f245489b) + (this.f245488a.hashCode() * 31);
    }
}
