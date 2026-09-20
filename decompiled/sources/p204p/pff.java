package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pff extends sff {

    /* JADX INFO: renamed from: a */
    public final boolean f177044a;

    public pff(boolean z) {
        this.f177044a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pff) && this.f177044a == ((pff) obj).f177044a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f177044a);
    }
}
