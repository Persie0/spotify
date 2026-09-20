package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i6y0 extends l6y0 {

    /* JADX INFO: renamed from: a */
    public final boolean f99382a;

    public i6y0(boolean z) {
        this.f99382a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6y0) && this.f99382a == ((i6y0) obj).f99382a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99382a);
    }
}
