package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c6i0 implements e6i0 {

    /* JADX INFO: renamed from: a */
    public final boolean f34545a;

    public c6i0(boolean z) {
        this.f34545a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6i0) && this.f34545a == ((c6i0) obj).f34545a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34545a);
    }
}
