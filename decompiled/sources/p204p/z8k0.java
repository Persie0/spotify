package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z8k0 extends e9k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f280493a;

    public z8k0(boolean z) {
        this.f280493a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8k0) && this.f280493a == ((z8k0) obj).f280493a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280493a);
    }
}
