package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g6y0 extends l6y0 {

    /* JADX INFO: renamed from: a */
    public final boolean f77141a;

    public g6y0(boolean z) {
        this.f77141a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6y0) && this.f77141a == ((g6y0) obj).f77141a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77141a);
    }
}
