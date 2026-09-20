package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kkz0 {

    /* JADX INFO: renamed from: a */
    public final v670 f123747a;

    /* JADX INFO: renamed from: b */
    public final boolean f123748b;

    public kkz0(v670 v670Var, boolean z) {
        this.f123747a = v670Var;
        this.f123748b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkz0)) {
            return false;
        }
        kkz0 kkz0Var = (kkz0) obj;
        return wj50.m88271j(this.f123747a, kkz0Var.f123747a) && this.f123748b == kkz0Var.f123748b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123748b) + (this.f123747a.hashCode() * 31);
    }
}
