package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jh31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final boolean f112323a;

    public jh31(boolean z) {
        this.f112323a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jh31) && this.f112323a == ((jh31) obj).f112323a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112323a);
    }
}
