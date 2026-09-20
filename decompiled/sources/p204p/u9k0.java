package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u9k0 extends y9k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f228218a;

    /* JADX INFO: renamed from: b */
    public final boolean f228219b;

    public u9k0(boolean z, boolean z2) {
        this.f228218a = z;
        this.f228219b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9k0)) {
            return false;
        }
        u9k0 u9k0Var = (u9k0) obj;
        return this.f228218a == u9k0Var.f228218a && this.f228219b == u9k0Var.f228219b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f228219b) + (Boolean.hashCode(this.f228218a) * 31);
    }
}
