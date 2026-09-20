package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class il0 {

    /* JADX INFO: renamed from: a */
    public final boolean f103256a;

    /* JADX INFO: renamed from: b */
    public final boolean f103257b;

    public il0(boolean z, boolean z2) {
        this.f103256a = z;
        this.f103257b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il0)) {
            return false;
        }
        il0 il0Var = (il0) obj;
        return this.f103256a == il0Var.f103256a && this.f103257b == il0Var.f103257b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103257b) + (Boolean.hashCode(this.f103256a) * 31);
    }
}
