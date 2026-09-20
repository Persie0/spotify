package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h9t0 extends akg1 {

    /* JADX INFO: renamed from: c */
    public final boolean f89035c;

    public h9t0(boolean z) {
        this.f89035c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9t0) && this.f89035c == ((h9t0) obj).f89035c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89035c);
    }
}
