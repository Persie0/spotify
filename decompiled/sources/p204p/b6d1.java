package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b6d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final boolean f23943a;

    public b6d1(boolean z) {
        this.f23943a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6d1) && this.f23943a == ((b6d1) obj).f23943a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23943a);
    }
}
