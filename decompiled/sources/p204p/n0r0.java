package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n0r0 {

    /* JADX INFO: renamed from: a */
    public final z2r0 f149137a;

    /* JADX INFO: renamed from: b */
    public final guq0 f149138b;

    public n0r0(z2r0 z2r0Var, guq0 guq0Var) {
        this.f149137a = z2r0Var;
        this.f149138b = guq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0r0)) {
            return false;
        }
        n0r0 n0r0Var = (n0r0) obj;
        return this.f149137a.equals(n0r0Var.f149137a) && this.f149138b.equals(n0r0Var.f149138b);
    }

    public final int hashCode() {
        return this.f149138b.hashCode() + (this.f149137a.hashCode() * 31);
    }
}
