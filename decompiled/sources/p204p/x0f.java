package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x0f {

    /* JADX INFO: renamed from: a */
    public final boolean f256875a;

    public x0f(boolean z) {
        this.f256875a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0f) && this.f256875a == ((x0f) obj).f256875a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256875a);
    }
}
