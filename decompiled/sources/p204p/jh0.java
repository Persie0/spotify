package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jh0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f112302a;

    public jh0(boolean z) {
        this.f112302a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jh0) && this.f112302a == ((jh0) obj).f112302a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112302a);
    }
}
