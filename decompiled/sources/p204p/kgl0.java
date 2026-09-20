package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kgl0 {

    /* JADX INFO: renamed from: a */
    public final int f122418a;

    /* JADX INFO: renamed from: b */
    public final ogl0 f122419b;

    public kgl0(int i, ogl0 ogl0Var) {
        this.f122418a = i;
        this.f122419b = ogl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgl0)) {
            return false;
        }
        kgl0 kgl0Var = (kgl0) obj;
        return this.f122418a == kgl0Var.f122418a && this.f122419b.equals(kgl0Var.f122419b);
    }

    public final int hashCode() {
        return this.f122419b.hashCode() + (edb.m38547C(this.f122418a) * 31);
    }
}
