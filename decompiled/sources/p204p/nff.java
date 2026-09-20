package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nff extends sff {

    /* JADX INFO: renamed from: a */
    public final boolean f153340a;

    public nff(boolean z) {
        this.f153340a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nff) && this.f153340a == ((nff) obj).f153340a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153340a);
    }
}
