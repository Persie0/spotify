package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zgf0 implements ehf0 {

    /* JADX INFO: renamed from: a */
    public final int f282626a;

    public zgf0(int i) {
        this.f282626a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zgf0) && this.f282626a == ((zgf0) obj).f282626a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f282626a);
    }
}
