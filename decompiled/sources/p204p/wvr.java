package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wvr {

    /* JADX INFO: renamed from: a */
    public final boolean f255579a;

    public wvr(boolean z) {
        this.f255579a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wvr) && this.f255579a == ((wvr) obj).f255579a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255579a);
    }
}
