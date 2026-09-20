package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ffx0 implements hfx0 {

    /* JADX INFO: renamed from: a */
    public final long f69118a;

    public ffx0(long j) {
        this.f69118a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffx0) && this.f69118a == ((ffx0) obj).f69118a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f69118a);
    }
}
