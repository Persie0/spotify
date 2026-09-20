package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bni0 {

    /* JADX INFO: renamed from: a */
    public final hz80 f28841a;

    /* JADX INFO: renamed from: b */
    public final boolean f28842b;

    public bni0(hz80 hz80Var, boolean z) {
        this.f28841a = hz80Var;
        this.f28842b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bni0)) {
            return false;
        }
        bni0 bni0Var = (bni0) obj;
        return wj50.m88271j(this.f28841a, bni0Var.f28841a) && this.f28842b == bni0Var.f28842b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28842b) + (this.f28841a.hashCode() * 31);
    }
}
