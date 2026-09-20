package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pxc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final boolean f182271a;

    public pxc0(boolean z) {
        this.f182271a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxc0) && this.f182271a == ((pxc0) obj).f182271a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182271a);
    }
}
