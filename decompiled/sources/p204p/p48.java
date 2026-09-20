package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p48 extends b58 {

    /* JADX INFO: renamed from: a */
    public final boolean f173864a;

    public p48(boolean z) {
        this.f173864a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p48) && this.f173864a == ((p48) obj).f173864a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f173864a);
    }
}
