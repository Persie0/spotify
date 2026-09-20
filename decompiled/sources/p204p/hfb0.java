package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hfb0 implements rfb0 {

    /* JADX INFO: renamed from: a */
    public final int f90664a;

    public hfb0(int i) {
        this.f90664a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfb0) && this.f90664a == ((hfb0) obj).f90664a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90664a);
    }
}
