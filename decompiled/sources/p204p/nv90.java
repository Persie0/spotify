package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nv90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final boolean f158841a;

    public nv90(boolean z) {
        this.f158841a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nv90) && this.f158841a == ((nv90) obj).f158841a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158841a);
    }
}
