package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n3o0 {

    /* JADX INFO: renamed from: a */
    public final boolean f150089a;

    /* JADX INFO: renamed from: b */
    public final boolean f150090b;

    public n3o0(boolean z, boolean z2) {
        this.f150089a = z;
        this.f150090b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3o0)) {
            return false;
        }
        n3o0 n3o0Var = (n3o0) obj;
        return this.f150089a == n3o0Var.f150089a && this.f150090b == n3o0Var.f150090b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150090b) + (Boolean.hashCode(this.f150089a) * 31);
    }
}
