package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wjt0 implements yjt0 {

    /* JADX INFO: renamed from: a */
    public final int f252044a;

    public wjt0(int i) {
        this.f252044a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjt0) && this.f252044a == ((wjt0) obj).f252044a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f252044a);
    }
}
