package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vw51 implements bx51 {

    /* JADX INFO: renamed from: a */
    public final wwu f245398a;

    /* JADX INFO: renamed from: b */
    public final int f245399b;

    public vw51(wwu wwuVar, int i) {
        this.f245398a = wwuVar;
        this.f245399b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw51)) {
            return false;
        }
        vw51 vw51Var = (vw51) obj;
        return wj50.m88271j(this.f245398a, vw51Var.f245398a) && this.f245399b == vw51Var.f245399b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f245399b) + (this.f245398a.hashCode() * 31);
    }
}
