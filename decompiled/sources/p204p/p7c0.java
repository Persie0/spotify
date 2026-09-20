package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f174644a;

    public p7c0(boolean z) {
        this.f174644a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7c0) && this.f174644a == ((p7c0) obj).f174644a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174644a);
    }
}
