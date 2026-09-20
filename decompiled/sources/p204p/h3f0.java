package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h3f0 extends j3f0 {

    /* JADX INFO: renamed from: a */
    public final int f87221a;

    public h3f0(int i) {
        this.f87221a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3f0) && this.f87221a == ((h3f0) obj).f87221a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87221a);
    }
}
