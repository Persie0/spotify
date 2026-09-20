package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jfb0 implements rfb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f111873a;

    public jfb0(boolean z) {
        this.f111873a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfb0) && this.f111873a == ((jfb0) obj).f111873a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111873a);
    }
}
