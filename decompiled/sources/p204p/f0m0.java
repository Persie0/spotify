package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f0m0 {

    /* JADX INFO: renamed from: a */
    public final g0m0 f64685a;

    /* JADX INFO: renamed from: b */
    public final boolean f64686b;

    public f0m0(g0m0 g0m0Var, boolean z) {
        this.f64685a = g0m0Var;
        this.f64686b = z;
    }

    /* JADX INFO: renamed from: a */
    public final g0m0 m40494a() {
        return this.f64685a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m40495b() {
        return this.f64686b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0m0)) {
            return false;
        }
        f0m0 f0m0Var = (f0m0) obj;
        return this.f64685a == f0m0Var.f64685a && this.f64686b == f0m0Var.f64686b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64686b) + (this.f64685a.hashCode() * 31);
    }
}
