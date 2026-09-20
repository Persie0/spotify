package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zf8 implements bg8 {

    /* JADX INFO: renamed from: a */
    public final int f282249a;

    public zf8(int i) {
        this.f282249a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zf8) && this.f282249a == ((zf8) obj).f282249a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f282249a);
    }
}
