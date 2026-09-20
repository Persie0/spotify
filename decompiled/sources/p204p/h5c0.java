package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h5c0 extends n5c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f87804a;

    public h5c0(boolean z) {
        this.f87804a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5c0) && this.f87804a == ((h5c0) obj).f87804a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87804a);
    }
}
