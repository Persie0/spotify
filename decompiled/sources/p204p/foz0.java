package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class foz0 {

    /* JADX INFO: renamed from: a */
    public final int f71654a;

    /* JADX INFO: renamed from: b */
    public final int f71655b;

    public foz0(int i, int i2) {
        this.f71654a = i;
        this.f71655b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foz0)) {
            return false;
        }
        foz0 foz0Var = (foz0) obj;
        return this.f71654a == foz0Var.f71654a && this.f71655b == foz0Var.f71655b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f71655b) + (edb.m38547C(this.f71654a) * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + t3d1.m80010y(this.f71654a) + ", endAffinity=" + t3d1.m80010y(this.f71655b) + ')';
    }

    public foz0(int i) {
        this(i, i);
    }
}
