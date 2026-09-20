package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vzm0 {

    /* JADX INFO: renamed from: a */
    public final wzm0 f246484a;

    /* JADX INFO: renamed from: b */
    public final boolean f246485b;

    public vzm0(wzm0 wzm0Var, boolean z) {
        this.f246484a = wzm0Var;
        this.f246485b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzm0)) {
            return false;
        }
        vzm0 vzm0Var = (vzm0) obj;
        return this.f246484a == vzm0Var.f246484a && this.f246485b == vzm0Var.f246485b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246485b) + (this.f246484a.hashCode() * 31);
    }
}
