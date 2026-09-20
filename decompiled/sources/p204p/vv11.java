package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vv11 {

    /* JADX INFO: renamed from: a */
    public final int f245118a;

    /* JADX INFO: renamed from: b */
    public final int f245119b;

    public vv11(int i, int i2) {
        this.f245118a = i;
        this.f245119b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv11)) {
            return false;
        }
        vv11 vv11Var = (vv11) obj;
        return this.f245118a == vv11Var.f245118a && this.f245119b == vv11Var.f245119b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f245119b) + (edb.m38547C(this.f245118a) * 31);
    }
}
