package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fe71 implements ge71 {

    /* JADX INFO: renamed from: a */
    public final int f68708a;

    public fe71(int i) {
        this.f68708a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe71) && this.f68708a == ((fe71) obj).f68708a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68708a);
    }
}
