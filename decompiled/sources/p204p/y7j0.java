package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y7j0 implements a8j0, cn41 {

    /* JADX INFO: renamed from: a */
    public final int f270096a;

    /* JADX INFO: renamed from: b */
    public final boolean f270097b;

    public y7j0(int i, boolean z) {
        this.f270096a = i;
        this.f270097b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7j0)) {
            return false;
        }
        y7j0 y7j0Var = (y7j0) obj;
        return this.f270096a == y7j0Var.f270096a && this.f270097b == y7j0Var.f270097b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f270097b) + (edb.m38547C(this.f270096a) * 31);
    }
}
