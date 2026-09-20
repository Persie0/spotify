package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oeb0 implements qeb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f164396a;

    public oeb0(boolean z) {
        this.f164396a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oeb0) && this.f164396a == ((oeb0) obj).f164396a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164396a);
    }
}
