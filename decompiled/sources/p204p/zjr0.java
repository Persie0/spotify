package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zjr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f283527a;

    /* JADX INFO: renamed from: b */
    public final boolean f283528b;

    public zjr0(boolean z, boolean z2) {
        this.f283527a = z;
        this.f283528b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjr0)) {
            return false;
        }
        zjr0 zjr0Var = (zjr0) obj;
        return this.f283527a == zjr0Var.f283527a && this.f283528b == zjr0Var.f283528b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283528b) + (Boolean.hashCode(this.f283527a) * 31);
    }
}
