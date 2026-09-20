package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h0k0 implements k0k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f86309a;

    public h0k0(boolean z) {
        this.f86309a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0k0) && this.f86309a == ((h0k0) obj).f86309a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86309a);
    }
}
