package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e4x0 {

    /* JADX INFO: renamed from: a */
    public final boolean f56193a;

    /* JADX INFO: renamed from: b */
    public final boolean f56194b;

    public e4x0(boolean z, boolean z2) {
        this.f56193a = z;
        this.f56194b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4x0)) {
            return false;
        }
        e4x0 e4x0Var = (e4x0) obj;
        return this.f56193a == e4x0Var.f56193a && this.f56194b == e4x0Var.f56194b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56194b) + (Boolean.hashCode(this.f56193a) * 31);
    }
}
