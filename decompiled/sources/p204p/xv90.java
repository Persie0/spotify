package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xv90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final boolean f266315a;

    public xv90(boolean z) {
        this.f266315a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xv90) && this.f266315a == ((xv90) obj).f266315a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266315a);
    }
}
