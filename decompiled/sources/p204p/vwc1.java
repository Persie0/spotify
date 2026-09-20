package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vwc1 implements bxc1 {

    /* JADX INFO: renamed from: a */
    public final n601 f245457a;

    /* JADX INFO: renamed from: b */
    public final Double f245458b;

    public vwc1(n601 n601Var, Double d) {
        this.f245457a = n601Var;
        this.f245458b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwc1)) {
            return false;
        }
        vwc1 vwc1Var = (vwc1) obj;
        return wj50.m88271j(this.f245457a, vwc1Var.f245457a) && wj50.m88271j(this.f245458b, vwc1Var.f245458b);
    }

    public final int hashCode() {
        int iHashCode = this.f245457a.hashCode() * 31;
        Double d = this.f245458b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
