package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class y0f {

    /* JADX INFO: renamed from: a */
    public final boolean f267977a;

    public y0f(boolean z) {
        this.f267977a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0f) && this.f267977a == ((y0f) obj).f267977a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267977a);
    }
}
