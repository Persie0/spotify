package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p8c0 extends q8c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f174934a;

    public p8c0(boolean z) {
        this.f174934a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8c0) && this.f174934a == ((p8c0) obj).f174934a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174934a);
    }
}
