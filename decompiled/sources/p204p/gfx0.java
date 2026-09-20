package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gfx0 implements hfx0 {

    /* JADX INFO: renamed from: a */
    public final long f79484a;

    public gfx0(long j) {
        this.f79484a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfx0) && this.f79484a == ((gfx0) obj).f79484a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f79484a);
    }
}
