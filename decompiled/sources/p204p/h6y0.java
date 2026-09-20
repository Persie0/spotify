package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h6y0 extends l6y0 {

    /* JADX INFO: renamed from: a */
    public final boolean f88294a;

    public h6y0(boolean z) {
        this.f88294a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h6y0) && this.f88294a == ((h6y0) obj).f88294a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88294a);
    }
}
