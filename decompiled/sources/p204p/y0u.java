package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y0u extends z0u {

    /* JADX INFO: renamed from: a */
    public final boolean f268087a;

    public y0u(boolean z) {
        this.f268087a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0u) && this.f268087a == ((y0u) obj).f268087a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268087a);
    }
}
