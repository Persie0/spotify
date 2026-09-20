package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m9u0 {

    /* JADX INFO: renamed from: a */
    public final boolean f141390a;

    /* JADX INFO: renamed from: b */
    public final boolean f141391b;

    public m9u0(boolean z, boolean z2) {
        this.f141390a = z;
        this.f141391b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9u0)) {
            return false;
        }
        m9u0 m9u0Var = (m9u0) obj;
        return this.f141390a == m9u0Var.f141390a && this.f141391b == m9u0Var.f141391b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141391b) + (Boolean.hashCode(this.f141390a) * 31);
    }
}
