package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rci0 implements tci0 {

    /* JADX INFO: renamed from: a */
    public final int f197873a;

    public rci0(int i) {
        this.f197873a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rci0) && this.f197873a == ((rci0) obj).f197873a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f197873a);
    }
}
