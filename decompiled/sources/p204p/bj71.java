package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bj71 implements cj71 {

    /* JADX INFO: renamed from: a */
    public final int f27632a;

    public bj71(int i) {
        this.f27632a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj71) && this.f27632a == ((bj71) obj).f27632a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27632a);
    }
}
