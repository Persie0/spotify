package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gy90 {

    /* JADX INFO: renamed from: a */
    public final by90 f85518a;

    /* JADX INFO: renamed from: b */
    public final vx90 f85519b;

    public gy90(by90 by90Var, vx90 vx90Var) {
        this.f85518a = by90Var;
        this.f85519b = vx90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy90)) {
            return false;
        }
        gy90 gy90Var = (gy90) obj;
        return wj50.m88271j(this.f85518a, gy90Var.f85518a) && wj50.m88271j(this.f85519b, gy90Var.f85519b);
    }

    public final int hashCode() {
        return this.f85519b.hashCode() + (this.f85518a.hashCode() * 31);
    }
}
