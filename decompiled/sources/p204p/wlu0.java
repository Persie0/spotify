package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wlu0 {

    /* JADX INFO: renamed from: a */
    public final boolean f252620a;

    public wlu0(boolean z) {
        this.f252620a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wlu0) && this.f252620a == ((wlu0) obj).f252620a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252620a);
    }
}
